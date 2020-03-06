public class App {
    public static void main(String[] args) throws Exception {
        CargoBox test = new CargoBox();

        test.setValues("kargo", 5, 4.2);
        System.out.println(test.toString());
        System.out.println(test.getWeight());

        String testString = "CB Milk 5 1 25.5 Milk 1 2 30.2 Wheet 2 3 20 CB Oil 11 5 20 CB Wood 1 1 250";

        Shipment siunta = new Shipment();
        siunta.makeBoats(3, "pirma 309 antra 1100 trecia 249");

        siunta.fillBoats(testString);
    }
}