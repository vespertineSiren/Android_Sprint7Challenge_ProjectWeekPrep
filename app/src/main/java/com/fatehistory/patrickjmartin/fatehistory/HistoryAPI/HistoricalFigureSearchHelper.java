package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HistoricalFigureSearchHelper {

    private static volatile HistoricalFigureSearchHelper INSTANCE;
    public Map<String, String[]> PEOPLE_MAP;
    public String[] key;
    public List<String> keys;


    private HistoricalFigureSearchHelper() {
        if(INSTANCE != null) {
            throw new RuntimeException("Use getINSTANCE()");
        } else {
            keys = new ArrayList<String>();
            Set<String> keysTemp;

            Map<String, String[]> result = new HashMap<String, String[]>();
            result.put("alexander the great", new String[] {"Alexander_the_Great", "2291", "RiderIskandarStage3"});
            result.put("amakusa shiro", new String[] {"Amakusa_Shirō", "8234", "RulerAmakusaShirouStage3"});
            result.put("anne bonny", new String[] {"Anne_Bonny", "17056",  "RiderBonReadGOStage3"});
            result.put("arash", new String[] {"Arash", "10864", "ArcherArashGOStage3"});
            result.put("arjuna", new String[] {"Arjuna", "15299", "ArcherArjunaGOStage3"});
            result.put("astolfo", new String[] {"Astolfo", "4598", "RiderAstolfoStage3"});
            result.put("atlanta", new String[] {"Atalanta", "8269", "ArcherAtalantaStage3"});
            result.put("attila", new String[] {"Attila the Hun", "14836", "SaberAlteraStage3"});
            result.put("bedivere", new String[] {"Bedivere", "19423", "SaberBedivereStage3.jpg"});
            result.put("benkei", new String[] {"Benkei", "1123", "LancerBenkeiStage3"});
            result.put("beowulf", new String[] {"Beowulf_(hero)", "18104", "BerserkerBeowulfStage3"});
            result.put("billy the kid", new String[] {"Billy_the_Kid", "17069", "ArcherBillyStage3"});
            result.put("blackbeard", new String[] {"Blackbeard", "15859", "Edward_Teach"});
            result.put("boudica", new String[] {"Boudica", "15876", "RiderBoudicaStage3"});
            result.put("brynhildr", new String[] {"Brynhildr", "10300", "LancerBrynhildStage3"});
            result.put("caligula", new String[] {"Caligula", "13661", "BerserkerCaligulaStage3"});
            result.put("carmilla", new String[] {"Carmilla", "15816", "AssassinCarmGOStage3"});
            result.put("charles-henri sanson", new String[] {"Charles-Henri_Sanson", "15863", "AssassinSanGOStage3"});
            result.put("charles babbage", new String[] {"Charles_Babbage", "16966", "CasterBabbageStage3"});
            result.put("chevalier d'eon", new String[] {"Chevalier d'Éon", "15865", "SaberEonGOStage3"});
            result.put("cleopatra", new String[] {"Cleopatra", "20055", "AssassinCleopatraStage3"});
            result.put("cu chulainn", new String[] {"Cú_Chulainn", "1847", "LancerCuChulainnStage3"});
            result.put("darius iii", new String[] {"Darius_III", "15213", "BerserkerDariGOState3"});
            result.put("david", new String[] {"David", "4605", "ArcherDavidGOStage3"});
            result.put("diarmuid ua duibhne", new String[] {"Diarmuid_Ua_Duibhne", "18571", "SaberDiarmuidStage3"});
            result.put("dr. henry jekyll", new String[] {"Dr._Jekyll_and_Mr._Hyde_(character)", "15908", "FGOAssassinJekyllStage3"});
            result.put("edmond dantes", new String[] {"Edmond_Dantès", "18403", "AvengerEdmondDantesStage3"});
            result.put("elizabeth bathory", new String[] {"Elizabeth_Báthory", "7905", "LancerElizabethBathoryStage3"});
            result.put("enkidu", new String[] {"Enkidu", "5593", "LancerEnkiduStage3"});
            result.put("eric bloodaxe", new String[] {"Eric_Bloodaxe", "15850", "BerserkerEricGOState3"});
            result.put("the phantom of the opera", new String[] {"Erik_(The_Phantom_of_the_Opera)", "15861", "GOPhantomstage3"});
            result.put("euryale", new String[] {"Euryale_(Gorgon)", "3912", "ArcherEuryaleStage3"});
            result.put("fergus mac roich", new String[] {"Fergus_mac_Róich", "17538", "FGOSaberFergusStage3"});
            result.put("fionn mac cumhaill", new String[] {"Fionn_mac_Cumhaill", "11668", "LancerFionnStage3"});
            result.put("florence nightingale", new String[] {"Florence_Nightingale", "16724", "BerserkerNightingaleStage3"});
            result.put("francis drake", new String[] {"Francis_Drake", "3299", "RiderFrancisDrakeStage3"});
            result.put("frankenstein", new String[] {"Frankenstein's_monster", "8126", "FGOBerserkerFrankenStage3"});
            result.put("fujiwara no hidesato", new String[] {"Fujiwara_no_Hidesato", "19330", "ArcherTawaraTodaStage3"});
            result.put("fuma kotaro", new String[] {"Fūma_Kotarō", "19250", "AssassinFumaStage3"});
            result.put("gauis julius cesar", new String[] {"Gaius Julius Caesar", "15822", "SaberCaesarStage3"});
            result.put("gawain", new String[] {"Gawain", "3706", "SaberGawainStage3"});
            result.put("geronimo", new String[] {"Geronimo", "18584", "CasterGeronimoStage3"});
            result.put("gilgamesh", new String[] {"Gilgamesh", "1852", "ArcherGilgameshStage3"});
            result.put("gilles de rais", new String[] {"Gilles de Rais", "15907", "SaberGillesGOStage3"});
            result.put("hans christian andersen", new String[] {"Hans_Christian_Andersen", "8795", "CasterHansChristianAndersenStage3"});
            result.put("hassan-i sabbah", new String[] {"Hassan-i_Sabbah", "1857", "AssassinHassanCAStage3"});
            result.put("hector", new String[] {"Hector", "16969", "LancerHectGOStage3"});
            result.put("helena blavatsky", new String[] {"Helena_Blavatsky", "18582", "CasterHelenaStage3"});
            result.put("heracles", new String[] {"Heracles", "1846", "BerserkerHercGOState3"});
            result.put("ibaraki-douji", new String[] {"Ibaraki-dōji", "18898", "BerserkerIbarakiStage3"});
            result.put("ishtar", new String[] {"Ishtar", "17956", "ArcherIshtarStage3"});
            result.put("jack the ripper", new String[] {"Jack_the_Ripper", "4607", "FGOAssassinJackStage3"});
            result.put("jing ke", new String[] {"Jing_Ke", "15820", "AssassinJingGOState3"});
            result.put("joan of arc", new String[] {"Joan_of_Arc", "4562", "RulerJeanneStage3"});
            result.put("karna", new String[] {"Karna", "8270", "LancerKarnaGOStage3"});
            result.put("king arthur", new String[] {"King_Arthur", "2087", "SaberArtoriaPendragonStage3"});
            result.put("kintarou", new String[] {"Kintarō", "4609", "BerserkerSakaGOState3"});
            result.put("kiyohime", new String[] {"Kiyohime", "15860", "BerserkerKiyohimeStage3"});
            result.put("lancelot", new String[] {"Lancelot", "2340", "BerserkerLancelotStage3"});
            result.put("leonardo da vinci", new String[] {"Leonardo_da_Vinci", "16557", "CasterDaVinciStage3"});
            result.put("leonidas", new String[] {"Leonidas_I", "15854", "LancerLeonidasStage3"});
            result.put("li shuwen", new String[] {"Li_Shuwen", "18647", "LancerShuwenStage3"});
            result.put("lu bu fengxian", new String[] {"Lü_Bu", "5382", "BerserkerLuBuStage3"});
            result.put("marie antoinette", new String[] {"Marie_Antoinette", "15855", "RiderMarieAntoinetteStage3"});
            result.put("martha", new String[] {"Martha", "15874", "RiderMarthaStage3"});
            result.put("mata hari", new String[] {"Mata_Hari", "15842", "AssassinMataGOState3"});
            result.put("medb", new String[] {"Medb", "17537", "RiderMedbStage3"});
            result.put("medea", new String[] {"Medea", "1855", "CasterMedeaGOStage3"});
            result.put("medusa", new String[] {"Medusa", "1853", "RiderMedusaGOStage3"});
            result.put("mephistopholes", new String[] {"Mephistopheles", "15086", "CasterMephGOStage3"});
            result.put("merlin", new String[] {"Merlin", "4718", "CasterMerlinStage3"});
            result.put("minamoto no raikou", new String[] {"Minamoto_no_Yorimitsu", "19247", "YorimitsuStage3"});
            result.put("minaomoto no yoshitsune", new String[] {"Minamoto_no_Yoshitsune", "14928", "RiderUshiwakamaruStage3"});
            result.put("minotaur", new String[] {"Minotaur", "15870", "BerserkerAsteriosStage3"});
            result.put("miyamoto musashi", new String[] {"Miyamoto_Musashi", "20476", "SaberMusashiStage3"});
            result.put("mordred", new String[] {"Mordred", "5921", "SaberMordredStage3"});
            result.put("nero", new String[] {"Nero", "3693", "SaberNeroStage3"});
            result.put("nikola tesla", new String[] {"Nikola_Tesla", "17064", "FGOArcherTeslaStage3"});
            result.put("nitocris", new String[] {"Nitocris", "19327", "CasterNitocrisStage3"});
            result.put("oda nobunaga", new String[] {"Oda_Nobunaga", "10572", "FateGOArcherNobunaga"});
            result.put("okita souji", new String[] {"Okita_Sōji", "10012", "SaberOkitaSoujiStage3"});
            result.put("orion", new String[] {"Orion_(mythology)", "16985", "ArcherOrionArtemisStage3"});
            result.put("paracelsus", new String[] {"Paracelsus", "10859", "CasterParacelsusStage3"});
            result.put("quetzlcoatl", new String[] {"Quetzalcoatl", "20293", "RiderQuetzalcoatlStage3"});
            result.put("rama", new String[] {"Rama", "18583", "SaberRamaStage3"});
            result.put("ramesses ii", new String[] {"Ramesses_II", "10860", "RiderRamessesStage3"});
            result.put("robin hood", new String[] {"Robin_Hood", "3710", "ArcherRobinHoodStage3"});
            result.put("romulus", new String[] {"Romulus", "15858", "LancerRomulusStage3"});
            result.put("saint george", new String[] {"Saint_George", "4600", "RiderGeorgios_Stage3"});
            result.put("sasaki kojirou", new String[] {"Sasaki_Kojirō", "1856", "AssassinSasakiKojirouStage3"});
            result.put("scathach", new String[] {"Scáthach", "15147", "FGOLancerScathStage3"});
            result.put("shuten-douji", new String[] {"Shuten-dōji", "19030", "ShutenArt03"});
            result.put("siegfried", new String[] {"Sigurd", "4611", "SaberSiegGOStage3"});
            result.put("spartacus", new String[] {"Spartacus", "4613", "BerserkerSpartGOState3"});
            result.put("stheno", new String[] {"Stheno", "3913", "AssassinSthenoStage3"});
            result.put("tamamo no mae", new String[] {"Tamamo-no-Mae", "3300", "CasterTamaGOStage3"});
            result.put("thomas edison", new String[] {"Thomas_Edison", "18522", "CasterEdisonStage3"});
            result.put("tristan", new String[] {"Tristan", "17839", "ArcherTristanStage3"});
            result.put("vlad the impaler", new String[] {"Vlad_the_Impaler", "15899", "BerserkerVladGOStage3"});
            result.put("william shakespeare", new String[] {"William_Shakespeare", "8233", "CasterShakeGOStage3"});
            result.put("wolfgang amadeus mozart", new String[] {"Wolfgang_Amadeus_Mozart", "15839", "CasterMozGOStage3"});
            result.put("xuanzang", new String[] {"Xuanzang", "19113", "CasterXuanStage3"});
            result.put("zhuge liang", new String[] {"Zhuge_Liang", "15871", "CasterZLStage3"});

            keysTemp = result.keySet();
            keys.addAll(keysTemp);
            key = keysTemp.toArray(new String[keysTemp.size()]);

            PEOPLE_MAP = Collections.unmodifiableMap(result);
        }
    }

    public static HistoricalFigureSearchHelper getINSTANCE(){
        if(INSTANCE == null) {
            synchronized (HistoricalFigureSearchHelper.class) {
                if(INSTANCE == null) {
                    INSTANCE = new HistoricalFigureSearchHelper();
                }
            }
        }
        return INSTANCE;
    }

    /*
    private static Map<String, String[]> createMap() {

        Set<String> keysTemp;

        Map<String, String[]> result = new HashMap<String, String[]>();
        result.put("alexander the great", new String[] {"Alexander_the_Great", "2291", "RiderIskandarStage3"});
        result.put("amakusa shiro", new String[] {"Amakusa_Shirō", "8234", "RulerAmakusaShirouStage3"});
        result.put("anne bonny", new String[] {"Anne_Bonny", "17056",  "RiderBonReadGOStage3"});
        result.put("arash", new String[] {"Arash", "10864", "ArcherArashGOStage3"});
        result.put("arjuna", new String[] {"Arjuna", "15299", "ArcherArjunaGOStage3"});
        result.put("astolfo", new String[] {"Astolfo", "4598", "RiderAstolfoStage3"});
        result.put("atlanta", new String[] {"Atalanta", "8269", "ArcherAtalantaStage3"});
        result.put("attila", new String[] {"Attila the Hun", "14836", "SaberAlteraStage3"});
        result.put("bedivere", new String[] {"Bedivere", "19423", "SaberBedivereStage3.jpg"});
        result.put("benkei", new String[] {"Benkei", "1123", "LancerBenkeiStage3"});
        result.put("beowulf", new String[] {"Beowulf_(hero)", "18104", "BerserkerBeowulfStage3"});
        result.put("billy the kid", new String[] {"Billy_the_Kid", "17069", "ArcherBillyStage3"});
        result.put("blackbeard", new String[] {"Blackbeard", "15859", "Edward_Teach"});
        result.put("boudica", new String[] {"Boudica", "15876", "RiderBoudicaStage3"});
        result.put("brynhildr", new String[] {"Brynhildr", "10300", "LancerBrynhildStage3"});
        result.put("caligula", new String[] {"Caligula", "13661", "BerserkerCaligulaStage3"});
        result.put("carmilla", new String[] {"Carmilla", "15816", "AssassinCarmGOStage3"});
        result.put("charles-henri sanson", new String[] {"Charles-Henri_Sanson", "15863", "AssassinSanGOStage3"});
        result.put("charles babbage", new String[] {"Charles_Babbage", "16966", "CasterBabbageStage3"});
        result.put("chevalier d'eon", new String[] {"Chevalier d'Éon", "15865", "SaberEonGOStage3"});
        result.put("cleopatra", new String[] {"Cleopatra", "20055", "AssassinCleopatraStage3"});
        result.put("cu chulainn", new String[] {"Cú_Chulainn", "1847", "LancerCuChulainnStage3"});
        result.put("darius iii", new String[] {"Darius_III", "15213", "BerserkerDariGOState3"});
        result.put("david", new String[] {"David", "4605", "ArcherDavidGOStage3"});
        result.put("diarmuid ua duibhne", new String[] {"Diarmuid_Ua_Duibhne", "18571", "SaberDiarmuidStage3"});
        result.put("dr. henry jekyll", new String[] {"Dr._Jekyll_and_Mr._Hyde_(character)", "15908", "FGOAssassinJekyllStage3"});
        result.put("edmond dantes", new String[] {"Edmond_Dantès", "18403", "AvengerEdmondDantesStage3"});
        result.put("elizabeth bathory", new String[] {"Elizabeth_Báthory", "7905", "LancerElizabethBathoryStage3"});
        result.put("enkidu", new String[] {"Enkidu", "5593", "LancerEnkiduStage3"});
        result.put("eric bloodaxe", new String[] {"Eric_Bloodaxe", "15850", "BerserkerEricGOState3"});
        result.put("the phantom of the opera", new String[] {"Erik_(The_Phantom_of_the_Opera)", "15861", "GOPhantomstage3"});
        result.put("euryale", new String[] {"Euryale_(Gorgon)", "3912", "ArcherEuryaleStage3"});
        result.put("fergus mac roich", new String[] {"Fergus_mac_Róich", "17538", "FGOSaberFergusStage3"});
        result.put("fionn mac cumhaill", new String[] {"Fionn_mac_Cumhaill", "11668", "LancerFionnStage3"});
        result.put("florence nightingale", new String[] {"Florence_Nightingale", "16724", "BerserkerNightingaleStage3"});
        result.put("francis drake", new String[] {"Francis_Drake", "3299", "RiderFrancisDrakeStage3"});
        result.put("frankenstein", new String[] {"Frankenstein's_monster", "8126", "FGOBerserkerFrankenStage3"});
        result.put("fujiwara no hidesato", new String[] {"Fujiwara_no_Hidesato", "19330", "ArcherTawaraTodaStage3"});
        result.put("fuma kotaro", new String[] {"Fūma_Kotarō", "19250", "AssassinFumaStage3"});
        result.put("gauis julius cesar", new String[] {"Gaius Julius Caesar", "15822", "SaberCaesarStage3"});
        result.put("gawain", new String[] {"Gawain", "3706", "SaberGawainStage3"});
        result.put("geronimo", new String[] {"Geronimo", "18584", "CasterGeronimoStage3"});
        result.put("gilgamesh", new String[] {"Gilgamesh", "1852", "ArcherGilgameshStage3"});
        result.put("gilles de rais", new String[] {"Gilles de Rais", "15907", "SaberGillesGOStage3"});
        result.put("hans christian andersen", new String[] {"Hans_Christian_Andersen", "8795", "CasterHansChristianAndersenStage3"});
        result.put("hassan-i sabbah", new String[] {"Hassan-i_Sabbah", "1857", "AssassinHassanCAStage3"});
        result.put("hector", new String[] {"Hector", "16969", "LancerHectGOStage3"});
        result.put("helena blavatsky", new String[] {"Helena_Blavatsky", "18582", "CasterHelenaStage3"});
        result.put("heracles", new String[] {"Heracles", "1846", "BerserkerHercGOState3"});
        result.put("ibaraki-douji", new String[] {"Ibaraki-dōji", "18898", "BerserkerIbarakiStage3"});
        result.put("ishtar", new String[] {"Ishtar", "17956", "ArcherIshtarStage3"});
        result.put("jack the ripper", new String[] {"Jack_the_Ripper", "4607", "FGOAssassinJackStage3"});
        result.put("jing ke", new String[] {"Jing_Ke", "15820", "AssassinJingGOState3"});
        result.put("joan of arc", new String[] {"Joan_of_Arc", "4562", "RulerJeanneStage3"});
        result.put("karna", new String[] {"Karna", "8270", "LancerKarnaGOStage3"});
        result.put("king arthur", new String[] {"King_Arthur", "2087", "SaberArtoriaPendragonStage3"});
        result.put("kintarou", new String[] {"Kintarō", "4609", "BerserkerSakaGOState3"});
        result.put("kiyohime", new String[] {"Kiyohime", "15860", "BerserkerKiyohimeStage3"});
        result.put("lancelot", new String[] {"Lancelot", "2340", "BerserkerLancelotStage3"});
        result.put("leonardo da vinci", new String[] {"Leonardo_da_Vinci", "16557", "CasterDaVinciStage3"});
        result.put("leonidas", new String[] {"Leonidas_I", "15854", "LancerLeonidasStage3"});
        result.put("li shuwen", new String[] {"Li_Shuwen", "18647", "LancerShuwenStage3"});
        result.put("lu bu fengxian", new String[] {"Lü_Bu", "5382", "BerserkerLuBuStage3"});
        result.put("marie antoinette", new String[] {"Marie_Antoinette", "15855", "RiderMarieAntoinetteStage3"});
        result.put("martha", new String[] {"Martha", "15874", "RiderMarthaStage3"});
        result.put("mata hari", new String[] {"Mata_Hari", "15842", "AssassinMataGOState3"});
        result.put("medb", new String[] {"Medb", "17537", "RiderMedbStage3"});
        result.put("medea", new String[] {"Medea", "1855", "CasterMedeaGOStage3"});
        result.put("medusa", new String[] {"Medusa", "1853", "RiderMedusaGOStage3"});
        result.put("mephistopholes", new String[] {"Mephistopheles", "15086", "CasterMephGOStage3"});
        result.put("merlin", new String[] {"Merlin", "4718", "CasterMerlinStage3"});
        result.put("minaomoto no raikou", new String[] {"Minamoto_no_Yorimitsu", "19247", "YorimitsuStage3"});
        result.put("minaomoto no yoshitsune", new String[] {"Minamoto_no_Yoshitsune", "14928", "RiderUshiwakamaruStage3"});
        result.put("minotaur", new String[] {"Minotaur", "15870", "BerserkerAsteriosStage3"});
        result.put("miyamoto musashi", new String[] {"Miyamoto_Musashi", "20476", "SaberMusashiStage3"});
        result.put("mordred", new String[] {"Mordred", "5921", "SaberMordredStage3"});
        result.put("nero", new String[] {"Nero", "3693", "SaberNeroStage3"});
        result.put("nikola tesla", new String[] {"Nikola_Tesla", "17064", "FGOArcherTeslaStage3"});
        result.put("nitocris", new String[] {"Nitocris", "19327", "CasterNitocrisStage3"});
        result.put("oda nobunaga", new String[] {"Oda_Nobunaga", "10572", "FateGOArcherNobunaga"});
        result.put("okita souji", new String[] {"Okita_Sōji", "10012", "SaberOkitaSoujiStage3"});
        result.put("orion", new String[] {"Orion_(mythology)", "16985", "ArcherOrionArtemisStage3"});
        result.put("paracelsus", new String[] {"Paracelsus", "10859", "CasterParacelsusStage3"});
        result.put("quetzlcoatl", new String[] {"Quetzalcoatl", "20293", "RiderQuetzalcoatlStage3"});
        result.put("rama", new String[] {"Rama", "18583", "SaberRamaStage3"});
        result.put("ramesses ii", new String[] {"Ramesses_II", "10860", "RiderRamessesStage3"});
        result.put("robin hood", new String[] {"Robin_Hood", "3710", "ArcherRobinHoodStage3"});
        result.put("romulus", new String[] {"Romulus", "15858", "LancerRomulusStage3"});
        result.put("saint george", new String[] {"Saint_George", "4600", "RiderGeorgios_Stage3"});
        result.put("sasaki kojirou", new String[] {"Sasaki_Kojirō", "1856", "AssassinSasakiKojirouStage3"});
        result.put("scathach", new String[] {"Scáthach", "15147", "FGOLancerScathStage3"});
        result.put("shuten-douji", new String[] {"Shuten-dōji", "19030", "ShutenArt03"});
        result.put("siegfried", new String[] {"Sigurd", "4611", "SaberSiegGOStage3"});
        result.put("spartacus", new String[] {"Spartacus", "4613", "BerserkerSpartGOState3"});
        result.put("stheno", new String[] {"Stheno", "3913", "AssassinSthenoStage3"});
        result.put("tamamo no mae", new String[] {"Tamamo-no-Mae", "3300", "CasterTamaGOStage3"});
        result.put("thomas edison", new String[] {"Thomas_Edison", "18522", "CasterEdisonStage3"});
        result.put("tristan", new String[] {"Tristan", "17839", "ArcherTristanStage3"});
        result.put("vlad the impaler", new String[] {"Vlad_the_Impaler", "15899", "BerserkerVladGOStage3"});
        result.put("william shakespeare", new String[] {"William_Shakespeare", "8233", "CasterShakeGOStage3"});
        result.put("wolfgang amadeus mozart", new String[] {"Wolfgang_Amadeus_Mozart", "15839", "CasterMozGOStage3"});
        result.put("xuanzang", new String[] {"Xuanzang", "19113", "CasterXuanStage3"});
        result.put("zhuge liang", new String[] {"Zhuge_Liang", "15871", "CasterZLStage3"});

        keysTemp = result.keySet();
        key = keysTemp.toArray(new String[keysTemp.size()]);

        return Collections.unmodifiableMap(result);
    }
    */

}

