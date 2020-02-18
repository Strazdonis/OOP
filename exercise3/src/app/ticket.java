/**
 * ticket
 */
public class ticket {

    public static boolean isHappy(String ticket) {
        if(ticket.length() != 6) {
            System.out.println("length error");
            return false;
        }
        //sum of 3 first digits = sum of 3 last digits
        int startSum = 0;
        int lastSum = 0;
        for(int i=0; i<6; i++) {
            char c = ticket.charAt(i);

            if(i<3) {
                startSum += c;
            } else {
                lastSum += c;
            }
            
            //returns -1 if the same char is not found later on
            if(ticket.indexOf(c, i+1) != -1) { //if all digits of the ticket are different
                return false;
            }
            
        }

        if(startSum != lastSum) {
            return false;
        }

        return true;
    }
}