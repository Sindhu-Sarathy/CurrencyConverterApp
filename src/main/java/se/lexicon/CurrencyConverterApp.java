package se.lexicon;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static se.lexicon.CurrencyConvValidation.*;

public class CurrencyConverterApp {
      public static void main(String[] args){
          Scanner scanner=new Scanner(System.in);
          CurrencyConverter converter=new CurrencyConverter();

          int choice;
        do{
            displayMenu();
            choice=validMenuChoice(scanner);
            switch (choice){
                case 1:
                    Conversion(scanner,converter,"SEK","USD");
                    break;
                case 2:
                    Conversion(scanner,converter,"USD","SEK");
                    break;
                case 3:
                    Conversion(scanner,converter,"SEK","Euro");
                    break;
                case 4:
                    Conversion(scanner,converter,"Euro","SEK");
                    break;
                case 0:
                    System.out.println("Exiting! Good bye!");
                    break;
                default:
                    System.out.println("Invalid Options.Try again.");
            }

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

      public static void Conversion(Scanner scanner,CurrencyConverter convert,String from,String To){

          double amount=validationForAmount(scanner,from);
          double result=convert.convertCurrency(from,To,amount);
          convert.displayResult(from,To,amount,result);


      }
}
