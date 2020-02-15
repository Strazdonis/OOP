package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- 2 UZDUOTIS ---");
        int m[] = {1,2,3};
        int n[] = {4,5,6};
        int x = new Uzduotis2(m,n).metodas();

        System.out.println(x);
        
        System.out.println("--- 3 UZDUOTIS ---");
        String a = new Uzduotis3("123", 5).dalis(); //123
        String b = new Uzduotis3("12345", 3).dalis(); //234
        String c = new Uzduotis3("1234", 2).dalis(); //23
        String d = new Uzduotis3("12345", 4).dalis(); //1
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    
    }
}