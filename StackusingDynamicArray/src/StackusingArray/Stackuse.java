package StackusingArray;

public class Stackuse {

    public static void main(String[]args)
    {
     
        StackusingArray stack= new StackusingArray(3);
        int i=1;

        while(i<=40)
        {
           stack.push(i);
           i++;
        }
    
    


    while(!stack.isEmpty())
    {try{
       System.out.println(stack.pop());
    }
    catch(StackEmptyException e) {

         System.out.println("Stack is Empty");


    }
    }
    


    }

}




