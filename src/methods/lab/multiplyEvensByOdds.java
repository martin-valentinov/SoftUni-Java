package methods.lab;

import java.util.Scanner;

public class multiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int result = getMultipleOfEvensAndOdds(number);
        System.out.println(result);
    }

    public static int getMultipleOfEvensAndOdds(int number){
        int result = getSumOfEvenNumbers(number) * getSumOfOddNumbers(number);
        return result;
    }

    public static int getSumOfEvenNumbers(int number){
        int sum = 0;
        while (number != 0){
            if (number % 2 == 0){
                sum += number % 10;
            }
            number /= 10;
        }
        return sum;
    }

    public static int getSumOfOddNumbers(int number) {
        int sum = 0;
        while (number != 0){
            if (number % 2 != 0){
                sum += number % 10;
            }
            number /= 10;
        }
        return sum;
    }
}
