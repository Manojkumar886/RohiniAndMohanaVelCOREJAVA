package FundamentalJava.Exception;

import java.io.IOException;
import  java.lang.Runtime;
public class CompiletimeException
{
    public static void main(String[] args)
    {
     Runtime run=Runtime.getRuntime();

     Process pro;

     try
     {
         pro=run.exec("notepad");
         Thread.sleep(10000);
         pro=run.exec("mspaint");
     }
     catch(IOException ioException)
     {
     }
     catch(InterruptedException ie)
     {

     }



    }
}


//class sample
//{
//    static sample sam=new sample();
//
//    public static sample getsample()
//    {
//        return sam;
//    }
//}





//class Runtime
//{
//    public Runtime()//def constructor
//    {
//
//    }
//
//    private static Runtime run=new Runtime();
//
//    public static Runtime getRuntime()
//    {
//        return  run;
//    }
//
//}