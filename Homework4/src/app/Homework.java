/**
 * Homework
 */
import java.lang.Math;
public class Homework {
    public double findR(double S) {
        double pi = Math.PI;
        return Math.round(Math.sqrt(S / pi)); //S = P * R^2
    }
    public int timesRepeated(String part, String full) {
       // return full.toLowerCase().split(part.toLowerCase(), full.length()).length-1; oneline
       String b = full.toLowerCase();
       String a = part.toLowerCase();
       return b.split(a, b.length()).length-1;
    }
}