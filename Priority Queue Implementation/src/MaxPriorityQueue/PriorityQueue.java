package MaxPriorityQueue;

import java.util.ArrayList;

public class PriorityQueue {

    ArrayList<Integer>heap;

    public PriorityQueue()
    {
        heap=new ArrayList<>();
    }

public int size(){


    return heap.size();

}
public boolean isempty(){

return heap.size()==0;


}
public void insert(int ele){


heap.add(ele);
int childindex=heap.size()-1;
int parentindex=(childindex-1)/2;

while(childindex>0)
{
if(heap.get(childindex)>heap.get(parentindex))
{
    int parentvalue=heap.get(parentindex);
    heap.set(parentindex,heap.get(childindex));
    heap.set(childindex,parentvalue);
    childindex=parentindex;
    parentindex=(childindex-1)/2;
}
else{
    return;
}
}

}
public int getmax() throws PriorityQueueException{
if(size()==0)
{
    throw new PriorityQueueException();
}

return heap.get(0);



}
public int removemax() throws PriorityQueueException{
    if(size()==0)
    {
        throw new PriorityQueueException();
    }


int valuetoberetured=heap.get(0);

heap.set(0,heap.get(heap.size()-1));
heap.remove(heap.size()-1);
int index=0;
int maxindex=0;
while((2*index)+1<heap.size())
{
if(heap.get(index)<heap.get((2*index)+1))
{
    maxindex=(2*index)+1;
}
if(((2*index)+2)<heap.size()&& heap.get(maxindex)<heap.get((2*index)+2))
{
    maxindex=(2*index)+2;
}
if(index==maxindex)
{
    return valuetoberetured;
}
else{
int temp=heap.get(index);
heap.set(index,heap.get(maxindex));
heap.set(maxindex,temp);
index=maxindex;

}

}
return valuetoberetured;
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
