package io.github.kevalshah2005.common.items;

import java.util.List;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SpecialItem extends Item {

	public SpecialItem(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack p_77624_1_, World p_77624_2_, List<ITextComponent> p_77624_3_,
			ITooltipFlag p_77624_4_) {
		// TODO Auto-generated method stub
		super.appendHoverText(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);
		if (InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)){
			p_77624_3_.add(new StringTextComponent("Advanced Tooltip"));
		} else {
			p_77624_3_.add(new TranslationTextComponent("tooltip.special_item.hold_shift"));
		}
	}
	
	/*
	@Override
	public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
		// TODO Auto-generated method stub		
		ZombieEntity zombie = new ZombieEntity(worldIn);
		zombie.setPosition(playerIn.getX(), playerIn.getY(), playerIn.getZ());
		worldIn.addEntity(zombie));
		
		return ActionResult(resultSuccess(playerIn.getItem))
	}
	*/
}
