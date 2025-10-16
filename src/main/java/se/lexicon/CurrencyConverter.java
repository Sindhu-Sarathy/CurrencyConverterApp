package se.lexicon;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrencyConverter {
    private static final DecimalFormat df=new DecimalFormat("0.00");

    public double convertCurrency(String from,String to,double amount){
        double result=0;
        if(from.equals("SEK") && to.equals("USD")){
            result = amount * 0.11;
        }
        else if(from.equals("USD")&& to.equals("SEK")){
            result = amount * 9.46;
        }
        else if(from.equals("SEK")&& to.equals("Euro")){
            result = amount * 0.91;
        }
        else if(from.equals("Euro")&& to.equals("SEK")){
            result = amount * 11.03;
        }
        else{
            System.out.println("Conversion is not supported.");
        }

        return result;
    }

    public void displayResult(String from,String to,double amount,double result){
        String dateTime= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("------------------------------");
        System.out.println("The Result is: ");
        System.out.println(df.format(amount)+" "+ from +"="+ df.format(result) +" "+ to);
        System.out.println("Date and Time: "+dateTime);
        System.out.println("------------------------------");
    }
}
