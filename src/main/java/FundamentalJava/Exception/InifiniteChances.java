package FundamentalJava.Exception;

import java.util.Scanner;

public class InifiniteChances
{
    String Content="The throw keyword is used to create a custom error.Throw is followed by instance of exception Class.";
    public void Infinite()
    {
        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("Which index of value you want-first index");
            int first=scan.nextInt();
            System.out.println("Which index of value you want-Last index");
            int last=scan.nextInt();
            System.out.println(Content.substring(first,last));
        }
        catch (StringIndexOutOfBoundsException siobe)
        {
            System.out.println(siobe+" please less then"+Content.length());
            throw siobe;
        }
    }

    public static void main(String[] args)
    {
        InifiniteChances chance=new InifiniteChances();

        try
        {
            chance.Infinite();
        }
        catch (StringIndexOutOfBoundsException siobe)
        {
            System.out.println(siobe);
            chance.Infinite();
        }
    }
}
