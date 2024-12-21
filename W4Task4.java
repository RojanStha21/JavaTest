package S3Workshop_4;

import java.util.ArrayList;
import java.util.List;

public class W4Task4 {
    public static int[] getEvenNumbers(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }

        int[] evens = new int[count];
        int index = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evens[index++] = num;
            }
        }
        return evens;
    }
    }


