package lists.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> concatenatedList = new ArrayList<>();

        if (firstList.size() < secondList.size()) {
            for (int index = 0; index < firstList.size(); index++) {
                concatenatedList.add(firstList.get(index));
                concatenatedList.add(secondList.get(index));
            }
            for (int index = firstList.size(); index < secondList.size(); index++) {
                concatenatedList.add(secondList.get(index));
            }
        } else if (firstList.size() > secondList.size()) {
            for (int index = 0; index < secondList.size(); index++) {
                concatenatedList.add(firstList.get(index));
                concatenatedList.add(secondList.get(index));
            }
            for (int index = secondList.size(); index < firstList.size(); index++) {
                concatenatedList.add(firstList.get(index));
            }
        } else {
            for (int index = 0; index < firstList.size(); index++) {
                concatenatedList.add(firstList.get(index));
                concatenatedList.add(secondList.get(index));
            }
        }

        for (int number : concatenatedList) {
            System.out.print(number + " ");
        }
    }
}
