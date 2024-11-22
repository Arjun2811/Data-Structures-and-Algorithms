package BinarySearch;
public class Binary {


public static int Binary(int[]arr,int x,int s,int e)
{
   

if(s>e)
{
    return -1;
}


int mid =(s+e)/2;

if(x==arr[mid])
{
    return mid;
}
if(x<arr[mid])
{
    int smallans=Binary(arr,x,s,mid-1);
    return smallans;
}
if(x>arr[mid])
{
    int smallans=Binary(arr,x,mid+1,e);
    return smallans;
}



return 0;



}

public static int Binary(int[]arr,int x)
{
    int s=0;
    int e=arr.length-1;
    int f= Binary(arr,x,s,e);
    return f;
}




    public static void main(String[]args)
    {
        int arr[]={1,2,3,4,5,6,7};
        int x=6;
       int f= Binary(arr,x);
       System.out.println(f);

    }

}
