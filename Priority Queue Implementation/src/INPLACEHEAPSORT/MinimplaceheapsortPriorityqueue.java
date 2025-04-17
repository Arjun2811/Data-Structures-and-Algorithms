package INPLACEHEAPSORT;

public class MinimplaceheapsortPriorityqueue {


public static void VirtualInsertion(int[]arr,int i)
{
int childindex=i;
int parentindex=(childindex-1)/2;

while(childindex>0)
{
if(arr[childindex]<arr[parentindex])
{
    int temp=arr[childindex];
    arr[childindex]=arr[parentindex];
    arr[parentindex]=temp;
    childindex=parentindex;
    parentindex=(childindex-1)/2;
}
else{
    return;
}
}
}
public static int VirtualRemoval(int[]arr,int heapsize)
{
int valuetoberetured=arr[0];
arr[0]=arr[heapsize-1];

heapsize--;

int index=0;
int minindex=0;
while((2*index)+1<heapsize)
{

if(arr[minindex]>arr[(2*index)+1])
{
minindex=(2*index)+1;
}
if((2*index)+2<heapsize && arr[minindex]>arr[(2*index)+2])
{
    minindex=(2*index)+2;
}
if(index==minindex)
{
    return valuetoberetured;
}
else{
    int temp=arr[index];
    arr[index]=arr[minindex];
    arr[minindex]=temp;
    index=minindex;
}
}
return valuetoberetured;

}




    public static void main(String[]args){
        int arr[]={5,1,9,2,0,6};
        int i=0;
        while(i<arr.length)
        {
        VirtualInsertion(arr,i);
        i++;
    }

    i=0;
    while(i<arr.length)
    {
       int valuetobereturned= VirtualRemoval(arr,arr.length-i);

       arr[arr.length-i-1]=valuetobereturned;
        i++;
    }
    i=0;
    while(i<arr.length)
    {
        System.out.println(arr[i]);
        i++;
    }


    
}
}