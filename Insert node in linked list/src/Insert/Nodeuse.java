package Insert;
import java.util.Scanner;
public class Nodeuse {

public static Node<Integer> takeinput()
{
Node<Integer>head=null;
Node<Integer>Tail=null;
Scanner s = new Scanner(System.in);
int data=s.nextInt();
while(data!=-1)
{Node<Integer> node1=new Node<Integer>(data);
    if(head==null)
    {
        head=node1;
     
        Tail=node1;
    }
    else{
        Tail.next=node1;
        Tail=Tail.next;
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

public static Node<Integer> Insert(int pos,int value,Node<Integer>head)
{
     int i=0;
     Node<Integer>Temp=head;

     if(pos==0)
     {
        Node<Integer> node1= new Node<Integer>(value);
        node1.next=Temp;
        return node1;
     }
     while(i<pos-1)
     {
        i++;
        Temp=Temp.next;

     }
     Node<Integer> node1= new Node<Integer>(value);
     node1.next=Temp.next;
     Temp.next=node1;

return head;

}

    public static void main(String[]args){
       Node<Integer>head= takeinput();
       print(head);
      Node<Integer>Head=Insert(2,80,head);
      print(Head);
       
}
}
