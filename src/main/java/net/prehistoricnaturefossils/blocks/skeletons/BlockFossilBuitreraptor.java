package net.prehistoricnaturefossils.blocks.skeletons;

import net.lepidodendron.block.base.IArchiveVertebrate;
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
import net.prehistoricnaturefossils.blocks.base.BlockSkeletonBase;
import net.prehistoricnaturefossils.items.ItemInit;
import net.prehistoricnaturefossils.tile.TileEntityFossilBuitreraptor;
import net.prehistoricnaturefossils.triggers.CustomTrigger;
import net.prehistoricnaturefossils.triggers.ModTriggers;

import javax.annotation.Nullable;

public class BlockFossilBuitreraptor extends BlockSkeletonBase implements IArchiveVertebrate {

    public BlockFossilBuitreraptor() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_buitreraptor");
        setTranslationKey("pf_skeleton_buitreraptor");
        GameRegistry.registerTileEntity(TileEntityFossilBuitreraptor.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_buitreraptor");
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
        return "mobdnaPNlepidodendron:prehistoric_flora_buitreraptor";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilBuitreraptor();
    }

    @Override
    public int stages() {
        return 5;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return ModTriggers.BUITRERAPTOR_COMPLETE;
    }

}
