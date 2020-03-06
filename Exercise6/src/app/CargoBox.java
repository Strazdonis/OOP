// * The class has three private class variables: itemName, itemQuantity, and weightPerItem.
// * The class has method setValues that gets three values to set all dynamic class variables.
// * The class has get methods for all class variables.
// * The class has method getWeight that returns the total weight of the cargo box.
// * The class has public method toString that returns a String with all cargo box information.

/**
 * CargoBox
 */
public class CargoBox {
    private String itemName;
    private int itemQuantity;
    private double weightPerItem;

    public void setValues(String name, int quantity, double weight) {
        itemName = name;
        itemQuantity = quantity;
        weightPerItem = weight;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getWeightPerItem() {
        return weightPerItem;
    }
    
    public double getWeight() {
        return itemQuantity * weightPerItem;
    }

    public String toString() {
        return 
            "name: " + itemName + 
            " quantity: " + itemQuantity + 
            " item weight: " + weightPerItem;
    }
}