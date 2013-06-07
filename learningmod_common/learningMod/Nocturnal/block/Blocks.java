package learningMod.Nocturnal.block;

import learningMod.Nocturnal.lib.BlockIds;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class Blocks {
    
    public static Block NewBlock;

    public static void BlocksInit() {
        NewBlock = new NewBlock(BlockIds.NEWBLOCK_ID);
        
        GameRegistry.registerBlock(NewBlock);

    }
}
