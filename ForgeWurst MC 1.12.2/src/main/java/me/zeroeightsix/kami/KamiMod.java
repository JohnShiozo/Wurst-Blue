package me.zeroeightsix.kami;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = KamiMod.MODID, name = KamiMod.NAME, version = KamiMod.VERSION)
public class KamiMod {
    public static final String MODID = "wurstblue";
    public static final String NAME = "Wurst Blue";
    public static final String VERSION = "1.0";
    public static final String FULL_VERSION = ChatFormatting.AQUA + NAME + ChatFormatting.WHITE + " " + VERSION;

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new EventProcessor());
        ModuleManager.INSTANCE.init();
    }
}
