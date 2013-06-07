package learningMod.Nocturnal.block;

import learningMod.Nocturnal.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockLearningMod extends Block {
    
    public BlockLearningMod(int id, Material material) {
        super(id, material);
    }
    
    @SideOnly(Side.CLIENT)
    
    @Override
    public void registerIcons(IconRegister register) {
        /* Gives a new block. MOD_ID = Mod name + ; this. statement calls the block*/
        blockIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }
}
