package methods.lab;

import java.util.Scanner;

public class printingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printNextLine(n);

    }

    public static void printLine(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public static void printNextLine(int n) {
        for (int i = 1; i <= n; i++){
            printLine(i);
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            printLine(i);
            System.out.println();
        }
    }
}
