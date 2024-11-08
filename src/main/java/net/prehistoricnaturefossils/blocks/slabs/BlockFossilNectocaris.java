package net.prehistoricnaturefossils.blocks.slabs;

import net.lepidodendron.block.base.IArchiveInvertebrate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.blocks.base.BlockInit;
import net.prehistoricnaturefossils.blocks.base.BlockSlabBase;
import net.prehistoricnaturefossils.items.ItemInit;
import net.prehistoricnaturefossils.tile.TileEntityFossilNectocaris;
import net.prehistoricnaturefossils.triggers.CustomTrigger;

import javax.annotation.Nullable;

public class BlockFossilNectocaris extends BlockSlabBase implements IArchiveInvertebrate {

    public BlockFossilNectocaris() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_nectocaris");
        setTranslationKey("pf_skeleton_nectocaris");
        GameRegistry.registerTileEntity(TileEntityFossilNectocaris.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_nectocaris");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this) {
            @Override
            public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
                return BlockInit.onItemUseFossils(this, player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
            }
        }.setRegistryName(this.getRegistryName()));
    }

    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_nectocaris";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilNectocaris();
    }

    @Override
    public int stages() {
        return 1;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return null;
    }

}
