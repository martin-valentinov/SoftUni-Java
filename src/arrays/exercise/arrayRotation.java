package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.
                stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).
                toArray();

        int numOfRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfRotations; i++) {
            int tempValue = arr[0];
            for (int index = 0; index < arr.length - 1; index++) {
                arr[index] = arr[index + 1];
            }
            arr[arr.length - 1] = tempValue;
        }
        for (int item :
                arr) {
            System.out.print(item + " ");
        }
    }
}