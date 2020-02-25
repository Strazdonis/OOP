/**
 * Methods
 */
public class Methods {

    //MATH 

    public double expression(int a, int b, double c, double d, double e) {
        double result = 0;

        //https://stackoverflow.com/questions/31258674/math-pow-using-fractional-exponents
        double fraction_a = (double) 1/3;
        double fraction_b = (double) 1/2;
        double fraction_e = (double) 1/4;


        result += Math.pow(a, fraction_a);
        result += Math.pow(b, fraction_b);
        result += Math.pow(c, d);
        result += Math.pow(e, fraction_e);

        return result;
    }

    public double intermediate(String[] r) {
        int a = Integer.parseInt(r[0]);
        int b = Integer.parseInt(r[1]);
        double c = Double.parseDouble(r[2]);
        double d = Double.parseDouble(r[3]);
        double e = Double.parseDouble(r[4]);
        return expression(a,b,c,d,e);
    }


    //STRINGS

    public String[] sentences(String[] words) {
        int cntr=-1; //since I'm doing cntr++ and 0%3 == 0
        int len = words.length/3;
        String[] sentences = new String[len];
        for(int i=0; i<words.length; i++) {
            if(i%3 == 0) { //go to next index after 3 words
                cntr++;
                sentences[cntr] = words[i] + " ";
                continue;
            }
            sentences[cntr] += words[i] + " ";
        }
        return sentences;
    }

    public int vowelLetters(String word) {
        String vowels = "aeiou";
        int count = 0;
        char[] chars = word.toLowerCase().toCharArray();
        for(char c : chars) {
            if(vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }


    public boolean hasInside(String sub, String full) {
        return full.contains(sub);
    }

    /*
        how many vowels has each sentence;
        how many sentences have word "house";
        how many sentences have two or three repetitive words;
    */

    public int[] vowelsInSentences(String[] sentences) {
        int len = sentences.length;
        int[] vowels = new int[len];

        for(int i=0; i<len; i++) {
            vowels[i] = vowelLetters(sentences[i]);
        }
        return vowels;
    }

    public int houseInSentences(String[] sentences) {
        int len = sentences.length;
        int count = 0;
        for(String sentence : sentences) {
            if(hasInside("house", sentence)) {
                count++;
            }
        }
        return count;
    }

    public int repetitiveWords(String[] sentences) {
        int len = sentences.length;
        int count = 0;
        
        for(String sentence : sentences) {
            
            String[] words = sentence.split(" ");
            
            for(String word : words) {
                if(hasInside(word, sentence.replaceFirst(word, ""))) {
                    count++;
                    break; //gets another sentence
                }
            }
        }
        return count;
    }
}