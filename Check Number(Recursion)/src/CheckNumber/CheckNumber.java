package CheckNumber;

import java.util.Scanner;

public class CheckNumber {


public static boolean CheckNumber(int[]arr,int x)
{
    

    if(arr[0]==x){
        return true;
    }
  if(arr.length==1)
  {
    return false;
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



    boolean smallans=CheckNumber(arr2, x);
    return smallans;
    
}






public static void main(String[]args)
{

Scanner s = new Scanner(System.in);
int x=s.nextInt();
    int n=s.nextInt();

    int arr[]= new int[n];
    int i=0;
    while(i<n)
    {
        arr[i]=s.nextInt();
        i++;
    }
   boolean ans= CheckNumber(arr,x);
   System.out.println(ans);
}
}