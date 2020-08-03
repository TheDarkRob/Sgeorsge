
package net.mcreator.sgeorsge.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.sgeorsge.item.RiceItem;
import net.mcreator.sgeorsge.SgeorsgeModElements;

@SgeorsgeModElements.ModElement.Tag
public class SgeorsgeFoodItemGroup extends SgeorsgeModElements.ModElement {
	public SgeorsgeFoodItemGroup(SgeorsgeModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsgeorsge_food") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RiceItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
