package net.prehistoricnaturefossils.blocks.base;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.prehistoricnaturefossils.blocks.skeletons.*;
import net.prehistoricnaturefossils.blocks.slabs.*;
import net.prehistoricnaturefossils.tile.base.TileEntityFossilBase;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block FOSSIL_AKMONISTION = new BlockFossilAkmonistion();
    public static final Block FOSSIL_AMPYX = new BlockFossilAmpyx();
    public static final Block FOSSIL_ANOMOLACARIS = new BlockFossilAnomalocaris();
    public static final Block FOSSIL_ANTEOSAURUS = new BlockFossilAnteosaurus();
    public static final Block FOSSIL_ARIZONASAURUS = new BlockFossilArizonasaurus();
    public static final Block FOSSIL_ARTHROPLEURA = new BlockFossilArthropleura();
    public static final Block FOSSIL_ASAPHUS = new BlockFossilAsaphus();
    public static final Block FOSSIL_BUNGARTIUS = new BlockFossilBungartius();
    public static final Block FOSSIL_CAVIRAMUS = new BlockFossilCaviramus();
    public static final Block FOSSIL_COCCOSTEUS = new BlockFossilCoccosteus();
    public static final Block FOSSIL_COTYLORHYNCHUS = new BlockFossilCotylorhynchus();
    public static final Block FOSSIL_CYAMODUS = new BlockFossilCyamodus();
    public static final Block FOSSIL_CYMBOSPONDYLUS = new BlockFossilCymbospondylus();
    public static final Block FOSSIL_DESMATOSUCHUS = new BlockFossilDesmatosuchus();
    public static final Block FOSSIL_DIMETRODON = new BlockFossilDimetrodon();
    public static final Block FOSSIL_DIPLOCAULUS = new BlockFossilDiplocaulus();
    public static final Block FOSSIL_DRYOSAURUS = new BlockFossilDryosaurus();
    public static final Block FOSSIL_DUNKLEOSTEUS = new BlockFossilDunkleosteus();
    public static final Block FOSSIL_EDAPHOSAURUS = new BlockFossilEdaphosaurus();
    public static final Block FOSSIL_EFFIGIA = new BlockFossilEffigia();
    public static final Block FOSSIL_ERYTHROSUCHUS = new BlockFossilErythrosuchus();
    public static final Block FOSSIL_ESTEMMENOSUCHUS = new BlockFossilEstemmenosuchus();
    public static final Block FOSSIL_FALCATUS = new BlockFossilFalcatus();
    public static final Block FOSSIL_GERROTHORAX = new BlockFossilGerrothorax();
    public static final Block FOSSIL_HENODUS = new BlockFossilHenodus();
    public static final Block FOSSIL_KEICHOUSAURUS = new BlockFossilKeichousaurus();
    public static final Block FOSSIL_KENTROSAURUS = new BlockFossilKentrosaurus();
    public static final Block FOSSIL_LILIENSTERNUS = new BlockFossilLiliensternus();
    public static final Block FOSSIL_LIMULID = new BlockFossilLimulid();
    public static final Block FOSSIL_LOTOSAURUS = new BlockFossilLotosaurus();
    public static final Block FOSSIL_LYSTROSAURUS = new BlockFossilLystrosaurus();
    public static final Block FOSSIL_MASTODONSAURUS = new BlockFossilMastodonsaurus();
    public static final Block FOSSIL_MEGALOSAURUS = new BlockFossilMegalosaurus();
    public static final Block FOSSIL_MEGANEURA = new BlockFossilMeganeura();
    public static final Block FOSSIL_MEGARACHNE = new BlockFossilMegarachne();
    public static final Block FOSSIL_MIXOPTERUS = new BlockFossilMixopterus();
    public static final Block FOSSIL_MOSCHOPS = new BlockFossilMoschops();
    public static final Block FOSSIL_OPHIACODON = new BlockFossilOphiacodon();
    public static final Block FOSSIL_OPHTHALMOSAURUS = new BlockFossilOphthalmosaurus();
    public static final Block FOSSIL_PLATYHYSTRIX = new BlockFossilPlatyhystrix();
    public static final Block FOSSIL_POPOSAURUS = new BlockFossilPoposaurus();
    public static final Block FOSSIL_PRIONOSUCHUS = new BlockFossilPrionosuchus();
    public static final Block FOSSIL_PULMONOSCORPIUS = new BlockFossilPulmonoscorpius();
    public static final Block FOSSIL_RUBIDGEA = new BlockFossilRubidgea();
    public static final Block FOSSIL_SCHINDERHANNES = new BlockFossilSchinderhannes();
    public static final Block FOSSIL_SCUTOSAURUS = new BlockFossilScutosaurus();
    public static final Block FOSSIL_SHRINGASAURUS = new BlockFossilShringasaurus();
    public static final Block FOSSIL_SILESAURUS = new BlockFossilSilesaurus();
    public static final Block FOSSIL_SUMINIA = new BlockFossilSuminia();
    public static final Block FOSSIL_TANYSTROPHEUS = new BlockFossilTanystropheus();
    public static final Block FOSSIL_THECODONTOSAURUS = new BlockFossilThecodontosaurus();
    public static final Block FOSSIL_TIARAJUDENS = new BlockFossilTiarajudens();
    public static final Block FOSSIL_TIKTAALIK = new BlockFossilTiktaalik();
    public static final Block FOSSIL_TULLIMONSTRUM = new BlockFossilTullimonstrum();
    public static final Block FOSSIL_WALLISEROPS = new BlockFossilWalliserops();
    public static final Block FOSSIL_YINLONG = new BlockFossilYinlong();
    public static final Block FOSSIL_JONKERIA = new BlockFossilJonkeria();
    public static final Block FOSSIL_POSTOSUCHUS = new BlockFossilPostosuchus();
    public static final Block FOSSIL_CRASSIGYRINUS = new BlockFossilCrassigyrinus();
    public static final Block FOSSIL_ERYOPS = new BlockFossilEryops();
    public static final Block FOSSIL_LESSEMSAURUS = new BlockFossilLessemsaurus();
    public static final Block FOSSIL_NOTHOSAURUS = new BlockFossilNothosaurus();
    public static final Block FOSSIL_ATOPODENTATUS = new BlockFossilAtopodentatus();
    public static final Block FOSSIL_PLACODUS = new BlockFossilPlacodus();
    public static final Block FOSSIL_SHONISAURUS = new BlockFossilShonisaurus();
    public static final Block FOSSIL_LISOWICIA = new BlockFossilLisowicia();
    public static final Block FOSSIL_SMILOSUCHUS = new BlockFossilSmilosuchus();
    public static final Block FOSSIL_EORHYNCHOCHELYS = new BlockFossilEorhynchochelys();
    public static final Block FOSSIL_DATHEOSAURUS = new BlockFossilDatheosaurus();
    public static final Block FOSSIL_PHOLIDERPETON = new BlockFossilPholiderpeton();
    public static final Block FOSSIL_MEGALOCEPHALUS = new BlockFossilMegalocephalus();
    public static final Block FOSSIL_LIMNOSCELIS = new BlockFossilLimnoscelis();
    public static final Block FOSSIL_PROBURNETIA = new BlockFossilProburnetia();
    public static final Block FOSSIL_TETRACERATOPS  = new BlockFossilTetraceratops();
    public static final Block FOSSIL_BUNOSTEGOS  = new BlockFossilBunostegos();
    public static final Block FOSSIL_INOSTRANCEVIA  = new BlockFossilInostrancevia();
    public static final Block FOSSIL_TURBOSCINETES  = new BlockFossilTurboscinetes();
    public static final Block FOSSIL_AEGER  = new BlockFossilAeger();
    public static final Block FOSSIL_ERYON  = new BlockFossilEryon();
    public static final Block FOSSIL_FOREYIA  = new BlockFossilForeyia();
    public static final Block FOSSIL_CROTALOCEPHALUS  = new BlockFossilCrotalocephalus();
    public static final Block FOSSIL_OPABINIA  = new BlockFossilOpabinia();
    public static final Block FOSSIL_GEMUENDINA  = new BlockFossilGemuendina();
    public static final Block FOSSIL_BOBASATRANIA  = new BlockFossilBobasatrania();
    public static final Block FOSSIL_OTTOIA  = new BlockFossilOttoia();
    public static final Block FOSSIL_BELANTSEA  = new BlockFossilBelantsea();
//    public static final Block FOSSIL_CRINOID_RAFT  = new BlockFossilCrinoidRaft();
    public static final Block FOSSIL_CLADOSELACHE  = new BlockFossilCladoselache();
    public static final Block FOSSIL_EUSTHENOPTERON  = new BlockFossilEusthenopteron();
    public static final Block FOSSIL_SIDNEYIA  = new BlockFossilSidneyia();
    public static final Block FOSSIL_VETULICOLA  = new BlockFossilVetulicola();
    public static final Block FOSSIL_CLATROTITAN  = new BlockFossilClatrotitan();
    public static final Block FOSSIL_HALLUCIGENIA  = new BlockFossilHallucigenia();
    public static final Block FOSSIL_BANDRINGA  = new BlockFossilBandringa();
    public static final Block FOSSIL_PIKAIA  = new BlockFossilPikaia();
    public static final Block FOSSIL_CANADASPIS  = new BlockFossilCanadaspis();
    public static final Block FOSSIL_KERYGMACHELA  = new BlockFossilKerygmachela();
    public static final Block FOSSIL_BALHUTICARIS  = new BlockFossilBalhuticaris();
    public static final Block FOSSIL_CAMBRORASTER  = new BlockFossilCambroraster();
    public static final Block FOSSIL_EOREDLICHIA  = new BlockFossilEoredlichia();
    public static final Block FOSSIL_YAWUNIK  = new BlockFossilYawunik();
    public static final Block FOSSIL_MARRELLA  = new BlockFossilMarrella();
    public static final Block FOSSIL_NECTOCARIS  = new BlockFossilNectocaris();
    public static final Block FOSSIL_POLYBRANCHIASPIS  = new BlockFossilPolybranchiaspis();
    public static final Block FOSSIL_PARAMETEORASPIS  = new BlockFossilParameteoraspis();
    public static final Block FOSSIL_HAIKOUICHTHYS  = new BlockFossilHaikouichthys();
    public static final Block FOSSIL_YOHOIA  = new BlockFossilYohoia();
    public static final Block FOSSIL_SANCTACARIS  = new BlockFossilSanctacaris();
    public static final Block FOSSIL_SKEEMELLA  = new BlockFossilSkeemella();
    public static final Block FOSSIL_RHOMALEOSAURUS  = new BlockFossilRhomaleosaurus();
    public static final Block FOSSIL_PROTEROSUCHUS  = new BlockFossilProterosuchus();
    public static final Block FOSSIL_DAKOSAURUS  = new BlockFossilDakosaurus();
    public static final Block FOSSIL_PLACERIAS  = new BlockFossilPlacerias();
    public static final Block FOSSIL_PLATEOSAURUS  = new BlockFossilPlateosaurus();
    public static final Block FOSSIL_COELOPHYSIS  = new BlockFossilCoelophysis();
    public static final Block FOSSIL_ICHTHYOSTEGA  = new BlockFossilIchthyostega();
    public static final Block FOSSIL_HERRERASAURUS  = new BlockFossilHerrerasaurus();
    public static final Block FOSSIL_BATRACHOTOMUS  = new BlockFossilBatrachotomus();
    public static final Block FOSSIL_DIADECTES  = new BlockFossilDiadectes();
    public static final Block FOSSIL_CYNOGNATHUS  = new BlockFossilCynognathus();
    public static final Block FOSSIL_HYPERODAPEDON  = new BlockFossilHyperodapedon();
    public static final Block FOSSIL_PROGANOCHELYS  = new BlockFossilProganochelys();
    public static final Block FOSSIL_SILLOSUCHUS  = new BlockFossilSillosuchus();
    public static final Block FOSSIL_XINPUSAURUS  = new BlockFossilXinpusaurus();
    public static final Block FOSSIL_VANCLEAVEA  = new BlockFossilVancleavea();
    public static final Block FOSSIL_TEMNODONTOSAURUS  = new BlockFossilTemnodontosaurus();
    public static final Block FOSSIL_CERATOSAURUS  = new BlockFossilCeratosaurus();
    public static final Block FOSSIL_BOBOSAURUS  = new BlockFossilBobosaurus();
    public static final Block FOSSIL_EURHINOSAURUS  = new BlockFossilEurhinosaurus();
    public static final Block FOSSIL_CYRTOCERAS  = new BlockFossilCyrtoceras();
    public static final Block FOSSIL_PLATYPELTOIDES  = new BlockFossilPlatypeltoides();
    public static final Block FOSSIL_LITUITES  = new BlockFossilLituites();
    public static final Block FOSSIL_COTHURNOCYSTIS  = new BlockFossilCothurnocystis();
    public static final Block FOSSIL_ORTHOCERAS  = new BlockFossilOrthoceras();
    public static final Block FOSSIL_ARANDASPIS  = new BlockFossilArandaspis();
    public static final Block FOSSIL_MACLURINA   = new BlockFossilMaclurina();
    public static final Block FOSSIL_APHETOCERAS   = new BlockFossilAphetoceras();
    public static final Block FOSSIL_SACABAMBASPIS   = new BlockFossilSacabambaspis();
    public static final Block FOSSIL_HUNGIOIDES   = new BlockFossilHungioides();
    public static final Block FOSSIL_CRYOLOPHOSAURUS   = new BlockFossilCryolophosaurus();
    public static final Block FOSSIL_GIGANTSPINOSAURUS   = new BlockFossilGigantspinosaurus();
    public static final Block FOSSIL_TUOJIANGOSAURUS   = new BlockFossilTuojiangosaurus();
    public static final Block FOSSIL_STEGOSAURUS   = new BlockFossilStegosaurus();
    public static final Block FOSSIL_HUAYANGOSAURUS   = new BlockFossilHuayangosaurus();
    public static final Block FOSSIL_EUROPASAURUS   = new BlockFossilEuropasaurus();
    public static final Block FOSSIL_DIDYMOGRAPTUS   = new BlockFossilDidymograptus();
    public static final Block FOSSIL_GONIOCERAS   = new BlockFossilGonioceras();
    public static final Block FOSSIL_AEGIROCASSIS   = new BlockFossilAegirocassis();
    public static final Block FOSSIL_CAMEROCERAS   = new BlockFossilCameroceras();
    public static final Block FOSSIL_CONODONT   = new BlockFossilConodont();
    public static final Block FOSSIL_PRICYCLOPYGE   = new BlockFossilPricyclopyge();
    public static final Block FOSSIL_VILLEBRUNASTER   = new BlockFossilVillebrunaster();
    public static final Block FOSSIL_CALVAPILOSA   = new BlockFossilCalvapilosa();
    public static final Block FOSSIL_AINIKTOZOON   = new BlockFossilAiniktozoon();
    public static final Block FOSSIL_ARCTINURUS   = new BlockFossilArctinurus();
    public static final Block FOSSIL_BOHEMOHARPES   = new BlockFossilBohemoharpes();
    public static final Block FOSSIL_BIRKENIA   = new BlockFossilBirkenia();
    public static final Block FOSSIL_CARCINOSOMA   = new BlockFossilCarcinosoma();
    public static final Block FOSSIL_FURCASTER   = new BlockFossilFurcaster();
    public static final Block FOSSIL_EURYPTERUS   = new BlockFossilEurypterus();
    public static final Block FOSSIL_JAMOYTIUS    = new BlockFossilJamoytius();
    public static final Block FOSSIL_HUPEHSUCHUS    = new BlockFossilHupehsuchus();
    public static final Block FOSSIL_LAIDLERIA    = new BlockFossilLaidleria();
    public static final Block FOSSIL_YUNGUISAURUS    = new BlockFossilYunguisaurus();
    public static final Block FOSSIL_MIXOSAURUS    = new BlockFossilMixosaurus();
    public static final Block FOSSIL_CRIOCEPHALOSAURUS    = new BlockFossilCriocephalosaurus();
    public static final Block FOSSIL_CTENOSPONDYLUS    = new BlockFossilCtenospondylus();
    public static final Block FOSSIL_ELGINIA    = new BlockFossilElginia();
    public static final Block FOSSIL_EUNOTOSAURUS    = new BlockFossilEunotosaurus();
    public static final Block FOSSIL_ROBERTIA    = new BlockFossilRobertia();
    public static final Block FOSSIL_LABIDOSAURUS    = new BlockFossilLabidosaurus();
    public static final Block FOSSIL_VIVAXOSAURUS    = new BlockFossilVivaxosaurus();
    public static final Block FOSSIL_URANOCENTRODON    = new BlockFossilUranocentrodon();
    public static final Block FOSSIL_TORVOSAURUS    = new BlockFossilTorvosaurus();
    public static final Block FOSSIL_YANGCHUANOSAURUS    = new BlockFossilYangchuanosaurus();
    public static final Block FOSSIL_PHRAGMOCERAS    = new BlockFossilPhragmoceras();
    public static final Block FOSSIL_PLATYLOMASPIS    = new BlockFossilPlatylomaspis();
    public static final Block FOSSIL_DILOPHOSAURUS    = new BlockFossilDilophosaurus();
    public static final Block FOSSIL_MYMOORAPELTA    = new BlockFossilMymoorapelta();
    public static final Block FOSSIL_SINRAPTOR    = new BlockFossilSinraptor();
    public static final Block FOSSIL_ALLOSAURUS    = new BlockFossilAllosaurus();
    public static final Block FOSSIL_LIMUSAURUS    = new BlockFossilLimusaurus();
    public static final Block FOSSIL_APATOSAURUS    = new BlockFossilApatosaurus();
    public static final Block FOSSIL_DASYCEPS    = new BlockFossilDasyceps();
    public static final Block FOSSIL_PRISTEROGNATHUS    = new BlockFossilPristerognathus();
    public static final Block FOSSIL_BOTHRIOLEPIS    = new BlockFossilBothriolepis();
    public static final Block FOSSIL_BUNDENBACHIELLUS    = new BlockFossilBundenbachiellus();
    public static final Block FOSSIL_ATTERCOPUS    = new BlockFossilAttercopus();
    public static final Block FOSSIL_JAEKELOPTERUS    = new BlockFossilJaekelopterus();
    public static final Block FOSSIL_BROCHOADMONES    = new BlockFossilBrochoadmones();
    public static final Block FOSSIL_RHINOPTERASPIS    = new BlockFossilRhinopteraspis();
    public static final Block FOSSIL_HIBBERTOPTERUS    = new BlockFossilHibbertopterus();
    public static final Block FOSSIL_PARMASTEGA    = new BlockFossilParmastega();
    public static final Block FOSSIL_PROCERATOSAURUS    = new BlockFossilProceratosaurus();
    public static final Block FOSSIL_ELAPHROSAURUS    = new BlockFossilElaphrosaurus();
    public static final Block FOSSIL_ANUROGNATHUS    = new BlockFossilAnurognathus();
    public static final Block FOSSIL_RHAMPHORHYNCHUS    = new BlockFossilRhamphorhynchus();
    public static final Block FOSSIL_YUXISAURUS    = new BlockFossilYuxisaurus();
    public static final Block FOSSIL_GUANLONG    = new BlockFossilGuanlong();
    public static final Block FOSSIL_CHILESAURUS    = new BlockFossilChilesaurus();
    public static final Block FOSSIL_CAMARASAURUS    = new BlockFossilCamarasaurus();
    public static final Block FOSSIL_ADEOPAPPOSAURUS    = new BlockFossilAdeopapposaurus();
    public static final Block FOSSIL_MIRAGAIA    = new BlockFossilMiragaia();
    public static final Block FOSSIL_CIURCOPTERUS    = new BlockFossilCiurcopterus();
    public static final Block FOSSIL_SLIMONIA    = new BlockFossilSlimonia();
    public static final Block FOSSIL_DUNYU    = new BlockFossilDunyu();
    public static final Block FOSSIL_PLATYCARASPIS    = new BlockFossilPlatycaraspis();
    public static final Block FOSSIL_PTERODACTYLUS    = new BlockFossilPterodactylus();
    public static final Block FOSSIL_COMPSOGNATHUS    = new BlockFossilCompsognathus();
    public static final Block FOSSIL_THELODUS    = new BlockFossilThelodus();
    public static final Block FOSSIL_GUIYU    = new BlockFossilGuiyu();
    public static final Block FOSSIL_TITANICHTHYS    = new BlockFossilTitanichthys();
    public static final Block FOSSIL_CAMPTOSAURUS    = new BlockFossilCamptosaurus();
    public static final Block FOSSIL_ACANTHOSTEGA    = new BlockFossilAcanthostega();
    public static final Block FOSSIL_SHUNOSAURUS    = new BlockFossilShunosaurus();
    public static final Block FOSSIL_WARNETICARIS    = new BlockFossilWarneticaris();
    public static final Block FOSSIL_PHANTASPIS    = new BlockFossilPhantaspis();
    public static final Block FOSSIL_PROTEROGYRINUS    = new BlockFossilProterogyrinus();
    public static final Block FOSSIL_HETERODONTOSAURUS    = new BlockFossilHeterodontosaurus();
    public static final Block FOSSIL_DIPLODOCUS    = new BlockFossilDiplodocus();
    public static final Block FOSSIL_BRACHIOSAURUS    = new BlockFossilBrachiosaurus();
    public static final Block FOSSIL_ORNITHOLESTES    = new BlockFossilOrnitholestes();
    public static final Block FOSSIL_MAMENCHISAURUS    = new BlockFossilMamenchisaurus();
    public static final Block FOSSIL_YI    = new BlockFossilYi();
    public static final Block FOSSIL_DIMORPHODON    = new BlockFossilDimorphodon();
    public static final Block FOSSIL_ARCHAEOPTERYX    = new BlockFossilArchaeopteryx();
    public static final Block FOSSIL_NEUROPTERA    = new BlockFossilNeuroptera();
    public static final Block FOSSIL_KLEPTOTHULE    = new BlockFossilKleptothule();
    public static final Block FOSSIL_PSYCHOPYGE    = new BlockFossilPsychopyge();
    public static final Block FOSSIL_ANGUSTIDONTUS    = new BlockFossilAngustidontus();
    public static final Block FOSSIL_TYRANNOPHONTES    = new BlockFossilTyrannophontes();
    public static final Block FOSSIL_STANOCEPHALOSAURUS    = new BlockFossilStanocephalosaurus();
    public static final Block FOSSIL_CACOPS    = new BlockFossilCacops();
    public static final Block FOSSIL_DICKINSONIA    = new BlockFossilDickinsonia();
    public static final Block FOSSIL_OSTEOLEPIS    = new BlockFossilOsteolepis();
    public static final Block FOSSIL_DICRANURUS    = new BlockFossilDicranurus();
    public static final Block FOSSIL_HELIOPELTIS    = new BlockFossilHeliopeltis();
    public static final Block FOSSIL_FURCACAUDA    = new BlockFossilFurcacauda();
    public static final Block FOSSIL_DIPLACANTHUS    = new BlockFossilDiplacanthus();
    public static final Block FOSSIL_SPRIGGINA    = new BlockFossilSpriggina();
    public static final Block FOSSIL_PAREXUS    = new BlockFossilParexus();
    public static final Block FOSSIL_SCAUMENACIA    = new BlockFossilScaumenacia();
    public static final Block FOSSIL_DREPANASPIS    = new BlockFossilDrepanaspis();
    public static final Block FOSSIL_ZENASPIS    = new BlockFossilZenaspis();
    public static final Block FOSSIL_SCLERODUS    = new BlockFossilSclerodus();
    public static final Block FOSSIL_OPHTHALMOTHULE    = new BlockFossilOphthalmothule();
    public static final Block FOSSIL_PLESIOSAURUS    = new BlockFossilPlesiosaurus();
    public static final Block FOSSIL_CHARNIA    = new BlockFossilCharnia();
    public static final Block FOSSIL_LONGISQUAMA    = new BlockFossilLongisquama();
    public static final Block FOSSIL_ISOXYS    = new BlockFossilIsoxys();
    public static final Block FOSSIL_WAPTIA    = new BlockFossilWaptia();
    public static final Block FOSSIL_ROTACIURCA    = new BlockFossilRotaciurca();
    public static final Block FOSSIL_CYCLOMEDUSA    = new BlockFossilCyclomedusa();
    public static final Block FOSSIL_MECOCHIRUS    = new BlockFossilMecochirus();
    public static final Block FOSSIL_ERYMA    = new BlockFossilEryma();
    public static final Block FOSSIL_CAPINATATOR    = new BlockFossilCapinatator();
    public static final Block FOSSIL_HADRANAX    = new BlockFossilHadranax();
    public static final Block FOSSIL_LUFENGOSAURUS    = new BlockFossilLufengosaurus();
    public static final Block FOSSIL_MONOLOPHOSAURUS    = new BlockFossilMonolophosaurus();
    public static final Block FOSSIL_PHYLLOCERAS    = new BlockFossilPhylloceras();
    public static final Block FOSSIL_TITANITES    = new BlockFossilTitanites();
    public static final Block FOSSIL_BETHESDAICHTHYS    = new BlockFossilBethesdaichthys();
    public static final Block FOSSIL_BRAZILICHTHYS    = new BlockFossilBrazilichthys();
    public static final Block FOSSIL_MAMULICHTHYS    = new BlockFossilMamulichthys();
    public static final Block FOSSIL_SENEKICHTHYS    = new BlockFossilSenekichthys();
    public static final Block FOSSIL_GOSFORDIA    = new BlockFossilGosfordia();
    public static final Block FOSSIL_HARPAGOFUTUTOR    = new BlockFossilHarpagofututor();
    public static final Block FOSSIL_ICHTHYOSAURUS    = new BlockFossilIchthyosaurus();
    public static final Block FOSSIL_THALATTOSUCHUS    = new BlockFossilThalattosuchus();
    public static final Block FOSSIL_HYDROPESSUM    = new BlockFossilHydropessum();
    public static final Block FOSSIL_DIPTERONOTUS    = new BlockFossilDipteronotus();
    public static final Block FOSSIL_FLAGELLOPANTOPUS    = new BlockFossilFlagellopantopus();
    public static final Block FOSSIL_PRAEARCTURUS    = new BlockFossilPraearcturus();
    public static final Block FOSSIL_DEUTEROSAURUS    = new BlockFossilDeuterosaurus();
    public static final Block FOSSIL_PLIOSAURUS    = new BlockFossilPliosaurus();
    public static final Block FOSSIL_MOBULAVERMIS    = new BlockFossilMobulavermis();
    public static final Block FOSSIL_CAIHONG    = new BlockFossilCaihong();
    public static final Block FOSSIL_KAYKAY    = new BlockFossilKaykay();
    public static final Block FOSSIL_LEEDSICHTHYS    = new BlockFossilLeedsichthys();
    public static final Block FOSSIL_STENSIOELLA    = new BlockFossilStensioella();
    public static final Block FOSSIL_GROENLANDASPIS    = new BlockFossilGroenlandaspis();
    public static final Block FOSSIL_GANTAROSTRATASPIS    = new BlockFossilGantarostrataspis();
    public static final Block FOSSIL_DORYASPIS    = new BlockFossilDoryaspis();
    public static final Block FOSSIL_HELIANTHASTER    = new BlockFossilHelianthaster();
    public static final Block FOSSIL_MIMETASTER    = new BlockFossilMimetaster();
    public static final Block FOSSIL_ECHINOCHIMAERA    = new BlockFossilEchinochimaera();
    public static final Block FOSSIL_SQUATINACTIS    = new BlockFossilSquatinactis();
    public static final Block FOSSIL_ERETMORHIPIS    = new BlockFossilEretmorhipis();
    public static final Block FOSSIL_CARTORHYNCHUS    = new BlockFossilCartorhynchus();
    public static final Block FOSSIL_STAHLECKERIA    = new BlockFossilStahleckeria();
    public static final Block FOSSIL_ENDOTHIODON    = new BlockFossilEndothiodon();
    public static final Block FOSSIL_ACANTHOSTOMATOPS    = new BlockFossilAcanthostomatops();
    public static final Block FOSSIL_MELOSAURUS    = new BlockFossilMelosaurus();
    public static final Block FOSSIL_ALLENYPTERUS    = new BlockFossilAllenypterus();
    public static final Block FOSSIL_HADRONECTOR    = new BlockFossilHadronector();
    public static final Block FOSSIL_PALAEONISCUM    = new BlockFossilPalaeoniscum();
    public static final Block FOSSIL_PARANAICHTHYS    = new BlockFossilParanaichthys();
    public static final Block FOSSIL_COOPEROCERAS    = new BlockFossilCooperoceras();
    public static final Block FOSSIL_VESTINAUTILUS    = new BlockFossilVestinautilus();
    public static final Block FOSSIL_DIPLOCERASPIS    = new BlockFossilDiploceraspis();
    public static final Block FOSSIL_STOKESOSAURUS    = new BlockFossilStokesosaurus();
    public static final Block FOSSIL_DIPLOCAULUSMINIMUS    = new BlockFossilDiplocaulusminimus();
    public static final Block FOSSIL_SECODONTOSAURUS    = new BlockFossilSecodontosaurus();
    public static final Block FOSSIL_EOABELISAURUS    = new BlockFossilEoabelisaurus();
    public static final Block FOSSIL_PATAGOSAURUS    = new BlockFossilPatagosaurus();
    public static final Block FOSSIL_ASFALTOVENATOR    = new BlockFossilAsfaltovenator();
    public static final Block FOSSIL_LESOTHOSAURUS    = new BlockFossilLesothosaurus();
    public static final Block FOSSIL_BRACHYTRACHELOPAN    = new BlockFossilBrachytrachelopan();
    public static final Block FOSSIL_MANIDENS    = new BlockFossilManidens();
    public static final Block FOSSIL_CHUNGKINGOSAURUS    = new BlockFossilChungkingosaurus();
    public static final Block FOSSIL_TAPEJARA    = new BlockFossilTapejara();
    public static final Block FOSSIL_IRRITATOR    = new BlockFossilIrritator();
    public static final Block FOSSIL_HALISKIA    = new BlockFossilHaliskia();
    public static final Block FOSSIL_LUSKHAN    = new BlockFossilLuskhan();
    public static final Block FOSSIL_EUROPEJARA    = new BlockFossilEuropejara();
    public static final Block FOSSIL_DEINONYCHUS    = new BlockFossilDeinonychus();
    public static final Block FOSSIL_SPECTROVENATOR    = new BlockFossilSpectrovenator();
    public static final Block FOSSIL_SARCOSUCHUS    = new BlockFossilSarcosuchus();
    public static final Block FOSSIL_ICHTHYOVENATOR    = new BlockFossilIchthyovenator();
    public static final Block FOSSIL_TENONTOSAURUS    = new BlockFossilTenontosaurus();
    public static final Block FOSSIL_MANTELLISAURUS    = new BlockFossilMantellisaurus();
    public static final Block FOSSIL_SUZHOUSAURUS    = new BlockFossilSuzhousaurus();
    public static final Block FOSSIL_KUNBARRASAURUS    = new BlockFossilKunbarrasaurus();
    public static final Block FOSSIL_AMARGASAURUS    = new BlockFossilAmargasaurus();
    public static final Block FOSSIL_SINOSAURUS    = new BlockFossilSinosaurus();
    public static final Block FOSSIL_OURANOSAURUS    = new BlockFossilOuranosaurus();
    public static final Block FOSSIL_PRESTOSUCHUS    = new BlockFossilPrestosuchus();
    public static final Block FOSSIL_KLAMELISAURUS    = new BlockFossilKlamelisaurus();
    public static final Block FOSSIL_TUPANDACTYLUS    = new BlockFossilTupandactylus();
    public static final Block FOSSIL_GAIASIA    = new BlockFossilGaiasia();
    public static final Block FOSSIL_AQUILOPS    = new BlockFossilAquilops();
    public static final Block FOSSIL_MEILIFEILONG    = new BlockFossilMeilifeilong();
    public static final Block FOSSIL_PROTOCERATOPS    = new BlockFossilProtoceratops();
    public static final Block FOSSIL_BOSLATIFRONS    = new BlockFossilBoslatifrons();
    public static final Block FOSSIL_VELOCIRAPTOR    = new BlockFossilVelociraptor();
    public static final Block FOSSIL_EREMOTHERIUM    = new BlockFossilEremotherium();
    public static final Block FOSSIL_EUSTREPTOSPONDYLUS    = new BlockFossilEustreptospondylus();
    public static final Block FOSSIL_KAYENTATHERIUM    = new BlockFossilKayentatherium();
    public static final Block FOSSIL_SYNTHETOCERAS    = new BlockFossilSynthetoceras();
    public static final Block FOSSIL_COMPTONATUS    = new BlockFossilComptonatus();
    public static final Block FOSSIL_JINYUNPELTA    = new BlockFossilJinyunpelta();
    public static final Block FOSSIL_CENTROSAURUS    = new BlockFossilCentrosaurus();
    public static final Block FOSSIL_CHASMOSAURUS    = new BlockFossilChasmosaurus();
    public static final Block FOSSIL_DEARC    = new BlockFossilDearc();
    public static final Block FOSSIL_LAGOSUCHUS    = new BlockFossilLagosuchus();
    public static final Block FOSSIL_STRUTHIOMIMUS    = new BlockFossilStruthiomimus();
    public static final Block FOSSIL_XENACANTHUS    = new BlockFossilXenacanthus();
    public static final Block FOSSIL_GREGORIUS    = new BlockFossilGregorius();
    public static final Block FOSSIL_PSITTACOSAURUSMONGOLIENSIS    = new BlockFossilPsittacosaurusmongoliensis();
    public static final Block FOSSIL_PSITTACOSAURUSSIBIRICUS    = new BlockFossilPsittacosaurussibiricus();
    public static final Block FOSSIL_OLOROTITAN    = new BlockFossilOlorotitan();
    public static final Block FOSSIL_PSITTACOSAURUSLUJIATUNENSIS    = new BlockFossilPsittacosauruslujiatunensis();
    public static final Block FOSSIL_INCISIVOSAURUS    = new BlockFossilIncisivosaurus();
    public static final Block FOSSIL_THYLACOLEO    = new BlockFossilThylacoleo();
    public static final Block FOSSIL_lUSOVENATOR    = new BlockFossilLusovenator();
    public static final Block FOSSIL_CONCAVENATOR    = new BlockFossilConcavenator();
    public static final Block FOSSIL_MINQARIA    = new BlockFossilMinqaria();
    public static final Block FOSSIL_STENOKRANIO    = new BlockFossilStenokranio();
    public static final Block FOSSIL_DIADEMODON    = new BlockFossilDiademodon();
    public static final Block FOSSIL_BARYONYX    = new BlockFossilBaryonyx();
    public static final Block FOSSIL_RIOJASUCHUS    = new BlockFossilRiojasuchus();
    public static final Block FOSSIL_SPICLYPEUS    = new BlockFossilSpiclypeus();
    public static final Block FOSSIL_BERTHASAURA    = new BlockFossilBerthasaura();
    public static final Block FOSSIL_RECHNISAURUS    = new BlockFossilRechnisaurus();
    public static final Block FOSSIL_STAGONOLEPIS    = new BlockFossilStagonolepis();
    public static final Block FOSSIL_AUSTRIADACTYLUS    = new BlockFossilAustriadactylus();
    public static final Block FOSSIL_SIMOLESTES    = new BlockFossilSimolestes();
    public static final Block FOSSIL_CRYPTOCLIDUS    = new BlockFossilCryptoclidus();
    public static final Block FOSSIL_DREPANOSAURUS    = new BlockFossilDrepanosaurus();
    public static final Block FOSSIL_HYPSILOPHODON    = new BlockFossilHypsilophodon();
    public static final Block FOSSIL_LEAELLYNASAURA    = new BlockFossilLeaellynasaura();
    public static final Block FOSSIL_MUTTABURRASAURUS    = new BlockFossilMuttaburrasaurus();
    public static final Block FOSSIL_HYPURONECTOR    = new BlockFossilHypuronector();
    public static final Block FOSSIL_PIATNITZKYSAURUS    = new BlockFossilPiatnitzkysaurus();
    public static final Block FOSSIL_NQWEBASAURUS    = new BlockFossilNqwebasaurus();
    public static final Block FOSSIL_IGUANODON    = new BlockFossilIguanodon();
    public static final Block FOSSIL_FALCARIUS    = new BlockFossilFalcarius();
    public static final Block FOSSIL_UTAHRAPTOR    = new BlockFossilUtahraptor();
    public static final Block FOSSIL_CONVOLOSAURUS    = new BlockFossilConvolosaurus();
    public static final Block FOSSIL_LAJASVENATOR    = new BlockFossilLajasvenator();
    public static final Block FOSSIL_EUROPELTA    = new BlockFossilEuropelta();
    public static final Block FOSSIL_ACROCANTHOSAURUS    = new BlockFossilAcrocanthosaurus();
    public static final Block FOSSIL_CALLAWAYIA    = new BlockFossilCallawayia();
    public static final Block FOSSIL_NANNOPTERYGIUS    = new BlockFossilNannopterygius();
    public static final Block FOSSIL_BARBOSANIA    = new BlockFossilBarbosania();
    public static final Block FOSSIL_ANHANGUERA    = new BlockFossilAnhanguera();
    public static final Block FOSSIL_PROBACTROSAURUS    = new BlockFossilProbactrosaurus();
    public static final Block FOSSIL_ALTIRHINUS    = new BlockFossilAltirhinus();
    public static final Block FOSSIL_PELECANIMIMUS    = new BlockFossilPelecanimimus();
    public static final Block FOSSIL_BAJADASAURUS    = new BlockFossilBajadasaurus();
    public static final Block FOSSIL_EOCURSOR    = new BlockFossilEocursor();
    public static final Block FOSSIL_DRACORAPTOR    = new BlockFossilDracoraptor();
    public static final Block FOSSIL_SAUROPELTA    = new BlockFossilSauropelta();
    public static final Block FOSSIL_YUTYRANNUS    = new BlockFossilYutyrannus();
    public static final Block FOSSIL_LEPTOCLEIDUS    = new BlockFossilLeptocleidus();
    public static final Block FOSSIL_ABYSSOSAURUS    = new BlockFossilAbyssosaurus();
    public static final Block FOSSIL_AUSTRALOVENATOR    = new BlockFossilAustralovenator();
    public static final Block FOSSIL_GASTONIA    = new BlockFossilGastonia();
    public static final Block FOSSIL_POLACANTHUS    = new BlockFossilPolacanthus();
    public static final Block FOSSIL_EOCARCHARIA    = new BlockFossilEocarcharia();
    public static final Block FOSSIL_TRIMERUS    = new BlockFossilTrimerus();
    public static final Block FOSSIL_LUNGMENSHANASPIS    = new BlockFossilLungmenshanaspis();
    public static final Block FOSSIL_CTENOCHASMA    = new BlockFossilCtenochasma();
    public static final Block FOSSIL_PTERODAUSTRO    = new BlockFossilPterodaustro();
    public static final Block FOSSIL_ALIENUM    = new BlockFossilAlienum();
    public static final Block FOSSIL_PAMBDELURION    = new BlockFossilPambdelurion();
    public static final Block FOSSIL_QIANOSUCHUS    = new BlockFossilQianosuchus();
    public static final Block FOSSIL_ANTHRACOSAURUS    = new BlockFossilAnthracosaurus();
    public static final Block FOSSIL_KANNEMEYERIA    = new BlockFossilKannemeyeria();
    public static final Block FOSSIL_TYRANNOTITAN    = new BlockFossilTyrannotitan();
    public static final Block FOSSIL_TERATERPETON    = new BlockFossilTeraterpeton();
    public static final Block FOSSIL_TRILOPHOSAURUS    = new BlockFossilTrilophosaurus();
    public static final Block FOSSIL_NIGERPETON    = new BlockFossilNigerpeton();
    public static final Block FOSSIL_GIRAFFATITAN    = new BlockFossilGiraffatitan();
    public static final Block FOSSIL_LITARGOSUCHUS    = new BlockFossilLitargosuchus();
    public static final Block FOSSIL_NICROSAURUS    = new BlockFossilNicrosaurus();
    public static final Block FOSSIL_DAURLONG    = new BlockFossilDaurlong();
    public static final Block FOSSIL_WUERHOSAURUS    = new BlockFossilWuerhosaurus();
    public static final Block FOSSIL_ZHENYUANLONG    = new BlockFossilZhenyuanlong();
    public static final Block FOSSIL_FUKUISAURUS    = new BlockFossilFukuisaurus();
    public static final Block FOSSIL_JINZHOUSAURUS    = new BlockFossilJinzhousaurus();
    public static final Block FOSSIL_EUHELOPUS    = new BlockFossilEuhelopus();
    public static final Block FOSSIL_MEI    = new BlockFossilMei();
    public static final Block FOSSIL_SUCHOMIMUS    = new BlockFossilSuchomimus();
    public static final Block FOSSIL_EDMONTOSAURUS    = new BlockFossilEdmontosaurus();
    public static final Block FOSSIL_TYRANNOSAURUS    = new BlockFossilTyrannosaurus();
    public static final Block FOSSIL_ANATOSUCHUS    = new BlockFossilAnatosuchus();
    public static final Block FOSSIL_NIGERSAURUS    = new BlockFossilNigersaurus();
    public static final Block FOSSIL_CHAOYANGOPTERUS    = new BlockFossilChaoyangopterus();
    public static final Block FOSSIL_SHENZHOUPTERUS    = new BlockFossilShenzhoupterus();
    public static final Block FOSSIL_YUANYANGLONG    = new BlockFossilYuanyanglong();
    public static final Block FOSSIL_PROTOCERAS    = new BlockFossilProtoceras();
    public static final Block FOSSIL_PRENOCEPHALE    = new BlockFossilPrenocephale();
    public static final Block FOSSIL_HATZEGOPTERYX    = new BlockFossilHatzegopteryx();
    public static final Block FOSSIL_PRODINOCERAS    = new BlockFossilProdinoceras();
    public static final Block FOSSIL_DECENNATHERIUM    = new BlockFossilDecennatherium();
    public static final Block FOSSIL_SIMOSTHENURUS    = new BlockFossilSimosthenurus();
    public static final Block FOSSIL_PYROTHERIUM    = new BlockFossilPyrotherium();
    public static final Block FOSSIL_DINOCROCUTA    = new BlockFossilDinocrocuta();
    public static final Block FOSSIL_DORUDON    = new BlockFossilDorudon();
    public static final Block FOSSIL_TORUKJARA    = new BlockFossilTorukjara();
    public static final Block FOSSIL_CAIUAJARA    = new BlockFossilCaiuajara();
    public static final Block FOSSIL_OXYDACTYLUS    = new BlockFossilOxydactylus();
    public static final Block FOSSIL_DAMADAMA    = new BlockFossilDamadama();
    public static final Block FOSSIL_HIPPIDION    = new BlockFossilHippidion();
    public static final Block FOSSIL_RANGIFER    = new BlockFossilRangifer();
    public static final Block FOSSIL_TUPANDACTYLUSNAVIGANS    = new BlockFossilTupandactylusnavigans();
    public static final Block FOSSIL_SINOPTERUS    = new BlockFossilSinopterus();
    public static final Block FOSSIL_KUTCHICETUS    = new BlockFossilKutchicetus();
    public static final Block FOSSIL_KUBANOCHOERUS    = new BlockFossilKubanochoerus();
    public static final Block FOSSIL_TREMAGLASPIS    = new BlockFossilTremaglaspis();
    public static final Block FOSSIL_PRISCOMYZON    = new BlockFossilPriscomyzon();
    public static final Block FOSSIL_ASIATYRANNUS    = new BlockFossilAsiatyrannus();
    public static final Block FOSSIL_SINOCERATOPS    = new BlockFossilSinoceratops();
    public static final Block FOSSIL_CAMANCHIA    = new BlockFossilCamanchia();
    public static final Block FOSSIL_SEMIONOTUS    = new BlockFossilSemionotus();
    public static final Block FOSSIL_BANNYKUS    = new BlockFossilBannykus();
    public static final Block FOSSIL_KOOLASUCHUS    = new BlockFossilKoolasuchus();

    public static EnumActionResult onItemUseFossils(ItemBlock blockitem, EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        Block block = iblockstate.getBlock();

        if (!block.isReplaceable(worldIn, pos)) {
            pos = pos.offset(facing);
        }

        ItemStack itemstack = player.getHeldItem(hand);

        if (!itemstack.isEmpty() && player.canPlayerEdit(pos, facing, itemstack) && worldIn.mayPlace(blockitem.getBlock(), pos, false, facing, player)) {
            int i = blockitem.getMetadata(itemstack.getMetadata());
            IBlockState iblockstate1 = blockitem.getBlock().getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, i, player, hand);

            if (blockitem.placeBlockAt(itemstack, player, worldIn, pos, facing, hitX, hitY, hitZ, iblockstate1)) {
                iblockstate1 = worldIn.getBlockState(pos);
                SoundType soundtype = iblockstate1.getBlock().getSoundType(iblockstate1, worldIn, pos, player);
                worldIn.playSound(player, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
                TileEntity te = worldIn.getTileEntity(pos);
                if (te != null) {
                    if (te instanceof TileEntityFossilBase) {
                        if (itemstack.hasTagCompound()) {
                            if (itemstack.getTagCompound().hasKey("period")) {
                                switch (itemstack.getTagCompound().getInteger("period")) {
                                    case 0: default:
                                        break;

                                    case 1:
                                        ((TileEntityFossilBase)te).dim01 = 1;
                                        break;

                                    case 2:
                                        ((TileEntityFossilBase)te).dim02 = 1;
                                        break;

                                    case 3:
                                        ((TileEntityFossilBase)te).dim03 = 1;
                                        break;

                                    case 4:
                                        ((TileEntityFossilBase)te).dim04 = 1;
                                        break;

                                    case 5:
                                        ((TileEntityFossilBase)te).dim05 = 1;
                                        break;

                                    case 6:
                                        ((TileEntityFossilBase)te).dim06 = 1;
                                        break;

                                    case 7:
                                        ((TileEntityFossilBase)te).dim07 = 1;
                                        break;

                                    case 8:
                                        ((TileEntityFossilBase)te).dim08 = 1;
                                        break;

                                    case 9:
                                        ((TileEntityFossilBase)te).dim09 = 1;
                                        break;

                                    case 10:
                                        ((TileEntityFossilBase)te).dim10 = 1;
                                        break;

                                    case 11:
                                        ((TileEntityFossilBase)te).dim11 = 1;
                                        break;

                                    case 12:
                                        ((TileEntityFossilBase)te).dim12 = 1;
                                        break;

                                    case 13:
                                        ((TileEntityFossilBase)te).dim13 = 1;
                                        break;
                                }
                            }
                        }
                    }
                }
                itemstack.shrink(1);
            }

            return EnumActionResult.SUCCESS;
        } else {
            return EnumActionResult.FAIL;
        }
    }
}
