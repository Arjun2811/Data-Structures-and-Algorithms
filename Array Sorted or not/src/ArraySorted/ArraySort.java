package ArraySorted;
import java.util.Scanner;

public class ArraySort {
//123
public static boolean ArraySort(int input[])
{
if(input.length<=1)
{
    return true;

}

int smallinput[]=new int[input.length-1];
int i=1;
int f=0;
while(i<input.length)
{
smallinput[f]=input[i];
i++;
f++;
}

boolean smallans=ArraySort(smallinput);
if(!smallans)
{
    return false;
}
if(input[0]<=input[1])
{
    return true;
}
else
{
    return false;
}

}
//Another way of doing this

//package ArraySorted;
//import java.util.Scanner;

//public class ArraySort {

//public static boolean ArraySort(int input[])
//{
//if(input.length<=1)
//{
  //  return true;

//}
//if(input[0]<=input[1])
//{
 //   return true;
//}

//int smallinput[]=new int[input.length-1];
//int i=1;
//int f=0;
//while(i<input.length)
//{
//smallinput[f]=input[i];
//i++;
//f++;
//}

//boolean smallans=ArraySort(smallinput);
//if(!smallans)
//{
 //   return false;
//}

//else
//{
  //  return false;
//}

//}

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
       boolean ans =ArraySort(arr);
       System.out.println(ans);
    }
}
