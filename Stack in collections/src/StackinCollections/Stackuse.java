package StackinCollections;
import java.util.Stack;
public class Stackuse {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack();
        int arr[]={1,2,3,4,5};
        int i=0;
        int n=arr.length;
        while(i<n)
        {
        stack.push(arr[i]);
         i++;
        }
        System.out.println("size of the stack is "+stack.size());
        System.out.println("top of the stack "+stack.peek());

        while(!stack.isEmpty())
        {
            System.out.println( stack.pop());
        }
        System.out.println();
    }

}
