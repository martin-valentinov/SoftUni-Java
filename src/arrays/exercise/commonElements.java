package arrays.exercise;

import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String secondArrItem:
             secondArr) {
            for (String firstArrItem:
                 firstArr) {
                if (secondArrItem.equals(firstArrItem)) {
                    System.out.print(secondArrItem + " ");
                }
            }
        }
    }
}
