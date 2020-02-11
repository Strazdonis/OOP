public class Main {
    /**
     * Homework. Create a 2-dimensional array that contains information about basketball players.
     * Let us assume that each row of the array contains the name of the player, the team name, and the position the player plays in a team.
     * Add information about at least 5 players. The program must take parameters from the command line and based on them print the answer:
     *
     * parameters     - result
     * ------------------------
     * n XXX          - print all the information about player XXX
     * t YYY          - print names of players of the team YYY
     * tp YYY ZZZ     - print who plays in position ZZZ in team YYY (who plays for team YYY in position ZZZ)
     *
     */
    public static void main(String[] args) {
        String param = args[0];

        String[][] players = {
                {"Jonas Valanciunas", "Grizzlies", "Vidurio puolejas"},
                {"Renaldas Seibutis", "Tecnyconta", "Atakuojantis gynejas"},
                {"Mantas Kalnietis", "Lokomotiv-Kuban", "Izaidejas"},
                {"Jonas Maciulis", "AEK", "Lengvasis krastas"},
                {"Mindaugas Kuzminskas", "Lokomotiv-Kuban", "Lengvasis krastas"}
        };
//        int pLength = players.length;
        switch (param) {
            case "n":
                for (String[] player : players) { // basically players.forEach( player => {...
                    if (player[0].equals(args[1])) { //player name == XXX
                        System.out.println(player[0] + " " + player[1] + " " + player[2]);
                    }
                }
                break;
//for (int i=0; i<pLength; i++) {
//    if(players[i][0].equals(args[1])) {
//        System.out.println(players[i][0] + " " + players[i][1] + " " + players[i][2]);
//        break;
//    }
//}
            case "t":
                for(String[] player : players) {
                    if(player[1].equals(args[1])) { //player team == YYY
                        System.out.println(player[0] + " " + player[1] + " " + player[2]);
                    }
                }
                break;
            case "tp":
                for(String[] player : players) {
                    if(player[1].equals(args[1]) && player[2].equals(args[2])) { //player team == YYY && player position == ZZZ
                        System.out.println(player[0] + " " + player[1] + " " + player[2]);
                    }
                }
                break;
            default:
                System.out.println("invalid param");
                break;
        }
    }
}
