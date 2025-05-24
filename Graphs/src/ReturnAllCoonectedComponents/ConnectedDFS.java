package ReturnAllCoonectedComponents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ConnectedDFS {

    
public static ArrayList<Integer> ConnectedDFS(int[][]arr,int fv,boolean[]visited,ArrayList arr2)
{
    visited[fv]=true;
    int i =0;
    while(i<arr.length)
    {
        if(arr[fv][i]==1&&visited[i]==false)
        {
  arr2.add(i);
            ConnectedDFS(arr,i,visited,arr2);
        }
        i++;
    }
return arr2;
}



    public static ArrayList<ArrayList<Integer>> helper(int[][]arr,int fv)
    {
        if(arr.length==0)
    {
        return null;
    }

    ArrayList<ArrayList<Integer>>arr1=new ArrayList<>();
    boolean Visited[]=new boolean[arr.length];
int i=0;
while(i<Visited.length)
{
if(Visited[i]==false)
{ArrayList<Integer>arr2=new ArrayList<>();
    arr2.add(i);
    ArrayList<Integer>arr3=ConnectedDFS(arr,i,Visited,arr2);
    arr1.add(arr3);
}
i++;


}
return arr1;
   
  
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





ArrayList<ArrayList<Integer>> arr1=helper(arr,0);
if(arr1!=null)
{
 i=0;
while(i<arr1.size())
{
int f=0;
Collections.sort(arr1.get(i));
while(f<arr1.get(i).size())
{
System.out.print(arr1.get(i).get(f)+" ");
f++;
}
System.out.println();
i++;
}

}
    }
}