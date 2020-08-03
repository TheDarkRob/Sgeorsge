
package net.mcreator.sgeorsge.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.sgeorsge.itemgroup.SgeorsgeNetherItemGroup;
import net.mcreator.sgeorsge.SgeorsgeModElements;

import java.util.List;
import java.util.Collections;

@SgeorsgeModElements.ModElement.Tag
public class PolishedBasaltBlock extends SgeorsgeModElements.ModElement {
	@ObjectHolder("sgeorsge:polished_basalt")
	public static final Block block = null;
	public PolishedBasaltBlock(SgeorsgeModElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(SgeorsgeNetherItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.25f, 4.2f).lightValue(0).harvestLevel(0)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("polished_basalt");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
