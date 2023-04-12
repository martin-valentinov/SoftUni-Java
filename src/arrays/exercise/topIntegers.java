package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class topIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int mainIndex = 0; mainIndex < arr.length; mainIndex++){
            int value = arr[mainIndex];


            if (mainIndex == arr.length - 1) {
                System.out.print(value + " ");
            }

            boolean isTop = false;
            for (int i = mainIndex + 1; i < arr.length; i++){
                if (value > arr[i]) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(value + " ");
            }
        }

    }
}
