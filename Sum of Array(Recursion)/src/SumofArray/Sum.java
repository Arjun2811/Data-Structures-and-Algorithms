package SumofArray;
import java.util.Scanner;
public class Sum {

public static int Sum(int[]arr)
{
if(arr.length==1)
{
    return arr[0];
}
int arr2[]=new int[arr.length-1];
int i=1;
int f=0;
while(i<arr.length)
{
    arr2[f]=arr[i];
    i++;
    f++;

}

int smallans=Sum(arr2);
return arr[0]+smallans;

}




public static void main(String[]args)
{
 Scanner s = new Scanner(System.in);

    int n=s.nextInt();

    int arr[]= new int[n];
    int i=0;
    while(i<n)
    {
        arr[i]=s.nextInt();
        i++;
    }
   int ans= Sum(arr);
   System.out.println(ans);


}


}
