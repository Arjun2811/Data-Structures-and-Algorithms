package BFSImplementation;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BFS {


public static void BFS(int[][]arr,int sv,boolean[]newarr)
{
Queue<Integer> q1 = new LinkedList<>();
q1.add(sv);
newarr[sv]=true;

while(q1.size()!=0)
{int i=0;
    sv=q1.peek();
System.out.println(sv);
q1.remove(sv);
while(i<arr.length)
{
if(arr[sv][i]==1&&newarr[i]==false)
{

q1.add(i);
newarr[i]=true;

}

    i++;
}




}
}





public static void printhelper(int[][]arr,int sv)
{
boolean newarr[]=new boolean[arr.length];
int i=0;
while(i<arr.length)
{
    if(newarr[i]==false)
    {

    BFS(arr,i,newarr);


    }
    i++;
}





}






public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    int v=s.nextInt();
    int e=s.nextInt();

    int [][]arr= new int[v][v];
    int i=0;
    while(i<e)
    {
        int sv=s.nextInt();
        int lv=s.nextInt();

        arr[sv][lv]=1;
        arr[lv][sv]=1;

        i++;
    }
    printhelper(arr,0);



}


}
