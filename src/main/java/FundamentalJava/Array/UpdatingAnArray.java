package FundamentalJava.Array;
import java.util.Arrays;
import java.util.Scanner;
public class UpdatingAnArray
{
    public static void main(String[] args)
    {
        Long ElectricityBillNo[]={875466387617873l,3877636536722l,832763657663l,472767635267367378l,678673676737672l,127873882l};
        int startingValue=0;
        int endvalue=3;
        int count=1;
        for(;startingValue<endvalue;startingValue++)
        {
            System.out.println("count no :"+count);
            System.out.println(ElectricityBillNo[startingValue]);
            count++;
        }
//        replacingInArray(ElectricityBillNo);
//        int pos=1;
//        long newvalue=75675265625622l;
//        ElectricityBillNo[pos]=newvalue;
//        for(long bill:ElectricityBillNo)
//        {
//            System.out.print(bill+",");
//        }


//        Scanner scan=new Scanner(System.in);
//        System.out.println("which pos of value you want");
//        int pos=scan.nextInt();
//        System.out.println("you are choose to pos no is :"+pos+" in this pos of value is "+ElectricityBillNo[pos]);
    }
    public static void replacingInArray(Long[] EBBILL)
    {
        System.out.println("before updating an Eb bill statement"+ Arrays.toString(EBBILL));
        Scanner scan=new Scanner(System.in);
        System.out.println("which index of EB Bill value ");
        int index=scan.nextInt();
        System.out.println(EBBILL[index]+" in this no is your EB bill no,you edit this bill no,");
        Long newvalue=scan.nextLong();
        EBBILL[index]=newvalue;
        System.out.println("After updating an Eb bill statement"+ Arrays.toString(EBBILL));
    }
}
