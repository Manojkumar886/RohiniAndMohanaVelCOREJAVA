package FundamentalJava.Interface;

public interface Kidding extends  Sleepable
{
    public void DemoKidding(); //no implements

    public static void main(String[] args)
    {
        Kidding ok=new Kidding()
        {
            public void DemoKidding()
            {

            }
            public void DemoSleep()
            {

            }

        };
    }
}
