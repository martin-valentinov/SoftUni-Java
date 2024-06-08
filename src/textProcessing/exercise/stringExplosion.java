package textProcessing.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        int strength = 0;
        for (int i = 0; i < input.length(); i++){
            char currentChar = input.charAt(i);

            if (currentChar == '>'){
                strength += Integer.parseInt(input.charAt(i + 1) + "");
            } else if (currentChar != '>' && strength > 0){
                input.deleteCharAt(i);
                i--;
                strength--;
            }
        }

        System.out.println(input.toString());
        }
    }

