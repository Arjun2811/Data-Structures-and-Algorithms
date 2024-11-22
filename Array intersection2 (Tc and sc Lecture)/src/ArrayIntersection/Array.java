package ArrayIntersection;

import java.util.Arrays;

public class Array {



public static void Sorted(int[]arr1,int arr2[])
{

    Arrays.sort(arr1);
    Arrays.sort(arr2);
    Merge(arr1,arr2);
}
    public static void Merge(int[]arr1,int arr2[])
{
int i=0;
int j=0;
int n=arr1.length;
int m=arr2.length;
while(i<n&&j<m){
    
    if(arr1[i]==arr2[j])
{
System.out.print(arr1[i]+" ");
i++;
j++;
}
else
if(arr1[i]>arr2[j])
{
    j++;
}
else{
    i++;
}



}


}

    







public static void main(String[]args)
{

    int arr1[]={2,5,8,4,3,1};
    int arr2[]={4,9,6,5,1,2};
 
    Sorted(arr1,arr2);
    
}
}
