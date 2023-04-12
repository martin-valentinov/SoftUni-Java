package basicSyntax.exercise;

import java.util.Scanner;

public class rageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double expenses = headsetPrice * (lostGames / 2) + mousePrice * (lostGames / 3) + keyboardPrice * (lostGames / 6) +
                displayPrice * (lostGames / 12);

        System.out.printf("Rage expenses: %.2f lv.", expenses);
//        double asd = headsetPrice * (lostGames / 2);
//        double asd2 = headsetPrice * (lostGames / 2.0);
//        System.out.println(asd);
//        System.out.println(asd2);
    }
}
