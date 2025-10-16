package se.lexicon;
import java.util.Scanner;
import static se.lexicon.CurrencyConvValidation.*;

public class CurrencyConverterApp {
      public static void main(String[] args){
          Scanner scanner=new Scanner(System.in);
          int choice;
        do{
            displayMenu();
            choice=validMenuChoice(scanner);
        }
        while(choice!=0);

      }

      private static void displayMenu(){
          System.out.println("----Currency Converter----");
          System.out.println("1. Convert SEK to USD");
          System.out.println("2. Convert USD to SEK");
          System.out.println("3. Convert SEK to Euro");
          System.out.println("4. Convert Euro to SEK");
          System.out.println("0. Exit");
          System.out.print("Enter your choice: ");
      }
}
