package dataTypesAndVariables.lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class poundToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal pound = new BigDecimal(scanner.nextLine());
        BigDecimal dollar = new BigDecimal(1.36);
        dollar = dollar.multiply(pound);

        System.out.printf("%.3f", dollar);
    }
}
