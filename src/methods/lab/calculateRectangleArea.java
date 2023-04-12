package methods.lab;

import java.util.Scanner;

public class calculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = Integer.parseInt(scanner.nextLine());
        int sideB = Integer.parseInt(scanner.nextLine());
        int area = rectangleArea(sideA, sideB);

        System.out.println(area);

    }

    public static int rectangleArea(int sideA, int sideB) {
        int area = sideA * sideB;
        return area;
    }
}
