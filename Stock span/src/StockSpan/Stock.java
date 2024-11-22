package StockSpan;

public class Stock {

public static int[] Stockspan(int[]arr) 
{
    stackusingArray stack=new stackusingArray();
int i=0;
int count=0;
int f=0;
int n=arr.length;
int output[]=new int[n];
    while(i<n)
    {
stack.push(arr[i]);
i++;
    }

    while(!stack.isempty())
    {
i=stack.size()-2;
count=1;
while((i>=0)&&(arr[i]<stack.Top()))
{
    count++;
    i--;
}
output[f]=count;
f++;
stack.pop();

    }
    i=0;
    int g=n-1;
    int temp[]=new int[n];
    while(i<n)
    {
    temp[i]=output[g];
    i++;
    g--;
    }
    return temp;
}




    public static void main(String[]args) 
    {


        int arr[]={70,50};
        int output[]=Stockspan(arr);
        int i=0;
        while(i<output.length)
        {
            System.out.println(output[i]);
            i++;
        }
    }
}
