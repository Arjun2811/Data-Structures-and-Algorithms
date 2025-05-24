package ISconnectedBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ISConnected {


public static void IsConnected(int[][]arr,int fv,boolean[]visited)
{

    Queue<Integer> q1= new LinkedList<>();
    q1.add(fv);
    while(q1.size()!=0)
    {
        int front=q1.remove();
        int i=0;
        while(i<arr.length)
        {
          if(arr[front][i]==1&&visited[i]==false)
          {
            visited[i]=true;
            q1.add(i);
          }
          i++;
        }

    }




}



    public static boolean helper(int[][]arr,int fv,boolean[]visited)
    {
        if(arr.length==0||arr.length==1)
    {
        return true;
    }
    
    IsConnected(arr,fv,visited);
    int f =0;
    while(f<arr.length)
    {
        if(visited[f]==false)
        {
          return false;
        }
       f++;
    }
    return true;
    
    
    }

    public static void main(String[]args)
    {

 Scanner s = new Scanner(System.in);
        int v=s.nextInt();
        int e=s.nextInt();
        
int[][]arr= new int[v][v];
int i=0;
while(i<e)
{
    int fv=s.nextInt();
    int lv=s.nextInt();
    arr[fv][lv]=1;
    arr[lv][fv]=1;
    i++;
}

boolean visited[]=new boolean[v];



boolean ans=helper(arr,0,visited);
System.out.println(ans);

    }
}
