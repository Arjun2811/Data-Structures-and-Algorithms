package RotateArray;
public class Rotate {



public static void Rotate(int[]arr,int d)
{
    int i=0;
    int n=arr.length;
    int end=n-1;
    while(i<end)
    {
        int temp=arr[end];
        arr[end]=arr[i];
        arr[i]=temp;
        i++;
        end--;
        
    }

i=0;
end=n-d-1;
while(i<end)
{
int temp=arr[end];
arr[end]=arr[i];
arr[i]=temp;
i++;
end--;
}
 end =n-1;
 d=n-d;

while(d<end)
{
int temp=arr[end];
arr[end]=arr[d];
arr[d]=temp;
d++;
end--;
}

}

    public static void main(String[]args)
    {
        int arr[]= {3,2,1,5,8};
        int d=3;
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
