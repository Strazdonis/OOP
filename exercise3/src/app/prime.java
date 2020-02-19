/**
 * prime
 */
public class prime {
    public static boolean isDivisor(int num, int div) {
        if(num%div == 0) {
            return true;
        }
        return false;
    }
    
    public static boolean isPrime(int num) {
        double half = num/2;
        for(int i=2; i<Math.floor(half); i++) {
            if(isDivisor(num, i)) {
               return false; 
            }
        }
        return true;
    }

    public static void allPrimeDivisors(int num) {
        double half = num/2;
        for(int i=2; i<Math.floor(half); i++) {
            if(isDivisor(num, i)) {
                if(isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}