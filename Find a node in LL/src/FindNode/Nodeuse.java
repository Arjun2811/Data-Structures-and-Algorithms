
package FindNode;
import java.util.Scanner;
public class Nodeuse {


    public static Node<Integer> takeinput()
    {
        Node<Integer>Head=null;
        Node<Integer>Tail=null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while(data!=-1)
        { Node<Integer> node1 = new Node(data);
            if(Head==null)
            {
                Head=node1;
                Tail=node1;
            }
            else{
                Tail.next=node1;
                Tail=Tail.next;
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


    public static int Find(Node<Integer>Head,int n)
    {
   int i=0;
   while(Head!=null)
   {
 

if(Head.data==n)
{
    return i;
}
    Head=Head.next;
    i++;
   }
   return -1;


    }

public static void main(String[]args){
    Node<Integer>Head=takeinput();
    // print(Head);
   int i=Find(Head,10);
   System.out.println(i);
}

}
