package app;

/**
 * Uzduotis3
 * gražina ilgio s simboliu poseki iš eilutes e vidurio
 * 
 */
public class Uzduotis3 {
    private String e;
    private int s;
    private int ilgis;

    public Uzduotis3(String e, int s) {
        this.e = e;
        ilgis = e.length();
        this.s = s;
    }

    public String dalis() {
        if(ilgis < s) { //jei e trumpesne nei arba lygi sk s
            return e;
        } else if(ilgis%2 == s%2) { //jei e yra lyginio ilgio ir s lyginis, jei e yra nelyginio ilgio ir s nelyginis
            //s viduriniu simboliu is eilutes e
            return e.substring(ilgis-s-1, s+1);
        } else { //likusiais atvejais
            //grazinamas pirmas e simbolis
            return e.substring(0, 1);
        }
    }
}