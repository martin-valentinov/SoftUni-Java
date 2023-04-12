package arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.
                stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).
                toArray();
        int[] secondArr = Arrays.
                stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).
                toArray();


        for (int index = 0; index < firstArr.length; index++){
            if (firstArr[index] != secondArr[index]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", index);
                return;
            }
        }

        int sum = 0;

        for (int item:
             firstArr) {
            sum += item;
        }

        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
