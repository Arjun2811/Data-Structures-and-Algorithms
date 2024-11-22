package PairSum;
public class Pair {

public static int Pair(int[]arr,int num)
{
    int n =arr.length;
    int i=0;
    int count=0;
    while(i<n)
    {
        int j=i+1;
        while(j<n)
        {
            if(arr[i]+arr[j]==num)
            {
               count++;
            }
            j++;
        }
        i++;

    }
    return count;
}






    public static void main(String[]args)
    {
        int arr[]={1,3,6,2,5,4,3,2,4};
        int num=7;
        int count=Pair(arr,num);
        System.out.println(count);
    }
}
