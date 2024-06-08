package textProcessing.exercise;

import java.util.Scanner;

public class lettersChangeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] codes = scanner.nextLine().split("\\s+");

        double sum = 0;

        for (int i = 0; i < codes.length; i++){
            String code = codes[i];
            char firstLetter = code.charAt(0);
            char secondLetter = code.charAt(code.length() - 1);
            double number = Double.parseDouble(code.replace(firstLetter, ' ').
                    replace(secondLetter, ' ').trim());

            if (Character.isUpperCase(firstLetter)){
                number /= (int) firstLetter - 64;
            } else if (Character.isLowerCase(firstLetter)){
                number *= (int) firstLetter - 96;
            }

            if (Character.isUpperCase(secondLetter)){
                number -= (int) secondLetter - 64;
            } else if (Character.isLowerCase(secondLetter)){
                number += (int) secondLetter - 96;
            }

            sum += number;
        }

        System.out.printf("%.2f", sum);
    }
}
