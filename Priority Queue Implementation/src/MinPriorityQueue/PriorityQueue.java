package MinPriorityQueue;

import java.util.ArrayList;

public class PriorityQueue {

   private ArrayList<Integer>heap;

public PriorityQueue()
{
    heap=new ArrayList<>();
}
public boolean isempty()
{

return heap.size()==0;

}
public int size()
{
return heap.size();
}
public int getmin() throws PriorityQueueException
{if(isempty())
    {
        throw new  PriorityQueueException();
    }
    return heap.get(0);
}
public void insert(int element)
{
heap.add(element);
int childindex=heap.size()-1;
int parentindex=(childindex-1)/2;

while(childindex>0)
{
if(heap.get(childindex)<heap.get(parentindex))
{
    int temp=heap.get(childindex);
    heap.set(childindex,heap.get(parentindex));
    heap.set(parentindex,temp);
    childindex=parentindex;
    parentindex=(childindex-1)/2;
}
else{
    return;
}
}
}
public int removemin()throws PriorityQueueException
{ if(heap.size()==0)
    {
        PriorityQueueException p2= new PriorityQueueException();
        throw p2;
    }
    
    
    
    int smallindex=-1;
    int valuetoberetured=heap.get(0);
    heap.set(0,heap.get(heap.size()-1));
    heap.remove(heap.size()-1);
int parentindex=0;
while((2*parentindex)+1<heap.size())
{
    int leftchild=heap.get((2*parentindex)+1);

    int smaller=leftchild;
    smallindex=((2*parentindex)+1);

    if((2*parentindex)+2<heap.size())
    {
    int rightchild=heap.get((2*parentindex)+2);
     smaller=Math.min(leftchild, rightchild);
    if(leftchild>rightchild)
    {
        smallindex=(2*parentindex)+2;
    }
    else if(leftchild<=rightchild){
        smallindex=((2*parentindex)+1);
    }
}
    if(heap.get(parentindex)>smaller)
    {
        int temp=heap.get(smallindex);

        heap.set(smallindex,heap.get(parentindex));
        heap.set(parentindex,temp);
        parentindex=smallindex;
    }
    else{
        return valuetoberetured;
    }
}
return valuetoberetured;
}
public int removeminbetter()throws PriorityQueueException
{
    if(isempty())
    {
        throw new PriorityQueueException();
    }
    int temp=heap.get(0);
    heap.set(0,heap.get(heap.size()-1));
    heap.remove(heap.size()-1);
    int index=0;
    int minindex=0;
    int leftchildindex=1;
    int rightchildindex=2;
while(leftchildindex<heap.size())
{
    if(heap.get(leftchildindex)<heap.get(minindex))
    {
        minindex=leftchildindex;
    }
    
    if(rightchildindex<heap.size()&&heap.get(rightchildindex)<heap.get(minindex))
    {
minindex=rightchildindex;
    }
    if(minindex==index)
    {  return temp;
        
    }else{
        int temp2=heap.get(index);
        heap.set(index,heap.get(minindex));
        heap.set(minindex,temp2);
    }
    index=minindex;
    leftchildindex=(2*index)+1;
    rightchildindex=(2*index)+2;
}
return temp;





}
public void print()
{
    int i=0;
    while(i<heap.size())
    {
        System.out.println(heap.get(i));
        i++;
    }
}


}
