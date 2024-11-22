package Reverse;
import java.util.Scanner;
public class Nodeuse {


    public static Node<Integer> Takeinput()
    {
        Node<Integer>Head=null;
        Node<Integer>Tail=null;
        Scanner s = new Scanner(System.in);
        int data=s.nextInt();
        while(data!=-1)
        {
            Node<Integer> node1= new Node<>(data);
            if(Head==null)
            {
                Head=node1;
                Tail=node1;
            }
            else{
                Tail.next=node1;
                Tail=node1;
            }
            data=s.nextInt();
        }
        return Head;
    }
    public static void print(Node<Integer>Head)
    {
    
        while(Head!=null)
        {
    
            System.out.println(Head.data);
            Head=Head.next;
        }
    }

    public static DoubleNode Reverse(Node<Integer>head)
{

    if(head==null||head.next==null)
    {
DoubleNode ans=new DoubleNode();
ans.Head=head;
ans.Tail=head;
return ans;
    }

    DoubleNode smallans=Reverse(head.next);
    smallans.Tail.next=head;
    head.next=null;

    smallans.Tail=head;
    return smallans;



    }



public static void main(String[]args){

Node<Integer>Head=Takeinput();
print(Head);
DoubleNode ans=Reverse(Head);
print(ans.Head);

}
}
//  class DoubleNode {

//     Node<Integer>Head;
//     Node<Integer>Tail;
// }  ye double node yha b bna skta hu its just that ki public ni rkh skta isse ek java class m sirf ek hi class public ho skti h 












