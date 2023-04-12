package arrays.lab;
import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.
                stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).
                toArray();

//        String numbers = scanner.nextLine;
//        String[] numbersArr = numbers.split(" ");
//        int[] numbersArr2 = new int[numbersArr.length];
//        for (int i = 0; i <= numbersArr.length - 1; i++){
//              numbersArr2[i] = Integer.parseInt(numbersArr[i]);
//        }
        int sum = 0;

        for (int i = 0; i < numbersArr.length; i++){
            if (numbersArr[i] % 2 == 0) {
                sum += numbersArr[i];
            }
        }
        System.out.println(sum);
    }
}
