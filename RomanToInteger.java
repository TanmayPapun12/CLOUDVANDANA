public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "IX";
        int result = romanToInt(roman);
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        int result = 0;
        int length = s.length();
        int i = 0;

        while (i < length) {
            char currentChar = s.charAt(i);
            int currentNum = getRomanValue(currentChar);

            if (i < length - 1) {
                char nextChar = s.charAt(i + 1);
                int nextNum = getRomanValue(nextChar);

                if (currentNum < nextNum) {
                    result += (nextNum - currentNum);
                    i += 2;
                } else {
                    result += currentNum;
                    i++;
                }
            } else {
                result += currentNum;
                i++;
            }
        }

        return result;
    }

    public static int getRomanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
