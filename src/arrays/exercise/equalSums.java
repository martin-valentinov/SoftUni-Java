package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class equalSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (arr.length == 1) {
            System.out.println(0);
            return;
        }

        int rightSum = 0;

        for (int i = 1; i < arr.length; i++){
            rightSum += arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++){
            if (leftSum == rightSum) {
                System.out.print(i);
                break;
            } else {
                if (i == arr.length - 1) {
                    System.out.println("no");
                    break;
                } else {
                    leftSum += arr[i];
                    rightSum -= arr[i + 1];
                }
            }
        }
    }
}
