package textProcessing.exercise;

import java.util.Scanner;

public class characterMultiplier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String input1 = input[0];
        String input2 = input[1];

        System.out.println(sumOfCharacters(input1, input2));

    }

    public static int sumOfCharacters(String input1,String input2){
        int sum = 0;
        char[] firstInputChars = input1.toCharArray();
        char[] secondInputChars = input2.toCharArray();

        int lengthierInput = Math.max(firstInputChars.length, secondInputChars.length);
        int shorterInput = Math.min(firstInputChars.length, secondInputChars.length);

        for (int i = 0; i < shorterInput; i++){
            int firstChar = firstInputChars[i];
            int secondChar = secondInputChars[i];
            int charMultiplied = firstChar * secondChar;
            sum += charMultiplied;
        }

        if (shorterInput != lengthierInput) {
            if (firstInputChars.length < secondInputChars.length) {
                for (int i = shorterInput; i < lengthierInput; i++){
                    sum += secondInputChars[i];
                }
            } else {
                for (int i = shorterInput; i < lengthierInput; i++){
                    sum += firstInputChars[i];
                }
            }
        }

        return sum;
    }
}
