package FundamentalJava.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class DemoSecurewrite
{
    public static void main(String[] args) throws IOException
    {
        File file=new File("E:\\RohiniMohanavel&Tamil\\src\\main\\java\\FundamentalJava\\Files\\securewriting.txt");

//        file.createNewFile();
//        System.out.println(file.getName()+" has file is created successfully");

        FileOutputStream fos=new FileOutputStream(file);

        DeflaterOutputStream  dos=new DeflaterOutputStream(fos);

        Scanner scan=new Scanner(System.in);
        System.out.println("Please which value you want added in your file");
        String content=scan.nextLine();

        dos.write(content.getBytes());

        dos.close();
        fos.close();

    }
}
