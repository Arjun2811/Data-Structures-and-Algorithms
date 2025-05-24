package PrismAlgorithm;
import java.util.Scanner;
public class Prism {


public static void print(int[]parent,int[]weight)
{
int i=1;
while(i<parent.length)
{
if(parent[i]<i)
{
    System.out.println(parent[i]+" "+ i +" "+ weight[i]);
}
else{
    System.out.println( i +" "+parent[i]+" "+weight[i]);
}
i++;
}
}
    public static int findminvertex(int[]weight,boolean visited[])
    {
int minvertexvalue=Integer.MAX_VALUE;
        int i=0;
        int minvertex=-1;
        while(i<weight.length)
        {
            if(weight[i]<minvertexvalue&&visited[i]==false)
            {
                minvertex=i;
          minvertexvalue=weight[i];

            }
            i++;
        }
        return minvertex;

    }
public static void prism(int[][]arr)
{
    int v =arr.length;
    boolean visited[]=new boolean[v];
    int weight[]=new int[v];
    int parent[]=new int[v];
    weight[0]=0;
    int i=1;
    while(i<v)
    {
        weight[i]=Integer.MAX_VALUE;
    i++;
    }
    parent[0]=-1;
    int f=0;
    while(f<v)
    {
   int minvertex= findminvertex(weight,visited);
   visited[minvertex]=true;
    i=0;
   while(i<v)
   {
    if(arr[minvertex][i]!=0&&arr[minvertex][i]<weight[i]&&visited[i]==false)
    {
        weight[i]=arr[minvertex][i];
        parent[i]=minvertex;
    }
    i++;
   }
f++;

}
print(parent,weight);


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
           int w=s.nextInt();
           arr[fv][lv]=w;
           arr[lv][fv]=w;
           i++;
        }
        prism(arr);
    }
}
