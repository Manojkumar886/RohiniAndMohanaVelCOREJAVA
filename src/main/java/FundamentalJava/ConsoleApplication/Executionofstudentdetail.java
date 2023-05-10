package FundamentalJava.ConsoleApplication;

import java.util.Scanner;

public class Executionofstudentdetail  implements ZealousCustomerDetailsPerforamance
{
    ZealousCustomerDetails [] studentdetails=new   ZealousCustomerDetails[10];
//        {
//            System.out.println(studentdetails[i]);
//        }ZealousCustomerDetails[10];//Array Declaration

    public Executionofstudentdetail()//Default constuctor
    {
        studentdetails[0]=new ZealousCustomerDetails("Manojkumar",1.30,9789355930l,"Java Full Stack developer",28000.0f,"Razak");
        studentdetails[1]=new ZealousCustomerDetails("Saipavi",1.00,782798788722l,"Python Stack dveeloper",20000.0f,"Razak");
    }


    public static void main(String[] args)
    {

        Executionofstudentdetail execution=new Executionofstudentdetail();//Constructor
        Scanner scan=new Scanner(System.in);
        do
        {
            System.out.println("Welcome to Zealous Academy");
            System.out.println("which process you want work this"+"\n1.AddnewStudentdetails\n2.Listallstudentdetails\n3.updatestudentdetails\n4.deletecustomerdetail\n5.sortingstudentdetails");
            int usage=scan.nextInt();
            switch (usage)
            {
                case 1:
                    System.out.println("adding new student details"+"\nStudentname\tHours\tStudentMobileno\tCoursedetail\tprice\tInchangeName");
                    ZealousCustomerDetails customer1=new ZealousCustomerDetails(scan.next(), scan.nextDouble(), scan.nextLong(),scan.next(), scan.nextFloat(), scan.next());
                    execution.addcustomerdetail(customer1);
                    break;
                case 2:
                    System.out.println("List all you values ");
                    execution.listallcostomerdetails();

            }


        }
        while (true);


    }

    @Override
    public String addcustomerdetail(ZealousCustomerDetails zealous)
    {
        for(int pos=0;pos<studentdetails.length;pos++)
        {
            if(studentdetails[pos]==null)
            {
                studentdetails[pos]=zealous;
                System.out.println(zealous.getStudentName()+" has been added in our studentdetails");
                break;
            }
        }
        return zealous.getStudentName()+" has not been added ";
    }

    @Override
    public void listallcostomerdetails()
    {
        for(ZealousCustomerDetails customers:studentdetails)
        {
            System.out.println(customers);
        }

    }

    @Override
    public String updatecustomerdetail(String Studentname)
    {
        return null;
    }

    @Override
    public String deletecustomerdetail(String Studentname)
    {
        return null;
    }

    @Override
    public float sortingcustomerdetail(float pricevalue)
    {
        return 0;
    }
}
