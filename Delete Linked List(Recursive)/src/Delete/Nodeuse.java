package Delete;
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
    
    public static void print(Node<Integer>Head)
    {
    
        while(Head!=null)
        {
    
    
            System.out.println(Head.data);
            Head=Head.next;
        }
    }

    public static Node<Integer> Delete(Node<Integer>Head,int pos)
    {  
        if(Head==null)
        {
            return Head;
        }

        if(pos==0)
        {
            return Head.next;
        }

        Head.next=Delete(Head.next,pos-1);
        return Head;

    }



public static void main(String[] args) {
    Node<Integer>Head=Takeinput();
    print(Head);
    Node<Integer>FinalNode=Delete(Head,0);
    print(FinalNode);
}


}
