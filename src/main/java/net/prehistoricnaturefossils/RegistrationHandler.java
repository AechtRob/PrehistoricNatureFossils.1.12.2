package net.prehistoricnaturefossils;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.prehistoricnaturefossils.blocks.base.BlockInit;
import net.prehistoricnaturefossils.client.render.general.RenderRegistryFossils;
import net.prehistoricnaturefossils.enchantments.Enchantments;
import net.prehistoricnaturefossils.items.IHasModel;
import net.prehistoricnaturefossils.items.ItemInit;

import java.util.Arrays;

@EventBusSubscriber(
        modid = "prehistoricnaturefossils"
)
public class RegistrationHandler {
    public RegistrationHandler() {
    }

    public static final boolean doDevOnly = false;

    public static final String[] devOnly = new String[]{
            "skeleton_stokesosaurus",
            "skeleton_secodontosaurus",
            "skeleton_eoabelisaurus",
            "skeleton_patagosaurus",
            "skeleton_asfaltovenator",
            //"skeleton_lesothosaurus",
            "skeleton_brachytrachelopan",
            "skeleton_manidens",
            "skeleton_chungkingosaurus",
            //"skeleton_tapejara",
            "skeleton_irritator",
            "skeleton_europejara",
            //"skeleton_deinonychus",
            //"skeleton_haliskia",
            //"skeleton_luskhan",
            "skeleton_spectrovenator",
            "skeleton_sarcosuchus",
            "skeleton_ichthyovenator",
            "skeleton_tenontosaurus",
            "skeleton_mantellisaurus",
            "skeleton_suzhousaurus",
            "skeleton_kunbarrasaurus",
            "skeleton_amargasaurus",
            "skeleton_sinosaurus",
            "skeleton_ouranosaurus",
            //"skeleton_prestosuchus",
            "skeleton_klamelisaurus",
            "skeleton_tupandactylus",
            "skeleton_gaiasia",
            //"skeleton_aquilops",
            "skeleton_meilifeilong",
            "skeleton_protoceratops",
            "skeleton_boslatifrons",
            "skeleton_velociraptor",
            "skeleton_eremotherium",
            "skeleton_synthetoceras",
            "skeleton_comptonatus",
            //"skeleton_jinyunpelta",
            "skeleton_centrosaurus",
            "skeleton_chasmosaurus",
            "skeleton_struthiomimus",
            "skeleton_psittacosaurusmongoliensis",
            //"skeleton_psittacosaurussibiricus",
            "skeleton_psittacosauruslujiatunensis",
            "skeleton_olorotitan",
            "skeleton_incisivosaurus",
            "skeleton_thylacoleo",
            "skeleton_concavenator",
            "skeleton_minqaria",
            //"skeleton_diademodon",
            "skeleton_baryonyx",
            "skeleton_riojasuchus",
            "skeleton_spiclypeus",
            //"skeleton_berthasaura",
            "skeleton_rechnisaurus",
            "skeleton_simolestes",
            "skeleton_cryptoclidus",
            //"skeleton_drepanosaurus",
            //"skeleton_hypsilophodon",
            "skeleton_leaellynasaura",
            //"skeleton_muttaburrasaurus",
            "skeleton_nqwebasaurus",
            "skeleton_iguanodon",
            //"skeleton_falcarius",
            "skeleton_utahraptor",
            "skeleton_convolosaurus",
            "skeleton_lajasvenator",
            "skeleton_europelta",
            //"skeleton_acrocanthosaurus",
            "skeleton_callawayia",
            "skeleton_nannopterygius",
            "skeleton_barbosania",
            //"skeleton_anhanguera",
            "skeleton_probactrosaurus",
            "skeleton_altirhinus",
            "skeleton_pelecanimimus",
            "skeleton_bajadasaurus",
            //"skeleton_eocursor",
            //"skeleton_dracoraptor",
            "skeleton_sauropelta",
            "skeleton_yutyrannus",
            //"skeleton_leptocleidus",
            "skeleton_abyssosaurus",
            "skeleton_australovenator",
            "skeleton_gastonia",
            "skeleton_polacanthus",
            //"skeleton_eocarcharia",
            "skeleton_ctenochasma",
            "skeleton_pterodaustro",
            "skeleton_daurlong",
            "skeleton_wuerhosaurus",
            "skeleton_zhenyuanlong",
            "skeleton_fukuisaurus",
            "skeleton_jinzhousaurus",
            "skeleton_euhelopus",
            "skeleton_mei",
            "skeleton_suchomimus",
            "skeleton_edmontosaurus",
            "skeleton_tyrannosaurus",
            "skeleton_chaoyangopterus",
            "skeleton_shenzhoupterus",
            "skeleton_yuanyanglong",
            "skeleton_protoceras",
            "skeleton_prenocephale",
            "skeleton_hatzegopteryx",
            "skeleton_decennatherium",
            "skeleton_prodinoceras",
            "skeleton_simosthenurus",
            "skeleton_pyrotherium",
            "skeleton_dinocrocuta",
            "skeleton_dorudon",
            "skeleton_torukjara",
            "skeleton_caiuajara",
            "skeleton_oxydactylus",
            "skeleton_damadama",
            "skeleton_hippidion",
            "skeleton_rangifer",
            "skeleton_tupandactylusnavigans",
            "skeleton_sinopterus",
            "skeleton_kutchicetus",
            "skeleton_kubanochoerus",
            "skeleton_asiatyrannus",
            "skeleton_sinoceratops",
            "skeleton_ikrandraco",
            "skeleton_hamipterus",
            "skeleton_dsungaripterus",
            "skeleton_beipiaosaurus",
            "skeleton_proa",
            "skeleton_brightstoneus",
            "skeleton_scelidosaurus",
            "skeleton_yingshanosaurus",
            "skeleton_jianchangnathus",
            "skeleton_kranosaura",
            "skeleton_hypselospinus",
            "skeleton_neovenator",
            "skeleton_rabidosaurus",
            "skeleton_yunnanosaurus",
            "skeleton_montanoceratops",
            "skeleton_malawisaurus",
            "skeleton_hescheleria",
            "skeleton_megalancosaurus",
            "skeleton_ornatops",
            "skeleton_angulomastacator",
            "skeleton_einiosaurus",
            "skeleton_regaliceratops",
            "skeleton_shuvuuia",
            "skeleton_skorpiovenator",
            "skeleton_tethyshadros",
            "skeleton_spinosaurus",
            "skeleton_nasutoceratops",
            "skeleton_menoceras",
            "skeleton_gastornis",
            "skeleton_sinclairomeryx",
            "skull_acrocanthosaurus",
            "skeleton_diplocaulusminimus"
    };

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        for (Item item : ItemInit.ITEMS.toArray(new Item[0])) {
            if (registerThis(item.getRegistryName())) {
                event.getRegistry().register(item);
            }
        }
        //event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        for (Block block : BlockInit.BLOCKS.toArray(new Block[0])) {
            if (registerThis(block.getRegistryName())) {
                event.getRegistry().register(block);
            }
        }
        //event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        for (Block block : BlockInit.BLOCKS) {
            if (block instanceof IHasModel && registerThis(block.getRegistryName())) {
                ((IHasModel)block).registerModels();
            }
        }
        for (Item item : ItemInit.ITEMS) {
            if (item instanceof IHasModel && registerThis(item.getRegistryName())) {
                ((IHasModel)item).registerModels();
            }
        }
        RenderRegistryFossils.RegisterEntityRenders();
    }

    @SubscribeEvent
    public static void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
        event.getRegistry().registerAll(Enchantments.DISCERNING_COLLECTOR);
    }

    public static boolean registerThis(ResourceLocation resourcelocation) {
        return (!Arrays.stream(devOnly).anyMatch(x -> x.equalsIgnoreCase(resourcelocation.getPath().toString()))) || doDevOnly;
    }

}
