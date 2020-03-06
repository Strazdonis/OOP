// * The class has five private class variables: boatName, maxWeight, noOfBoxes, totalWeight, and array boxes of CargoBox objects. 
// * Class variables boatName and maxWeight are not initialized during the declaration. Variables noOfBoxes and totalWeight are initialized with value 0. Array boxes is initialized with 10 positions.
// * The class has method setValues that gets parameters to set the name of the boat and the maximum weight of the boat.
// * The class has get methods for class variables noOfBoxes, boatName, maxWeight, and totalWeight.
// * The class has method addCargoBox that gets a CargoBox object and returns a boolean value. If the box is loaded to the boat successfully the result is true. The boat can not exceed the maximum weight and the number of boxes. The method also increases values of class variables noOfBoxes and totalWeight of the boat if the box is loaded to the boat.
// * The class has method printCargoBoxes. The method does not get and return anything. It prints information about all boxes of the boat (method toString could be used without its invocation).
// * The class has public method toString that returns the String with a boat name, total weight, and the maximum weight of the boat.

/**
 * Boat
 */
public class Boat {
    private String boatName;
    private int maxWeight;
    private int noOfBoxes = 0;
    private double totalWeight = 0;
    private CargoBox[] boxes = new CargoBox[10];

    public void setValues(String name, int weight) {
        boatName = name;
        maxWeight = weight;
    }

    public int getNoOfBoxes() {
        return noOfBoxes;
    }

    public String getBoatName() {
        return boatName;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public Boolean addCargoBox(CargoBox box) {
        double boxWeight = box.getWeight();
        // The boat can not exceed the maximum weight and the number of boxes.
        if(noOfBoxes >= 10 || totalWeight+boxWeight > maxWeight) {
            return false;
        }
        boxes[noOfBoxes] = box; 
        totalWeight+=boxWeight;
        noOfBoxes++;
        return true;
    }

    public void printCargoBoxes() {
        for(CargoBox box : boxes) {
            System.out.println(box.toString());
        }
    }

    public String toString() {
        return 
            "name: " + boatName +
            " weight: " + totalWeight +
            " max weight: " + maxWeight;
    }

}