
package net.mcreator.sgeorsge.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.sgeorsge.itemgroup.SgeorsgeDuplicatioItemGroup;
import net.mcreator.sgeorsge.SgeorsgeModElements;

@SgeorsgeModElements.ModElement.Tag
public class DiamondDustItem extends SgeorsgeModElements.ModElement {
	@ObjectHolder("sgeorsge:diamond_dust")
	public static final Item block = null;
	public DiamondDustItem(SgeorsgeModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SgeorsgeDuplicatioItemGroup.tab).maxStackSize(64));
			setRegistryName("diamond_dust");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
