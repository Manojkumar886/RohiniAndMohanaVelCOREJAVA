package FundamentalJava.ConsoleApplication;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionProcess implements ZealousCustomerDetailsPerforamance,Runnable
{
    TreeSet<ZealousCustomerDetails> zealous=new TreeSet<ZealousCustomerDetails>();
    public CollectionProcess()
    {
        zealous.add(new ZealousCustomerDetails("Tamilarasan",2.00,9789355930l,"Java Full Stack Developer",30000.0f,"RazakSR"));
        zealous.add(new ZealousCustomerDetails("Mohanavel",1.00,9345755930l,"C++ Full Stack Developer",30000.0f,"Annamalai"));
        zealous.add(new ZealousCustomerDetails("Manoj",1.30,8909355930l,"Python Full Stack Developer",30000.0f,"Manikandan"));
    }

    synchronized public void run() {
        do {
            System.out.println("Welcome to Zealous " + Thread.currentThread().getName());
            CollectionProcess execution = new CollectionProcess();
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to Zealous Academy");
            System.out.println("which process you want work this" + "\n1.AddnewStudentdetails\n2.Listallstudentdetails\n3.updatestudentdetails\n4.deletecustomerdetail\n5.sortingstudentdetails\n6.searchanstduentname");
            int usage = scan.nextInt();
            switch (usage) {
                case 1:
                    System.out.println("adding new student details" + "\nStudentname\tHours\tStudentMobileno\tCoursedetail\tprice\tInchangeName");
                    ZealousCustomerDetails customer1 = new ZealousCustomerDetails(scan.next(), scan.nextDouble(), scan.nextLong(), scan.next(), scan.nextFloat(), scan.next());
                    System.out.println(execution.addcustomerdetail(customer1));
                    break;
                case 2:
                    System.out.println("List all you values ");
                    execution.listallcostomerdetails();
                    break;
                case 3:
                    System.out.println("Which type of studentname details you are updated");
                    String updatenames = scan.next();
                    execution.updatecustomerdetail(updatenames);
                    break;
                case 4:
                    System.out.println("Which name of array you delete in your object");
                    String name = scan.next();
                    execution.deletecustomerdetail(name);
                    break;
                case 5:
                    execution.sortingcustomerdetail();
                    execution.listallcostomerdetails();
                    break;
                case 6:
                    System.out.println("which studnetname details you are seraching..");
                    String studentname = scan.next();
                    execution.Searchcustomerdetails(studentname);
                default:
                    return;
            }
        }while (true) ;
    }

    @Override
    public String addcustomerdetail(ZealousCustomerDetails customer)
    {
        zealous.add(customer);
        return customer.getStudentName()+"\t student joined us our company";
    }

    @Override
    public void listallcostomerdetails()
    {
        Iterator<ZealousCustomerDetails> it= zealous.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    @Override
    public String updatecustomerdetail(String Studentname) {
        return null;
    }

    @Override
    public String deletecustomerdetail(String Studentname) {
        return null;
    }

    @Override
    public void sortingcustomerdetail() {

    }

    @Override
    public String Searchcustomerdetails(String stduentname) {
        return null;
    }
}
