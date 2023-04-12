package methods.exercise;

import java.util.Scanner;

public class nXnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printNxNTable(n);

    }

    public static void printNxNTable (int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
