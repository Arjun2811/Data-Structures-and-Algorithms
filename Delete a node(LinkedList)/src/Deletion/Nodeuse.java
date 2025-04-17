package Deletion;
import java.util.Scanner;
public class Nodeuse {




    public static Node<Integer> takeinput()
    {

        Node<Integer>head=null;
        Node<Integer>tail=null;
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
    public static void print(Node<Integer>head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }



    public static Node<Integer> Deletion(Node<Integer>head,int pos)
    {
int i=0;
if(pos==0)
{
    head=head.next;
    return head;
}
Node<Integer>Temp=head;
while(Temp!=null)
{   if(Temp.next==null)
    {
        return head;
    }
    if(i==pos-1)
    {
        Temp.next=Temp.next.next;
 return head;
    }
    i++;
    Temp=Temp.next;
}




return head;
}
    

    public static void main(String[]args)
    {
        Node<Integer>head=takeinput();
        print(head);
        Node<Integer>Head=Deletion(head,2);
        print(Head);
    }
}
