package StackusingQueues;

public class Stackuse {


    public static void main(String[]args)
    {
        StackUsingqueues s1=new StackUsingqueues();
        int i=0;
        int arr[]={1,2,3,4,5,5,6,7};
        while(i<arr.length)
        {
           s1.push(arr[i]);
           i++;
        }
        System.out.println(s1.size());
        while(!s1.isEmpty())
        {
            System.out.println(s1.pull());
        }
        System.out.println(s1.size());

    }
}
