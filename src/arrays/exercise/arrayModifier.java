package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "swap":
                    int firstIndex = Integer.parseInt(command[1]);
                    int secondIndex = Integer.parseInt(command[2]);
                    int tempValue = arr[firstIndex];
                    arr[firstIndex] = arr[secondIndex];
                    arr[secondIndex] = tempValue;
                    break;
                case "multiply":
                    int firstInd = Integer.parseInt(command[1]);
                    int secondInd = Integer.parseInt(command[2]);
                    arr[firstInd] = arr[firstInd] * arr[secondInd];
                    break;
                case "decrease":
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] -= 1;
                    }
                    break;
            }

            command = scanner.nextLine().split(" ");
        }

        for (int x = 0; x < arr.length - 1; x++){
            System.out.print(arr[x] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
    }
}
