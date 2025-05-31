package ConnectingDots;
import java.util.Scanner;
public class Connectingdots {




public static void Connecting(char[][]arr,int i,int j, boolean visited[][],char fv)
{

int f=0;
int newi[]={0,-1,1,0} ;  

int newj[]={1,0,0,-1};
while(f<4)
{
    if(fv==arr[newi[f]+i][newj[f]+j])
    {
        Connecting(arr, newi[f]+i, newj[f]+j, visited, fv);
    }

}



}



public static boolean helper(char[][]arr)
{
boolean visited[][]=new boolean[arr.length][arr[0].length];
int i=0;
while(i<arr.length)
{
    int j=0;
    while(j<arr[0].length)
    {
       boolean ans= Connecting(arr,i,j,visited,arr[i][j]);
       if(ans==true)
       {
        return true;
       }
       j++;
    }
    i++;
}
return false;





}

    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();;
        String[]board={"AAAA","ABCA","AAAA"};
        char arr[][]=new char[n][m];
        int i=0;
        while(i<n)
        {
            int j=0;
            while(j<m)
{
    arr[i][j]=board[i].charAt(j);
    j++;
}   
i++;             
            
        }
        helper(arr);
           
    }
}
