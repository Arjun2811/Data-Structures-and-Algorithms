package DijkstrasAlgorithm;
import java.util.Scanner;
public class Djiktras {




public static void print(int[]distance)
{


    int i=0;
    while(i<distance.length)
    {
        System.out.println(i+" "+distance[i]);
        i++;
    }
}



    public static int findminvertex(int distance[],boolean visited[])
    {

        int v=visited.length;
        int minvertex=-1;
        int i=0;
        int mindistancevalue=Integer.MAX_VALUE;
        while(i<v)
        {
            if(distance[i]<mindistancevalue&&visited[i]==false)
            {
mindistancevalue=distance[i];
minvertex=i;
            }
            i++;
        }
        return minvertex;
    }

public static void Djiktra(int[][]arr)
{
    int v=arr.length;
    boolean visited[]=new boolean[v];
    int distance[]=new int[v];
    distance[0]=0;
    int i=1;
    while(i<v)
    {
        distance[i]=Integer.MAX_VALUE;
        i++;
    }
    i=0;
    while(i<v-1)
    {
       int minvertex= findminvertex(distance,visited);
       visited[minvertex]=true;
       int f=0;
       while(f<v)
       {
        if(arr[minvertex][f]!=0&&visited[f]==false&&distance[minvertex]!=Integer.MAX_VALUE)//last condition" distance[minvertex]!=Integer.MAX_VALUE " i don't have a neeed just put for a safer side this condition will not be used
        {
            int ans=distance[minvertex]+arr[minvertex][f];
            if(ans<distance[f])
            {
                distance[f]=ans;
            }
        }
        f++;
       }


i++;

    }
print(distance);
}
   


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v=s.nextInt();
        int e=s.nextInt();

        int arr[][]= new int[v][v];
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
        Djiktra(arr);
        
    }
}
