package Javaproblems;

import java.util.Scanner;

public class Shoppingcart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;
        
        System.out.println();
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("what is the price for each?: ");
        price = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();
        total = price * quantity;

        System.out.println("You have bought "+ quantity+ " " + item);
        System.out.println("Your total is "+ currency + total);
         scanner.nextLine();
    }
}
}