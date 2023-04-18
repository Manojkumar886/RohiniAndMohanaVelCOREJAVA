package FundamentalJava.Array;

import java.util.Arrays;

public class ArrayCreation
{
    public static void main(String[] args)
    {
        arraydeclaration();
    }

    public static void arraydeclaration()
    {
        String [] IplTeamName={"csk","mi","Rcb","Kkr","RR","LSG","GT","Punjab"};// compile time declaration

//        System.out.println(IplTeamName); only shown an address values

//        System.out.println(Arrays.toString(IplTeamName));
//        System.out.println(IplTeamName.length);
//
//        for(int index=0;index< IplTeamName.length;index++)
//        {
//            System.out.println(IplTeamName[index]);//Iplteamname[0].Iplteamname[1],Iplteamname[7]
//        }

        for(String teams:IplTeamName)
        {
            System.out.println(teams);
        }
    }
}
