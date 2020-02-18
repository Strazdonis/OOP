/**
 * chem
 */
public class chem {
    static String[][] elements = {
        //symbol, name, number, mass
        {"Li", "Lithium", "3", "6.94"},
        {"Na", "Sodium", "11", "22.9"},
        {"K", "Potassium", "19", "39.1"},
        {"C", "Carbon", "6", "12.0"},
    };
    public static String chemistry(String type, String value) {
        int index;
        if(type.equals("s")) {//symbol
            index=0;
        } else if(type.equals("na")) {//name
            index=1;
        } else if(type.equals("nu")) {//number
            index=2;
        } else if(type.equals("m")) {//mass
            index=3;
        } else {
            System.out.println("given type is incorrect, use s for symbol, na for name, nu for number or m for mass");
            return "type error";

        }

        for(String[] element : elements) {
            if(element[index].equals(value)) {
                return "No " + element[2] + " " + element[1] + " (" + element[0] + ")";
            }
        }
        return "didn't find anything";
    }
    
}