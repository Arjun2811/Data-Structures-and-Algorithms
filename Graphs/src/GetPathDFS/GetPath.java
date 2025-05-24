package GetPathDFS;
import java.util.ArrayList;
import java.util.Scanner;
public class GetPath {

public static ArrayList getpath(int[][]arr,int fv,int lv,boolean[]visited)
{
    if(fv==lv)
    {  
        ArrayList<Integer>path=new ArrayList<>();
        path.add(fv);
        return path;
    }


  visited[fv]=true;

int i=0;
while(i<arr.length)
{
if(arr[fv][i]==1&&visited[i]==false)
{

ArrayList<Integer>path=getpath(arr, i, lv, visited);
if(path!=null)
{
path.add(fv);
return path;
}

}
i++;
}
return null;
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
ArrayList<Integer>ansarr=getpath(arr,fv,lv,visited);
if(ansarr!=null)
{
i=0;
while(i<ansarr.size())
{
    System.out.println(ansarr.get(i));
    i++;
}

    }
}
}
