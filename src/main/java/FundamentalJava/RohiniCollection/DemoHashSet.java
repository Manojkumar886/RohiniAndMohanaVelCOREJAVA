package FundamentalJava.RohiniCollection;

import java.util.HashSet;

public class DemoHashSet
{
    public static void main(String[] args)
    {
//        set is not added in duplicates values,random order
        HashSet<String>  chocolatename=new HashSet<String>();

        chocolatename.add("Nestle");
        chocolatename.add("Nestle");
        chocolatename.add("Vicks");
        chocolatename.add("Koipko");
        chocolatename.add("DiaryMilk");
        chocolatename.add("Kit Kat");
        chocolatename.add("Orea");
        chocolatename.add("Park");

        System.out.println(chocolatename);

    }
}
