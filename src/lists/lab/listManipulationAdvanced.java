package lists.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String commandWord = command.split(" ")[0];

            switch (commandWord) {
                case "Contains":
                    int number = Integer.parseInt(command.split(" ")[1]);
                    if (numbersList.contains(Integer.valueOf(number))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = command.split(" ")[1];
                    if (evenOrOdd.equals("even")) {
                        for (int num : numbersList) {
                            if (num % 2 == 0) {
                                System.out.print(num + " ");
                            }
                        }
                    } else {
                        for (int num : numbersList) {
                            if (num % 2 == 1) {
                                System.out.print(num + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (int num : numbersList) {
                        sum += num;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = command.split(" ")[1];
                    int numberCondition = Integer.parseInt(command.split(" ")[2]);
                    List<Integer> newList = getConditionNumbers(numbersList, condition, numberCondition);
                    System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
            }


            command = scanner.nextLine();
        }
    }

    public static List<Integer> getConditionNumbers(List<Integer> listNum, String condition, int numberCondition) {
        List<Integer> newList = new ArrayList<>();

        for (int index = 0; index < listNum.size(); index++) {
            int currentNum = listNum.get(index);

            if (condition.equals("<")) {
                if (currentNum < numberCondition) {
                    newList.add(currentNum);
                }
            } else if (condition.equals(">")) {
                if (currentNum > numberCondition) {
                    newList.add(currentNum);
                }
            } else if (condition.equals("<=")) {
                if (currentNum <= numberCondition) {
                    newList.add(currentNum);
                }
            } else if (condition.equals(">=")) {
                if (currentNum >= numberCondition) {
                    newList.add(currentNum);
                }
            }
        }
        return  newList;
    }
}
