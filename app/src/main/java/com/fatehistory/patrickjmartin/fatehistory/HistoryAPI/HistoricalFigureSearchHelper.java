package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HistoricalFigureSearchHelper {

    public static final Map<String, String[]> PEOPLE_MAP = createMap();
    public static String[] key;

    private static Map<String, String[]> createMap() {

        Set<String> keysTemp;

        Map<String, String[]> result = new HashMap<String, String[]>();
        result.put("alexander the great", new String[] {"Alexander_the_Great", "Iskandar"});
        result.put("amakusa shiro", new String[] {"Amakusa_Shirō","Amakusa_Shirō"});
        result.put("anne bonny", new String[] {"Anne_Bonny", "Anne_Bonny_%26_Mary_Read"});
        result.put("arash", new String[] {"Arash", "Arash"});
        result.put("arjuna", new String[] {"Arjuna", "Arjuna"});
        result.put("astolfo", new String[] {"Astolfo", "Astolfo"});
        result.put("atlanta", new String[] {"Atalanta", "Atalante"});
        result.put("attila", new String[] {"Attila the Hun", "Altera"});
        result.put("bedivere", new String[] {"Bedivere"});
        result.put("benkei", new String[] {"Benkei", "Musashibō_Benkei"});
        result.put("beowulf", new String[] {"Beowulf_(hero)", "Beowulf"});
        result.put("billy the kid", new String[] {"Billy_the_Kid"});
        result.put("blackbeard", new String[] {"Blackbeard", "Edward_Teach"});
        result.put("boudica", new String[] {"Boudica"});
        result.put("brynhildr", new String[] {"Brynhildr"});
        result.put("caligula", new String[] {"Caligula"});
        result.put("carmilla", new String[] {"Carmilla"});
        result.put("charles-henri sanson", new String[] {"Charles-Henri_Sanson"});
        result.put("charles babbage", new String[] {"Charles_Babbage"});
        result.put("chevalier d'eon", new String[] {"Chevalier d'Éon", "Chevalier d'Eon"});
        result.put("cleopatra", new String[] {"Cleopatra"});
        result.put("cu chulainn", new String[] {"Cú_Chulainn", "Cú_Chulainn"});
        result.put("darius iii", new String[] {"Darius_III"});
        result.put("david", new String[] {"David"});
        result.put("diarmuid ua duibhne", new String[] {"Diarmuid_Ua_Duibhne"});
        result.put("dr. henry jekyll", new String[] {"Dr._Jekyll_and_Mr._Hyde_(character)", "Henry_Jekyll_%26_Hyde"});
        result.put("edmond dantes", new String[] {"Edmond_Dantès"});
        result.put("elizabeth bathory", new String[] {"Elizabeth_Báthory", "Elizabeth_Báthory"});
        result.put("enkidu", new String[] {"Enkidu"});
        result.put("eric bloodaxe", new String[] {"Eric_Bloodaxe"});
        result.put("the phantom of the opera", new String[] {"Erik_(The_Phantom_of_the_Opera)", "Phantom_of_the_Opera"});
        result.put("euryale", new String[] {"Euryale_(Gorgon)", "Euryale"});
        result.put("fergus mac roich", new String[] {"Fergus_mac_Róich"});
        result.put("fionn mac cumhaill", new String[] {"Fionn_mac_Cumhaill"});
        result.put("florence nightingale", new String[] {"Florence_Nightingale", "Nightingale"});
        result.put("francis drake", new String[] {"Francis_Drake"});
        result.put("frankenstein", new String[] {"Frankenstein's_monster", "Frankenstein"});
        result.put("fujiwara no hidesato", new String[] {"Fujiwara_no_Hidesato", "Tawara_Tōta"});
        result.put("fuma kotaro", new String[] {"Fūma_Kotarō", "Fūma_Kotarō"});
        result.put("gauic julius cesar", new String[] {"Gaius Julius Caesar"});
        result.put("gawain", new String[] {"Gawain"});
        result.put("geronimo", new String[] {"Geronimo"});
        result.put("gilgamesh", new String[] {"Gilgamesh"});
        result.put("gilles de rais", new String[] {"Gilles de Rais", "Gilles de Rais (Saber)"});
        result.put("hans christian andersen", new String[] {"Hans_Christian_Andersen"});
        result.put("hassan-i sabbah", new String[] {"Hassan-i_Sabbah", "Cursed_Arm_Hassan"});
        result.put("hector", new String[] {"Hector"});
        result.put("helena blavatsky", new String[] {"Helena_Blavatsky"});
        result.put("heracles", new String[] {"Heracles"});
        result.put("ibaraki-douji", new String[] {"Ibaraki-dōji", "Ibaraki_Dōji"});
        result.put("ishtar", new String[] {"Ishtar"});
        result.put("jack the ripper", new String[] {"Jack_the_Ripper"});
        result.put("jing ke", new String[] {"Jing_Ke"});
        result.put("joan of arc", new String[] {"Joan_of_Arc", "Jeanne_d'Arc"});
        result.put("karna", new String[] {"Karna"});
        result.put("king arthur", new String[] {"King_Arthur", "Artoria_Pendragon"});
        result.put("kintarou", new String[] {"Kintarō", "Sakata_Kintoki"});
        result.put("kiyohime", new String[] {"Kiyohime"});
        result.put("lancelot", new String[] {"Lancelot"});
        result.put("leonardo da vinci", new String[] {"Leonardo_da_Vinci", "Leonardo_Da_Vinci"});
        result.put("leonidas", new String[] {"Leonidas_I"});
        result.put("li shuwen", new String[] {"Li_Shuwen"});
        result.put("lu bu fengxian", new String[] {"Lü_Bu", "Lu_Bu_Fengxian"});
        result.put("marie antoinette", new String[] {"Marie_Antoinette", "Marie_Antoinette"});
        result.put("martha", new String[] {"Martha"});
        result.put("mata hari", new String[] {"Mata_Hari"});
        result.put("medb", new String[] {"Medb"});
        result.put("medea", new String[] {"Medea"});
        result.put("medusa", new String[] {"Medusa"});
        result.put("mephistopholes", new String[] {"Mephistopheles"});
        result.put("merlin", new String[] {"Merlin"});
        result.put("minaomoto no yoshitsune", new String[] {"Minamoto_no_Yoshitsune", "Ushiwakamaru"});
        result.put("minotaur", new String[] {"Minotaur", "Asterios"});
        result.put("miyamoto musashi", new String[] {"Miyamoto_Musashi"});
        result.put("mordred", new String[] {"Mordred"});
        result.put("nero", new String[] {"Nero", "Nero_Claudius"});
        result.put("nikola tesla", new String[] {"Nikola_Tesla"});
        result.put("nitocris", new String[] {"Nitocris"});
        result.put("oda nobunaga", new String[] {"Oda_Nobunaga"});
        result.put("okita souji", new String[] {"Okita_Sōji"});
        result.put("orion", new String[] {"Orion_(mythology)", "Orion"});
        result.put("paracelsus", new String[] {"Paracelsus", "Paracelsus_von_Hohenheim"});
        result.put("quetzlcoatl", new String[] {"Quetzalcoatl"});
        result.put("rama", new String[] {"Rama"});
        result.put("ramesses ii", new String[] {"Ramesses_II", "Ozymandias"});
        result.put("robin hood", new String[] {"Robin_Hood"});
        result.put("romulus", new String[] {"Romulus"});
        result.put("saint george", new String[] {"Saint_George"});
        result.put("sasaki kojirou", new String[] {"Sasaki_Kojirō", "Sasaki_Kojirō"});
        result.put("scathach", new String[] {"Scáthach"});
        result.put("shuten-douji", new String[] {"Shuten-dōji", "Shuten_Dōji"});
        result.put("siegfried", new String[] {"Sigurd", "Siegfried"});
        result.put("spartacus", new String[] {"Spartacus"});
        result.put("stheno", new String[] {"Stheno"});
        result.put("tamamo no mae", new String[] {"Tamamo-no-Mae", "Tamamo_no_Mae"});
        result.put("thomas edison", new String[] {"Thomas_Edison"});
        result.put("tristan", new String[] {"Tristan"});
        result.put("vlad the impaler", new String[] {"Vlad_the_Impaler", "Vlad_III"});
        result.put("william shakespeare", new String[] {"William_Shakespeare"});
        result.put("wolfgang amadeus mozart", new String[] {"Wolfgang_Amadeus_Mozart"});
        result.put("zhuge liang", new String[] {"Zhuge_Liang", "Zhuge_Liang_(Lord_El-Melloi_II)"});

        keysTemp = result.keySet();
        key = keysTemp.toArray(new String[keysTemp.size()]);

        return Collections.unmodifiableMap(result);
    }


}

