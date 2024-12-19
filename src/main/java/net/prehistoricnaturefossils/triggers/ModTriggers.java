package net.prehistoricnaturefossils.triggers;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.ICriterionTrigger;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ModTriggers

{

    public static final CustomTrigger AEGER_COMPLETE = new CustomTrigger("adv_aeger");
    public static final CustomTrigger ALIENUM_COMPLETE = new CustomTrigger("adv_alienum");
    public static final CustomTrigger PAMBDELURION_COMPLETE = new CustomTrigger("adv_pambdelurion");
    public static final CustomTrigger TRIMERUS_COMPLETE = new CustomTrigger("adv_trimerus");
    public static final CustomTrigger LUNGMENSHANASPIS_COMPLETE = new CustomTrigger("adv_lungmenshanaspis");
    public static final CustomTrigger XENACANTHUS_COMPLETE = new CustomTrigger("adv_xenacanthus");
    public static final CustomTrigger GREGORIUS_COMPLETE = new CustomTrigger("adv_gregorius");
    public static final CustomTrigger CIURCOPTERUS_COMPLETE = new CustomTrigger("adv_ciurcopterus");
    public static final CustomTrigger HADRANAX_COMPLETE = new CustomTrigger("adv_hadranax");
    public static final CustomTrigger CAPINATATOR_COMPLETE = new CustomTrigger("adv_capinatator");
    public static final CustomTrigger ERYMA_COMPLETE = new CustomTrigger("adv_eryma");
    public static final CustomTrigger MECOCHIRUS_COMPLETE = new CustomTrigger("adv_mecochirus");
    public static final CustomTrigger CYCLOMEDUSA_COMPLETE = new CustomTrigger("adv_cyclomedusa");
    public static final CustomTrigger ROTACIURCA_COMPLETE = new CustomTrigger("adv_rotaciurca");
    public static final CustomTrigger WAPTIA_COMPLETE = new CustomTrigger("adv_waptia");
    public static final CustomTrigger ISOXYS_COMPLETE = new CustomTrigger("adv_isoxys");
    public static final CustomTrigger ZENASPIS_COMPLETE = new CustomTrigger("adv_zenaspis");
    public static final CustomTrigger SCLERODUS_COMPLETE = new CustomTrigger("adv_sclerodus");
    public static final CustomTrigger SLIMONIA_COMPLETE = new CustomTrigger("adv_slimonia");
    public static final CustomTrigger SCAUMENACIA_COMPLETE = new CustomTrigger("adv_scaumenacia");
    public static final CustomTrigger DREPANASPIS_COMPLETE = new CustomTrigger("adv_drepanaspis");
    public static final CustomTrigger LONGISQUAMA_COMPLETE = new CustomTrigger("adv_longisquama");
    public static final CustomTrigger COOPEROCERAS_COMPLETE = new CustomTrigger("adv_cooperoceras");
    public static final CustomTrigger VESTINAUTILUS_COMPLETE = new CustomTrigger("adv_vestinautilus");
    public static final CustomTrigger PALAEONISCUM_COMPLETE = new CustomTrigger("adv_palaeoniscum");
    public static final CustomTrigger PARANAICHTHYS_COMPLETE = new CustomTrigger("adv_paranaichthys");
    public static final CustomTrigger ALLENYPTERUS_COMPLETE = new CustomTrigger("adv_allenypterus");
    public static final CustomTrigger HADRONECTOR_COMPLETE = new CustomTrigger("adv_hadronector");
    public static final CustomTrigger FLAGELLOPANTOPUS_COMPLETE = new CustomTrigger("adv_flagellopantopus");
    public static final CustomTrigger PRAEARCTURUS_COMPLETE = new CustomTrigger("adv_praearcturus");
    public static final CustomTrigger ECHINOCHIMAERA_COMPLETE = new CustomTrigger("adv_echinochimaera");
    public static final CustomTrigger SQUATINACTIS_COMPLETE = new CustomTrigger("adv_squatinactis");
    public static final CustomTrigger HELIANTHASTER_COMPLETE = new CustomTrigger("adv_helianthaster");
    public static final CustomTrigger MIMETASTER_COMPLETE = new CustomTrigger("adv_mimetaster");
    public static final CustomTrigger DORYASPIS_COMPLETE = new CustomTrigger("adv_doryaspis");
    public static final CustomTrigger GANTAROSTRATASPIS_COMPLETE = new CustomTrigger("adv_gantarostrataspis");
    public static final CustomTrigger STENSIOELLA_COMPLETE = new CustomTrigger("adv_stensioella");
    public static final CustomTrigger GROENLANDASPIS_COMPLETE = new CustomTrigger("adv_groenlandaspis");
    public static final CustomTrigger MOBULAVERMIS_COMPLETE = new CustomTrigger("adv_mobulavermis");
    public static final CustomTrigger KAYKAY_COMPLETE = new CustomTrigger("adv_kaykay");
    public static final CustomTrigger LEEDSICHTHYS_COMPLETE = new CustomTrigger("adv_leedsichthys");
    public static final CustomTrigger CAIHONG_COMPLETE = new CustomTrigger("adv_caihong");
    public static final CustomTrigger GOSFORDIA_COMPLETE = new CustomTrigger("adv_gosfordia");
    public static final CustomTrigger HYDROPESSUM_COMPLETE = new CustomTrigger("adv_hydropessum");
    public static final CustomTrigger DIPTERONOTUS_COMPLETE = new CustomTrigger("adv_dipteronotus");
    public static final CustomTrigger HARPAGOFUTUTOR_COMPLETE = new CustomTrigger("adv_harpagofututor");
    public static final CustomTrigger MAMULICHTHYS_COMPLETE = new CustomTrigger("adv_mamulichthys");
    public static final CustomTrigger SENEKICHTHYS_COMPLETE = new CustomTrigger("adv_senekichthys");
    public static final CustomTrigger PHYLLOCERAS_COMPLETE = new CustomTrigger("adv_phylloceras");
    public static final CustomTrigger TITANITES_COMPLETE = new CustomTrigger("adv_titanites");
    public static final CustomTrigger CHARNIA_COMPLETE = new CustomTrigger("adv_charnia");
    public static final CustomTrigger BRAZILICHTHYS_COMPLETE = new CustomTrigger("adv_brazilichthys");
    public static final CustomTrigger BETHESDAICHTHYS_COMPLETE = new CustomTrigger("adv_bethesdaichthys");
    public static final CustomTrigger HELIOPELTIS_COMPLETE = new CustomTrigger("adv_heliopeltis");
    public static final CustomTrigger PAREXUS_COMPLETE = new CustomTrigger("adv_parexus");
    public static final CustomTrigger SPRIGGINA_COMPLETE = new CustomTrigger("adv_spriggina");
    public static final CustomTrigger DIPLACANTHUS_COMPLETE = new CustomTrigger("adv_diplacanthus");
    public static final CustomTrigger FURCACAUDA_COMPLETE = new CustomTrigger("adv_furcacauda");
    public static final CustomTrigger DICRANURUS_COMPLETE = new CustomTrigger("adv_dicranurus");
    public static final CustomTrigger DUNYU_COMPLETE = new CustomTrigger("adv_dunyu");
    public static final CustomTrigger GUIYU_COMPLETE = new CustomTrigger("adv_guiyu");
    public static final CustomTrigger OSTEOLEPIS_COMPLETE = new CustomTrigger("adv_osteolepis");
    public static final CustomTrigger DICKINSONIA_COMPLETE = new CustomTrigger("adv_dickinsonia");
    public static final CustomTrigger PLATYCARASPIS_COMPLETE = new CustomTrigger("adv_platycaraspis");
    public static final CustomTrigger THELODUS_COMPLETE = new CustomTrigger("adv_thelodus");
    public static final CustomTrigger WARNETICARIS_COMPLETE = new CustomTrigger("adv_warneticaris");
    public static final CustomTrigger PHANTASPIS_COMPLETE = new CustomTrigger("adv_phantaspis");
    public static final CustomTrigger ARCHAEOPTERYX_COMPLETE = new CustomTrigger("adv_archaeopteryx");
    public static final CustomTrigger KLEPTOTHULE_COMPLETE = new CustomTrigger("adv_kleptothule");
    public static final CustomTrigger PSYCHOPYGE_COMPLETE = new CustomTrigger("adv_psychopyge");
    public static final CustomTrigger ANGUSTIDONTUS_COMPLETE = new CustomTrigger("adv_angustidontus");
    public static final CustomTrigger TYRANNOPHONTES_COMPLETE = new CustomTrigger("adv_tyrannophontes");
    public static final CustomTrigger NEUROPTERA_COMPLETE = new CustomTrigger("adv_neuroptera");
    public static final CustomTrigger ANTEOSAURUS_COMPLETE = new CustomTrigger("adv_anteosaurus");
    public static final CustomTrigger ARIZONASAURUS_COMPLETE = new CustomTrigger("adv_arizonasaurus");
    public static final CustomTrigger ATOPODENTATUS_COMPLETE = new CustomTrigger("adv_atopodentatus");
    public static final CustomTrigger BUNGARTIUS_COMPLETE = new CustomTrigger("adv_bungartius");
    public static final CustomTrigger BUNOSTEGOS_COMPLETE = new CustomTrigger("adv_bunostegos");
    public static final CustomTrigger CAVIRAMUS_COMPLETE = new CustomTrigger("adv_caviramus");
    public static final CustomTrigger COTYLORHYNCHUS_COMPLETE = new CustomTrigger("adv_cotylorhynchus");
    public static final CustomTrigger CRASSIGYRINUS_COMPLETE = new CustomTrigger("adv_crassigyrinus");
    public static final CustomTrigger CYAMODUS_COMPLETE = new CustomTrigger("adv_cyamodus");
    public static final CustomTrigger CYMBOSPONDYLUS_COMPLETE = new CustomTrigger("adv_cymbospondylus");
    public static final CustomTrigger DATHEOSAURUS_COMPLETE = new CustomTrigger("adv_datheosaurus");
    public static final CustomTrigger DESMATOSUCHUS_COMPLETE = new CustomTrigger("adv_desmatosuchus");
    public static final CustomTrigger DIMETRODON_COMPLETE = new CustomTrigger("adv_dimetrodon");
    public static final CustomTrigger DIPLOCAULUS_COMPLETE = new CustomTrigger("adv_diplocaulus");
    public static final CustomTrigger DRYOSAURUS_COMPLETE = new CustomTrigger("adv_dryosaurus");
    public static final CustomTrigger DUNKLEOSTEUS_COMPLETE = new CustomTrigger("adv_dunkleosteus");
    public static final CustomTrigger EDAPHOSAURUS_COMPLETE = new CustomTrigger("adv_edaphosaurus");
    public static final CustomTrigger EFFIGIA_COMPLETE = new CustomTrigger("adv_effigia");
    public static final CustomTrigger EORHYNCHOCHELYS_COMPLETE = new CustomTrigger("adv_eorhynchochelys");
    public static final CustomTrigger ERYOPS_COMPLETE = new CustomTrigger("adv_eryops");
    public static final CustomTrigger ERYTHROSUCHUS_COMPLETE = new CustomTrigger("adv_erythrosuchus");
    public static final CustomTrigger ESTEMMENOSUCHUS_COMPLETE = new CustomTrigger("adv_estemmenosuchus");
    public static final CustomTrigger GERROTHORAX_COMPLETE = new CustomTrigger("adv_gerrothorax");
    public static final CustomTrigger HENODUS_COMPLETE = new CustomTrigger("adv_henodus");
    public static final CustomTrigger INOSTRANCEVIA_COMPLETE = new CustomTrigger("adv_inostrancevia");
    public static final CustomTrigger JONKERIA_COMPLETE = new CustomTrigger("adv_jonkeria");
    public static final CustomTrigger KENTROSAURUS_COMPLETE = new CustomTrigger("adv_kentrosaurus");
    public static final CustomTrigger LESSEMSAURUS_COMPLETE = new CustomTrigger("adv_lessemsaurus");
    public static final CustomTrigger LILIENSTERNUS_COMPLETE = new CustomTrigger("adv_liliensternus");
    public static final CustomTrigger LIMNOSCELIS_COMPLETE = new CustomTrigger("adv_limnoscelis");
    public static final CustomTrigger LISOWICIA_COMPLETE = new CustomTrigger("adv_lisowicia");
    public static final CustomTrigger LOTOSAURUS_COMPLETE = new CustomTrigger("adv_lotosaurus");
    public static final CustomTrigger LYSTROSAURUS_COMPLETE = new CustomTrigger("adv_lystrosaurus");
    public static final CustomTrigger MASTODONSAURUS_COMPLETE = new CustomTrigger("adv_mastodonsaurus");
    public static final CustomTrigger MEGALOCEPHALUS_COMPLETE = new CustomTrigger("adv_megalocephalus");
    public static final CustomTrigger MEGALOSAURUS_COMPLETE = new CustomTrigger("adv_megalosaurus");
    public static final CustomTrigger MOSCHOPS_COMPLETE = new CustomTrigger("adv_moschops");
    public static final CustomTrigger NOTHOSAURUS_COMPLETE = new CustomTrigger("adv_nothosaurus");
    public static final CustomTrigger OPHIACODON_COMPLETE = new CustomTrigger("adv_ophiacodon");
    public static final CustomTrigger OPHTHALMOSAURUS_COMPLETE = new CustomTrigger("adv_ophthalmosaurus");
    public static final CustomTrigger PHOLIDERPETON_COMPLETE = new CustomTrigger("adv_pholiderpeton");
    public static final CustomTrigger PLACODUS_COMPLETE = new CustomTrigger("adv_placodus");
    public static final CustomTrigger PLATYHYSTRIX_COMPLETE = new CustomTrigger("adv_platyhystrix");
    public static final CustomTrigger POPOSAURUS_COMPLETE = new CustomTrigger("adv_poposaurus");
    public static final CustomTrigger POSTOSUCHUS_COMPLETE = new CustomTrigger("adv_postosuchus");
    public static final CustomTrigger PRIONOSUCHUS_COMPLETE = new CustomTrigger("adv_prionosuchus");
    public static final CustomTrigger PROBURNETIA_COMPLETE = new CustomTrigger("adv_proburnetia");
    public static final CustomTrigger RUBIDGEA_COMPLETE = new CustomTrigger("adv_rubidgea");
    public static final CustomTrigger SCUTOSAURUS_COMPLETE = new CustomTrigger("adv_scutosaurus");
    public static final CustomTrigger SHONISAURUS_COMPLETE = new CustomTrigger("adv_shonisaurus");
    public static final CustomTrigger SHRINGASAURUS_COMPLETE = new CustomTrigger("adv_shringasaurus");
    public static final CustomTrigger SILESAURUS_COMPLETE = new CustomTrigger("adv_silesaurus");
    public static final CustomTrigger SMILOSUCHUS_COMPLETE = new CustomTrigger("adv_smilosuchus");
    public static final CustomTrigger SUMINIA_COMPLETE = new CustomTrigger("adv_suminia");
    public static final CustomTrigger TANYSTROPHEUS_COMPLETE = new CustomTrigger("adv_tanystropheus");
    public static final CustomTrigger TETRACERATOPS_COMPLETE = new CustomTrigger("adv_tetraceratops");
    public static final CustomTrigger THECODONTOSAURUS_COMPLETE = new CustomTrigger("adv_thecodontosaurus");
    public static final CustomTrigger TIARAJUDENS_COMPLETE = new CustomTrigger("adv_tiarajudens");
    public static final CustomTrigger TIKTAALIK_COMPLETE = new CustomTrigger("adv_tiktaalik");
    public static final CustomTrigger YINLONG_COMPLETE = new CustomTrigger("adv_yinlong");
    public static final CustomTrigger RHOMALEOSAURUS_COMPLETE = new CustomTrigger("adv_rhomaleosaurus");
    public static final CustomTrigger PROTEROSUCHUS_COMPLETE = new CustomTrigger("adv_proterosuchus");
    public static final CustomTrigger DAKOSAURUS_COMPLETE = new CustomTrigger("adv_dakosaurus");
    public static final CustomTrigger PLACERIAS_COMPLETE = new CustomTrigger("adv_placerias");
    public static final CustomTrigger PLATEOSAURUS_COMPLETE = new CustomTrigger("adv_plateosaurus");
    public static final CustomTrigger COELOPHYSIS_COMPLETE = new CustomTrigger("adv_coelophysis");
    public static final CustomTrigger ICHTHYOSTEGA_COMPLETE = new CustomTrigger("adv_ichthyostega");
    public static final CustomTrigger HERRERASAURUS_COMPLETE = new CustomTrigger("adv_herrerasaurus");
    public static final CustomTrigger BATRACHOTOMUS_COMPLETE = new CustomTrigger("adv_batrachotomus");
    public static final CustomTrigger DIADECTES_COMPLETE = new CustomTrigger("adv_diadectes");
    public static final CustomTrigger CYNOGNATHUS_COMPLETE = new CustomTrigger("adv_cynognathus");
    public static final CustomTrigger HYPERODAPEDON_COMPLETE = new CustomTrigger("adv_hyperodapedon");
    public static final CustomTrigger PROGANOCHELYS_COMPLETE = new CustomTrigger("adv_proganochelys");
    public static final CustomTrigger SILLOSUCHUS_COMPLETE = new CustomTrigger("adv_sillosuchus");
    public static final CustomTrigger XINPUSAURUS_COMPLETE = new CustomTrigger("adv_xinpusaurus");
    public static final CustomTrigger VANCLEAVEA_COMPLETE = new CustomTrigger("adv_vancleavea");
    public static final CustomTrigger TEMNODONTOSAURUS_COMPLETE = new CustomTrigger("adv_temnodontosaurus");
    public static final CustomTrigger CERATOSAURUS_COMPLETE = new CustomTrigger("adv_ceratosaurus");
    public static final CustomTrigger BOBOSAURUS_COMPLETE = new CustomTrigger("adv_bobosaurus");
    public static final CustomTrigger EURHINOSAURUS_COMPLETE = new CustomTrigger("adv_eurhinosaurus");
    public static final CustomTrigger CRYOLOPHOSAURUS_COMPLETE = new CustomTrigger("adv_cryolophosaurus");
    public static final CustomTrigger GIGANTSPINOSAURUS_COMPLETE = new CustomTrigger("adv_gigantspinosaurus");
    public static final CustomTrigger TUOJIANGOSAURUS_COMPLETE = new CustomTrigger("adv_tuojiangosaurus");
    public static final CustomTrigger STEGOSAURUS_COMPLETE = new CustomTrigger("adv_stegosaurus");
    public static final CustomTrigger HUAYANGOSAURUS_COMPLETE = new CustomTrigger("adv_huayangosaurus");
    public static final CustomTrigger EUROPASAURUS_COMPLETE = new CustomTrigger("adv_europasaurus");
    public static final CustomTrigger HUPEHSUCHUS_COMPLETE = new CustomTrigger("adv_hupehsuchus");
    public static final CustomTrigger LAIDLERIA_COMPLETE = new CustomTrigger("adv_laidleria");
    public static final CustomTrigger YUNGUISAURUS_COMPLETE = new CustomTrigger("adv_yunguisaurus");
    public static final CustomTrigger MIXOSAURUS_COMPLETE = new CustomTrigger("adv_mixosaurus");
    public static final CustomTrigger CRIOCEPHALOSAURUS_COMPLETE = new CustomTrigger("adv_criocephalosaurus");
    public static final CustomTrigger CTENOSPONDYLUS_COMPLETE = new CustomTrigger("adv_ctenospondylus");
    public static final CustomTrigger ELGINIA_COMPLETE = new CustomTrigger("adv_elginia");
    public static final CustomTrigger EUNOTOSAURUS_COMPLETE = new CustomTrigger("adv_eunotosaurus");
    public static final CustomTrigger ROBERTIA_COMPLETE = new CustomTrigger("adv_robertia");
    public static final CustomTrigger LABIDOSAURUS_COMPLETE = new CustomTrigger("adv_labidosaurus");
    public static final CustomTrigger VIVAXOSAURUS_COMPLETE = new CustomTrigger("adv_vivaxosaurus");
    public static final CustomTrigger URANOCENTRODON_COMPLETE = new CustomTrigger("adv_uranocentrodon");
    public static final CustomTrigger TORVOSAURUS_COMPLETE = new CustomTrigger("adv_torvosaurus");
    public static final CustomTrigger YANGCHUANOSAURUS_COMPLETE = new CustomTrigger("adv_yangchuanosaurus");
    public static final CustomTrigger DILOPHOSAURUS_COMPLETE = new CustomTrigger("adv_dilophosaurus");
    public static final CustomTrigger MYMOORAPELTA_COMPLETE = new CustomTrigger("adv_mymoorapelta");
    public static final CustomTrigger SINRAPTOR_COMPLETE = new CustomTrigger("adv_sinraptor");
    public static final CustomTrigger ALLOSAURUS_COMPLETE = new CustomTrigger("adv_allosaurus");
    public static final CustomTrigger LIMUSAURUS_COMPLETE = new CustomTrigger("adv_limusaurus");
    public static final CustomTrigger APATOSAURUS_COMPLETE = new CustomTrigger("adv_apatosaurus");
    public static final CustomTrigger DASYCEPS_COMPLETE = new CustomTrigger("adv_dasyceps");
    public static final CustomTrigger PRISTEROGNATHUS_COMPLETE = new CustomTrigger("adv_pristerognathus");
    public static final CustomTrigger BOTHRIOLEPIS_COMPLETE = new CustomTrigger("adv_bothriolepis");
    public static final CustomTrigger PARMASTEGA_COMPLETE = new CustomTrigger("adv_parmastega");
    public static final CustomTrigger PROCERATOSAURUS_COMPLETE = new CustomTrigger("adv_proceratosaurus");
    public static final CustomTrigger ELAPHROSAURUS_COMPLETE = new CustomTrigger("adv_elaphrosaurus");
    public static final CustomTrigger ANUROGNATHUS_COMPLETE = new CustomTrigger("adv_anurognathus");
    public static final CustomTrigger RHAMPHORHYNCHUS_COMPLETE = new CustomTrigger("adv_rhamphorhynchus");
    public static final CustomTrigger YUXISAURUS_COMPLETE = new CustomTrigger("adv_yuxisaurus");
    public static final CustomTrigger GUANLONG_COMPLETE = new CustomTrigger("adv_guanlong");
    public static final CustomTrigger CHILESAURUS_COMPLETE = new CustomTrigger("adv_chilesaurus");
    public static final CustomTrigger CAMARASAURUS_COMPLETE = new CustomTrigger("adv_camarasaurus");
    public static final CustomTrigger ADEOPAPPOSAURUS_COMPLETE = new CustomTrigger("adv_adeopapposaurus");
    public static final CustomTrigger MIRAGAIA_COMPLETE = new CustomTrigger("adv_miragaia");
    public static final CustomTrigger PTERODACTYLUS_COMPLETE = new CustomTrigger("adv_pterodactylus");
    public static final CustomTrigger COMPSOGNATHUS_COMPLETE = new CustomTrigger("adv_compsognathus");
    public static final CustomTrigger TITANICHTHYS_COMPLETE = new CustomTrigger("adv_titanichthys");
    public static final CustomTrigger CAMPTOSAURUS_COMPLETE = new CustomTrigger("adv_camptosaurus");
    public static final CustomTrigger ACANTHOSTEGA_COMPLETE = new CustomTrigger("adv_acanthostega");
    public static final CustomTrigger SHUNOSAURUS_COMPLETE = new CustomTrigger("adv_shunosaurus");
    public static final CustomTrigger PROTEROGYRINUS_COMPLETE = new CustomTrigger("adv_proterogyrinus");
    public static final CustomTrigger HETERODONTOSAURUS_COMPLETE = new CustomTrigger("adv_heterodontosaurus");
    public static final CustomTrigger DIPLODOCUS_COMPLETE = new CustomTrigger("adv_diplodocus");
    public static final CustomTrigger BRACHIOSAURUS_COMPLETE = new CustomTrigger("adv_brachiosaurus");
    public static final CustomTrigger ORNITHOLESTES_COMPLETE = new CustomTrigger("adv_ornitholestes");
    public static final CustomTrigger MAMENCHISAURUS_COMPLETE = new CustomTrigger("adv_mamenchisaurus");
    public static final CustomTrigger YI_COMPLETE = new CustomTrigger("adv_yi");
    public static final CustomTrigger DIMORPHODON_COMPLETE = new CustomTrigger("adv_dimorphodon");
    public static final CustomTrigger STANOCEPHALOSAURUS_COMPLETE = new CustomTrigger("adv_stanocephalosaurus");
    public static final CustomTrigger CACOPS_COMPLETE = new CustomTrigger("adv_cacops");
    public static final CustomTrigger OPHTHALMOTHULE_COMPLETE = new CustomTrigger("adv_ophthalmothule");
    public static final CustomTrigger PLESIOSAURUS_COMPLETE = new CustomTrigger("adv_plesiosaurus");
    public static final CustomTrigger LUFENGOSAURUS_COMPLETE = new CustomTrigger("adv_lufengosaurus");
    public static final CustomTrigger MONOLOPHOSAURUS_COMPLETE = new CustomTrigger("adv_monolophosaurus");
    public static final CustomTrigger ICHTHYOSAURUS_COMPLETE = new CustomTrigger("adv_ichthyosaurus");
    public static final CustomTrigger THALATTOSUCHUS_COMPLETE = new CustomTrigger("adv_thalattosuchus");
    public static final CustomTrigger DEUTEROSAURUS_COMPLETE = new CustomTrigger("adv_deuterosaurus");
    public static final CustomTrigger PLIOSAURUS_COMPLETE = new CustomTrigger("adv_pliosaurus");
    public static final CustomTrigger ERETMORHIPIS_COMPLETE = new CustomTrigger("adv_eretmorhipis");
    public static final CustomTrigger CARTORHYNCHUS_COMPLETE = new CustomTrigger("adv_cartorhynchus");
    public static final CustomTrigger STAHLECKERIA_COMPLETE = new CustomTrigger("adv_stahleckeria");
    public static final CustomTrigger ENDOTHIODON_COMPLETE = new CustomTrigger("adv_endothiodon");
    public static final CustomTrigger ACANTHOSTOMATOPS_COMPLETE = new CustomTrigger("adv_acanthostomatops");
    public static final CustomTrigger MELOSAURUS_COMPLETE = new CustomTrigger("adv_melosaurus");
    public static final CustomTrigger DIPLOCERASPIS_COMPLETE = new CustomTrigger("adv_diploceraspis");
    public static final CustomTrigger STOKESOSAURUS_COMPLETE = new CustomTrigger("adv_stokesosaurus");
    public static final CustomTrigger DIPLOCAULUSMINIMUS_COMPLETE = new CustomTrigger("adv_diplocaulusminimus");
    public static final CustomTrigger SECODONTOSAURUS_COMPLETE = new CustomTrigger("adv_secodontosaurus");
    public static final CustomTrigger EOABELISAURUS_COMPLETE = new CustomTrigger("adv_eoabelisaurus");
    public static final CustomTrigger PATAGOSAURUS_COMPLETE = new CustomTrigger("adv_patagosaurus");
    public static final CustomTrigger ASFALTOVENATOR_COMPLETE = new CustomTrigger("adv_asfaltovenator");
    public static final CustomTrigger LESOTHOSAURUS_COMPLETE = new CustomTrigger("adv_lesothosaurus");
    public static final CustomTrigger BRACHYTRACHELOPAN_COMPLETE = new CustomTrigger("adv_brachytrachelopan");
    public static final CustomTrigger MANIDENS_COMPLETE = new CustomTrigger("adv_manidens");
    public static final CustomTrigger CHUNGKINGOSAURUS_COMPLETE = new CustomTrigger("adv_chungkingosaurus");
    public static final CustomTrigger TAPEJARA_COMPLETE = new CustomTrigger("adv_tapejara");
    public static final CustomTrigger IRRITATOR_COMPLETE = new CustomTrigger("adv_irritator");
    public static final CustomTrigger HALISKIA_COMPLETE = new CustomTrigger("adv_haliskia");
    public static final CustomTrigger LUSKHAN_COMPLETE = new CustomTrigger("adv_luskhan");
    public static final CustomTrigger EUROPEJARA_COMPLETE = new CustomTrigger("adv_europejara");
    public static final CustomTrigger DEINONYCHUS_COMPLETE = new CustomTrigger("adv_deinonychus");
    public static final CustomTrigger SPECTROVENATOR_COMPLETE = new CustomTrigger("adv_spectrovenator");
    public static final CustomTrigger SARCOSUCHUS_COMPLETE = new CustomTrigger("adv_sarcosuchus");
    public static final CustomTrigger ICHTHYOVENATOR_COMPLETE = new CustomTrigger("adv_ichthyovenator");
    public static final CustomTrigger TENONTOSAURUS_COMPLETE = new CustomTrigger("adv_tenontosaurus");
    public static final CustomTrigger MANTELLISAURUS_COMPLETE = new CustomTrigger("adv_mantellisaurus");
    public static final CustomTrigger SUZHOUSAURUS_COMPLETE = new CustomTrigger("adv_suzhousaurus");
    public static final CustomTrigger KUNBARRASAURUS_COMPLETE = new CustomTrigger("adv_kunbarrasaurus");
    public static final CustomTrigger AMARGASAURUS_COMPLETE = new CustomTrigger("adv_amargasaurus");
    public static final CustomTrigger SINOSAURUS_COMPLETE = new CustomTrigger("adv_sinosaurus");
    public static final CustomTrigger OURANOSAURUS_COMPLETE = new CustomTrigger("adv_ouranosaurus");
    public static final CustomTrigger PRESTOSUCHUS_COMPLETE = new CustomTrigger("adv_prestosuchus");
    public static final CustomTrigger KLAMELISAURUS_COMPLETE = new CustomTrigger("adv_klamelisaurus");
    public static final CustomTrigger TUPANDACTYLUS_COMPLETE = new CustomTrigger("adv_tupandactylus");
    public static final CustomTrigger GAIASIA_COMPLETE = new CustomTrigger("adv_gaiasia");
    public static final CustomTrigger AQUILOPS_COMPLETE = new CustomTrigger("adv_aquilops");
    public static final CustomTrigger MEILIFEILONG_COMPLETE = new CustomTrigger("adv_meilifeilong");
    public static final CustomTrigger PROTOCERATOPS_COMPLETE = new CustomTrigger("adv_protoceratops");
    public static final CustomTrigger BOSLATIFRONS_COMPLETE = new CustomTrigger("adv_boslatifrons");
    public static final CustomTrigger VELOCIRAPTOR_COMPLETE = new CustomTrigger("adv_velociraptor");
    public static final CustomTrigger EREMOTHERIUM_COMPLETE = new CustomTrigger("adv_eremotherium");
    public static final CustomTrigger EUSTREPTOSPONDYLUS_COMPLETE = new CustomTrigger("adv_eustreptospondylus");
    public static final CustomTrigger KAYENTATHERIUM_COMPLETE = new CustomTrigger("adv_kayentatherium");
    public static final CustomTrigger SYNTHETOCERAS_COMPLETE = new CustomTrigger("adv_synthetoceras");
    public static final CustomTrigger COMPTONATUS_COMPLETE = new CustomTrigger("adv_comptonatus");
    public static final CustomTrigger JINYUNPELTA_COMPLETE = new CustomTrigger("adv_jinyunpelta");
    public static final CustomTrigger CENTROSAURUS_COMPLETE = new CustomTrigger("adv_centrosaurus");
    public static final CustomTrigger CHASMOSAURUS_COMPLETE = new CustomTrigger("adv_chasmosaurus");
    public static final CustomTrigger DEARC_COMPLETE = new CustomTrigger("adv_dearc");
    public static final CustomTrigger LAGOSUCHUS_COMPLETE = new CustomTrigger("adv_lagosuchus");
    public static final CustomTrigger STRUTHIOMIMUS_COMPLETE = new CustomTrigger("adv_struthiomimus");
    public static final CustomTrigger PSITTACOSAURUSMONGOLIENSIS_COMPLETE = new CustomTrigger("adv_psittacosaurusmongoliensis");
    public static final CustomTrigger PSITTACOSAURUSSIBIRICUS_COMPLETE = new CustomTrigger("adv_psittacosaurussibiricus");
    public static final CustomTrigger OLOROTITAN_COMPLETE = new CustomTrigger("adv_olorotitan");
    public static final CustomTrigger PSITTACOSAURUSLUJIATUNENSIS_COMPLETE = new CustomTrigger("adv_psittacosauruslujiatunensis");
    public static final CustomTrigger INCISIVOSAURUS_COMPLETE = new CustomTrigger("adv_incisivosaurus");
    public static final CustomTrigger THYLACOLEO_COMPLETE = new CustomTrigger("adv_thylacoleo");
    public static final CustomTrigger LUSOVENATOR_COMPLETE = new CustomTrigger("adv_lusovenator");
    public static final CustomTrigger CONCAVENATOR_COMPLETE = new CustomTrigger("adv_concavenator");
    public static final CustomTrigger MINQARIA_COMPLETE = new CustomTrigger("adv_minqaria");
    public static final CustomTrigger STENOKRANIO_COMPLETE = new CustomTrigger("adv_stenokranio");
    public static final CustomTrigger DIADEMODON_COMPLETE = new CustomTrigger("adv_diademodon");
    public static final CustomTrigger BARYONYX_COMPLETE = new CustomTrigger("adv_baryonyx");
    public static final CustomTrigger RIOJASUCHUS_COMPLETE = new CustomTrigger("adv_riojasuchus");
    public static final CustomTrigger SPICLYPEUS_COMPLETE = new CustomTrigger("adv_spiclypeus");
    public static final CustomTrigger BERTHASAURA_COMPLETE = new CustomTrigger("adv_berthasaura");
    public static final CustomTrigger RECHNISAURUS_COMPLETE = new CustomTrigger("adv_rechnisaurus");
    public static final CustomTrigger STAGONOLEPIS_COMPLETE = new CustomTrigger("adv_stagonolepis");
    public static final CustomTrigger AUSTRIADACTYLUS_COMPLETE = new CustomTrigger("adv_austriadactylus");
    public static final CustomTrigger SIMOLESTES_COMPLETE = new CustomTrigger("adv_simolestes");
    public static final CustomTrigger CRYPTOCLIDUS_COMPLETE = new CustomTrigger("adv_cryptoclidus");
    public static final CustomTrigger DREPANOSAURUS_COMPLETE = new CustomTrigger("adv_drepanosaurus");
    public static final CustomTrigger HYPSILOPHODON_COMPLETE = new CustomTrigger("adv_hypsilophodon");
    public static final CustomTrigger LEAELLYNASAURA_COMPLETE = new CustomTrigger("adv_leaellynasaura");
    public static final CustomTrigger MUTTABURRASAURUS_COMPLETE = new CustomTrigger("adv_muttaburrasaurus");
    public static final CustomTrigger HYPURONECTOR_COMPLETE = new CustomTrigger("adv_hypuronector");
    public static final CustomTrigger PIATNITZKYSAURUS_COMPLETE = new CustomTrigger("adv_piatnitzkysaurus");
    public static final CustomTrigger NQWEBASAURUS_COMPLETE = new CustomTrigger("adv_nqwebasaurus");
    public static final CustomTrigger IGUANODON_COMPLETE = new CustomTrigger("adv_iguanodon");
    public static final CustomTrigger FALCARIUS_COMPLETE = new CustomTrigger("adv_falcarius");
    public static final CustomTrigger UTAHRAPTOR_COMPLETE = new CustomTrigger("adv_utahraptor");
    public static final CustomTrigger CONVOLOSAURUS_COMPLETE = new CustomTrigger("adv_convolosaurus");
    public static final CustomTrigger LAJASVENATOR_COMPLETE = new CustomTrigger("adv_lajasvenator");
    public static final CustomTrigger EUROPELTA_COMPLETE = new CustomTrigger("adv_europelta");
    public static final CustomTrigger ACROCANTHOSAURUS_COMPLETE = new CustomTrigger("adv_acrocanthosaurus");
    public static final CustomTrigger CALLAWAYIA_COMPLETE = new CustomTrigger("adv_callawayia");
    public static final CustomTrigger NANNOPTERYGIUS_COMPLETE = new CustomTrigger("adv_nannopterygius");
    public static final CustomTrigger BARBOSANIA_COMPLETE = new CustomTrigger("adv_barbosania");
    public static final CustomTrigger ANHANGUERA_COMPLETE = new CustomTrigger("adv_anhanguera");
    public static final CustomTrigger PROBACTROSAURUS_COMPLETE = new CustomTrigger("adv_probactrosaurus");
    public static final CustomTrigger ALTIRHINUS_COMPLETE = new CustomTrigger("adv_altirhinus");
    public static final CustomTrigger PELECANIMIMUS_COMPLETE = new CustomTrigger("adv_pelecanimimus");
    public static final CustomTrigger BAJADASAURUS_COMPLETE = new CustomTrigger("adv_bajadasaurus");
    public static final CustomTrigger EOCURSOR_COMPLETE = new CustomTrigger("adv_eocursor");
    public static final CustomTrigger DRACORAPTOR_COMPLETE = new CustomTrigger("adv_dracoraptor");
    public static final CustomTrigger SAUROPELTA_COMPLETE = new CustomTrigger("adv_sauropelta");
    public static final CustomTrigger YUTYRANNUS_COMPLETE = new CustomTrigger("adv_yutyrannus");
    public static final CustomTrigger LEPTOCLEIDUS_COMPLETE = new CustomTrigger("adv_leptocleidus");
    public static final CustomTrigger ABYSSOSAURUS_COMPLETE = new CustomTrigger("adv_abyssosaurus");
    public static final CustomTrigger AUSTRALOVENATOR_COMPLETE = new CustomTrigger("adv_australovenator");
    public static final CustomTrigger GASTONIA_COMPLETE = new CustomTrigger("adv_gastonia");
    public static final CustomTrigger POLACANTHUS_COMPLETE = new CustomTrigger("adv_polacanthus");
    public static final CustomTrigger EOCARCHARIA_COMPLETE = new CustomTrigger("adv_eocarcharia");
    public static final CustomTrigger CTENOCHASMA_COMPLETE = new CustomTrigger("adv_ctenochasma");
    public static final CustomTrigger PTERODAUSTRO_COMPLETE = new CustomTrigger("adv_pterodaustro");
    public static final CustomTrigger QIANOSUCHUS_COMPLETE = new CustomTrigger("adv_qianosuchus");
    public static final CustomTrigger ANTHRACOSAURUS_COMPLETE = new CustomTrigger("adv_anthracosaurus");
    public static final CustomTrigger KANNEMEYERIA_COMPLETE = new CustomTrigger("adv_kannemeyeria");
    public static final CustomTrigger TYRANNOTITAN_COMPLETE = new CustomTrigger("adv_tyrannotitan");
    public static final CustomTrigger TERATERPETON_COMPLETE = new CustomTrigger("adv_teraterpeton");
    public static final CustomTrigger TRILOPHOSAURUS_COMPLETE = new CustomTrigger("adv_trilophosaurus");
    public static final CustomTrigger NIGERPETON_COMPLETE = new CustomTrigger("adv_nigerpeton");
    public static final CustomTrigger GIRAFFATITAN_COMPLETE = new CustomTrigger("adv_giraffatitan");
    public static final CustomTrigger LITARGOSUCHUS_COMPLETE = new CustomTrigger("adv_litargosuchus");
    public static final CustomTrigger NICROSAURUS_COMPLETE = new CustomTrigger("adv_nicrosaurus");
    public static final CustomTrigger DAURLONG_COMPLETE = new CustomTrigger("adv_daurlong");
    public static final CustomTrigger WUERHOSAURUS_COMPLETE = new CustomTrigger("adv_wuerhosaurus");
    public static final CustomTrigger ZHENYUANLONG_COMPLETE = new CustomTrigger("adv_zhenyuanlong");
    public static final CustomTrigger FUKUISAURUS_COMPLETE = new CustomTrigger("adv_fukuisaurus");
    public static final CustomTrigger JINZHOUSAURUS_COMPLETE = new CustomTrigger("adv_jinzhousaurus");
    public static final CustomTrigger EUHELOPUS_COMPLETE = new CustomTrigger("adv_euhelopus");
    public static final CustomTrigger MEI_COMPLETE = new CustomTrigger("adv_mei");
    public static final CustomTrigger SUCHOMIMUS_COMPLETE = new CustomTrigger("adv_suchomimus");
    public static final CustomTrigger EDMONTOSAURUS_COMPLETE = new CustomTrigger("adv_edmontosaurus");
    public static final CustomTrigger TYRANNOSAURUS_COMPLETE = new CustomTrigger("adv_tyrannosaurus");
    public static final CustomTrigger ANATOSUCHUS_COMPLETE = new CustomTrigger("adv_anatosuchus");
    public static final CustomTrigger NIGERSAURUS_COMPLETE = new CustomTrigger("adv_nigersaurus");
    public static final CustomTrigger CHAOYANGOPTERUS_COMPLETE = new CustomTrigger("adv_chaoyangopterus");
    public static final CustomTrigger SHENZHOUPTERUS_COMPLETE = new CustomTrigger("adv_shenzhoupterus");
    public static final CustomTrigger YUANYANGLONG_COMPLETE = new CustomTrigger("adv_yuanyanglong");
    public static final CustomTrigger PROTOCERAS_COMPLETE = new CustomTrigger("adv_protoceras");
    public static final CustomTrigger PRENOCEPHALE_COMPLETE = new CustomTrigger("adv_prenocephale");
    public static final CustomTrigger HATZEGOPTERYX_COMPLETE = new CustomTrigger("adv_hatzegopteryx");
    public static final CustomTrigger PRODINOCERAS_COMPLETE = new CustomTrigger("adv_prodinoceras");
    public static final CustomTrigger DECENNATHERIUM_COMPLETE = new CustomTrigger("adv_decennatherium");
    public static final CustomTrigger SIMOSTHENURUS_COMPLETE = new CustomTrigger("adv_simosthenurus");
    public static final CustomTrigger PYROTHERIUM_COMPLETE = new CustomTrigger("adv_pyrotherium");
    public static final CustomTrigger DINOCROCUTA_COMPLETE = new CustomTrigger("adv_dinocrocuta");
    public static final CustomTrigger DORUDON_COMPLETE = new CustomTrigger("adv_dorudon");
    public static final CustomTrigger TORUKJARA_COMPLETE = new CustomTrigger("adv_torukjara");
    public static final CustomTrigger CAIUAJARA_COMPLETE = new CustomTrigger("adv_caiuajara");
    public static final CustomTrigger OXYDACTYLUS_COMPLETE = new CustomTrigger("adv_oxydactylus");
    public static final CustomTrigger DAMADAMA_COMPLETE = new CustomTrigger("adv_damadama");
    public static final CustomTrigger HIPPIDION_COMPLETE = new CustomTrigger("adv_hippidion");
    public static final CustomTrigger RANGIFER_COMPLETE = new CustomTrigger("adv_rangifer");
    public static final CustomTrigger TUPANDACTYLUSNAVIGANS_COMPLETE = new CustomTrigger("adv_tupandactylusnavigans");
    public static final CustomTrigger SINOPTERUS_COMPLETE = new CustomTrigger("adv_sinopterus");


    public static final CustomTrigger[] TRIGGER_ARRAY = new CustomTrigger[] {
            AEGER_COMPLETE,
            ALIENUM_COMPLETE,
            PAMBDELURION_COMPLETE,
            TRIMERUS_COMPLETE,
            LUNGMENSHANASPIS_COMPLETE,
            XENACANTHUS_COMPLETE,
            GREGORIUS_COMPLETE,
            SLIMONIA_COMPLETE,
            SCAUMENACIA_COMPLETE,
            DREPANASPIS_COMPLETE,
            LONGISQUAMA_COMPLETE,
            COOPEROCERAS_COMPLETE,
            VESTINAUTILUS_COMPLETE,
            PALAEONISCUM_COMPLETE,
            PARANAICHTHYS_COMPLETE,
            ALLENYPTERUS_COMPLETE,
            HADRONECTOR_COMPLETE,
            FLAGELLOPANTOPUS_COMPLETE,
            PRAEARCTURUS_COMPLETE,
            ECHINOCHIMAERA_COMPLETE,
            SQUATINACTIS_COMPLETE,
            HELIANTHASTER_COMPLETE,
            MIMETASTER_COMPLETE,
            DORYASPIS_COMPLETE,
            GANTAROSTRATASPIS_COMPLETE,
            STENSIOELLA_COMPLETE,
            GROENLANDASPIS_COMPLETE,
            MOBULAVERMIS_COMPLETE,
            KAYKAY_COMPLETE,
            LEEDSICHTHYS_COMPLETE,
            CAIHONG_COMPLETE,
            GOSFORDIA_COMPLETE,
            HYDROPESSUM_COMPLETE,
            DIPTERONOTUS_COMPLETE,
            HARPAGOFUTUTOR_COMPLETE,
            MAMULICHTHYS_COMPLETE,
            SENEKICHTHYS_COMPLETE,
            PHYLLOCERAS_COMPLETE,
            TITANITES_COMPLETE,
            CHARNIA_COMPLETE,
            BRAZILICHTHYS_COMPLETE,
            BETHESDAICHTHYS_COMPLETE,
            HELIOPELTIS_COMPLETE,
            PAREXUS_COMPLETE,
            SPRIGGINA_COMPLETE,
            DIPLACANTHUS_COMPLETE,
            FURCACAUDA_COMPLETE,
            DICRANURUS_COMPLETE,
            GUIYU_COMPLETE,
            OSTEOLEPIS_COMPLETE,
            DICKINSONIA_COMPLETE,
            KLEPTOTHULE_COMPLETE,
            PSYCHOPYGE_COMPLETE,
            ANGUSTIDONTUS_COMPLETE,
            TYRANNOPHONTES_COMPLETE,
            THELODUS_COMPLETE,
            DIPLODOCUS_COMPLETE,
            OPHTHALMOTHULE_COMPLETE,
            PLESIOSAURUS_COMPLETE,
            BRACHIOSAURUS_COMPLETE,
            THALATTOSUCHUS_COMPLETE,
            DEUTEROSAURUS_COMPLETE,
            PLIOSAURUS_COMPLETE,
            ERETMORHIPIS_COMPLETE,
            CARTORHYNCHUS_COMPLETE,
            STAHLECKERIA_COMPLETE,
            ENDOTHIODON_COMPLETE,
            ACANTHOSTOMATOPS_COMPLETE,
            MELOSAURUS_COMPLETE,
            DIPLOCERASPIS_COMPLETE,
            STOKESOSAURUS_COMPLETE,
            DIPLOCAULUSMINIMUS_COMPLETE,
            SECODONTOSAURUS_COMPLETE,
            EOABELISAURUS_COMPLETE,
            PATAGOSAURUS_COMPLETE,
            ASFALTOVENATOR_COMPLETE,
            LESOTHOSAURUS_COMPLETE,
            BRACHYTRACHELOPAN_COMPLETE,
            MANIDENS_COMPLETE,
            CHUNGKINGOSAURUS_COMPLETE,
            TAPEJARA_COMPLETE,
            IRRITATOR_COMPLETE,
            HALISKIA_COMPLETE,
            LUSKHAN_COMPLETE,
            EUROPEJARA_COMPLETE,
            DEINONYCHUS_COMPLETE,
            SPECTROVENATOR_COMPLETE,
            SARCOSUCHUS_COMPLETE,
            ICHTHYOVENATOR_COMPLETE,
            TENONTOSAURUS_COMPLETE,
            MANTELLISAURUS_COMPLETE,
            SUZHOUSAURUS_COMPLETE,
            KUNBARRASAURUS_COMPLETE,
            AMARGASAURUS_COMPLETE,
            SINOSAURUS_COMPLETE,
            OURANOSAURUS_COMPLETE,
            PRESTOSUCHUS_COMPLETE,
            KLAMELISAURUS_COMPLETE,
            TUPANDACTYLUS_COMPLETE,
            GAIASIA_COMPLETE,
            AQUILOPS_COMPLETE,
            MEILIFEILONG_COMPLETE,
            PROTOCERATOPS_COMPLETE,
            BOSLATIFRONS_COMPLETE,
            VELOCIRAPTOR_COMPLETE,
            EREMOTHERIUM_COMPLETE,
            EUSTREPTOSPONDYLUS_COMPLETE,
            KAYENTATHERIUM_COMPLETE,
            SYNTHETOCERAS_COMPLETE,
            COMPTONATUS_COMPLETE,
            JINYUNPELTA_COMPLETE,
            CENTROSAURUS_COMPLETE,
            CHASMOSAURUS_COMPLETE,
            DEARC_COMPLETE,
            LAGOSUCHUS_COMPLETE,
            STRUTHIOMIMUS_COMPLETE,
            PSITTACOSAURUSMONGOLIENSIS_COMPLETE,
            PSITTACOSAURUSSIBIRICUS_COMPLETE,
            PSITTACOSAURUSLUJIATUNENSIS_COMPLETE,
            INCISIVOSAURUS_COMPLETE,
            THYLACOLEO_COMPLETE,
            LUSOVENATOR_COMPLETE,
            CONCAVENATOR_COMPLETE,
            MINQARIA_COMPLETE,
            STENOKRANIO_COMPLETE,
            DIADEMODON_COMPLETE,
            BARYONYX_COMPLETE,
            RIOJASUCHUS_COMPLETE,
            SPICLYPEUS_COMPLETE,
            BERTHASAURA_COMPLETE,
            RECHNISAURUS_COMPLETE,
            STAGONOLEPIS_COMPLETE,
            AUSTRIADACTYLUS_COMPLETE,
            SIMOLESTES_COMPLETE,
            CRYPTOCLIDUS_COMPLETE,
            DREPANOSAURUS_COMPLETE,
            HYPSILOPHODON_COMPLETE,
            LEAELLYNASAURA_COMPLETE,
            MUTTABURRASAURUS_COMPLETE,
            HYPURONECTOR_COMPLETE,
            PIATNITZKYSAURUS_COMPLETE,
            NQWEBASAURUS_COMPLETE,
            IGUANODON_COMPLETE,
            FALCARIUS_COMPLETE,
            UTAHRAPTOR_COMPLETE,
            CONVOLOSAURUS_COMPLETE,
            LAJASVENATOR_COMPLETE,
            EUROPELTA_COMPLETE,
            ACROCANTHOSAURUS_COMPLETE,
            CALLAWAYIA_COMPLETE,
            NANNOPTERYGIUS_COMPLETE,
            BARBOSANIA_COMPLETE,
            ANHANGUERA_COMPLETE,
            PROBACTROSAURUS_COMPLETE,
            ALTIRHINUS_COMPLETE,
            PELECANIMIMUS_COMPLETE,
            BAJADASAURUS_COMPLETE,
            EOCURSOR_COMPLETE,
            DRACORAPTOR_COMPLETE,
            SAUROPELTA_COMPLETE,
            YUTYRANNUS_COMPLETE,
            LEPTOCLEIDUS_COMPLETE,
            ABYSSOSAURUS_COMPLETE,
            AUSTRALOVENATOR_COMPLETE,
            GASTONIA_COMPLETE,
            POLACANTHUS_COMPLETE,
            EOCARCHARIA_COMPLETE,
            CTENOCHASMA_COMPLETE,
            PTERODAUSTRO_COMPLETE,
            QIANOSUCHUS_COMPLETE,
            ANTHRACOSAURUS_COMPLETE,
            KANNEMEYERIA_COMPLETE,
            TYRANNOTITAN_COMPLETE,
            TERATERPETON_COMPLETE,
            TRILOPHOSAURUS_COMPLETE,
            NIGERPETON_COMPLETE,
            GIRAFFATITAN_COMPLETE,
            LITARGOSUCHUS_COMPLETE,
            NICROSAURUS_COMPLETE,
            DAURLONG_COMPLETE,
            WUERHOSAURUS_COMPLETE,
            ZHENYUANLONG_COMPLETE,
            FUKUISAURUS_COMPLETE,
            JINZHOUSAURUS_COMPLETE,
            EUHELOPUS_COMPLETE,
            MEI_COMPLETE,
            SUCHOMIMUS_COMPLETE,
            EDMONTOSAURUS_COMPLETE,
            TYRANNOSAURUS_COMPLETE,
            ANATOSUCHUS_COMPLETE,
            NIGERSAURUS_COMPLETE,
            CHAOYANGOPTERUS_COMPLETE,
            SHENZHOUPTERUS_COMPLETE,
            YUANYANGLONG_COMPLETE,
            PROTOCERAS_COMPLETE,
            PRENOCEPHALE_COMPLETE,
            HATZEGOPTERYX_COMPLETE,
            PRODINOCERAS_COMPLETE,
            DECENNATHERIUM_COMPLETE,
            SIMOSTHENURUS_COMPLETE,
            PYROTHERIUM_COMPLETE,
            DINOCROCUTA_COMPLETE,
            DORUDON_COMPLETE,
            TORUKJARA_COMPLETE,
            CAIUAJARA_COMPLETE,
            OXYDACTYLUS_COMPLETE,
            DAMADAMA_COMPLETE,
            HIPPIDION_COMPLETE,
            RANGIFER_COMPLETE,
            TUPANDACTYLUSNAVIGANS_COMPLETE,
            SINOPTERUS_COMPLETE,
            OLOROTITAN_COMPLETE,
            ICHTHYOSAURUS_COMPLETE,
            LUFENGOSAURUS_COMPLETE,
            MONOLOPHOSAURUS_COMPLETE,
            DUNYU_COMPLETE,
            CIURCOPTERUS_COMPLETE,
            HADRANAX_COMPLETE,
            CAPINATATOR_COMPLETE,
            ERYMA_COMPLETE,
            MECOCHIRUS_COMPLETE,
            CYCLOMEDUSA_COMPLETE,
            ROTACIURCA_COMPLETE,
            WAPTIA_COMPLETE,
            ISOXYS_COMPLETE,
            ZENASPIS_COMPLETE,
            SCLERODUS_COMPLETE,
            WARNETICARIS_COMPLETE,
            PHANTASPIS_COMPLETE,
            ARCHAEOPTERYX_COMPLETE,
            NEUROPTERA_COMPLETE,
            SHUNOSAURUS_COMPLETE,
            CAMPTOSAURUS_COMPLETE,
            ORNITHOLESTES_COMPLETE,
            STANOCEPHALOSAURUS_COMPLETE,
            CACOPS_COMPLETE,
            YI_COMPLETE,
            DIMORPHODON_COMPLETE,
            MAMENCHISAURUS_COMPLETE,
            TITANICHTHYS_COMPLETE,
            PLATYCARASPIS_COMPLETE,
            PARMASTEGA_COMPLETE,
            COMPSOGNATHUS_COMPLETE,
            PTERODACTYLUS_COMPLETE,
            CAMARASAURUS_COMPLETE,
            PROTEROGYRINUS_COMPLETE,
            ACANTHOSTEGA_COMPLETE,
            HETERODONTOSAURUS_COMPLETE,
            MIRAGAIA_COMPLETE,
            ADEOPAPPOSAURUS_COMPLETE,
            ANUROGNATHUS_COMPLETE,
            GUANLONG_COMPLETE,
            CHILESAURUS_COMPLETE,
            RHAMPHORHYNCHUS_COMPLETE,
            ANTEOSAURUS_COMPLETE,
            YUXISAURUS_COMPLETE,
            DASYCEPS_COMPLETE,
            BOTHRIOLEPIS_COMPLETE,
            ELAPHROSAURUS_COMPLETE,
            MYMOORAPELTA_COMPLETE,
            PRISTEROGNATHUS_COMPLETE,
            PROCERATOSAURUS_COMPLETE,
            APATOSAURUS_COMPLETE,
            SINRAPTOR_COMPLETE,
            LIMUSAURUS_COMPLETE,
            ALLOSAURUS_COMPLETE,
            YANGCHUANOSAURUS_COMPLETE,
            DILOPHOSAURUS_COMPLETE,
            GIGANTSPINOSAURUS_COMPLETE,
            VIVAXOSAURUS_COMPLETE,
            TORVOSAURUS_COMPLETE,
            URANOCENTRODON_COMPLETE,
            LAIDLERIA_COMPLETE,
            LABIDOSAURUS_COMPLETE,
            ROBERTIA_COMPLETE,
            EUNOTOSAURUS_COMPLETE,
            ELGINIA_COMPLETE,
            CTENOSPONDYLUS_COMPLETE,
            MIXOSAURUS_COMPLETE,
            HUPEHSUCHUS_COMPLETE,
            CRIOCEPHALOSAURUS_COMPLETE,
            YUNGUISAURUS_COMPLETE,
            STEGOSAURUS_COMPLETE,
            EUROPASAURUS_COMPLETE,
            HUAYANGOSAURUS_COMPLETE,
            BOBOSAURUS_COMPLETE,
            TUOJIANGOSAURUS_COMPLETE,
            CRYOLOPHOSAURUS_COMPLETE,
            EURHINOSAURUS_COMPLETE,
            PLATEOSAURUS_COMPLETE,
            CERATOSAURUS_COMPLETE,
            TEMNODONTOSAURUS_COMPLETE,
            SILLOSUCHUS_COMPLETE,
            VANCLEAVEA_COMPLETE,
            XINPUSAURUS_COMPLETE,
            YINLONG_COMPLETE,
            PLACERIAS_COMPLETE,
            CYNOGNATHUS_COMPLETE,
            ICHTHYOSTEGA_COMPLETE,
            PROGANOCHELYS_COMPLETE,
            DAKOSAURUS_COMPLETE,
            HYPERODAPEDON_COMPLETE,
            TIKTAALIK_COMPLETE,
            HERRERASAURUS_COMPLETE,
            TANYSTROPHEUS_COMPLETE,
            DIADECTES_COMPLETE,
            TIARAJUDENS_COMPLETE,
            THECODONTOSAURUS_COMPLETE,
            TETRACERATOPS_COMPLETE,
            BATRACHOTOMUS_COMPLETE,
            SMILOSUCHUS_COMPLETE,
            COELOPHYSIS_COMPLETE,
            SUMINIA_COMPLETE,
            SILESAURUS_COMPLETE,
            SHONISAURUS_COMPLETE,
            SHRINGASAURUS_COMPLETE,
            POSTOSUCHUS_COMPLETE,
            SCUTOSAURUS_COMPLETE,
            RUBIDGEA_COMPLETE,
            PROBURNETIA_COMPLETE,
            PRIONOSUCHUS_COMPLETE,
            POPOSAURUS_COMPLETE,
            OPHIACODON_COMPLETE,
            PLATYHYSTRIX_COMPLETE,
            PLACODUS_COMPLETE,
            PHOLIDERPETON_COMPLETE,
            OPHTHALMOSAURUS_COMPLETE,
            LOTOSAURUS_COMPLETE,
            LYSTROSAURUS_COMPLETE,
            NOTHOSAURUS_COMPLETE,
            MEGALOSAURUS_COMPLETE,
            MOSCHOPS_COMPLETE,
            MEGALOCEPHALUS_COMPLETE,
            MASTODONSAURUS_COMPLETE,
            LISOWICIA_COMPLETE,
            LIMNOSCELIS_COMPLETE,
            ATOPODENTATUS_COMPLETE,
            LILIENSTERNUS_COMPLETE,
            BUNGARTIUS_COMPLETE,
            LESSEMSAURUS_COMPLETE,
            KENTROSAURUS_COMPLETE,
            HENODUS_COMPLETE,
            PROTEROSUCHUS_COMPLETE,
            JONKERIA_COMPLETE,
            INOSTRANCEVIA_COMPLETE,
            ERYOPS_COMPLETE,
            GERROTHORAX_COMPLETE,
            ESTEMMENOSUCHUS_COMPLETE,
            ERYTHROSUCHUS_COMPLETE,
            EORHYNCHOCHELYS_COMPLETE,
            EFFIGIA_COMPLETE,
            BUNOSTEGOS_COMPLETE,
            EDAPHOSAURUS_COMPLETE,
            CAVIRAMUS_COMPLETE,
            CRASSIGYRINUS_COMPLETE,
            DUNKLEOSTEUS_COMPLETE,
            CYAMODUS_COMPLETE,
            CYMBOSPONDYLUS_COMPLETE,
            COTYLORHYNCHUS_COMPLETE,
            DATHEOSAURUS_COMPLETE,
            DRYOSAURUS_COMPLETE,
            DESMATOSUCHUS_COMPLETE,
            DIPLOCAULUS_COMPLETE,
            DIMETRODON_COMPLETE,
            RHOMALEOSAURUS_COMPLETE,
            ARIZONASAURUS_COMPLETE

    };


    public static void registerTriggers()
    {
        Method method;

        method = ReflectionHelper.findMethod(CriteriaTriggers.class, "register", "func_192118_a", ICriterionTrigger.class);

        method.setAccessible(true);

        for (int i=0; i < TRIGGER_ARRAY.length; i++)
        {
            try
            {
               method.invoke(null, TRIGGER_ARRAY[i]);
            }
            catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
            {
               e.printStackTrace();
            }
        }
    }
}