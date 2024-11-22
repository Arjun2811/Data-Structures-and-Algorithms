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
    System.out.println("Top is "+Stack.Top());
    
    System.out.println("Size of the stack after pushing "+ Stack.size());

    while(!Stack.isempty())
    {
     System.out.println(Stack.pop());
    }
    System.out.println("Size of the stack after popping "+ Stack.size());
    
}
}