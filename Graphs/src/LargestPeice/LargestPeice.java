package LargestPeice;
import java.util.Scanner;
public class LargestPeice {




public static int Largest(int[][]arr,int i,int j,boolean visited[][],int consti, int constj,int count)
{//11
//01

    int newi[]={0,-1,1,0} ;  
    int newj[]={1,0,0,-1};
visited[i][j]=true;
    int f=0;
    while(f<4)
    {
       
    if(i+newi[f]>=0&&i+newi[f]<arr.length&&j+newj[f]>=0&&j+newj[f]<arr[0].length&&arr[i+newi[f]][j+newj[f]]==1&&visited[i+newi[f]][j+newj[f]]==false)
    {
       int ans= Largest(arr,i+newi[f],j+newj[f],visited ,consti,constj,count+1);
       visited[i][j]=false;
       return ans;

    }
    f++;
    }
visited[i][j]=false;
return count;



}
public static int helper(int[][]arr)
{ 
    boolean visited[][]=new boolean[arr.length][arr[0].length];
    int i=0;
   int max=Integer.MIN_VALUE;
    while(i<arr.length)
    {
        int j=0;
        while(j<arr[0].length)
        {
            if(arr[i][j]==1)
            {
               int count= Largest(arr,i,j,visited,i,j,1);
               if(max<count)
               {
                max=count;
               }
            }
            j++;
        }
        i++;
    }
    if(max>1)
    {
    return max;
}
return 0;

}

    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
int n=s.nextInt();
String []edge={"100","010","010"};
int [][]arr=new int[n][edge[0].length()];
int i=0;
while(i<edge.length)
{
    int j=0;
    while(j<edge[i].length())
    {
        arr[i][j]=(edge[i].charAt(j))-'0';
        j++;
    }
    i++;
}
int ans=helper(arr);
System.out.println(ans);
    }
}
