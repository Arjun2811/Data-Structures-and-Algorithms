package HASPATH;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HASPATHBFS {

public static boolean haspathbyBFS(int[][]arr,int sv,int lv,boolean[]visited)
{
Queue<Integer>q1=new LinkedList<>();
q1.add(sv);
visited[sv]=true;

while(q1.size()!=0)
{
    int front=q1.peek();
    if(front==lv)
    {
        return true;
    }
    q1.remove();
    int i=0;
while(i<arr.length)
{
if(arr[front][i]==1&&visited[i]==false)
{
    q1.add(i);
    visited[i]=true;

}
i++;


}
}


return false;



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
       boolean ans= haspathbyBFS(arr,sv,lv,visited);
       System.out.println(ans);

    
}
}
