package FundamentalJava.Array;

import java.util.Scanner;

public class InsertingAnArray
{
    public static void main(String[] args)
    {
        double [] CGPA=new double[10];
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your class student CGPA-Count:10");
        long billno=8786785675865667l;
        float decimal=8.9f;
        char bloodgroup='B';

        for(int pos=0;pos<CGPA.length;pos++)
        {
            CGPA[9]=7;
            CGPA[2]=6.6;
            CGPA[0]=9.8;
//            CGPA[pos]=scan.nextDouble();
        }

        for(double percentage:CGPA)
        {
            System.out.print(percentage+" ");
        }

    }
}
