package GetPathBFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GetPath {



public static void getpath(int[][]arr,int fv,int lv,boolean[] visited)
{HashMap<Integer,Integer>h1=new HashMap<>();
Queue<Integer>q1=new LinkedList<>();
q1.add(fv);
visited[fv]=true;
while(q1.size()!=0)
{
int front=q1.remove();
int i=0;
    while(i<arr.length)
    {
    if(arr[front][i]==1 && visited[i]==false)
   {h1.put(i,front);
    visited[i]=true;
    q1.add(i);
    if(i==lv)
    {
   int a=lv;
   System.out.println(a);
while(a!=fv)
{
a=h1.get(a);
System.out.println(a);

}   
return;
    }
  
   }
   i++;
    }


}
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
            int fv=s.nextInt();
            int lv=s.nextInt();
            arr[fv][lv]=1;
            arr[lv][fv]=1;
            i++;
        }
        boolean[] visited=new boolean[v];
        int fv=s.nextInt();
        int lv=s.nextInt();
          getpath(arr,fv,lv,visited);
    }
}
