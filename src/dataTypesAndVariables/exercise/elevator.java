package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

//            int courses = numberOfPeople / capacity;
//
//            if (numberOfPeople % capacity != 0) {
//                courses += 1;
//            }
        int courses = (int) Math.ceil((double) numberOfPeople / capacity);
        System.out.println(courses);


    }
}
