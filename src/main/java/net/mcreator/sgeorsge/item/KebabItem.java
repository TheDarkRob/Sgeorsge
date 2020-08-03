
package net.mcreator.sgeorsge.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.sgeorsge.procedures.KebabFoodEatenProcedure;
import net.mcreator.sgeorsge.SgeorsgeModElements;

import java.util.Map;
import java.util.HashMap;

@SgeorsgeModElements.ModElement.Tag
public class KebabItem extends SgeorsgeModElements.ModElement {
	@ObjectHolder("sgeorsge:kebab")
	public static final Item block = null;
	public KebabItem(SgeorsgeModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(20).saturation(20f).meat().build()));
			setRegistryName("kebab");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 30;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				KebabFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
