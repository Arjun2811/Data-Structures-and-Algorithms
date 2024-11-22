package LinkedList;

public class Nodeuse {

public static void print(Node<Integer>Head)
{   Node<Integer>Temp=Head;
    while(Head!=null)
    {
        System.out.println(Head.data);
        Head=Head.next;
    }
    Head=Temp;
    while(Head!=null)
    {
        System.out.println(Head.data);
        Head=Head.next;
    }
}

    public static void main(String[]args){

        Node<Integer> node1=new Node<>(10);
        System.out.println(node1.data);
        System.out.println(node1.next);
        Node<Integer> node2= new Node<>(20);
        node1.next=node2;
        //this(node1.next) will store the reference of node 2
        System.out.println(node1.next);
        System.out.println(node2);
        System.out.println(node2.next);
System.out.println("*Starting of using the head part*");
Node<Integer>node3=new Node<>(30);
node2.next=node3;
Node<Integer> Head=node1;
// while(Head !=null)
// {
//     System.out.println(Head.data);
//     Head=Head.next;
// }i can print it here as well
print(Head);
//if we dont wanna do that temp thing we can directly write print(head) function. it will also print it 2 times
    }
}
