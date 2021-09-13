package io.github.kevalshah2005;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.kevalshah2005.core.enums.Swords;
import io.github.kevalshah2005.core.init.BlockInit;
import io.github.kevalshah2005.core.init.ItemInit;
import io.github.kevalshah2005.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TestMod.MOD_ID)
public class TestMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "testmod_kevalshah2005";
    public static final ItemGroup TEST_MOD_GROUP = new TestModGroup("testmodtab");
    
    public TestMod() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        Swords.SWORDS.register(bus);
        
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }
    
    public static class TestModGroup extends ItemGroup {

		public TestModGroup(String label) {
			super(label);
			// TODO Auto-generated constructor stub
		}

		@Override
		public ItemStack makeIcon() {
			// TODO Auto-generated method stub
			return ItemInit.CRYSTAL.get().getDefaultInstance();
		}
    }
}
