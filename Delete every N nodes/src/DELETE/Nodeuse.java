package DELETE;
import java.util.Scanner;
public class Nodeuse {


    public static Node<Integer> Takeinput()
    {
        Node<Integer>Head=null;
        Node<Integer>Tail=null;
        Scanner s = new Scanner(System.in);
        int data=s.nextInt();
        while(data!=-1)
        {
            Node<Integer> node1= new Node<>(data);
            if(Head==null)
            {
                Head=node1;
                Tail=node1;
            }
            else{
                Tail.next=node1;
                Tail=node1;
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




    public static Node<Integer> Delete(Node<Integer>Head,int m ,int n)
    {if(m==0&&n==0)
        {
            return Head;
        }
        if(m==0)
        {
            Head=null;
            return Head;
        }
        Node<Integer>var=Head;
    int count=0;
    int f=0;
        Node<Integer>Temp=Head;
        while(Temp!=null)
        {
            if(count==m)
            { 
                while(f<n)
            {
                    f++;
                    if(Temp.next==null)
                    {
                    var.next=null;
                    return Head;
                    }
                    Temp=Temp.next;
                   
            }
            var.next=Temp;
                count=0;
                f=0;
            }

            count++;
            if(count==m)
            {
                var=Temp;
            }
            Temp=Temp.next;
            
        }
        return Head;
    }



// public static Node<Integer> DeleteNode(Node<Integer>Head,Node<Integer>Temp,int m,int n,int i)
// {
// if(Head==null)
// {
//     return Temp;
// }

// if(i==m)
// {
//     Node<Integer>var=Head;
//     int f=0;

// while(f<n)
// {
// f++;
// if(Head.next!=null)
// {
//     Head=Head.next;
// }
// else{
//    var.next=null;
//     return Temp;
// }


// var.next=Head;
// i=1;
// }


//     Node<Integer>Finalhead=DeleteNode(Head.next,Temp,m,n,++i);
//     return Finalhead;
//this through recursion is wrong 
// 

// public static Node<Integer> Delete(Node<Integer>Head,int m ,int n)
// { Node<Integer>Temp=Head;
//     //
//     Node<Integer>head=DeleteNode(Head,Temp,m,n,1);
//     return head;
// }


    public static void main(String[]args)
    {
        Node<Integer>Head=Takeinput();
       
        // print(Head);
    Node<Integer>head=Delete(Head,2,2);
        print(head);
    }
}