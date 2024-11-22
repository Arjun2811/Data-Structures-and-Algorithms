package TakingInput;
import java.util.Scanner;
public class NodeUSE {


public static Node<Integer> takinginput()
{

    Node<Integer> Head=null;
    Scanner s = new Scanner(System.in);
    int data =s.nextInt();

    while(data!=-1)
    {
        Node<Integer> newNode= new Node<Integer>(data);
        if(Head==null)
        {
            Head=newNode;
        }
        else{
            Node <Integer>Temp=Head;
            while(Temp.next!=null)
            {
                Temp=Temp.next;
            }
            Temp.next=newNode;
        }
        data=s.nextInt();
    }
    return Head;


}


public static void print(Node<Integer>Head)
{
    while(Head!=null)
    {
        System.out.println(Head.data+" ");
        Head=Head.next;
    }
}



public static void main(String[]args)
{

Node<Integer> Head=takinginput();
print(Head);





}

}
