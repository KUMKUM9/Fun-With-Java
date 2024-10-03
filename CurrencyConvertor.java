import java.util.Scanner;
public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome! which currency you would like to convert");
        System.out.println("1 is for rupee to other convertor");
        System.out.println("2 is for dollar to other convertor");
        System.out.println("3 is for pound to other convertor");
        System.out.println("4 is for euro to other convertor");
        int currency = sc.nextInt();
        System.out.println("Enter the amount you want to convert:");
        double amount = sc.nextDouble();
        switch (currency) {
            case 1:
                convert_from_rupee_to_other(amount);
                break;
            case 2:
                convert_from_dollar_to_other(amount);
                break;
            case 3:
                convert_from_pound_to_other(amount);
                break;
            case 4:
                convert_from_euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid currency!!");
        }
    }

    public static void convert_from_rupee_to_other(double amount){
        System.out.println("1 rupee = "+0.012+" Dollar");
        System.out.println("So "+amount+" rupee = "+0.012*amount+" $");

        System.out.println("1 rupee = "+0.011+" Euro");
        System.out.println("So "+amount+" rupee = "+0.011*amount+" euro");

        System.out.println("1 rupee = "+0.009+" Pound");
        System.out.println("So "+amount+" rupee = "+0.009*amount+" pound");

        System.out.println("1 rupee = "+15.888+" Won");
        System.out.println("So "+amount+" rupee = "+15.888*amount+" won");
    }

    public static void convert_from_dollar_to_other( double amount){
        System.out.println("1 dollar = "+83.948+" rupee");
        System.out.println("So "+amount+" dollar = "+83.948*amount+" rupee");

        System.out.println("1 dollar = "+0.906+" Euro");
        System.out.println("So "+amount+" dollar = "+0.906*amount+" euro");

        System.out.println("1 dollar = "+0.762+" Pound");
        System.out.println("So "+amount+" dollar = "+0.762*amount+" pound");

        System.out.println("1 dollar = "+1335.08+" Won");
        System.out.println("So "+amount+" dollar = "+1335.08*amount+" won");
    }

    public static void convert_from_pound_to_other(double amount){
        System.out.println("1 pound = "+1.312+" Dollar");
        System.out.println("So "+amount+" pound = "+1.312*amount+" $");

        System.out.println("1 pound = "+1.188+" Euro");
        System.out.println("So "+amount+" pound = "+1.188*amount+" euro");

        System.out.println("1 pound = "+110.103+" rupee");
        System.out.println("So "+amount+" pound = "+110.103*amount+" rupee");

        System.out.println("1 pound = "+1749.03+" Won");
        System.out.println("So "+amount+" pound = "+1749.03*amount+" won");
    }

    public static void convert_from_euro_to_other(double amount){
        System.out.println("1 euro = "+1.104+" Dollar");
        System.out.println("So "+amount+" euro = "+1.104*amount+" $");

        System.out.println("1 euro = "+92.650+" rupee");
        System.out.println("So "+amount+" euro = "+92.650*amount+" rupee");

        System.out.println("1 euro = "+0.842+" Pound");
        System.out.println("So "+amount+" euro = "+0.842*amount+" pound");

        System.out.println("1 euro = "+1472.3+" Won");
        System.out.println("So "+amount+" euro = "+1472.3*amount+" won");
    }

}
