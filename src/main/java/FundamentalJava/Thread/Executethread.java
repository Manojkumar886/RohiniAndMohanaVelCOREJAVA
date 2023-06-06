package FundamentalJava.Thread;

public class Executethread
{
    public static void main(String[] args) throws InterruptedException//main method-Thread
    {
        animal ani=new animal();
        ani.start();//Thread is startedq
        System.out.println(ani.isAlive());
        ani.join();
        System.out.println(ani.isAlive());
        birds bri=new birds();
        Thread th=new Thread(bri);
        th.start();
        th.join();

        System.out.println("This class is main method");
    }
}
class animal extends Thread
{
    public void run()
    {
        for(int i=0;i<=4;i++)
        {
            System.out.println("Welcome to Thread Execution Class");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}


class birds implements Runnable
{
    public void run()
    {
        for(int i=0;i<=4;i++)
        {
            System.out.println("Count no :"+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}