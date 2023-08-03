package FundamentalJava.String;

public class DemoStringclasses
{
    public static void main(String[] args)
    {
//        String is class .its is immutable class
        String name="Manojkumar";//Literal
        String name1=new String("manojkumar");
        String studentname=new String("Tamilarasan");//non literal

        studentname=studentname.concat(name);//immutable
        System.out.println(studentname);
//        System.out.println(studentname.concat(name));

//        System.out.println( name.charAt(3));
//        System.out.println(name.equalsIgnoreCase(name1));
        System.out.println(name.compareToIgnoreCase(name1));
//        System.out.println(name.startsWith("Man"));
//        System.out.println(name.endsWith("Man"));
//        name1=name1.replace("manojkumar","Rohini");
//        System.out.println(name1);
//        System.out.println(studentname.substring(5));
//        System.out.println(studentname.substring(5,11));
        System.out.println(studentname.contains("arasan"));

        String execution="      String is basicallly an object that represents sequnace of character values.     ";
        System.out.println(execution.trim());

        String changingvalue="String is basicallly an object that represents sequnace of character values.";
        String chaning[]=changingvalue.split(" ");

        for(String a:chaning)
        {
            System.out.print(a+"@");
        }
    }
}
