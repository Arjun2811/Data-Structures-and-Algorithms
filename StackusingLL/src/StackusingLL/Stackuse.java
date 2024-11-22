package StackusingLL;

import java.util.Scanner;

public class Stackuse {

public static void main(String[] args) {
    StackusingLL<Integer> Stack = new StackusingLL();
int i=1;
    while(i<5)
    {
        Stack.push(i+10);
        i++;
    }
    try {
        System.out.println("Top is "+Stack.Top());
    } catch (StackEmptyException e) {
        // TODO: handle exception
System.out.println("Stack is empty");
    }
    
    
    System.out.println("Size of the stack after pushing "+ Stack.size());

    while(!Stack.isempty())
    {
       try{ 
     System.out.println(Stack.pop());
     
       } 
    
    catch(StackEmptyException e)
        {
            System.out.println("Stack is empty");
        }
    }
    System.out.println("Size of the stack after popping "+ Stack.size());
    
}
}