package FundamentalJava.RohiniCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class DemoArraylistandVector
{
    public static void main(String[] args)
    {
        ArrayList object=new ArrayList();//generic

        object.add("Manojkumar");
        object.add("Manojkumar");
        object.add(21);
        object.add('M');
        object.add(45.6);
        object.add(9789355930l);
        object.add(true);
        object.add(3,88.9f);

        Vector object1=new Vector();
        object1.addAll(object);
        object1.add("Rohini");
        object1.add(31);
        object1.add(true);
        object1.add(90.09);

        System.out.println("my arrayList Values:"+object);
        System.out.println("my vector values :"+object1);

//        object1.removeAll(object);//same values will be removed
        object1.retainAll(object);//diffeenet values will be removed
        System.out.println("removed process");

        System.out.println("my arrayList Values:"+object);
        System.out.println("my vector values :"+object1);


        Iterator<ArrayList> it=object1.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }



    }
}
