package learningMod.Nocturnal.block;

import learningMod.Nocturnal.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class NewBlock extends BlockLearningMod {
    
    public NewBlock(int id) {
        super (id, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setUnlocalizedName(Strings.NEWBLOCK_NAME);
    }
}
