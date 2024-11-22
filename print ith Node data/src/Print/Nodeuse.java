package Print;
import java.util.Scanner;
public class Nodeuse {

public static void print(Node<Integer>Head,int i)
{
 int f=0;
 while(Head!=null)
 {
    if(f==i)
    {
System.out.println(Head.data);
return;
    }
    
    f++;
    Head=Head.next;
   
 }
 return;


}

public static Node<Integer> Takeinput()
{
    Node<Integer>Head=null;
    Node<Integer>Tail=null;
    Scanner s = new Scanner(System.in);
    int data=s.nextInt();
    while(data!=-1)
    { Node<Integer> node1= new Node(data);
        if(Head==null)
        {
       Head=node1;
       Tail= node1;
        }
        else
        {
            Tail.next=node1;
            Tail=Tail.next;
        }
        data=s.nextInt();
    }
    return Head;
}

public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    Node<Integer>Head=Takeinput();
int i=s.nextInt();
    print(Head,i);
}


}
