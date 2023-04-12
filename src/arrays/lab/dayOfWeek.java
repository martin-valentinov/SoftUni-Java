package arrays.lab;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = Integer.parseInt(scanner.nextLine());

        String[] dayOfWeek = new String[]{
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        if (dayNumber > 7 || dayNumber < 1) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(dayOfWeek[dayNumber - 1]);
        }
    }
}
