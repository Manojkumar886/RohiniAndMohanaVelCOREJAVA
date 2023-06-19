package FundamentalJava.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoInputMisMatchException
{
    public static void main(String[] args)
    {

        try
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("Please enter your age");
            int myage=scan.nextInt();
            System.out.println("my age is :"+myage);
        }
        catch (InputMismatchException ImmException)
        {
            Scanner scan=new Scanner(System.in);
            System.out.println(ImmException+" please enter only numeric values");
            System.out.println("Please enter your age");
            int myage=scan.nextInt();
            System.out.println("my age is :"+myage);
        }
        finally {
            System.out.println("Using Input Mismatch Exception");
        }
    }
}
