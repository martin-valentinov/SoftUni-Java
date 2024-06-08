package textProcessing.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class replaceRepeatingChars {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        List<Character> chars = new ArrayList<>();

        for (char currentChar : input) {
            chars.add(currentChar);
        }

        for (int i = 1; i < chars.size(); i++){
            char currentChar = chars.get(i);
            char previousChar = chars.get(i-1);

            if (currentChar == previousChar) {
                chars.remove(i);
                i--;
            }
        }

        for (char currentChar : chars) {
            System.out.print(currentChar);
        }
    }
}
