package learningMod.Nocturnal.configuration;

import java.io.File;
import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;

import learningMod.Nocturnal.lib.BlockIds;
import learningMod.Nocturnal.lib.Reference;
import learningMod.Nocturnal.lib.Strings;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {

    public static Configuration config;
    public static void init(File file){
        config = new Configuration(file);
        
        try {
             config.load();
             
             BlockIds.NEWBLOCK_ID = config.getBlock(Strings.NEWBLOCK_NAME, BlockIds.NEWBLOCK_ID_DEFAULT).getInt(BlockIds.NEWBLOCK_ID_DEFAULT);
        }
        catch(Exception e){
               FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the config file");
        }
        finally {
            config.save();
        }
    }   
}
