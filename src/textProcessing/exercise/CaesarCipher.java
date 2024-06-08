package textProcessing.exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char[] symbolsArray = text.toCharArray();
        StringBuilder encryptedString = new StringBuilder();

        for (char symbol : symbolsArray){
            char newChar = (char) ((int) symbol + 3);
            encryptedString.append(newChar);
        }

        System.out.println(encryptedString);
    }
}
