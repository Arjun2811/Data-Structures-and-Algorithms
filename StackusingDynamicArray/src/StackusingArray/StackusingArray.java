package StackusingArray;

public class StackusingArray {

private int data[];
private int top;
public StackusingArray()
{
    data=new int[10];
    top=-1;
}
public StackusingArray(int capacity)
{
    data= new int [capacity];
    top=-1;
}


public int size()
{
    int size=top+1;
    return size;
}

public int Top() throws StackEmptyException
{if(size()==0)
    {
        StackEmptyException e = new StackEmptyException();
        throw e;
    }

    return data[top];
}
public boolean isEmpty()
{
    if(top==-1)
    {
      return true;
    }
    else{
        return false;
    }
    //return (top==-1)
}
public void push(int element)
{
if(size()==data.length)
{
   Doublecapacity();
}



top++;
    data[top]=element;
}
public void Doublecapacity()
{  int temp[]=data;
    data=new int[data.length*2];
    
    int i=0;
    while(i<=top)
    {
        data[i]=temp[i];
        i++;
    }

}

public int pop() throws StackEmptyException 
{
if(size()==0)
{
    StackEmptyException e = new StackEmptyException();
    throw e;
}




    int elem=data[top];
    top--;
    return elem;
}




}



