package StackusingArray;

public class Stackuse {

    public static void main(String[]args)
    {
     
        StackusingArray stack= new StackusingArray();
        int i=1;
       //if we want to add try and catch in the while loop we can do it this way
    //     while(i<=11)
    //     {try{
    //        stack.push(i);
    //        i++;
    //     }
    // catch(StackfullException e)
    // {
    //     System.out.println("stack is full");
    //     break; //ye loop ke andar h isliye break krna pdega loop se bhaar ane k liye otherwise hota chla jayega print
    // }
    //     }
try{
        while(i<=11)
        {
           stack.push(i);
           i++;
        }
    }
    catch(StackfullException e)
    {
        System.out.println("stack is full");
        
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
