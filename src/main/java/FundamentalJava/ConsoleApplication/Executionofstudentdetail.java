package FundamentalJava.ConsoleApplication;

public class Executionofstudentdetail  implements ZealousCustomerDetailsPerforamance
{
    ZealousCustomerDetails [] studentdetails=new ZealousCustomerDetails[10];//Array Declaration

    public Executionofstudentdetail()//Default constuctor
    {
        studentdetails[0]=new ZealousCustomerDetails("Manojkumar",1.30,9789355930l,"Java Full Stack developer",28000.0f,"Razak");
        studentdetails[1]=new ZealousCustomerDetails("Saipavi",1.00,782798788722l,"Python Stack dveeloper",20000.0f,"Razak");
        for(int i=0;i<studentdetails.length;i++)
        {
            System.out.println(studentdetails[i]);
        }
    }


    public static void main(String[] args)
    {

        Executionofstudentdetail execution=new Executionofstudentdetail();


    }

    @Override
    public String addcustomerdetail(ZealousCustomerDetails zealous)
    {

        return null;
    }

    @Override
    public void listallcostomerdetails()
    {

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
