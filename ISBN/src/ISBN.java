public class ISBN {
    private String isbn;
    private String input;
    private String controller;

    public ISBN(String isbn) {
        input = isbn;
        this.isbn = isbn.replaceAll("-", "");
        controller = isbn.substring(isbn.length()-1);
    }

    public String validate() {
       // System.out.println("input: " + input + " ISBN: " + isbn + ", controller: " + controller + " length: " + isbn.length());
        int checkSum = 0;
        int cInt;
        String c;
        if(isbn.length() == 10) {
            if(controller.matches("[0-9]|X")) { //The last check digit can be 0-9 or X
                for(int i=0; i<9; i++) {
                    c = isbn.substring(i, i+1);
                    cInt=Integer.parseInt(c);
                    checkSum += cInt * (10-(i));
                }

                if(controller.equals("X")) { // == "X" didn't work
                    checkSum+=10;
                } else {
                    checkSum+=Integer.parseInt(controller);
                }
                if(checkSum%11 == 0) {
                    return "valid";
                } else {
                    return "checksum error: " + checkSum;
                }

            } else {
                return "controller error: expected [0-9] or X, got: " + controller;
            }

        } else if(isbn.length() == 13) {
            if(controller.matches("[0-9]")) { //The last check digit can be 0-9
                for(int i=0; i<13; i++) {
                    c = isbn.substring(i, i+1);
                    cInt = Integer.parseInt(c);
                    if((i+1)%2==0) {
                        checkSum += cInt * 3;
                    } else {
                        checkSum += cInt;
                    }
                }
                //checkSum+=Integer.parseInt(controller);
                if( ( (10 - (checkSum % 10) ) % 10) == 0) {
                    return "valid";
                } else {
                    return "checksum error: " + checkSum;
                }
            } else {
                return "controller error: expected [0-9], got: " + controller;
            }

        } else {
            return "length error: expected 10 or 13, got: " + isbn.length();
        }
    }
}
