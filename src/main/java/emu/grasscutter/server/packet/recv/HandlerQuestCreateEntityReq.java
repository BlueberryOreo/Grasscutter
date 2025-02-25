package emu.grasscutter.server.packet.recv;

import emu.grasscutter.data.GameData;
import emu.grasscutter.data.excels.GadgetData;
import emu.grasscutter.data.excels.ItemData;
import emu.grasscutter.data.excels.monster.MonsterData;
import emu.grasscutter.game.entity.*;
import emu.grasscutter.game.world.Position;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketQuestCreateEntityRsp;
import lombok.val;

@Opcodes(PacketOpcodes.QuestCreateEntityReq)
public class HandlerQuestCreateEntityReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        val req = QuestCreateEntityReq.parseFrom(payload);
        val entity = req.getEntity();
        val scene = session.getPlayer().getWorld().getSceneById(entity.getSceneId());

        val pos = new Position(entity.getPos());
        val rot = new Position(entity.getRot());
        GameEntity gameEntity = null;
        switch (entity.getEntityCase()) {
            case GADGET_ID -> {
                val gadgetId = entity.getGadgetId();
                val gadgetInfo = entity.getGadget();
                GadgetData gadgetData = GameData.getGadgetDataMap().get(gadgetId);
                gameEntity =
                        switch (gadgetData.getType()) {
                            case Vehicle -> new EntityVehicle(scene, session.getPlayer(), gadgetId, 0, pos, rot);
                            default -> new EntityGadget(scene, gadgetId, pos, rot);
                        };
            }
            case ITEM_ID -> {
                val itemId = entity.getItemId();
                ItemData itemData = GameData.getItemDataMap().get(itemId);
                gameEntity = new EntityItem(scene, null, itemData, pos, 1, true);
            }
            case MONSTER_ID -> {
                val monsterId = entity.getMonsterId();
                val level = entity.getLevel();
                MonsterData monsterData = GameData.getMonsterDataMap().get(monsterId);
                gameEntity = new EntityMonster(scene, monsterData, pos, level);
            }
            case NPC_ID -> {}
        }

        if (gameEntity != null) {
            scene.addEntity(gameEntity);
        }

        val createdEntityId = gameEntity != null ? gameEntity.getId() : -1;

        session.send(new PacketQuestCreateEntityRsp(createdEntityId, req));
    }
}
