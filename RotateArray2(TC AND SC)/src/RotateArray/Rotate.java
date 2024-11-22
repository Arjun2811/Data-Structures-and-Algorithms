package RotateArray;
public class Rotate {


//23456
//45623
public static void Rotate(int[]arr,int d)
{
    int n=arr.length;

int arr2[]=new int[n];

int i=0;
while(i<d)
{
    arr2[i]=arr[i];
    i++;
}
int f=0;
while(d<n)
{
 arr[f]=arr[d];
 d++;
 f++;
}
i=0;
while(f<d)
{
    arr[f]=arr2[i];
    f++;
    i++;
}





}




public static void main(String[]args)
{
    int arr[]={3,4,5,6,7};
    int d=5;
    Rotate(arr,d);
    int i=0;
    int n=arr.length;
    while(i<n)
    {
        System.out.println(arr[i]);
        i++;
    }
}


}
