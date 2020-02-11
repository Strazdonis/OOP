import java.lang.Math;
class Main {
    public static void main(String[] args) {
       /* int size = Integer.parseInt(args[0]);
        int[] m = new int[size+1];
        System.out.println("1. === ");
        for(int i=size-1; i>=0; i--) {
            m[i] = i%2 == 0 ? i : -(i);
        }
        System.out.println("2. === ");
        for(int j=0; j<size; j++) {
            System.out.println("m["+j+"] = " + m[j]);
        }
        System.out.println("3. === ");
        for(int k=0; k<size; k++) {
            if(m[k]%3==0) {
                m[k]*=2;
            }
        }
        System.out.println("4. === ");
        for(int e=size-1; e>=0; e-=2) {
            System.out.println("m["+e+"] = " + m[e]);
            if(e > 0) {
                System.out.println("m["+(e-1)+"] = " + m[e-1]);
            }
        }
*/


        String[][] personInfo = {
                {"Edvinas", "Strazdonis", "600"},
                {"Tomas", "Gzegoz", "700"},
                {"Antanas", "Sireika", "400"},
                {"Jonas", "Valanciunas", "1200"},
                {"Rokas", "Buozelis", "800"},
                {"Julius", "Valma", "800"}
        };

        int personLen = personInfo.length;

        for(int i=0; i<personLen; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(personInfo[i][j] + " ");
            }
            System.out.println();
        }


        String algo = args[0];

        if(algo.equals("v")) {
            int Cntr = 0;
            for(int i=0; i<personLen; i++) {
                if(personInfo[i][0].equals(args[1])) {
                    Cntr++;
                }
            }
            System.out.println(Cntr);
        }

        else if(algo.equals("p")) {
            int Cntr = 0;
            for(int i=0; i<personLen; i++) {
                if(personInfo[i][1].equals(args[1])) {
                    Cntr++;
                }
            }
            System.out.println(Cntr);
        }

        else if(algo.equals("vp")) {
            for(int i=0; i<personLen; i++) {
                if(personInfo[i][0] == args[0] && personInfo[i][1] == args[1]) {
                    System.out.println(Integer.parseInt(personInfo[i][2]));
                }
            }
        }

        else if(algo.equals("avg")) {
            int Salary=0;
            for(int i=0; i<personLen; i++) {
                Salary+=Integer.parseInt(personInfo[i][2]);
            }
            System.out.println(Salary/personLen);
        }

        else if(algo.equals("va")) {
            int closestSal=Integer.parseInt(personInfo[0][2]);
            int index=0;
            int x;
            for(int i=0; i<personLen; i++) {
                x = Math.abs(Integer.parseInt(personInfo[i][2])-Integer.parseInt(args[1]));
                if(x < closestSal) {
                    closestSal = x;
                    index = i;
                }
            }
            System.out.println(index + " : " + closestSal);
        }

        else if(algo.equals("max")) {
            int max=0;
            int maxi=0;
            for(int i=0; i<personLen; i++) {
                if(max < Integer.parseInt(personInfo[i][2])) {
                    max = Integer.parseInt(personInfo[i][2]);
                    maxi = i;
                }
            }
            System.out.println(maxi + " : " + max);
        }

        else if(algo.equals("r")) {
            int len = args[1].length();
            String sub = "";
            for(int i=0; i<personLen; i++) {
                sub = personInfo[i][0].substring(0, len);
                if(sub.equals(args[1])) {
                    System.out.println(sub + " - " + personInfo[i][0] + " " + personInfo[i][1]);
                }
            }
        }



    }
}