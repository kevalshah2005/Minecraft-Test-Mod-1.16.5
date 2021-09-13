package io.github.kevalshah2005.core.enums;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class Armor implements IArmorMaterial {
	
	CRYSTAL("crystal", 45, new int[]{4, 7, 9, 4}, 20, 
			SoundEvents.ARMOR_EQUIP_GENERIC, 4.0f, 0f, () -> Ingredient.(ItemInit.CRYSTAL.get()));

	private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
	private String name;
	private int durabilityMultiplier;
	private int[] slotProtections;
	private int enchantmentValue;
	private SoundEvent sound;
	private float toughness;
	private float knockbackResistance;
	private Ingredient repairIngredient;

	public Armor(String p_231593_1, int p_i231593_4_, int[] p_i231593_5_, int p_i231593_6_, SoundEvent p_i231593_7_, float p_i231593_8_, float p_i231593_9_, Supplier<Ingredient> p_i231593_10_) {
		this.name = p_231593_1;
		this.durabilityMultiplier = p_i231593_4_;
		this.slotProtections = p_i231593_5_;
		this.enchantmentValue = p_i231593_6_;
		this.sound = p_i231593_7_;
		this.toughness = p_i231593_8_;
		this.knockbackResistance = p_i231593_9_;
		this.repairIngredient = p_i231593_10_.get();
	}

	public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
		return HEALTH_PER_SLOT[p_200896_1_.getIndex()] * this.durabilityMultiplier;
	}

	public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
		return slotProtections[p_200902_1_.getIndex()];
	}

	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	public SoundEvent getEquipSound() {
		return this.sound;
	}

	public Ingredient getRepairIngredient() {
		return this.repairIngredient;
	}

	@OnlyIn(Dist.CLIENT)
	public String getName() {
		return this.name;
	}

	public float getToughness() {
		return this.toughness;
	}

	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
	

}
