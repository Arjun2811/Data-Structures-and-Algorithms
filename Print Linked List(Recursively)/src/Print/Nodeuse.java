package Print;
import java.util.Scanner;
public class Nodeuse {



public static Node<Integer> Takeinput()
{
Node<Integer>head=null;
Node<Integer>tail=null;
Scanner s = new Scanner(System.in);
int data=s.nextInt();
while(data!=-1)
{
Node<Integer> node1=new Node<Integer>(data);
if(head==null)
{
    head=node1;
    tail=node1;
}
else
{
tail.next=node1;
tail=node1;
}
data=s.nextInt();
}
return head;

}
public static void printR(Node<Integer>Head)
{
   if(Head==null)
   {
    return;

   }
   printR(Head.next);
   System.out.println(Head.data);
   //printR(Head.next); for print from front of the linked just write it here rather than on the 38th line
}

    










    public static void main(String[]args)
    {
        Node<Integer>Head=Takeinput();
        printR(Head);
    }

}
