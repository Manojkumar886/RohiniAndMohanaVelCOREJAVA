package FundamentalJava.RohiniCollection;

import java.util.Stack;

public class DemoStack
{
    public static void main(String[] args)
    {
        Stack<Character> object=new Stack<Character>();//non-generic

//        First in last out(push/add,pop-deleted by last element,peek-top of the element will be get a value,

        object.push('R');
        object.push('o');
        object.push('h');
        object.push('i');
        object.push('n');
        object.push('i');
        object.push('A');
        System.out.println(object);

        object.pop();
        System.out.println(object);
        System.out.println(object.peek());

        System.out.println(object.search('o'));

        System.out.println(object.empty());//object are empty(true) or not empty(false)
    }
}
