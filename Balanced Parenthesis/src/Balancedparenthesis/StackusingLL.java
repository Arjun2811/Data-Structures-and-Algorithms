package Balancedparenthesis;

public class StackusingLL {



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
    public void push(String element)
    { Node node1= new Node(element);
       
        node1.next=Head;
        Head=node1;
        size++;
       }
    

    public String pop() 
    { 
        if(size()==0)
        {
          return "f";
        }


        String data=Head.data;
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

    public String Top() 
    {
      if(size()==0)
      {
        return "f";
      }
      
        return Head.data;
      
      

    }


}

