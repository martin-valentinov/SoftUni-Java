package regularExpressions.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furniture {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> purchasedFurniture = new ArrayList<>();
        double totalPrice = 0.0;
        Pattern pattern = Pattern.compile(">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]+)!(?<quantity>[0-9]+)");

        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String typeOfFurniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                purchasedFurniture.add(typeOfFurniture);
                totalPrice += price * quantity;
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        purchasedFurniture.forEach(furniture -> System.out.println(furniture));
        System.out.printf("Total money spend: %.2f", totalPrice);


    }
}
