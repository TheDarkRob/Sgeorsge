
package net.mcreator.sgeorsge.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.sgeorsge.SgeorsgeModElements;

@SgeorsgeModElements.ModElement.Tag
public class SgeorsgeNetherItemGroup extends SgeorsgeModElements.ModElement {
	public SgeorsgeNetherItemGroup(SgeorsgeModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsgeorsge_nether") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.BUBBLE_COLUMN, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
