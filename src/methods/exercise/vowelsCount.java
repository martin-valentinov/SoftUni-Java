package methods.exercise;

import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().toLowerCase();
        printVowelCount(str);

    }

    public static void printVowelCount(String string){
        int vowelCount = 0;
        char[] symbol = string.toCharArray();

        for (char ch:
             symbol) {
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i'){
                vowelCount++;
        }
        }
        System.out.println(vowelCount);
    }
}
