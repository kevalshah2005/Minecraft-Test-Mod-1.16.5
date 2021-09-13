package io.github.kevalshah2005.core.init;

import io.github.kevalshah2005.TestMod;
import io.github.kevalshah2005.common.items.SpecialItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
		
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
			ForgeRegistries.ITEMS, 
			TestMod.MOD_ID
			);
	
	/*
	public static final RegistryObject<Item> CRYSTAL_SWORD = ITEMS.register("crystal_sword", 
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_COMBAT))
			);
	*/
	
	public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal",
			() -> new Item(new Item.Properties().tab(TestMod.TEST_MOD_GROUP)));
	
	public static final RegistryObject<SpecialItem> CRYSTAL_WAND = ITEMS.register("crystal_wand", 
			() -> new SpecialItem(new Item.Properties().tab(TestMod.TEST_MOD_GROUP)));
	
	// Food Items
	public static final Food CRYSTAL_APPLE_FOOD = (new Food.Builder())
			.effect(() -> new EffectInstance(Effects.REGENERATION, 1000, 2), 1.0f)
			.effect(() -> new EffectInstance(Effects.ABSORPTION, 800, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.DAMAGE_RESISTANCE, 1000, 2), 1.0f)
			.nutrition(20)
			.saturationMod(1.2f)
			.alwaysEat()
			.build();
	public static final RegistryObject<Item> CRYSTAL_APPLE = ITEMS.register("crystal_apple",
			() -> new Item(new Item.Properties().tab(TestMod.TEST_MOD_GROUP).food(CRYSTAL_APPLE_FOOD)));
	
	// Block Items
	public static final RegistryObject<BlockItem> CRYSTAL_ORE = ITEMS.register(
			"crystal_ore", 
			() -> new BlockItem(
					BlockInit.CRYSTAL_ORE.get(), 
					new Item.Properties().tab(TestMod.TEST_MOD_GROUP)
			));
}
