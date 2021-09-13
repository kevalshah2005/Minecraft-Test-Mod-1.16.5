package io.github.kevalshah2005.core.enums;

import io.github.kevalshah2005.TestMod;
import io.github.kevalshah2005.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Pickaxes extends PickaxeItem implements IItemTier {
	
	public static final DeferredRegister<Item> PICKAXES = DeferredRegister.create(
			ForgeRegistries.ITEMS, 
			TestMod.MOD_ID
			);
	
	public PickaxeItem(IItemTier p_i48478_1_, int p_i48478_2_, float p_i48478_3_, Item.Properties p_i48478_4_) {
	      super((float)p_i48478_2_, p_i48478_3_, p_i48478_1_, DIGGABLES, p_i48478_4_.addToolType(net.minecraftforge.common.ToolType.PICKAXE, p_i48478_1_.getLevel()));
	}
	
	public static final RegistryObject<Item> CRYSTAL_PICKAXE = ItemInit.ITEMS.register("crystal_sword", 
			() -> new Pickaxes(ItemTier.NETHERITE, 10 - 5, 1.6f - 4f, new SwordItem.Properties().tab(TestMod.TEST_MOD_GROUP)));

	@Override
	public int getUses() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getAttackDamageBonus() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEnchantmentValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
