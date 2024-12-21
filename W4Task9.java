package S3Workshop_4;

import static java.util.Collections.reverse;

public class W4Task9 {
    String toreverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    String toUppercase(String input) {
        return input.toUpperCase();
    }

    boolean isPalin(String input) {
        String reversed = toreverse(input);
        return input.equals(reversed);
    }

    int countVowel(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
