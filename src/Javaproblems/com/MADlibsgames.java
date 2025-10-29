package Javaproblems.com;

import java.util.Scanner;

public class MADlibsgames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Adjective1;
        String Noun1;
        String Adjective2;
        String Verb1;
        String Adjective3;

        System.out.print("Enter an Adjective (description): ");
        Adjective1 = scanner.nextLine();
        System.out.print("Enter an Noun (Animal or person): ");
        Noun1 = scanner.nextLine();
        System.out.print("Enter an Adjective (description): ");
        Adjective2 = scanner.nextLine();
        System.out.print("Enter an verb end with -ing: ");
        Verb1 = scanner.nextLine();
        System.out.print("Enter an Adjective (description): ");
        Adjective3 = scanner.nextLine();

        System.out.println("Today I Went to a "+ Adjective1+" zoo. ");
        System.out.println("In a exhibit, I saw a "+Noun1+".");
        System.out.println(Noun1+" was "+Adjective2+" and "+ Verb1+".");
        System.out.println("I was "+ Adjective3+" ! ");
    }
}
