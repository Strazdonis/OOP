package app;

import java.util.Arrays;

/**
 * Uzduotis2
 */
public class Uzduotis2 {
    private int[] m;
    private int[] n;

    public Uzduotis2(int[] m, int[] n) {
        this.m = m;
        this.n = n;
    }

    public int metodas () {
        int j = m.length - 1;
        int c = n[n.length - 1];
    
        for (; j >- 1; j -= 2) {
            if (m[j] % 2 == 0) {
                m[j] -= n[j];
            }
            else {
                m[j] += n[j];
            }

            n[j] *= 2;
            c += m[j] ;
        }
    
        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(n));
        System.out.println(j);
        return c;
    
    }
}