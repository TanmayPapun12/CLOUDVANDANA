public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        boolean[] letterPresent = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letterPresent[c - 'a'] = true;
            }
        }
        for (boolean present : letterPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
