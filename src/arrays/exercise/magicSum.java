package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length; i++){
            for (int n = i + 1; n < arr.length; n++) {
                if (arr[i] + arr[n] == num) {
                    System.out.println(arr[i] + " " + arr[n]);
                }
            }
        }
    }
}
