package classesandobjects;

public class DynamicArray {
    private int data[];
   private  int nextindex;

   public DynamicArray()
   {
    data=new int[5];
    nextindex=0;
   }
   public void add(int element)
   {

if(nextindex==data.length)
{
    restructure();
}

    data[nextindex]=element;
    nextindex++;

   }

   public int size()
   {
    int size=nextindex;
    return size;
   }

   public void restructure()
   {
    int temp[]=data;
    data=new int[data.length*2];
    int f=0;
    while(f<temp.length)
    {
    data[f]=temp[f];
    f++;
    }
   }
   public void set(int index,int value)
   {
    if(index>nextindex)
    {
        return ;
    }

if(index<nextindex )
    {
        data[index]=value;
   }
   else{
     add(value);
   }

}

public int get(int index)
{
    if(index>=nextindex)
    {
        return -1;
    }

else{
    return data[index];
}
}
public Boolean isempty()
{
    if(size()==0)
    {
        return true;
    }
    else
    {
        return false;
    }
}
public int removelast()
{  if(size()==0)
    {
        return -1;
    }
   int x =data[nextindex-1];
   data[nextindex-1]=0;
   nextindex--;
   return x;
}
}