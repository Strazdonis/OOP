import java.util.Arrays;

// * The class has class variable boats that is an array of Boat objects and it is not initialized during the declaration.
// * The class has method makeBoats. The method does not return anything. The method gets two parameters: the number of boats and a String with boat information (Name1 MaxWeigth1 Name2 MaxWeight2 ...). The method initializes class variable boats, creates all boats, and sets their names and maximum weights. Default constructor and method setValues are used in the method.
// * The class has method printBoats. The method does not get and return anything. The method prints information about each boat (boat information and its cargo box information) of the shipment.
// The class has method fillBoats. The method gets a String with all the information about all boats' cargo boxes. 
// The letters CB identify the start of the next boat filling. 
// The format between after CB is: itemName1 numberOfBoxes1 numberOfItemsInACargoBox1 weightOfOneItem1 itemName2 ... 
// The method addCargoBox must be invoked. If the box cannot be loaded the message must be printed. 
// The message about each filled boat must be printed too. 
// E.g. if String "CB Milk 5 1 25.5 Milk 1 2 30.2 Wheet 2 3 20 CB Oil 11 5 20 CB Wood 1 1 250" is received: 
// three times CB means that three boats are filled. "Milk 5 1 25.5" means that each of five boxes will contain one item of Milk 
// and weight of the item is 25.5. So the first boat will have 5+1+2 = 8 cargo boxes.
// The class has static method howManyFullyFilled that gets a Shipment object and returns a number of fully filled boats in this shipment.
// The class has method main. The main method has a String initialized with value "BO:3 Lietuva 350 Vytautas 1000 Kastytis 500 CB Milk 5 1 25.5 Milk 1 2 30.2 Wheet 2 3 20 CB Oil 11 5 20 CB Wood 1 1 250". This String is analyzed and new shipment is constructed. Methods makeBoats, fillBoats, printBoats, and howManyFullyFilled must be invoked.

/**
 * Shipment
 */
public class Shipment {
    private Boat[] boats; 
    /**
     * 
     * @param num number of boats
     * @param info String with information (Name1 MaxWeigth1 Name2 MaxWeight2 ...).
     */
    public void makeBoats(int num, String info) {
        int cntr = 0;
        String[] split = info.split(" ");
        boats = new Boat[split.length/2];
        for(int i=0; i<split.length; i+=2) {
            String name = split[i];
            int weight = Integer.parseInt(split[i+1]);
            
            boats[cntr] = new Boat();
            boats[cntr].setValues(name, weight);
            cntr++;
        }
    }

    public void printBoats() {
        for(Boat boat : boats) {
            System.out.println("boats:");
            System.out.println(boat.toString());
            System.out.println("cargo boxes:");
            boat.printCargoBoxes();
        }
    }

    // * The class has method fillBoats. The method gets a String with all the information about all boats' cargo boxes. 
    // * The letters CB identify the start of the next boat filling. 
    // * The format between after CB is: itemName1 numberOfBoxes1 numberOfItemsInACargoBox1 weightOfOneItem1 itemName2 ... 
    // * The method addCargoBox must be invoked. If the box cannot be loaded the message must be printed. 
    // * The message about each filled boat must be printed too. 
    // E.g. if String "CB Milk 5 1 25.5 Milk 1 2 30.2 Wheet 2 3 20 CB Oil 11 5 20 CB Wood 1 1 250" is received: 
    // three times CB means that three boats are filled. 
    // "Milk 5 1 25.5" means that each of five boxes will contain one item of Milk 
    // and weight of the item is 25.5. 
    // So the first boat will have 5+1+2 = 8 cargo boxes.

    public void fillBoats(String info) {
        String[] boxesSplit = info.split("CB ");
        String[] boxes = Arrays.copyOfRange(boxesSplit, 1, boxesSplit.length);
        int boatCntr=0;
        for(String box: boxes) {
            String[] split = box.split(" ");
            for(int i=0; i<split.length; i+=4) {
                String name = split[i];
                int numberOfBoxes = Integer.parseInt(split[i+1]);
                int numberOfItemsInACargoBox = Integer.parseInt(split[i+2]);
                double weightOfOneItem = Double.parseDouble(split[i+3]);
                for(int j=0; j<numberOfBoxes; j++) {
                    CargoBox cargo = new CargoBox();
                    cargo.setValues(name, numberOfItemsInACargoBox, weightOfOneItem);
                    Boolean wasAdded = boats[boatCntr].addCargoBox(cargo);
                    if(!wasAdded) {
                        System.out.println("could not add cargo box to boat, either maxWeight or max amount of boxes was exceeded");
                        // continue; //on one hand I will probably just get more errors, on the other hand another box might be smaller and fit cba checking
                    } else {
                        System.out.println("added a box of " + name + "(" + cargo.getWeight() + ") ");
                    }
                }
            }
            boatCntr++;
            System.out.println("FILLED BOAT " + boats[boatCntr-1].getBoatName());
        }
    }
    
}