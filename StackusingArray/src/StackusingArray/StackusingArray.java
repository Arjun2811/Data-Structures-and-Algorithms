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
public void push(int element) throws StackfullException
{
if(size()==data.length)
{

StackfullException e = new StackfullException();
throw e;
}


top++;
    data[top]=element;
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


