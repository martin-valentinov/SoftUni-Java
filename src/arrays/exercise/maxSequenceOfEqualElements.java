package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class maxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 1;
        int number = 0;

        for (int i = 0; i < arr.length; i++){
            int tempCount = 1;
            int tempNum = 0;

            for (int x = i + 1; x < arr.length; x++) {
                if (arr[i] == arr[x]){
                    tempCount++;
                    tempNum = arr[i];
                } else {
                    break;
                }

                if (tempCount > count) {
                    count = tempCount;
                    number = tempNum;
                }
            }
        }

        for (int n = 0; n < count; n++) {
            System.out.print(number + " ");
        }
    }
}
