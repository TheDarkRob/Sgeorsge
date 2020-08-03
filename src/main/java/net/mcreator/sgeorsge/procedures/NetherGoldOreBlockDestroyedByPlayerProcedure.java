package net.mcreator.sgeorsge.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sgeorsge.SgeorsgeModElements;

import java.util.Map;

@SgeorsgeModElements.ModElement.Tag
public class NetherGoldOreBlockDestroyedByPlayerProcedure extends SgeorsgeModElements.ModElement {
	public NetherGoldOreBlockDestroyedByPlayerProcedure(SgeorsgeModElements instance) {
		super(instance, 54);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure NetherGoldOreBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double random = 0;
		double drop = 0;
		for (int index0 = 0; index0 < (int) (6); index0++) {
			random = (double) Math.random();
			drop = (double) ((drop) + (random));
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET, (int) (1));
			_setstack.setCount((int) (drop));
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
