package FundamentalJava.RohiniCollection;

import java.util.HashMap;
import java.util.Hashtable;

public class DemoHashTableandHashMap
{
    public static void main(String[] args)
    {

        HashMap<String,String>  object=new HashMap<String,String>();

        object.put("Zealous Academy","Manojkumar");
        object.put("Zealous Tech Corp","Razak");
        object.put("Agonda","Booking Platform");

        System.out.println(object);


        Hashtable<String,String> object1=new Hashtable<>();

        object1.putAll(object);
        object1.put("LiveWare","annamalai");

        System.out.println("Hash Table Values :"+object1);

    }
}
