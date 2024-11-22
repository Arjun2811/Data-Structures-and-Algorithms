package Bubble;
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
        Node<Integer>node1=new Node(data);

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
public static void print(Node<Integer>Head)
{
    while(Head!=null)
    {
System.out.println(Head.data);


        Head=Head.next;
    }
}
public static void Bubble(Node<Integer>Head)
{int count=0;
    if(Head==null||Head.next==null)
    {
        return;
    }
    Node<Integer>Temp=Head;
    Node<Integer>temp1=Head;
    while(Temp!=null)
    {
        count++;
        Temp=Temp.next;
    }
   
    int i=0;
    while(i<count-1)
    { temp1=Head;
        int j=0;
        int f=0;
        while(j<count-1-f)
        {


if(temp1.data>temp1.next.data)
{
    int var=temp1.next.data;
    temp1.next.data=temp1.data;
    temp1.data=var;
}




temp1=temp1.next;

        j++;
        
        }
        i++;
        f++;
    }
}


public static void main(String[] args) {
    Node<Integer>Head=takeinput();
    print(Head);
    Bubble(Head);
    print(Head);


}


}
