package lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int listSize = numbers.size();

        //{1, 2, 3, 4, 5} -> {6, 6, 3}
        for (int index = 0; index < listSize / 2; index++) {
            int firstNum = numbers.get(index);
            int secondNum = numbers.get(numbers.size() - 1);
            int newNumber = firstNum + secondNum;
            numbers.set(index, newNumber);
            numbers.remove(numbers.size() - 1);
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
