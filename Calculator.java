import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Calculator {

    static Scanner sc=new Scanner(System.in);

    private static void add() {
        System.out.println("Enter a no to add :");
        float a=sc.nextFloat();
        System.out.println("Enter the no to add :");
        float b=sc.nextFloat();
        System.out.println("The Summation is : "+(a+b));
    }

    private static void sub() {
        System.out.println("Enter a no to subtract from :");
        float a=sc.nextFloat();
        System.out.println("Enter the no to subtract :");
        float b=sc.nextFloat();
        System.out.println("The Difference is : "+(a-b));
    }

    private static void mul() {
        System.out.println("Enter a no to base :");
        float a=sc.nextFloat();
        System.out.println("Enter the no to multiply :");
        float b=sc.nextFloat();
        System.out.println("The Product is : "+(a*b));
    }

    private static void div() {
        System.out.println("Enter a no to divident :");
        float a=sc.nextFloat();
        System.out.println("Enter the no to divisor :");
        float b=sc.nextFloat();
        if(b==0)
        {
            System.out.println("Division cannot take place as the divisor is 0");
        }
        else {
            System.out.println("The Quotient is  : " + (a / b));
            System.out.println("The Remainder is : " + (a % b));
        }
    }

    public static void main(String[] args) {

        System.out.println("--------CALCULATOR----------");
        System.out.println("Press 1 to ADD      : ");
        System.out.println("Press 2 to SUBTRACT : ");
        System.out.println("Press 3 to MULTIPLY : ");
        System.out.println("Press 4 to DIVIDE   : ");
        System.out.println();
        switch (sc.nextInt()){
            case 1: add();
                    break;
            case 2: sub();
                break;
            case 3: mul();
                break;
            case 4: div();
                break;
            default:System.out.println("Invalid Input........");
        }
    }
}
