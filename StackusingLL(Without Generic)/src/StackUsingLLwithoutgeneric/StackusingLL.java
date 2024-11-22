package StackUsingLLwithoutgeneric;

public class StackusingLL<T> {



    private Node Head;
    private int size;

    public StackusingLL()
    {
Head=null;
size=0;
    }
    public int size()
    { 

        return size;

    }
    public void push(int element)
    { Node node1= new Node(element);
       if(Head==null)
       {
         Head=node1;
         size++;
       }
       else{
        node1.next=Head;
        Head=node1;
        size++;
       }
    } 

    public int pop()
    { if(size()==0)
        {
            System.out.println(-1);
        } 
    
        int data=Head.data;
        Head=Head.next;
        size--;
        return data;

    }

    public boolean isempty()
    {
        if(size==0)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public int Top()
    {
      
      
        return Head.data;
      
      

    }








}

