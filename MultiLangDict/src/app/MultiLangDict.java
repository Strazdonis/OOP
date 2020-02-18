public class MultiLangDict {

    static String[][] words = {
        {"labas", "hello", "hallo"},
        {"maistas", "food", "essen"},
        {"rytas", "morning", "morgen"},
        {"vakaras", "evening", "der abend"},
        {"diena", "day", "tag"}
    };

    public static int getID(String lang) {
        String lLang = lang.toLowerCase();
        if(lLang.equals("lithuanian") || lLang.equals("lt")) {
            return 0;
        } else if(lLang.equals("english") || lLang.equals("en")) {
            return 1;
        } else if(lLang.equals("german") || lLang.equals("de")) {
            return 2;
        } else {
            return -1; //aka error
        }
    }

    public static String getWord(int from, int to, String key) {
        for(String[] word : words) {
            if(word[from].equals(key)) { // === would be stricter
                return word[to];
            }
        }
        return "No translation found";
    }

    public static String getTranslation(String[] args) {
        String fromAb = args[0]; //language abbrv.
        String toAb = args[1]; //language abbrv.
        String word = args[2]; //word to be translated
        
        int from = getID(fromAb);
        int to = getID(toAb);
        if(from == -1 || to == -1) {
            return "abbreviation error";
        }
        
        return getWord(from, to, word);
    }
    public static void main(String[] args) throws Exception {
        if(args.length == 3) {
            System.out.println(getTranslation(args));
        } else {
            System.out.println("give 3 arguments e.g. LT EN vakaras");
        }
    }
}