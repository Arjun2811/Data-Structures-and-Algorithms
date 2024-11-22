package Length;

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
    public static int Length(Node<Integer>Head)
{
    Node<Integer> Temp=Head;
    int i=0;
    if(Temp.next==null)
    {
        return 1;
    }
while(Temp!=null)
{if(Temp.next==null)
    {
        return i+1;
    }

    i++;
    Temp=Temp.next;
}
return 0;


}

public static void main(String[] args) {
    
Node<Integer> head=takeinput();
print(head);
int count=Length(head);
System.out.println(count);
    }
}


