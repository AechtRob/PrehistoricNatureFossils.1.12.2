package net.prehistoricnaturefossils;

import net.lepidodendron.block.*;
import net.lepidodendron.block.base.IArchiveInvertebrate;
import net.lepidodendron.block.base.IArchivePlant;
import net.lepidodendron.block.base.IArchiveStatic;
import net.lepidodendron.block.base.IArchiveVertebrate;
import net.lepidodendron.item.ItemFossilHammer;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.prehistoricnaturefossils.blocks.base.BlockInit;
import net.prehistoricnaturefossils.blocks.base.BlockSkeletonBase;
import net.prehistoricnaturefossils.blocks.base.BlockSlabBase;
import net.prehistoricnaturefossils.blocks.base.IAdvancementGranterFossil;
import net.prehistoricnaturefossils.enchantments.Enchantments;
import net.prehistoricnaturefossils.items.ItemSlabFinder;

import java.util.List;
import java.util.Random;

public class FossilBlockDrops {

    @SubscribeEvent //Add to the block drops for the fossils
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        Random rand = event.getWorld().rand;
        World worldIn = event.getWorld();
        if (event.getPlayer() == null) {
            return;
        }
        if (event.getPlayer().isCreative()) {
            return;
        }
        ItemStack stack = event.getPlayer().getHeldItemMainhand();
        BlockPos pos = event.getPos();
        IBlockState state = event.getState();
        if (state.getBlock() instanceof BlockFossil) {
            if (!worldIn.isRemote && stack.getItem() == ItemFossilHammer.block) {
                ItemStack dropStack = getDisplayableFossilStackModified(state, event.getPlayer(), stack, false);
                if (new Random().nextInt(10) == 0) {
                    if (!dropStack.isEmpty()) {
                        Block.spawnAsEntity(worldIn, pos, dropStack);
                    }
                }
                //fortune modifier:
                int levelEnchantment = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.FORTUNE, stack);
                int ii = rand.nextInt(levelEnchantment + 1) * 2;
                for (int i = 0; i < ii; ++i) {
                    if (rand.nextInt(2) == 0) {
                        dropStack = getDisplayableFossilStackModified(state, event.getPlayer(), stack, false);
                        if (new Random().nextInt(10) == 0) {
                            if (!dropStack.isEmpty()) {
                                Block.spawnAsEntity(worldIn, pos, dropStack);
                            }
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent //Add to the block drops for the fossils
    public void onBlockBreak(BlockEvent.HarvestDropsEvent event) {
        Random rand = event.getWorld().rand;
        World worldIn = event.getWorld();
        if (event.getHarvester() == null) {
            return;
        }
        if (event.getHarvester().isCreative()) {
            return;
        }
        ItemStack stack = event.getHarvester().getHeldItemMainhand();
        BlockPos pos = event.getPos();
        IBlockState state = event.getState();
        if (state.getBlock() instanceof BlockFossil) {
            //Fossil drops for the new tool:
            if (!worldIn.isRemote && stack.getItem() instanceof ItemSlabFinder) {
                BlockFossil fossilBlock = (BlockFossil) state.getBlock();
                Block.spawnAsEntity(worldIn, pos, fossilBlock.getFossilDrop());
                Block.spawnAsEntity(worldIn, pos,  fossilBlock.getFossilDrop());
                event.getHarvester().addStat(StatList.getBlockStats(fossilBlock));
                //fortune modifier:
                int levelEnchantment = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.FORTUNE, stack);
                int ii = rand.nextInt(levelEnchantment + 1) * 2;
                for (int i = 0; i < ii; ++i) {
                    if (rand.nextInt(3) == 0) {
                        Block.spawnAsEntity(worldIn, pos, fossilBlock.getFossilDrop());
                    }
                }
                //Add the displayables for this:
                ItemStack dropStack = getDisplayableFossilStackModified(state, event.getHarvester(), stack, true);
                if (new Random().nextInt(10) == 0) {
                    if (!dropStack.isEmpty()) {
                        Block.spawnAsEntity(worldIn, pos, dropStack);
                    }
                }
                //fortune modifier:
                levelEnchantment = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.FORTUNE, stack);
                ii = rand.nextInt(levelEnchantment + 1) * 2;
                for (int i = 0; i < ii; ++i) {
                    if (rand.nextInt(2) == 0) {
                        dropStack = getDisplayableFossilStackModified(state, event.getHarvester(), stack, true);
                        if (new Random().nextInt(10) == 0) {
                            if (!dropStack.isEmpty()) {
                                Block.spawnAsEntity(worldIn, pos, dropStack);
                            }
                        }
                    }
                }
                event.setDropChance(0); //prevent dropping the block!
            }
        }
    }

    public ItemStack getDisplayableFossilStackModified(IBlockState state, EntityPlayer player, ItemStack stack, boolean slabs) {
        int chanceImprover = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(Enchantments.DISCERNING_COLLECTOR, stack);
        int chanceImproverFactor = chanceImprover * 4;
        ItemStack resultStack = ItemStack.EMPTY;
        for (int i = 0; i <= chanceImproverFactor; i++) {
            resultStack = getDisplayableFossilStack(state, slabs);
            if ((!hasAdvancement(resultStack, player)) && Block.getBlockFromItem(resultStack.getItem()) != null && !resultStack.isEmpty()) {
                break;
            }
            if (chanceImprover > 0) {
                if ((new Random()).nextInt(chanceImproverFactor) == 0) {
                    break;
                }
            }
        }
        int period = 0;
        if (state.getBlock() == BlockFossilPrecambrian.block) {
            period = 1;
        }
        else if (state.getBlock() == BlockFossilCambrian.block) {
            period = 2;
        }
        else if (state.getBlock() == BlockFossilOrdovician.block) {
            period = 3;
        }
        else if (state.getBlock() == BlockFossilSilurian.block) {
            period = 4;
        }
        else if (state.getBlock() == BlockFossilDevonian.block) {
            period = 5;
        }
        else if (state.getBlock() == BlockFossilCarboniferous.block) {
            period = 6;
        }
        else if (state.getBlock() == BlockFossilPermian.block) {
            period = 7;
        }
        else if (state.getBlock() == BlockFossilTriassic.block) {
            period = 8;
        }
        else if (state.getBlock() == BlockFossilJurassic.block) {
            period = 9;
        }
        else if (state.getBlock() == BlockFossilCretaceous.block) {
            period = 10;
        }
        else if (state.getBlock() == BlockFossilPaleogene.block) {
            period = 11;
        }
        else if (state.getBlock() == BlockFossilNeogene.block) {
            period = 12;
        }
        else if (state.getBlock() == BlockFossilPleistocene.block) {
            period = 13;
        }
        if (!resultStack.isEmpty()) {
            Block origin = Block.getBlockFromItem(resultStack.getItem());
            NBTTagCompound stackNBT = new NBTTagCompound();
            if (origin instanceof IArchiveVertebrate) {
                stackNBT.setString("mobtype", "vertebrate");
                resultStack.setTagCompound(stackNBT);

                NBTTagCompound entityNBT = new NBTTagCompound();
                entityNBT.setString("id", "");
                resultStack.getTagCompound().setTag("PFMob", entityNBT);

                if (period != 0) {
                    resultStack.getTagCompound().setInteger("period", period);
                }
            }
            else if (origin instanceof IArchiveInvertebrate) {
                stackNBT.setString("mobtype", "invertebrate");
                resultStack.setTagCompound(stackNBT);

                NBTTagCompound entityNBT = new NBTTagCompound();
                entityNBT.setString("id", "");
                resultStack.getTagCompound().setTag("PFMob", entityNBT);
                if (period != 0) {
                    resultStack.getTagCompound().setInteger("period", period);
                }
            }
            else if (origin instanceof IArchiveStatic) {
                NBTTagCompound entityNBT = new NBTTagCompound();
                entityNBT.setString("id", "");
                stackNBT.setTag("PFStatic", entityNBT);
                resultStack.setTagCompound(stackNBT);
                if (period != 0) {
                    resultStack.getTagCompound().setInteger("period", period);
                }
            }
            else if (origin instanceof IArchivePlant) {
                NBTTagCompound entityNBT = new NBTTagCompound();
                entityNBT.setString("id", "");
                stackNBT.setTag("PFPlant", entityNBT);
                resultStack.setTagCompound(stackNBT);
                if (period != 0) {
                    resultStack.getTagCompound().setInteger("period", period);
                }
            }
        }
        return resultStack;
    }

    public boolean hasAdvancement(ItemStack stack, EntityPlayer player) {

        String strAdv = "";
        if (stack.isEmpty()) {
            return false;
        }
        if (stack.equals(ItemStack.EMPTY)) {
            return false;
        }
        if (stack == ItemStack.EMPTY) {
            return false;
        }
        if (Block.getBlockFromItem(stack.getItem()) == null) {
            return false;
        }
        if (Block.getBlockFromItem(stack.getItem()) instanceof IAdvancementGranterFossil) {
            if (((IAdvancementGranterFossil) Block.getBlockFromItem(stack.getItem())).getModTrigger() == null) {
                return false;
            }
            strAdv = ((IAdvancementGranterFossil) Block.getBlockFromItem(stack.getItem())).getModTrigger().getId().toString();
            strAdv = strAdv.replace("minecraft:", "prehistoricnaturefossils:");
        }
        if (strAdv.equalsIgnoreCase("")) {
            return false;
        }
        if ((((WorldServer) player.world).getAdvancementManager()
                .getAdvancement(new ResourceLocation(strAdv))) == null) {
            return false;
        }
        if (player instanceof EntityPlayerMP) {
            if (((EntityPlayerMP)player).getAdvancements().getProgress(((WorldServer) player.world).getAdvancementManager()
                .getAdvancement(new ResourceLocation(strAdv))).isDone()) {
                return true;
            }
        }
        return false;
    }


    public ItemStack getDisplayableFossilStack(IBlockState state, boolean slabs) {
        if (state.getBlock() == BlockFossilPrecambrian.block) {
            return fossilDropDisplayable(1, slabs);
        } else if (state.getBlock() == BlockFossilCambrian.block) {
            return fossilDropDisplayable(2, slabs);
        } else if (state.getBlock() == BlockFossilOrdovician.block) {
            return fossilDropDisplayable(3, slabs);
        } else if (state.getBlock() == BlockFossilSilurian.block) {
            return fossilDropDisplayable(4, slabs);
        } else if (state.getBlock() == BlockFossilDevonian.block) {
            return fossilDropDisplayable(5, slabs);
        } else if (state.getBlock() == BlockFossilCarboniferous.block) {
            return fossilDropDisplayable(6, slabs);
        } else if (state.getBlock() == BlockFossilPermian.block) {
            return fossilDropDisplayable(7, slabs);
        } else if (state.getBlock() == BlockFossilTriassic.block) {
            return fossilDropDisplayable(8, slabs);
        } else if (state.getBlock() == BlockFossilJurassic.block) {
            return fossilDropDisplayable(9, slabs);
        } else if (state.getBlock() == BlockFossilCretaceous.block) {
            return fossilDropDisplayable(10, slabs);
        } else if (state.getBlock() == BlockFossilPaleogene.block) {
            return fossilDropDisplayable(11, slabs);
        } else if (state.getBlock() == BlockFossilNeogene.block) {
            return fossilDropDisplayable(12, slabs);
        } else if (state.getBlock() == BlockFossilPleistocene.block) {
            return fossilDropDisplayable(13, slabs);
        } else {
            return ItemStack.EMPTY;
        }
    }

    public static ItemStack fossilDropDisplayable(int dim, boolean slabs) {

        switch (dim) {
            case 1:
            default: //Precambrian
                if (slabs) {
                    int ii = (new Random()).nextInt(getPrecambrianDisplayableFossilDropsSlabs().length);
                    return getPrecambrianDisplayableFossilDropsSlabs()[ii];
                }
                else {
                    int ii = (new Random()).nextInt(getPrecambrianDisplayableFossilDrops().length);
                    return getPrecambrianDisplayableFossilDrops()[ii];
                }

            case 2: //Cambrian
                if (slabs) {
                    int ii = (new Random()).nextInt(getCambrianDisplayableFossilDropsSlabs().length);
                    return getCambrianDisplayableFossilDropsSlabs()[ii];
                }
                else {
                    int ii = (new Random()).nextInt(getCambrianDisplayableFossilDrops().length);
                    return getCambrianDisplayableFossilDrops()[ii];
                }

            case 3: //Ordovician
                if (slabs) {
                    int ii = (new Random()).nextInt(getOrdovicianDisplayableFossilDropsSlabs().length);
                    return getOrdovicianDisplayableFossilDropsSlabs()[ii];
                }
                else {
                    int ii = (new Random()).nextInt(getOrdovicianDisplayableFossilDrops().length);
                    return getOrdovicianDisplayableFossilDrops()[ii];
                }

            case 4: //Silurian
                if (slabs) {
                    int ii = (new Random()).nextInt(getSilurianDisplayableFossilDropsSlabs().length);
                    return getSilurianDisplayableFossilDropsSlabs()[ii];
                }
                else {
                    int ii = (new Random()).nextInt(getSilurianDisplayableFossilDrops().length);
                    return getSilurianDisplayableFossilDrops()[ii];
                }

            case 5: //Devonian
                if (slabs) {
                    int ii = (new Random()).nextInt(getDevonianDisplayableFossilDropsSlabs().length);
                    return getDevonianDisplayableFossilDropsSlabs()[ii];
                }
                else {
                    int ii = (new Random()).nextInt(getDevonianDisplayableFossilDrops().length);
                    return getDevonianDisplayableFossilDrops()[ii];
                }

            case 6: //Carboniferous
                if (slabs) {
                    int ii = (new Random()).nextInt(getCarboniferousDisplayableFossilDropsSlabs().length);
                    return getCarboniferousDisplayableFossilDropsSlabs()[ii];
                }
                else {
                    int ii = (new Random()).nextInt(getCarboniferousDisplayableFossilDrops().length);
                    return getCarboniferousDisplayableFossilDrops()[ii];
                }

            case 7: //Permian
                if (slabs) {
                    int ii = (new Random()).nextInt(getPermianDisplayableFossilDropsSlabs().length);
                    return getPermianDisplayableFossilDropsSlabs()[ii];
                }
                else {
                    int ii = (new Random()).nextInt(getPermianDisplayableFossilDrops().length);
                    return getPermianDisplayableFossilDrops()[ii];
                }

            case 8: //Triassic
                if (slabs) {
                    int ii = (new Random()).nextInt(getTriassicDisplayableFossilDropsSlabs().length);
                    return getTriassicDisplayableFossilDropsSlabs()[ii];
                }
                else {
                    int ii = (new Random()).nextInt(getTriassicDisplayableFossilDrops().length);
                    return getTriassicDisplayableFossilDrops()[ii];
                }

            case 9: //Jurassic
                if (slabs) {
                    int ii = (new Random()).nextInt(getJurassicDisplayableFossilDropsSlabs().length);
                    return getJurassicDisplayableFossilDropsSlabs()[ii];
                }
                else {
                    int ii = (new Random()).nextInt(getJurassicDisplayableFossilDrops().length);
                    return getJurassicDisplayableFossilDrops()[ii];
                }

            case 10: //Cretaceous
                if (slabs) {
                    int ii = (new Random()).nextInt(getCretaceousDisplayableFossilDropsSlabs().length);
                    return getCretaceousDisplayableFossilDropsSlabs()[ii];
                }
                else {
                    int ii = (new Random()).nextInt(getCretaceousDisplayableFossilDrops().length);
                    return getCretaceousDisplayableFossilDrops()[ii];
                }

            case 11: //Paleogene
                if (slabs) {
                    int ii = (new Random()).nextInt(getPaleogeneDisplayableFossilDropsSlabs().length);
                    return getPaleogeneDisplayableFossilDropsSlabs()[ii];
                }
                else {
                    int ii = (new Random()).nextInt(getPaleogeneDisplayableFossilDrops().length);
                    return getPaleogeneDisplayableFossilDrops()[ii];
                }

            case 12: //Neogene
                if (slabs) {
                    int ii = (new Random()).nextInt(getNeogeneDisplayableFossilDropsSlabs().length);
                    return getNeogeneDisplayableFossilDropsSlabs()[ii];
                }
                else {
                    int ii = (new Random()).nextInt(getNeogeneDisplayableFossilDrops().length);
                    return getNeogeneDisplayableFossilDrops()[ii];
                }

            case 13: //Pleistocene
                if (slabs) {
                    int ii = (new Random()).nextInt(getPleistoceneDisplayableFossilDropsSlabs().length);
                    return getPleistoceneDisplayableFossilDropsSlabs()[ii];
                }
                else {
                    int ii = (new Random()).nextInt(getPleistoceneDisplayableFossilDrops().length);
                    return getPleistoceneDisplayableFossilDrops()[ii];
                }

        }
    }

    public static ItemStack[] getPrecambrianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                ItemStack.EMPTY
        };
        return itemStack;
    }

    public static ItemStack[] getCambrianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                ItemStack.EMPTY
        };
        return itemStack;
    }

    public static ItemStack[] getOrdovicianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                ItemStack.EMPTY
        };
        return itemStack;
    }

    public static ItemStack[] getSilurianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                ItemStack.EMPTY
        };
        return itemStack;
    }

    public static ItemStack[] getDevonianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_BUNGARTIUS, 1),
                new ItemStack(BlockInit.FOSSIL_DUNKLEOSTEUS, 1),
                new ItemStack(BlockInit.FOSSIL_BOTHRIOLEPIS, 1),
                new ItemStack(BlockInit.FOSSIL_ACANTHOSTEGA, 1),
                new ItemStack(BlockInit.FOSSIL_TITANICHTHYS, 1),
                new ItemStack(BlockInit.FOSSIL_ICHTHYOSTEGA, 1),
                new ItemStack(BlockInit.FOSSIL_PARMASTEGA, 1),
                new ItemStack(BlockInit.FOSSIL_TIKTAALIK, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCarboniferousDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_STENOKRANIO, 1),
                new ItemStack(BlockInit.FOSSIL_DIPLOCAULUS, 1),
                new ItemStack(BlockInit.FOSSIL_EDAPHOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_CRASSIGYRINUS, 1),
                new ItemStack(BlockInit.FOSSIL_ANTHRACOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_LIMNOSCELIS, 1),
                new ItemStack(BlockInit.FOSSIL_OPHIACODON, 1),
                new ItemStack(BlockInit.FOSSIL_DATHEOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_PHOLIDERPETON, 1),
                new ItemStack(BlockInit.FOSSIL_PROTEROGYRINUS, 1),
                new ItemStack(BlockInit.FOSSIL_ERYOPS, 1),
                new ItemStack(BlockInit.FOSSIL_MEGALOCEPHALUS, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPermianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_ANTEOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_DIMETRODON, 1),
                new ItemStack(BlockInit.FOSSIL_OPHIACODON, 1),
                new ItemStack(BlockInit.FOSSIL_GAIASIA, 1),
                new ItemStack(BlockInit.FOSSIL_DEUTEROSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_DIPLOCAULUSMINIMUS, 1),
                new ItemStack(BlockInit.FOSSIL_NIGERPETON, 1),
                new ItemStack(BlockInit.FOSSIL_SECODONTOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_DIPLOCAULUS, 1),
                new ItemStack(BlockInit.FOSSIL_MOSCHOPS, 1),
                new ItemStack(BlockInit.FOSSIL_URANOCENTRODON, 1),
                new ItemStack(BlockInit.FOSSIL_ROBERTIA, 1),
                new ItemStack(BlockInit.FOSSIL_CACOPS, 1),
                new ItemStack(BlockInit.FOSSIL_LABIDOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_PRISTEROGNATHUS, 1),
                new ItemStack(BlockInit.FOSSIL_ENDOTHIODON, 1),
                new ItemStack(BlockInit.FOSSIL_ACANTHOSTOMATOPS, 1),
                new ItemStack(BlockInit.FOSSIL_MELOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_VIVAXOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_DASYCEPS, 1),
                new ItemStack(BlockInit.FOSSIL_DIPLOCERASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_CRIOCEPHALOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_CTENOSPONDYLUS, 1),
                new ItemStack(BlockInit.FOSSIL_EUNOTOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ELGINIA, 1),
                new ItemStack(BlockInit.FOSSIL_DATHEOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ERYOPS, 1),
                new ItemStack(BlockInit.FOSSIL_INOSTRANCEVIA, 1),
                new ItemStack(BlockInit.FOSSIL_BUNOSTEGOS, 1),
                new ItemStack(BlockInit.FOSSIL_PLATYHYSTRIX, 1),
                new ItemStack(BlockInit.FOSSIL_TIARAJUDENS, 1),
                new ItemStack(BlockInit.FOSSIL_PROBURNETIA, 1),
                new ItemStack(BlockInit.FOSSIL_LYSTROSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_TETRACERATOPS, 1),
                new ItemStack(BlockInit.FOSSIL_SCUTOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_JONKERIA, 1),
                new ItemStack(BlockInit.FOSSIL_RUBIDGEA, 1),
                new ItemStack(BlockInit.FOSSIL_DIADECTES, 1),
                new ItemStack(BlockInit.FOSSIL_SUMINIA, 1),
                new ItemStack(BlockInit.FOSSIL_PRIONOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_ESTEMMENOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_EDAPHOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_COTYLORHYNCHUS, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getTriassicDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_ARIZONASAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_CYAMODUS, 1),
                new ItemStack(BlockInit.FOSSIL_EFFIGIA, 1),
                new ItemStack(BlockInit.FOSSIL_KRANOSAURA, 1),
                new ItemStack(BlockInit.FOSSIL_GERROTHORAX, 1),
                new ItemStack(BlockInit.FOSSIL_STANOCEPHALOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_NICROSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ERETMORHIPIS, 1),
                new ItemStack(BlockInit.FOSSIL_CARTORHYNCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_STAHLECKERIA, 1),
                new ItemStack(BlockInit.FOSSIL_BATRACHOTOMUS, 1),
                new ItemStack(BlockInit.FOSSIL_QIANOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_KANNEMEYERIA, 1),
                new ItemStack(BlockInit.FOSSIL_RABIDOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_HESCHELERIA, 1),
                new ItemStack(BlockInit.FOSSIL_MEGALANCOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_TERATERPETON, 1),
                new ItemStack(BlockInit.FOSSIL_TRILOPHOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_YUNGUISAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_MIXOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_LOTOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_HUPEHSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_DIADEMODON, 1),
                new ItemStack(BlockInit.FOSSIL_RIOJASUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_RECHNISAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_STAGONOLEPIS, 1),
                new ItemStack(BlockInit.FOSSIL_AUSTRIADACTYLUS, 1),
                new ItemStack(BlockInit.FOSSIL_DREPANOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_CALLAWAYIA, 1),
                new ItemStack(BlockInit.FOSSIL_HYPURONECTOR, 1),
                new ItemStack(BlockInit.FOSSIL_LAIDLERIA, 1),
                new ItemStack(BlockInit.FOSSIL_HERRERASAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_LYSTROSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_HENODUS, 1),
                new ItemStack(BlockInit.FOSSIL_SHRINGASAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_MASTODONSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_TANYSTROPHEUS, 1),
                new ItemStack(BlockInit.FOSSIL_CYNOGNATHUS, 1),
                new ItemStack(BlockInit.FOSSIL_HYPERODAPEDON, 1),
                new ItemStack(BlockInit.FOSSIL_PROGANOCHELYS, 1),
                new ItemStack(BlockInit.FOSSIL_SILLOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_VANCLEAVEA, 1),
                new ItemStack(BlockInit.FOSSIL_THECODONTOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_XINPUSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_POSTOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_SILESAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_POPOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_LESSEMSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_NOTHOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ATOPODENTATUS, 1),
                new ItemStack(BlockInit.FOSSIL_LISOWICIA, 1),
                new ItemStack(BlockInit.FOSSIL_SMILOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_PLATEOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_COELOPHYSIS, 1),
                new ItemStack(BlockInit.FOSSIL_PLACERIAS, 1),
                new ItemStack(BlockInit.FOSSIL_PRESTOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_SHONISAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_PLACODUS, 1),
                new ItemStack(BlockInit.FOSSIL_ERYTHROSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_CYMBOSPONDYLUS, 1),
                new ItemStack(BlockInit.FOSSIL_DESMATOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_BOBOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_PROTEROSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_EORHYNCHOCHELYS, 1),
                new ItemStack(BlockInit.FOSSIL_LAGOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_LILIENSTERNUS, 1),
                new ItemStack(BlockInit.FOSSIL_CAVIRAMUS, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getJurassicDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_KENTROSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_OPHTHALMOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_KLAMELISAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ORNITHOLESTES, 1),
                new ItemStack(BlockInit.FOSSIL_LITARGOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_SCELIDOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_JIANCHANGNATHUS, 1),
                new ItemStack(BlockInit.FOSSIL_YINGSHANOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_MAMENCHISAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_HUAYANGOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ELAPHROSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_THALATTOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_ASFALTOVENATOR, 1),
                new ItemStack(BlockInit.FOSSIL_YUNNANOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_LESOTHOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_BRACHYTRACHELOPAN, 1),
                new ItemStack(BlockInit.FOSSIL_MANIDENS, 1),
                new ItemStack(BlockInit.FOSSIL_CHUNGKINGOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_EOCURSOR, 1),
                new ItemStack(BlockInit.FOSSIL_DRACORAPTOR, 1),
                new ItemStack(BlockInit.FOSSIL_PATAGOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_STOKESOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_EUSTREPTOSPONDYLUS, 1),
                new ItemStack(BlockInit.FOSSIL_KAYENTATHERIUM, 1),
                new ItemStack(BlockInit.FOSSIL_EOABELISAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_PLIOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ICHTHYOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_DILOPHOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ADEOPAPPOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_SINRAPTOR, 1),
                new ItemStack(BlockInit.FOSSIL_GIRAFFATITAN, 1),
                new ItemStack(BlockInit.FOSSIL_SHUNOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_MIRAGAIA, 1),
                new ItemStack(BlockInit.FOSSIL_HETERODONTOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ALLOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ANUROGNATHUS, 1),
                new ItemStack(BlockInit.FOSSIL_OPHTHALMOTHULE, 1),
                new ItemStack(BlockInit.FOSSIL_PLESIOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_RHAMPHORHYNCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_YUXISAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_CAMPTOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_CHILESAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_GUANLONG, 1),
                new ItemStack(BlockInit.FOSSIL_CAMARASAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_APATOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_PTERODACTYLUS, 1),
                new ItemStack(BlockInit.FOSSIL_COMPSOGNATHUS, 1),
                new ItemStack(BlockInit.FOSSIL_PROCERATOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_DIPLODOCUS, 1),
                new ItemStack(BlockInit.FOSSIL_BRACHIOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_LIMUSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_MYMOORAPELTA, 1),
                new ItemStack(BlockInit.FOSSIL_YANGCHUANOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_YI, 1),
                new ItemStack(BlockInit.FOSSIL_DIMORPHODON, 1),
                new ItemStack(BlockInit.FOSSIL_CRYOLOPHOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_TORVOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_EUROPASAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_GIGANTSPINOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_YINLONG, 1),
                new ItemStack(BlockInit.FOSSIL_TUOJIANGOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_STEGOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_DAKOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_RHOMALEOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_EURHINOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_TEMNODONTOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_SINOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_LUFENGOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_MONOLOPHOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_DEARC, 1),
                new ItemStack(BlockInit.FOSSIL_MEGALOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_CERATOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_lUSOVENATOR, 1),
                new ItemStack(BlockInit.FOSSIL_SIMOLESTES, 1),
                new ItemStack(BlockInit.FOSSIL_PIATNITZKYSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_CRYPTOCLIDUS, 1),
                new ItemStack(BlockInit.FOSSIL_NANNOPTERYGIUS, 1),
                new ItemStack(BlockInit.FOSSIL_CTENOCHASMA, 1),
                new ItemStack(BlockInit.FOSSIL_DRYOSAURUS, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCretaceousDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_TAPEJARA, 1),
                new ItemStack(BlockInit.FOSSIL_HALISKIA, 1),
                new ItemStack(BlockInit.FOSSIL_SPECTROVENATOR, 1),
                new ItemStack(BlockInit.FOSSIL_IKRANDRACO, 1),
                new ItemStack(BlockInit.FOSSIL_NASUTOCERATOPS, 1),
                new ItemStack(BlockInit.FOSSIL_HAMIPTERUS, 1),
                new ItemStack(BlockInit.FOSSIL_DSUNGARIPTERUS, 1),
                new ItemStack(BlockInit.FOSSIL_BEIPIAOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_HYPSELOSPINUS, 1),
                new ItemStack(BlockInit.FOSSIL_MONTANOCERATOPS, 1),
                new ItemStack(BlockInit.FOSSIL_MALAWISAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_TETHYSHADROS, 1),
                new ItemStack(BlockInit.FOSSIL_SPINOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ORNATOPS, 1),
                new ItemStack(BlockInit.FOSSIL_ANGULOMASTACATOR, 1),
                new ItemStack(BlockInit.FOSSIL_EINIOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_SHUVUUIA, 1),
                new ItemStack(BlockInit.FOSSIL_SKORPIOVENATOR, 1),
                new ItemStack(BlockInit.FOSSIL_REGALICERATOPS, 1),
                new ItemStack(BlockInit.FOSSIL_NEOVENATOR, 1),
                new ItemStack(BlockInit.FOSSIL_BRIGHTSTONEUS, 1),
                new ItemStack(BlockInit.FOSSIL_PROA, 1),
                new ItemStack(BlockInit.FOSSIL_HUAXIAZHOULONG, 1),
                new ItemStack(BlockInit.FOSSIL_CARCHARODONTOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_PTERODAUSTRO, 1),
                new ItemStack(BlockInit.FOSSIL_SARCOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_MEI, 1),
                new ItemStack(BlockInit.FOSSIL_SUCHOMIMUS, 1),
                new ItemStack(BlockInit.FOSSIL_EDMONTOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ANATOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_ASIATYRANNUS, 1),
                new ItemStack(BlockInit.FOSSIL_SINOCERATOPS, 1),
                new ItemStack(BlockInit.FOSSIL_NIGERSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_TYRANNOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_CHAOYANGOPTERUS, 1),
                new ItemStack(BlockInit.FOSSIL_YUANYANGLONG, 1),
                new ItemStack(BlockInit.FOSSIL_TUPANDACTYLUSNAVIGANS, 1),
                new ItemStack(BlockInit.FOSSIL_SINOPTERUS, 1),
                new ItemStack(BlockInit.FOSSIL_SHENZHOUPTERUS, 1),
                new ItemStack(BlockInit.FOSSIL_DAURLONG, 1),
                new ItemStack(BlockInit.FOSSIL_WUERHOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ZHENYUANLONG, 1),
                new ItemStack(BlockInit.FOSSIL_FUKUISAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_JINZHOUSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_EUHELOPUS, 1),
                new ItemStack(BlockInit.FOSSIL_MANTELLISAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_TYRANNOTITAN, 1),
                new ItemStack(BlockInit.FOSSIL_SUZHOUSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_AQUILOPS, 1),
                new ItemStack(BlockInit.FOSSIL_COMPTONATUS, 1),
                new ItemStack(BlockInit.FOSSIL_MEILIFEILONG, 1),
                new ItemStack(BlockInit.FOSSIL_KUNBARRASAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_STRUTHIOMIMUS, 1),
                new ItemStack(BlockInit.FOSSIL_AMARGASAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_TUPANDACTYLUS, 1),
                new ItemStack(BlockInit.FOSSIL_TENONTOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_VELOCIRAPTOR, 1),
                new ItemStack(BlockInit.FOSSIL_PROTOCERATOPS, 1),
                new ItemStack(BlockInit.FOSSIL_PSITTACOSAURUSMONGOLIENSIS, 1),
                new ItemStack(BlockInit.FOSSIL_PSITTACOSAURUSSIBIRICUS, 1),
                new ItemStack(BlockInit.FOSSIL_PSITTACOSAURUSLUJIATUNENSIS, 1),
                new ItemStack(BlockInit.FOSSIL_INCISIVOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_OLOROTITAN, 1),
                new ItemStack(BlockInit.FOSSIL_BANNYKUS, 1),
                new ItemStack(BlockInit.FOSSIL_KOOLASUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_CONCAVENATOR, 1),
                new ItemStack(BlockInit.FOSSIL_MINQARIA, 1),
                new ItemStack(BlockInit.FOSSIL_BARYONYX, 1),
                new ItemStack(BlockInit.FOSSIL_BERTHASAURA, 1),
                new ItemStack(BlockInit.FOSSIL_SPICLYPEUS, 1),
                new ItemStack(BlockInit.FOSSIL_HYPSILOPHODON, 1),
                new ItemStack(BlockInit.FOSSIL_LEAELLYNASAURA, 1),
                new ItemStack(BlockInit.FOSSIL_PRENOCEPHALE, 1),
                new ItemStack(BlockInit.FOSSIL_HATZEGOPTERYX, 1),
                new ItemStack(BlockInit.FOSSIL_TORUKJARA, 1),
                new ItemStack(BlockInit.FOSSIL_CAIUAJARA, 1),
                new ItemStack(BlockInit.FOSSIL_MUTTABURRASAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_NQWEBASAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_IGUANODON, 1),
                new ItemStack(BlockInit.FOSSIL_FALCARIUS, 1),
                new ItemStack(BlockInit.FOSSIL_UTAHRAPTOR, 1),
                new ItemStack(BlockInit.FOSSIL_CONVOLOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_LAJASVENATOR, 1),
                new ItemStack(BlockInit.FOSSIL_EUROPELTA, 1),
                new ItemStack(BlockInit.FOSSIL_ACROCANTHOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_BARBOSANIA, 1),
                new ItemStack(BlockInit.FOSSIL_ANHANGUERA, 1),
                new ItemStack(BlockInit.FOSSIL_PROBACTROSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ALTIRHINUS, 1),
                new ItemStack(BlockInit.FOSSIL_PELECANIMIMUS, 1),
                new ItemStack(BlockInit.FOSSIL_BAJADASAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ICHTHYOVENATOR, 1),
                new ItemStack(BlockInit.FOSSIL_DEINONYCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_EUROPEJARA, 1),
                new ItemStack(BlockInit.FOSSIL_JINYUNPELTA, 1),
                new ItemStack(BlockInit.FOSSIL_CENTROSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_CHASMOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_LUSKHAN, 1),
                new ItemStack(BlockInit.FOSSIL_IRRITATOR, 1),
                new ItemStack(BlockInit.FOSSIL_SAUROPELTA, 1),
                new ItemStack(BlockInit.FOSSIL_YUTYRANNUS, 1),
                new ItemStack(BlockInit.FOSSIL_LEPTOCLEIDUS, 1),
                new ItemStack(BlockInit.FOSSIL_ABYSSOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_AUSTRALOVENATOR, 1),
                new ItemStack(BlockInit.FOSSIL_GASTONIA, 1),
                new ItemStack(BlockInit.FOSSIL_POLACANTHUS, 1),
                new ItemStack(BlockInit.FOSSIL_EOCARCHARIA, 1),
                new ItemStack(BlockInit.FOSSIL_OURANOSAURUS, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPaleogeneDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_PRODINOCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_MENOCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_PYROTHERIUM, 1),
                new ItemStack(BlockInit.FOSSIL_OXYDACTYLUS, 1),
                new ItemStack(BlockInit.FOSSIL_GASTORNIS, 1),
                new ItemStack(BlockInit.FOSSIL_DORUDON, 1),
                new ItemStack(BlockInit.FOSSIL_KUTCHICETUS, 1),
                new ItemStack(BlockInit.FOSSIL_PROTOCERAS, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getNeogeneDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_SYNTHETOCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_DECENNATHERIUM, 1),
                new ItemStack(BlockInit.FOSSIL_OXYDACTYLUS, 1),
                new ItemStack(BlockInit.FOSSIL_SINCLAIROMERYX, 1),
                new ItemStack(BlockInit.FOSSIL_KUBANOCHOERUS, 1),
                new ItemStack(BlockInit.FOSSIL_MENOCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_HIPPIDION, 1),
                new ItemStack(BlockInit.FOSSIL_DINOCROCUTA, 1),
                new ItemStack(BlockInit.FOSSIL_PROTOCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_THYLACOLEO, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPleistoceneDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_BOSLATIFRONS, 1),
                new ItemStack(BlockInit.FOSSIL_HIPPIDION, 1),
                new ItemStack(BlockInit.FOSSIL_RANGIFER, 1),
                new ItemStack(BlockInit.FOSSIL_THYLACOLEO, 1),
                new ItemStack(BlockInit.FOSSIL_DAMADAMA, 1),
                new ItemStack(BlockInit.FOSSIL_SIMOSTHENURUS, 1),
                new ItemStack(BlockInit.FOSSIL_EREMOTHERIUM, 1)
        };
        return itemStack;
    }



    public static ItemStack[] getPrecambrianDisplayableFossilDropsSlabs() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_DICKINSONIA, 1),
                new ItemStack(BlockInit.FOSSIL_CHARNIA, 1),
                new ItemStack(BlockInit.FOSSIL_SPRIGGINA, 1),
                new ItemStack(BlockInit.FOSSIL_ALIENUM, 1),
                new ItemStack(BlockInit.FOSSIL_CYCLOMEDUSA, 1),
        };
        return itemStack;
    }

    public static ItemStack[] getCambrianDisplayableFossilDropsSlabs() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_OPABINIA, 1),
                new ItemStack(BlockInit.FOSSIL_OTTOIA, 1),
                new ItemStack(BlockInit.FOSSIL_TUZOIA, 1),
                new ItemStack(BlockInit.FOSSIL_PAMBDELURION, 1),
                new ItemStack(BlockInit.FOSSIL_VETULICOLA, 1),
                new ItemStack(BlockInit.FOSSIL_HALLUCIGENIA, 1),
                new ItemStack(BlockInit.FOSSIL_CANADASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_HAIKOUICHTHYS, 1),
                new ItemStack(BlockInit.FOSSIL_YOHOIA, 1),
                new ItemStack(BlockInit.FOSSIL_TREMAGLASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_MOBULAVERMIS, 1),
                new ItemStack(BlockInit.FOSSIL_YAWUNIK, 1),
                new ItemStack(BlockInit.FOSSIL_PHANTASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_SANCTACARIS, 1),
                new ItemStack(BlockInit.FOSSIL_HADRANAX, 1),
                new ItemStack(BlockInit.FOSSIL_CAPINATATOR, 1),
                new ItemStack(BlockInit.FOSSIL_ISOXYS, 1),
                new ItemStack(BlockInit.FOSSIL_WAPTIA, 1),
                new ItemStack(BlockInit.FOSSIL_KLEPTOTHULE, 1),
                new ItemStack(BlockInit.FOSSIL_KERYGMACHELA, 1),
                new ItemStack(BlockInit.FOSSIL_SKEEMELLA, 1),
                new ItemStack(BlockInit.FOSSIL_PIKAIA, 1),
                new ItemStack(BlockInit.FOSSIL_EOREDLICHIA, 1),
                new ItemStack(BlockInit.FOSSIL_BALHUTICARIS, 1),
                new ItemStack(BlockInit.FOSSIL_CONODONT, 1),
                new ItemStack(BlockInit.FOSSIL_NECTOCARIS, 1),
                new ItemStack(BlockInit.FOSSIL_CAMBRORASTER, 1),
                new ItemStack(BlockInit.FOSSIL_SIDNEYIA, 1),
                new ItemStack(BlockInit.FOSSIL_MARRELLA, 1),
                new ItemStack(BlockInit.FOSSIL_ANOMOLACARIS, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getOrdovicianDisplayableFossilDropsSlabs() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_ASAPHUS, 1),
                new ItemStack(BlockInit.FOSSIL_LITUITES, 1),
                new ItemStack(BlockInit.FOSSIL_CAMEROCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_PRICYCLOPYGE, 1),
                new ItemStack(BlockInit.FOSSIL_TREMAGLASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_ORTHOCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_AEGIROCASSIS, 1),
                new ItemStack(BlockInit.FOSSIL_CONODONT, 1),
                new ItemStack(BlockInit.FOSSIL_DIDYMOGRAPTUS, 1),
                new ItemStack(BlockInit.FOSSIL_GONIOCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_ARANDASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_VILLEBRUNASTER, 1),
                new ItemStack(BlockInit.FOSSIL_CALVAPILOSA, 1),
                new ItemStack(BlockInit.FOSSIL_MACLURINA, 1),
                new ItemStack(BlockInit.FOSSIL_SACABAMBASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_HUNGIOIDES, 1),
                new ItemStack(BlockInit.FOSSIL_APHETOCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_CYRTOCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_COTHURNOCYSTIS, 1),
                new ItemStack(BlockInit.FOSSIL_PLATYPELTOIDES, 1),
        };
        return itemStack;
    }

    public static ItemStack[] getSilurianDisplayableFossilDropsSlabs() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_CROTALOCEPHALUS, 1),
                new ItemStack(BlockInit.FOSSIL_CONODONT, 1),
                new ItemStack(BlockInit.FOSSIL_TRIMERUS, 1),
                new ItemStack(BlockInit.FOSSIL_CYRTOCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_ROTACIURCA, 1),
                new ItemStack(BlockInit.FOSSIL_TREMAGLASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_CAMANCHIA, 1),
                new ItemStack(BlockInit.FOSSIL_MACLURINA, 1),
                new ItemStack(BlockInit.FOSSIL_AINIKTOZOON, 1),
                new ItemStack(BlockInit.FOSSIL_PHRAGMOCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_SCLERODUS, 1),
                new ItemStack(BlockInit.FOSSIL_PLATYLOMASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_SLIMONIA, 1),
                new ItemStack(BlockInit.FOSSIL_THELODUS, 1),
                new ItemStack(BlockInit.FOSSIL_CIURCOPTERUS, 1),
                new ItemStack(BlockInit.FOSSIL_GUIYU, 1),
                new ItemStack(BlockInit.FOSSIL_WARNETICARIS, 1),
                new ItemStack(BlockInit.FOSSIL_DUNYU, 1),
                new ItemStack(BlockInit.FOSSIL_PLATYCARASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_BOHEMOHARPES, 1),
                new ItemStack(BlockInit.FOSSIL_POLYBRANCHIASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_AMPYX, 1),
                new ItemStack(BlockInit.FOSSIL_MIXOPTERUS, 1),
                new ItemStack(BlockInit.FOSSIL_CARCINOSOMA, 1),
                new ItemStack(BlockInit.FOSSIL_FURCASTER, 1),
                new ItemStack(BlockInit.FOSSIL_EURYPTERUS, 1),
                new ItemStack(BlockInit.FOSSIL_ARCTINURUS, 1),
                new ItemStack(BlockInit.FOSSIL_JAMOYTIUS, 1),
                new ItemStack(BlockInit.FOSSIL_BIRKENIA, 1)
//                new ItemStack(BlockInit.FOSSIL_CRINOID_RAFT, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getDevonianDisplayableFossilDropsSlabs() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_CYRTOCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_CROTALOCEPHALUS, 1),
                new ItemStack(BlockInit.FOSSIL_MIMETASTER, 1),
                new ItemStack(BlockInit.FOSSIL_TRIMERUS, 1),
                new ItemStack(BlockInit.FOSSIL_LUNGMENSHANASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_PRISCOMYZON, 1),
                new ItemStack(BlockInit.FOSSIL_HELIANTHASTER, 1),
                new ItemStack(BlockInit.FOSSIL_DORYASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_GANTAROSTRATASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_STENSIOELLA, 1),
                new ItemStack(BlockInit.FOSSIL_GROENLANDASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_PAREXUS, 1),
                new ItemStack(BlockInit.FOSSIL_DIPLACANTHUS, 1),
                new ItemStack(BlockInit.FOSSIL_MACLURINA, 1),
                new ItemStack(BlockInit.FOSSIL_FURCACAUDA, 1),
                new ItemStack(BlockInit.FOSSIL_FLAGELLOPANTOPUS, 1),
                new ItemStack(BlockInit.FOSSIL_PRAEARCTURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ATTERCOPUS, 1),
                new ItemStack(BlockInit.FOSSIL_BUNDENBACHIELLUS, 1),
                new ItemStack(BlockInit.FOSSIL_SCAUMENACIA, 1),
                new ItemStack(BlockInit.FOSSIL_DREPANASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_CONODONT, 1),
                new ItemStack(BlockInit.FOSSIL_PSYCHOPYGE, 1),
                new ItemStack(BlockInit.FOSSIL_CLADOSELACHE, 1),
                new ItemStack(BlockInit.FOSSIL_ANGUSTIDONTUS, 1),
                new ItemStack(BlockInit.FOSSIL_BROCHOADMONES, 1),
                new ItemStack(BlockInit.FOSSIL_DICRANURUS, 1),
                new ItemStack(BlockInit.FOSSIL_JAEKELOPTERUS, 1),
                new ItemStack(BlockInit.FOSSIL_HELIOPELTIS, 1),
                new ItemStack(BlockInit.FOSSIL_EUSTHENOPTERON, 1),
                new ItemStack(BlockInit.FOSSIL_RHINOPTERASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_GEMUENDINA, 1),
                new ItemStack(BlockInit.FOSSIL_OSTEOLEPIS, 1),
                new ItemStack(BlockInit.FOSSIL_POLYBRANCHIASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_PARAMETEORASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_HIBBERTOPTERUS, 1),
                new ItemStack(BlockInit.FOSSIL_WALLISEROPS, 1),
                new ItemStack(BlockInit.FOSSIL_ZENASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_SCHINDERHANNES, 1),
                new ItemStack(BlockInit.FOSSIL_COCCOSTEUS, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCarboniferousDisplayableFossilDropsSlabs() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_ARTHROPLEURA, 1),
                new ItemStack(BlockInit.FOSSIL_SENEKICHTHYS, 1),
                new ItemStack(BlockInit.FOSSIL_HARPAGOFUTUTOR, 1),
                new ItemStack(BlockInit.FOSSIL_XENACANTHUS, 1),
                new ItemStack(BlockInit.FOSSIL_GREGORIUS, 1),
                new ItemStack(BlockInit.FOSSIL_ECHINOCHIMAERA, 1),
                new ItemStack(BlockInit.FOSSIL_VESTINAUTILUS, 1),
                new ItemStack(BlockInit.FOSSIL_ALLENYPTERUS, 1),
                new ItemStack(BlockInit.FOSSIL_HADRONECTOR, 1),
                new ItemStack(BlockInit.FOSSIL_SQUATINACTIS, 1),
                new ItemStack(BlockInit.FOSSIL_PULMONOSCORPIUS, 1),
                new ItemStack(BlockInit.FOSSIL_TYRANNOPHONTES, 1),
                new ItemStack(BlockInit.FOSSIL_TULLIMONSTRUM, 1),
                new ItemStack(BlockInit.FOSSIL_BANDRINGA, 1),
                new ItemStack(BlockInit.FOSSIL_MEGANEURA, 1),
                new ItemStack(BlockInit.FOSSIL_BELANTSEA, 1),
                new ItemStack(BlockInit.FOSSIL_CONODONT, 1),
                new ItemStack(BlockInit.FOSSIL_MEGARACHNE, 1),
                new ItemStack(BlockInit.FOSSIL_FALCATUS, 1),
                new ItemStack(BlockInit.FOSSIL_AKMONISTION, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPermianDisplayableFossilDropsSlabs() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_BRAZILICHTHYS, 1),
                new ItemStack(BlockInit.FOSSIL_MAMULICHTHYS, 1),
                new ItemStack(BlockInit.FOSSIL_BETHESDAICHTHYS, 1),
                new ItemStack(BlockInit.FOSSIL_COOPEROCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_PALAEONISCUM, 1),
                new ItemStack(BlockInit.FOSSIL_PARANAICHTHYS, 1),
                new ItemStack(BlockInit.FOSSIL_CONODONT, 1),
                new ItemStack(BlockInit.FOSSIL_BOBASATRANIA, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getTriassicDisplayableFossilDropsSlabs() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_FOREYIA, 1),
                new ItemStack(BlockInit.FOSSIL_BOBASATRANIA, 1),
                new ItemStack(BlockInit.FOSSIL_KEICHOUSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_LONGISQUAMA, 1),
                new ItemStack(BlockInit.FOSSIL_SEMIONOTUS, 1),
                new ItemStack(BlockInit.FOSSIL_GOSFORDIA, 1),
                new ItemStack(BlockInit.FOSSIL_DIPTERONOTUS, 1),
                new ItemStack(BlockInit.FOSSIL_HYDROPESSUM, 1),
                new ItemStack(BlockInit.FOSSIL_CONODONT, 1),
                new ItemStack(BlockInit.FOSSIL_CLATROTITAN, 1),
                new ItemStack(BlockInit.FOSSIL_AEGER, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getJurassicDisplayableFossilDropsSlabs() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_LIMULID, 1),
                new ItemStack(BlockInit.FOSSIL_KAYKAY, 1),
                new ItemStack(BlockInit.FOSSIL_LEEDSICHTHYS, 1),
                new ItemStack(BlockInit.FOSSIL_CAIHONG, 1),
                new ItemStack(BlockInit.FOSSIL_TITANITES, 1),
                new ItemStack(BlockInit.FOSSIL_PHYLLOCERAS, 1),
                new ItemStack(BlockInit.FOSSIL_CONODONT, 1),
                new ItemStack(BlockInit.FOSSIL_SEMIONOTUS, 1),
                new ItemStack(BlockInit.FOSSIL_NEUROPTERA, 1),
                new ItemStack(BlockInit.FOSSIL_AEGER, 1),
                new ItemStack(BlockInit.FOSSIL_ERYON, 1),
                new ItemStack(BlockInit.FOSSIL_ERYMA, 1),
                new ItemStack(BlockInit.FOSSIL_MECOCHIRUS, 1),
                new ItemStack(BlockInit.FOSSIL_TURBOSCINETES, 1),
                new ItemStack(BlockInit.FOSSIL_ARCHAEOPTERYX, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCretaceousDisplayableFossilDropsSlabs() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_AEGER, 1),
                new ItemStack(BlockInit.FOSSIL_MECOCHIRUS, 1),
                new ItemStack(BlockInit.FOSSIL_TROPAEUM, 1),
                new ItemStack(BlockInit.FOSSIL_ERYMA, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPaleogeneDisplayableFossilDropsSlabs() {
        ItemStack[] itemStack = {
                ItemStack.EMPTY
        };
        return itemStack;
    }

    public static ItemStack[] getNeogeneDisplayableFossilDropsSlabs() {
        ItemStack[] itemStack = {
                ItemStack.EMPTY
        };
        return itemStack;
    }

    public static ItemStack[] getPleistoceneDisplayableFossilDropsSlabs() {
        ItemStack[] itemStack = {
                ItemStack.EMPTY
        };
        return itemStack;
    }

    @SideOnly(Side.CLIENT) //Tooltips for vanilla items etc
    @SubscribeEvent
    public void onEvent(ItemTooltipEvent event) throws NoSuchMethodException {

        if (Block.getBlockFromItem(event.getItemStack().getItem()) instanceof BlockSkeletonBase
            || Block.getBlockFromItem(event.getItemStack().getItem()) instanceof BlockSlabBase) {
            if (event.getItemStack().hasTagCompound()) {
                if (event.getItemStack().getTagCompound().hasKey("period")) {
                    List<String> tt = event.getToolTip();
                    boolean perioduncertain = false;
                    if (event.getItemStack().getTagCompound().hasKey("perioduncertain")) {
                        perioduncertain =  event.getItemStack().getTagCompound().getBoolean("perioduncertain");
                    }
                    int period = event.getItemStack().getTagCompound().getInteger("period");
                    switch (period) {
                        case 1: default:
                            if (perioduncertain) {
                                tt.add(TextFormatting.DARK_RED + "Uncertain: first known from Precambrian");
                            }
                            else {
                                tt.add(TextFormatting.DARK_RED + "Precambrian");
                            }
                            break;

                        case 2:
                            if (perioduncertain) {
                                tt.add(TextFormatting.DARK_GREEN + "Uncertain: first known from Cambrian");
                            }
                            else {
                                tt.add(TextFormatting.DARK_GREEN + "Cambrian");
                            }
                            break;

                        case 3:
                            if (perioduncertain) {
                                tt.add(TextFormatting.DARK_AQUA + "Uncertain: first known from Ordovician");
                            }
                            else {
                                tt.add(TextFormatting.DARK_AQUA + "Ordovician");
                            }
                            break;

                        case 4:
                            if (perioduncertain) {
                                tt.add(TextFormatting.AQUA + "Uncertain: first known from Silurian");
                            }
                            else {
                                tt.add(TextFormatting.AQUA + "Silurian");
                            }
                            break;

                        case 5:
                            if (perioduncertain) {
                                tt.add(TextFormatting.GOLD + "Uncertain: first known from Devonian");
                            }
                            else {
                                tt.add(TextFormatting.GOLD + "Devonian");
                            }
                            break;

                        case 6:
                            if (perioduncertain) {
                                tt.add(TextFormatting.DARK_BLUE + "Uncertain: first known from Carboniferous");
                            }
                            else {
                                tt.add(TextFormatting.DARK_BLUE + "Carboniferous");
                            }
                            break;

                        case 7:

                            if (perioduncertain) {
                                tt.add(TextFormatting.RED + "Uncertain: first known from Permian");
                            }
                            else {
                                tt.add(TextFormatting.RED + "Permian");
                            }
                            break;

                        case 8:
                            if (perioduncertain) {
                                tt.add(TextFormatting.DARK_PURPLE + "Uncertain: first known from Triassic");
                            }
                            else {
                                tt.add(TextFormatting.DARK_PURPLE + "Triassic");
                            }
                            break;

                        case 9:
                            if (perioduncertain) {
                                tt.add(TextFormatting.BLUE + "Uncertain: first known from Jurassic");
                            }
                            else {
                                tt.add(TextFormatting.BLUE + "Jurassic");
                            }
                            break;

                        case 10:
                            if (perioduncertain) {
                                tt.add(TextFormatting.GREEN + "Uncertain: first known from Cretaceous");
                            }
                            else {
                                tt.add(TextFormatting.GREEN + "Cretaceous");
                            }
                            break;

                        case 11:
                            if (perioduncertain) {
                                tt.add(TextFormatting.GOLD + "Uncertain: first known from Paleogene");
                            }
                            else {
                                tt.add(TextFormatting.GOLD + "Paleogene");
                            }
                            break;

                        case 12:
                            if (perioduncertain) {
                                tt.add(TextFormatting.YELLOW + "Uncertain: first known from Neogene");
                            }
                            else {
                                tt.add(TextFormatting.YELLOW + "Neogene");
                            }
                            break;

                        case 13:
                            if (perioduncertain) {
                                tt.add(TextFormatting.GRAY + "Uncertain: first known from Pleistocene");
                            }
                            else {
                                tt.add(TextFormatting.GRAY + "Pleistocene");
                            }
                            break;
                    }
                }
            }
        }

    }
    
}
