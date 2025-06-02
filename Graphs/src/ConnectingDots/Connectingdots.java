package ConnectingDots;
import java.util.Scanner;
public class Connectingdots {




public static boolean Connecting(char[][]arr,int i,int j, boolean visited[][],char fv,int constanti,int constantj,int pathlength)
{
    // if(constanti==i&&constantj==j&&visited[i][j]==true&&pathlength>=4)
    // {
    //     return true;
    // }
    if(constanti==i&&constantj==j&&visited[i][j]==true&&pathlength<4)
    {
        return false;
    }

    visited[i][j]=true;
int f=0;
int newi[]={0,-1,1,0} ;  

int newj[]={1,0,0,-1};
while(f<4)
{
    if(newi[f]+i>=0&&newi[f]+i<arr.length&&newj[f]+j>=0&&newj[f]+j<arr[0].length&&fv==arr[newi[f]+i][newj[f]+j]&&newi[f]+i==constanti&&newj[f]+j==constantj&&visited[newi[f]+i][newj[f]+j]==true&&pathlength>=3)
    {//the first character or starting of the cycle would be coming here if cycle is forming
    return true;
    }

    if(newi[f]+i>=0&&newi[f]+i<arr.length&&newj[f]+j>=0&&newj[f]+j<arr[0].length&&fv==arr[newi[f]+i][newj[f]+j]&&visited[newi[f]+i][newj[f]+j]==false)
    {
        
       boolean ans= Connecting(arr, newi[f]+i, newj[f]+j, visited, fv,constanti,constantj,pathlength+1);
       if(ans==true)
       {
        return true;
       }
    }
   
    f++;

}
visited[i][j]=false;
return false;



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
       boolean ans= Connecting(arr,i,j,visited,arr[i][j],i,j,0);
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
        boolean ans=helper(arr);
        System.out.println(ans);
           
    }
}
