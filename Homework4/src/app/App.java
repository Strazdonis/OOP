public class App {
    public static void main(String[] args) throws Exception {
        Homework hw = new Homework();

        //System.out.println(hw.findR(Double.valueOf(args[0])));
        System.out.println(hw.timesRepeated(args[0], args[1]));
    }
}