package net.prehistoricnaturefossils;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;
import net.prehistoricnaturefossils.blocks.base.BlockSkeletonBase;
import net.prehistoricnaturefossils.blocks.base.BlockSlabBase;
import net.prehistoricnaturefossils.proxy.CommonProxy;
import net.prehistoricnaturefossils.triggers.ModTriggers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = "prehistoricnaturefossils",
        version = "6.01"
)
public class PrehistoricNatureFossils {
    public static final String MODID = "prehistoricnaturefossils";
    public static final String NAME = "Prehistoric Nature Fossils";
    public static final String VERSION = "6.01";
    public static final String MCVERSION = "[1.12.2]";
    public static final Logger LOGGER = LogManager.getLogger("prehistoricnaturefossils");
    public static final CreativeTabs CREATIVE_TAB = new CreativeTabFossils();
    public static final SoundType SKELETON = new SoundType(1.0F, 1.0F, SoundEvents.ENTITY_SKELETON_DEATH, SoundEvents.BLOCK_STONE_STEP, SoundEvents.ENTITY_SKELETON_STEP, SoundEvents.ENTITY_SKELETON_HURT, SoundEvents.BLOCK_STONE_STEP);
    @SidedProxy(clientSide = "net.prehistoricnaturefossils.proxy.ClientProxy", serverSide = "net.prehistoricnaturefossils.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static final boolean doFrames = true;

    public PrehistoricNatureFossils() {

    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        MinecraftForge.EVENT_BUS.register(new FossilBlockDrops());
        MinecraftForge.EVENT_BUS.register(new EventHandlers());
        ModTriggers.registerTriggers();

        try {
            for (Object block : Block.REGISTRY) {
                if (block instanceof BlockSkeletonBase) {
                    String oreDict = ((BlockSkeletonBase)block).getDNACompat();
                    if (oreDict != null) {
                        OreDictionary.registerOre(oreDict, new ItemStack((Block) block, 1));
                    }
                    OreDictionary.registerOre("bone", new ItemStack((Block) block, 1));
                }
                if (block instanceof BlockSlabBase) {
                    String oreDict = ((BlockSlabBase)block).getDNACompat();
                    if (oreDict != null) {
                        OreDictionary.registerOre(oreDict, new ItemStack((Block) block, 1));
                    }
                    OreDictionary.registerOre("stone", new ItemStack((Block) block, 1));
                }
            }
        } catch (Exception e) {
        }

        LootTableList.register(new ResourceLocation(PrehistoricNatureFossils.MODID, "loot_aetosaurs"));

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

}
