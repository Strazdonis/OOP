import java.util.ArrayList;

/**
 * Calculations
 */
//import java.math.*;
public class Calculations {
    public static void Multip_Table() {
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }

    public static void Opt_Multip_Table() {
        for(int i=1; i<=10; i++) {
            for(int j=i; j<=10; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }

    public static int Arithmetic_Prog(int a, int d, int n) {
        // AP = a + (n-1) * d
        return (a + (n-1)*d);
    }
    
    public static int Geometric_Prog(int a, int r, int n) {
        // T = a * r^(N-1)

        int pow = (int)Math.pow(r, n-1);
        return a * pow;  
    }

    public static int Reverse(int x) {
        int rev = 0;
        while(x>0) {
            rev*=10;
            rev+=x%10;
            x/=10;
        }
        return rev;
    }

    public static Boolean Self_Divisable(int x) {
        Boolean divisable = true;
        int divisor=0;
        int num = x;
        while(x>0) {
            divisor=x%10;
            double f = (double) num/divisor; 
            if(f%1 != 0) {
                return false;
            }
            x/=10;
        }
        return divisable;
    }

    public static StringBuffer Dec_To_Bin(int x) {
        int num = x;
        StringBuffer bin = new StringBuffer("");
        while(num>1) {
            bin.append(num%2);
            num=num/2; //dirbant su float arba double reiktu shiftint i sveikaja dali ( >> 0 )
        }
        bin.append(1); //liko 1 del x>1
        return bin.reverse();
    }


    public static boolean isIdeal(int x) {
        int sum = 0;
		for(int i=1 ; i<x; i++) {
			if(x % i == 0)  {
				sum += i;
			}
		}
		return sum == x;
    }

    public static ArrayList<Integer> Ideal_Numbers(int from, int to) {
        // E.g., 28=1+2+4+7+14 is an ideal number.
        ArrayList<Integer> ideals = new ArrayList<Integer>();
		for(int i=from; i<=to; i++) {
            if(isIdeal(i)) {
                ideals.add(i);
            }
        }
        return ideals;
    }

}