package FundamentalJava.RohiniCollection;

import java.util.LinkedList;
import java.util.Stack;

public class DemoLinkedList
{
    public static void main(String[] args)
    {
        LinkedList object=new LinkedList();//generic

//        LinkedList<Integer> object1=new LinkedList<Integer>();//Non-generic
//
//        object1.add(99);
//        object1.add(90);
//        object1.add(9000);
//        object1.add(89);

        object.add("Manojkumar");
        object.add(21);
        object.add('M');
        object.add(45.6);
        object.add(9789355930l);
        object.addFirst(true);
        object.add(3,88.9f);

        System.out.println(object+" all values");

        object.remove(4);
        object.remove("Manojkumar");

        System.out.println(object);

        object.set(0,false);
        System.out.println(object+" updated values");

        System.out.println(object.get(3));

        System.out.println(object.getLast());

        System.out.println(object.indexOf(false));

    }

}
