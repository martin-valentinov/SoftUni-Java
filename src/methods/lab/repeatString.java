package methods.lab;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String concatenatedWord = repeatString(word, n);
        System.out.println(concatenatedWord);
    }

    public static String repeatString(String word, int n){
        String str = "";
        for (int i = 1; i <= n; i++){
            str += word;
        }
        return str;
    }
}
