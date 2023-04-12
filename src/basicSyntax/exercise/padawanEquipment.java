package basicSyntax.exercise;

import java.util.Scanner;

public class padawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lightsaberSum = lightsaberPrice * (Math.ceil(countOfStudents * 1.1));
        double robeSum = robePrice * countOfStudents;
        int beltDiscount = countOfStudents / 6;
        double beltSum = beltPrice * (countOfStudents - beltDiscount);

        double totalPrice = lightsaberSum + robeSum + beltSum;


        if (amountOfMoney >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            double moneyNeeded = totalPrice - amountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.", moneyNeeded);
        }
    }
}
