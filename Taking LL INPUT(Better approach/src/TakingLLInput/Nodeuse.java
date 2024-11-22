package TakingLLInput;
import java.util.Scanner;
public class Nodeuse {

public static Node<Integer> Takeinput()
{
    Node<Integer>Head=null;
    Node<Integer>Tail=null;
    Scanner s = new Scanner(System.in);
    int data= s.nextInt();
    while(data!=-1)
    {Node<Integer> node1=new Node<Integer>(data);
    if(Head==null)
    { 
        Head=node1;
        Tail=node1;
    }
    else{
        // Node<Integer> Temp= Head;
       
        // while(Temp.Next!=null)
        // {
        //     Temp=Temp.Next;
        // }
        // Temp.Next=node1;
       Tail.Next=node1;
       Tail=Tail.Next;
    }
     data =s.nextInt();
}
return Head;


}   


public static void print(Node<Integer>Head)
{

 while(Head!=null)
{
    System.out.println(Head.data+" ");
    Head=Head.Next;
}

}
    public static void main(String[]args)
    {
Node<Integer>Head=Takeinput();
print(Head);


    }
}
