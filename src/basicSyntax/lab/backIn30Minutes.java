package basicSyntax.lab;

import java.util.Scanner;

public class backIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialHour = Integer.parseInt(scanner.nextLine());
        int initialMinutes = Integer.parseInt(scanner.nextLine());

        int timeInMinutes = initialHour * 60 + initialMinutes + 30;
        int hour = timeInMinutes / 60;
        int minutes = timeInMinutes % 60;

        if (hour == 24) {
             hour = 0;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }
}
