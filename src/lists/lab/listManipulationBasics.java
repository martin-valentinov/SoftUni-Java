package lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String commandWord = command.split(" ")[0];

            switch (commandWord) {
                case ("Add"):
                    int addNumber = Integer.parseInt(command.split(" ")[1]);
                    numbers.add(addNumber);
                    break;
                case ("Remove"):
                    int removeNumber = Integer.parseInt(command.split(" ")[1]);
                    numbers.remove(Integer.valueOf(removeNumber));
                    break;
                case ("RemoveAt"):
                    int index = Integer.parseInt(command.split(" ")[1]);
                    numbers.remove(index);
                    break;
                case ("Insert"):
                    int number = Integer.parseInt(command.split(" ")[1]);
                    int indexToAdd = Integer.parseInt(command.split(" ")[2]);
                    numbers.add(indexToAdd, number);
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""))
        }
    }
}
