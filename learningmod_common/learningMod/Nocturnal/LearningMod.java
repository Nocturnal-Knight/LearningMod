package learningMod.Nocturnal;

import java.io.File;

import learningMod.Nocturnal.block.Blocks;
import learningMod.Nocturnal.configuration.ConfigurationHandler;
import learningMod.Nocturnal.core.handler.LocalizationHandler;
import learningMod.Nocturnal.core.proxy.CommonProxy;
import learningMod.Nocturnal.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod (modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

@NetworkMod (channels = {Reference.CHANNEL_NAME}, clientSideRequired = true, serverSideRequired = false)

public class LearningMod {
    
    @SidedProxy (clientSide = Reference.CLIENT_PROXY_LOCATION ,serverSide = Reference.COMMON_PROXY_LOCATION)
    public static CommonProxy proxy;
    
    /* Initialised before mod starts */
    @PreInit
    public void preInit (FMLPreInitializationEvent event) {
        Blocks.BlocksInit();
        
        LocalizationHandler.loadLanguages();
        
        ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath()+ File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
    }
    
    /* Initialised when mod is loaded */
    @Init
    public void init (FMLInitializationEvent event) {
        
    }
    /* Initialised after mod is loaded */
    @PostInit
    public void postInit (FMLPostInitializationEvent event) {
        
    }
}
