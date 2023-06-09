package FundamentalJava.Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class DemoMaps
{
    public static void main(String[] args)
    {
//        Random ORder(based on K,v class)
        HashMap<String,Double> obj=new HashMap<String,Double>();
        obj.put("Mohanavel",80.0);
        obj.put("Tamilarasan",90.9);
        obj.put("Manojkumar",81.2);
        obj.put("Pavithra",92.3);
        obj.put("Rohini",99.9);
        obj.put("Annamalai",78.3);
        System.out.println(obj);
        Hashtable<String,Double> obj1=new Hashtable<String ,Double>();
        obj1.putAll(obj);
        obj1.remove("Manojkumar");
        System.out.println(obj1.get("Rohini"));//get a value and key
        System.out.println(obj.containsKey("Manojkumar"));

        System.out.println("Hash Table Values Are"+obj1);
        System.out.println("Hash Table Values Are(Arraychangeing)"+obj1.entrySet());

        for(Map.Entry m:obj.entrySet() )
        {
            System.out.println("my key class is "+m.getKey()+"\t my value class is "+m.getValue());
        }

        TreeMap<String,Studentdetails> obj2=new TreeMap<String ,Studentdetails>();

        Studentdetails stud1=new Studentdetails("Manoj","BCA",2021,82.3);
        Studentdetails stud2=new Studentdetails("Annamalai","BE(CSE)",2017,78.9);

        obj2.put("Manoj",stud1);
        obj2.put("Aaju",stud2);
        for(Map.Entry m:obj2.entrySet() )
        {
            System.out.println("my key class is "+m.getKey()+"\t my value class is "+m.getValue());
        }
    }
}
