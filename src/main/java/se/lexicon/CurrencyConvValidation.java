package se.lexicon;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CurrencyConvValidation {

    //Validating the menu
    public static int validMenuChoice(Scanner scanner){
        while(!scanner.hasNextInt()){
            System.out.print("Invalid Input.Please enter the number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    //To validate the entered amount
    public static double validationForAmount(Scanner scanner,String currency){
        double amount;
        while(true){
            System.out.print("Enter amount in "+currency+": ");
            try{
                amount=scanner.nextDouble();
                if(amount<0){
                    System.out.println("Amount cannot be negative.Try again");
                }
                else{
                    return amount;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input.Please enter the number.");
                scanner.next();
            }
        }
    }
}
