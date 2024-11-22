package StockSpan;

public class stackusingArray {

    int data[];
    int top;
    public stackusingArray()
    {
        data=new int[5];
        top=-1;
    }
    public int size()
    {  
        int size=top+1;
        return size;
    }
    public void push(int element)
    {
        
if(top+1==data.length)
{
    Doublecapacity();
}
top++;
        data[top]=element;

    }

    public void Doublecapacity()
    {
        int temp[]=data;
        data=new int[data.length*2];
        int i=0;
        while(i<temp.length)
        {
            data[i]=temp[i];
            i++;
        }
    }
    public int pop() 
    {if(size()==0)
        {
           return -1;
        }

        int i=data[top];
        top--;
        return i;
    }

public int Top() 
{
    if(top==-1)
    {
       return top;
    }
return data[top];
}
public boolean isempty()
{
    if(size()==0)
    {
        return true;
    }
    else{
        return false;
    }
}


}
