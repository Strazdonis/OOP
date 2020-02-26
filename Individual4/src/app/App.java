public class App {
    public static void main(String[] args) throws Exception {
        Calculations calc = new Calculations();
        System.out.println("== NORMAL TABLE ==");
        Calculations.Multip_Table();
        System.out.println("== OPTIMIZED TABLE ==");
        Calculations.Opt_Multip_Table();
        System.out.println("== AP ==");
        int a = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        System.out.println(Calculations.Arithmetic_Prog(a, d, n));
        System.out.println("== GP ==");
        int A = Integer.parseInt(args[3]);
        int r = Integer.parseInt(args[4]);
        int N = Integer.parseInt(args[5]);
        System.out.println(Calculations.Geometric_Prog(A, r, N));
        System.out.println("== REVERSE NUM ==");
        int x = 1234;
        System.out.println(Calculations.Reverse(x));
        System.out.println("== SELF-DIVISABLE ==");
        System.out.println(Calculations.Self_Divisable(111));
        System.out.println(Calculations.Self_Divisable(123));
        System.out.println("== DEC TO BIN ==");
        System.out.println(Calculations.Dec_To_Bin(54));
        System.out.println("== IDEAL NUMBERS ==");
        System.out.println(Calculations.Ideal_Numbers(1, 10000));
    }
}