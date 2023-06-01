package FundamentalJava;

public class DemoStringBuffer
{
    public static void main(String[] args)
    {
        String AccountHolder="Manojkumar Madheswaran";

//        String on=new String("Pavithra");
//        on=on.concat("R");
//        System.out.println(on);

        StringBuilder Sbuilder=new StringBuilder("Mohanavel");

        Sbuilder.append("MOhan");//MohanavelMohan
        System.out.println(Sbuilder);

        Sbuilder.insert(9,"Cousin");
        System.out.println(Sbuilder);//MohanavelCosuinMohan

        Sbuilder.replace(9,14,"Iswarya");
        System.out.println(Sbuilder);//MohanavelIswarayaMohan
        System.out.println(Sbuilder);//MohanavelIswarayaMohan

        System.out.println(Sbuilder.reverse());//nahOMnayrawsIlevanahoM
        System.out.println(Sbuilder.reverse());//MohanavelIswarayaMohan

        Sbuilder.delete(17,22);
        System.out.println(Sbuilder);



        StringBuffer SBuffer=new StringBuffer("Rohini");
        SBuffer.append("HariShankar");//RohiniHarishankar
        System.out.println(SBuffer);

        SBuffer.insert(6,"Rithish");//RohiniRithishHarishankar
        System.out.println(SBuffer);

        System.out.println(SBuffer.reverse());//raknahSiraHhsihtiRinihoR

        System.out.println(SBuffer.reverse());//RohiniRithishHarishankar

        SBuffer.delete(6,13);
        System.out.println(SBuffer);


    }
}
