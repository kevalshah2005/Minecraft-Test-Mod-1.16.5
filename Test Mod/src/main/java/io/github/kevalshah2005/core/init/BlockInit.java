package io.github.kevalshah2005.core.init;

import io.github.kevalshah2005.TestMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
			ForgeRegistries.BLOCKS, 
			TestMod.MOD_ID
			);
	
	public static final RegistryObject<OreBlock> CRYSTAL_ORE = BLOCKS.register(
			"crystal_ore", 
			() -> new OreBlock(AbstractBlock.Properties.of(Material.STONE)
					.requiresCorrectToolForDrops()
					.strength(15.0f, 100.0f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(4)
					.sound(SoundType.NETHER_ORE)));
}
