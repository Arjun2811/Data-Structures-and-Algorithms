package HASPATH;
import java.util.Scanner;
public class HASPATHDFS {
public static boolean haspathbyDFS(int[][]arr,int sv,int lv,boolean []visited)
{
    

    if(arr[sv][lv]==1)
    {
        return true;
    }

int i=0;
boolean ans=false;
while(i<arr.length)
{
    if(arr[sv][i]==1&& visited[i]==false)
    {
        visited[i]=true;
         ans=haspathbyDFS(arr, i, lv,visited);
         if(ans==true)
         {
            return true;
         }
    }
    i++;
}
return ans;
}
    public static void main(String[]args)
    {

Scanner s = new Scanner(System.in);
int v=s.nextInt();
int e=s.nextInt();


        int arr[][]=new int[v][v];
        int i=0;
        while(i<e)
        {
            int sv=s.nextInt();
            int lv=s.nextInt();

            arr[sv][lv]=1;
            arr[lv][sv]=1;
            i++;
        }
       boolean visited[]=new boolean[arr.length];
       int sv=s.nextInt();
    visited[sv]=true;
int lv=s.nextInt();
       boolean ans= haspathbyDFS(arr,sv,lv,visited);
       System.out.println(ans);
    }
}
