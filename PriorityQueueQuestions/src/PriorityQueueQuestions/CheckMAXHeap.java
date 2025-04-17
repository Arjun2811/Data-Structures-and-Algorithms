package PriorityQueueQuestions;
public class CheckMAXHeap {

public static boolean maxheap(int[]arr)
{
    
    int childindex=arr.length-1;
    int parentindex=(childindex-1)/2;
    while(childindex>0)
    {
        if(arr[parentindex]<arr[childindex])
        {
            return false;
        }
        childindex=childindex-1;
        parentindex=(childindex-1)/2;

}
return true;
}

    public static void main(String[]args)
{
    // int arr[]={42,20,18,6,14,11,9,4};
    int arr[]={5,7,9,10};
    boolean ans=maxheap(arr);
    System.out.println(ans);
}
}
