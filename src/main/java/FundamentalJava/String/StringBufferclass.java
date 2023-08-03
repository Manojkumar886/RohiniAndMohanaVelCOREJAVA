package FundamentalJava.String;

public class StringBufferclass
{
    public static void main(String[] args)
    {
//        buffer ,builder
//        thread safe,not safe
//        synchronized,not
//        slow,faster
//        mutable
        StringBuilder obj1=new StringBuilder("Kavitha");
        StringBuffer obj=new StringBuffer("Manojkumar");
        System.out.println(obj);//Manojkumar
        obj.append(" Madheswaran");
        System.out.println(obj);//Manojkumar Madheswaran
        obj.insert(5,"hari");
        System.out.println(obj);//Manojharikumar Madheswaran
        System.out.println(obj.reverse());//narawsehdaM ramukirahjonaM
        System.out.println(obj.reverse());//Manojharikumar Madheswaran
        obj.delete(5,9);
        System.out.println(obj);
        System.out.println(obj);
        obj.replace(0,10,"Pravenkumar");
        System.out.println(obj);
    }
}
