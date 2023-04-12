package methods.exercise;

import java.util.Scanner;

public class charactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstCh = scanner.nextLine().charAt(0);
        char secondCh = scanner.nextLine().charAt(0);

        printCharactersInRange(firstCh, secondCh);
    }

    public static void printCharactersInRange(char firstChar, char secondChar){
        // Взимаме по-малкия char
        if (firstChar < secondChar) {
            for (char symbol = (char)(firstChar + 1); symbol < secondChar; symbol++){
                System.out.print(symbol + " ");
            }
        } else {
            for (char symbol = (char)(secondChar + 1); symbol < firstChar; symbol++){
                System.out.print(symbol + " ");
            }
        }
    }

}
