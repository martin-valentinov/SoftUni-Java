package lists.lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        //{1, 6, 3, 3, 5, 5} - index 2
        //{1, 6, 6, 5, 5}

        for (int index = 0; index < numbers.size() - 1; index++){
            double firstNumber = numbers.get(index);
            double secondNumber = numbers.get(index + 1);

            if (firstNumber == secondNumber) {
                double newNumber = firstNumber + secondNumber;
                numbers.set(index, newNumber);
                numbers.remove(index + 1);
                index = -1;
            }
        }

        String output = joinItemsByDelimiter(numbers, " ");
        System.out.println(output);
    }

    public static String joinItemsByDelimiter(List<Double> items, String delimiter) {
        String output = "";

        for (Double numbers : items) {
            output += (new DecimalFormat("0.#").format(numbers) + delimiter);
        }
        return output;
    }
}
