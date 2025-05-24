package KrushkalImplementation;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Krushkal {




public static int findparent(int v,int[]parent)
{if(parent[v]==v)
    {
        return v;
    }


   int ans= findparent(parent[v], parent);
   return ans;

}
public static void print( Edge[]output)
{
    int i=0;
    while(i<output.length)
    {
        if(output[i].source<output[i].destination)
        {
System.out.println(output[i].source+" "+output[i].destination+" "+output[i].weight);
        }
        else{
            System.out.println(output[i].destination+" "+output[i].source+" "+output[i].weight);

        }

        i++;
    }
}



public static Edge[] Krushkal(Edge[]input,int v,int e)
{
Edge output[]=new Edge[v-1];
int count=0;//output arr count
int i=0;//input arr count
int parent[]=new int[v];
int f=0;
while(f<v)
{
    parent[f]=f;
    f++;
}
while(count!=v-1)
{
int parent1=findparent(input[i].source,parent);
int parent2=findparent(input[i].destination,parent);

if(parent1!=parent2)
{
    //  output[count]= new Edge();
     output[count]=input[i];
     parent[parent1]=parent2;
    count++;
}
i++;
}
return output;
}


public static void takeinput()
{
    Scanner s = new Scanner(System.in);
    int v=s.nextInt();
    int e=s.nextInt();

    Edge input[]=new Edge[e];
    int i=0;
    while(i<e)
    {
        input[i]=new Edge();
        input[i].source=s.nextInt();
        input[i].destination=s.nextInt();
        input[i].weight=s.nextInt();
        i++;
    }
    Arrays.sort(input);

   Edge output[] =Krushkal(input,v,e); 
   print(output);
}


    public static void main(String[]args)
    {
        takeinput();
    }
}
