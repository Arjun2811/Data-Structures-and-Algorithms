package passbyvalue;

import java.util.Scanner;

public class Nodeuse {

public static Node<Integer> takeinput()
    {

        Node<Integer> head=null;
        Node<Integer> tail=null;
        Scanner s = new Scanner(System.in);
        int data=s.nextInt();
        while(data!=-1)
        {
            Node<Integer> node1= new Node<Integer>(data);
            if(head==null)
            {
                head=node1;
                tail=node1;
            }
            else{
                tail.next=node1;
                tail=node1;
            }
            data=s.nextInt();

        }
        return head;


    }
    public static void print(Node<Integer> head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }


    public static void increment(Node<Integer>Head)
    {
      //Head.data++; pass by value concept the head in the main method in increment and Head here in the increment are both pointing to same
      // value .They both are same just different name in the main and here.So when any changes done in this Head Will also reflect there.
      
      //Head= new Node<Integer>(50);  now this will make a new node now any changes done here in Head wont be same for the head in the main.

      Node<Integer>Temp=Head;
      //basically ek copy banri h ye jo same jagah point krri h jha Head krra tha 
      while(Temp!=null)
      { Temp.data++;
       Temp=Temp.next;
      }
      

    }
    public static void main(String[] args) {
        Node<Integer>head=takeinput();
        //print(head);
       increment(head);
        print(head);
    }



}
