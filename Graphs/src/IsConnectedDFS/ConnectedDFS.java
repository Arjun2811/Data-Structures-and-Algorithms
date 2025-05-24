package IsConnectedDFS;
import java.util.Scanner;
public class ConnectedDFS {



public static void IsConnected(int[][]arr,int fv,boolean[]visited,int i)
{
    if(i>=arr.length)
    {
        visited[fv]=true;
    return;
    }
    visited[fv]=true;

    int f=0;
    while(f<arr.length)
    {
        if(arr[fv][f]==1&&visited[f]==false)
        {
            
            IsConnected(arr,f,visited,i+1);
        }
        f++;
    }

}
public static boolean helper(int[][]arr,int fv,boolean[]visited,int i)
{
    if(arr.length==0||arr.length==1)
{
    return true;
}

IsConnected(arr,fv,visited,i);
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



boolean ans=helper(arr,0,visited,1);
System.out.println(ans);


        
    }
}
