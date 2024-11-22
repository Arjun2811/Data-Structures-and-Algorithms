package RotateArray;
public class Rotate {

//23456
//45623 d=2   s=3
//56234  d=3   s=2
public static void Rotate(int[]arr,int d)
{
    int g=0;
    int n=arr.length;
    int arr2[]=new int[n];
while(g<n)
{
    arr2[g]=arr[g];
    g++;
}
int i=0;
int start=n-d;
while(start<n)
{
    arr[start]=arr2[i];
    i++;
    start++;
}
int f=0;
int end=n-d;
while(f<end)
{
    arr[f]=arr2[i];
    i++;
    f++;
}

    
}






    public static void main(String[]args)
    {
        int arr[]={1,2,3,4,5,6,7};
        int d =5;
        int n=arr.length;
        Rotate(arr,d);
        int i=0;
        while(i<n)
        {
            System.out.println(arr[i]);
            i++;
        }
    }
}
