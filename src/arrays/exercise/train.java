package arrays.exercise;

import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonsCount = Integer.parseInt(scanner.nextLine());
        
        int[] train = new int[wagonsCount];
        int sum = 0;
        
        for (int i = 0; i < wagonsCount; i++){
            int numOfPeople = Integer.parseInt(scanner.nextLine());
            train[i] = numOfPeople;
            sum += numOfPeople;
        }

        for (int wagon:
             train) {
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
