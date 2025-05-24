package DFSImplementation;
import java.util.Scanner;
public class DFS2 {

public static void print(int[][]arr,int sv,boolean[]visitor)
{
    System.out.println(sv);
visitor[sv]=true;
    int i=0;
    while(i<arr.length)
    {
        if(arr[sv][i]==1 && visitor[i]==false)
        {
            print(arr,i,visitor);
        }
        i++;
    }

}
public static void printhelper(int[][]arr)
{
    boolean visitor[]=new boolean[arr.length];
    int i=0;
    while(i<visitor.length)
    {
        if(visitor[i]==false)
        {
          print(arr,i,visitor);
        }
        i++;
    }

}
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int v=s.nextInt();
        int e =s.nextInt();
        int arr[][]= new int[v][v];
        int i=0;
        while(i<e)
        {
            int fv=s.nextInt();
            int lv=s.nextInt();

            arr[fv][lv]=1;
            arr[lv][fv]=1;
            i++;
        }
        printhelper(arr);

    }
}
