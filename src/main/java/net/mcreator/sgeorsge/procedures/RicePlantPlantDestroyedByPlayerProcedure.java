package net.mcreator.sgeorsge.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sgeorsge.item.RiceItem;
import net.mcreator.sgeorsge.SgeorsgeModElements;

import java.util.Map;

@SgeorsgeModElements.ModElement.Tag
public class RicePlantPlantDestroyedByPlayerProcedure extends SgeorsgeModElements.ModElement {
	public RicePlantPlantDestroyedByPlayerProcedure(SgeorsgeModElements instance) {
		super(instance, 42);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RicePlantPlantDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(RiceItem.block, (int) (1));
			_setstack.setCount((int) 2);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
