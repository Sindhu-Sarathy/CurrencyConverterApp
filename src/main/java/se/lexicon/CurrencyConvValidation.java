package se.lexicon;
import java.util.Scanner;

public class CurrencyConvValidation {
    public static int validMenuChoice(Scanner scanner){
        while(!scanner.hasNextInt()){
            System.out.print("Invalid Input.Please enter the number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

}
