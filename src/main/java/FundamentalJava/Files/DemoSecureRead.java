package FundamentalJava.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class DemoSecureRead
{
    public static void main(String[] args)  throws IOException
    {
        File file=new File("E:\\RohiniMohanavel&Tamil\\src\\main\\java\\FundamentalJava\\Files\\securewriting.txt");

        FileInputStream fis=new FileInputStream(file);

        InflaterInputStream iis=new InflaterInputStream(fis);

        byte  [] mycontent=new byte[fis.available()];

        iis.read(mycontent);

        System.out.println(new String(mycontent));
        iis.close();
        fis.close();


    }
}
