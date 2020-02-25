import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Methods m = new Methods();
        // MATH
        // switch(args.length) {
        //     case 1:
        //         System.out.println(m.intermediate(new String[]{args[0], args[0], args[0], args[0], args[0]}));
        //         break;
        //     case 2:
        //         System.out.println(m.intermediate(new String[]{args[0], args[0], args[1], args[1], args[1]}));
        //         break;
        //     case 5:
        //         System.out.println(m.intermediate(args)); 
        //         break;
        //     default:
        //         System.out.println("Exptected 1 or 2 arguments, got "+args.length+" instead");
        //         break;
        // }
        
        // STRINGS
        //System.out.println(Arrays.toString(m.sentences(args)));
        //System.out.println(m.vowelLetters(args[0]));
        String[] sentences = m.sentences(args);
        System.out.println(Arrays.toString(m.vowelsInSentences(sentences)));
        System.out.println(m.houseInSentences(sentences));
        System.out.println(m.repetitiveWords(sentences));
    }
}