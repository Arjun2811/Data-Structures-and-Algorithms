package Kreverse;
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







    public static Node<Integer> Kreverse(Node<Integer>head,Node<Integer>current,int k,int i,Node<Integer>temporary)
    {int count=0;
        Node<Integer>var=null;
        while(temporary!=null)
        {
            count++;
            temporary=temporary.next;
        }
        
        
        Node<Integer>prev=null;
        Node<Integer>finalhead=null;;
        int f=0;
        Node<Integer>Temp1=null;;
   while(current!=null)  
   {  
    Node<Integer>Temp=current.next;
while(i<k)
{if(i==0)
    {
        Temp1=current;
    }
    if(current!=null)
    {
        Temp=current.next;
        current.next=prev;
        prev=current;
        current=Temp;
    }
    

    i++;
    
    
}

while(f<1)
    {
   finalhead=prev;
    f++;
    }
// current=Temp1;
// prev=Temp1;
if(count%k==1)
{
    Temp1.next=current;
    
}
else{
Temp1.next=prev;
   }
if(current!=null)
{
    
Temp=current.next;
//current.next=null
if(var!=null)
{
    var.next=current.next;
}
else{
var=current;
}
i=1;

prev=current;
current=Temp;
}
}
return finalhead;

       
    }

    public static void main(String[]args)
    {

        Node<Integer>Head=Takeinput();
        // print(Head);
        Node<Integer>Temp=Head;
        Node<Integer>Temporary=Head;

        Node<Integer>head=Kreverse(Head,Temp,2,0,Temporary);
        print(head);
    }
}


///the correct ansss niche wala

	public static Node<Integer> kReverse(Node<Integer> head, int k) {


 if (head == null || k <= 1) {
            return head; // No need to reverse if head is null or k is 1 or less
        }

        Node<Integer> current = head;
        Node<Integer> prevTail = null;
        Node<Integer> newHead = null;

        while (current != null) {
            int count = 0;
            Node<Integer> groupPrev = null;
            Node<Integer> groupHead = current;

            // Reverse 'k' nodes at a time
            while (current != null && count < k) {
                Node<Integer> nextNode = current.next;
                current.next = groupPrev;
                groupPrev = current;
                current = nextNode;
                count++;
            }

            // Set new head for the first group
            if (newHead == null) {
                newHead = groupPrev;
            }

            // Connect the previous group's tail to the current group's head
            if (prevTail != null) {
                prevTail.next = groupPrev;
            }

            // Move the tail pointer for the next group
            prevTail = groupHead;
        }

        return newHead;
    }



		//Your code goes here
	}

