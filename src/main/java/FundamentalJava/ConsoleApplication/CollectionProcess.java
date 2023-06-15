package FundamentalJava.ConsoleApplication;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionProcess implements ZealousCustomerDetailsPerforamance,Runnable
{
    TreeSet<ZealousCustomerDetails>  zealous=new TreeSet<ZealousCustomerDetails>();

    public  CollectionProcess()
    {
        zealous.add(new ZealousCustomerDetails("Manojkumar",2.00,9789355930l,"Java Stack",30000.0f,"Razak"));
    }

    @Override
    public String addcustomerdetail(ZealousCustomerDetails zealous1)
    {
        zealous.add(zealous1);
        return zealous1.getStudentName()+" has been added successfully";
    }

    @Override
    public void listallcostomerdetails()
    {
        Iterator<ZealousCustomerDetails> it= zealous.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    @Override
    public String updatecustomerdetail(String Studentname)
    {
//        Scanner scan=new Scanner(System.in);
//
//        for(int index=0;index< zealous.size();index++)
//        {
//            System.out.println(zealous);
//            if(zealous.equals(Studentname))
//            {
//                System.out.println(studentdetails[index]);
//                System.out.println("which field data you want update");
//                String usage=scan.next();
//                switch (usage)
//                {
//                    case "studentname":
//                        System.out.println("your are choosen student name \n please tell us new value you are replaced");
//                        String newvalue=scan.next();
//                        studentdetails[index].setStudentName(newvalue);
//                        return null;
//                    case "Hours":
//                        System.out.println("you choosen hours value\n please tell us updated hours value");
//                        double newvalue1=scan.nextDouble();
//                        studentdetails[index].setHours(newvalue1);
//                        return studentdetails[index].getStudentName()+" has updated";
//                }
//            }
//        }
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

    @Override
     synchronized public void run()
    {
        System.out.println("Welcome to Zealous "+Thread.currentThread().getName());
        CollectionProcess execution=new CollectionProcess();
        Scanner scan=new Scanner(System.in);
        do {
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
        }while (true);
    }
}
