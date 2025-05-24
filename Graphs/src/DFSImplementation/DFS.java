package DFSImplementation;
import java.util.Scanner;
public class DFS {

public static void printhelper(int[][]arr,int sv,boolean []visitor)
{
System.out.println(sv);
visitor[sv]=true;

int i=0;
while(i<arr.length)
{
    if(arr[sv][i]==1&&visitor[i]==false)
    {
        printhelper(arr,i,visitor);
    }
    i++;
}
}
public static void print(int [][]arr)
{
    boolean visitor[]=new boolean[arr.length];
    int i=0;
    while(i<visitor.length)
    {
        if(visitor[i]==false)
        {
    printhelper(arr,i,visitor);

}
i++;
    }
}

    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int e=s.nextInt();
        int arr[][]= new int[n][n];
        int i=0;
        while(i<e)
        {
            int fv=s.nextInt();
            int sv=s.nextInt();
            arr[fv][sv]=1;
            arr[sv][fv]=1;
            i++;
        }
        print(arr);

    }
}
