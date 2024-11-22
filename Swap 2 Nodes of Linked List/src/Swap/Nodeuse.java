package Swap;
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

    public static Node<Integer> swap(Node<Integer>Head,Node<Integer>finalHead,int i,int j,int f)
    {





        Node<Integer>VarPI=null;
        Node<Integer>VarPJ=null;
         Node<Integer>CurrI=null;
          Node<Integer>CurrJ=null;

     while(Head!=null)
     {
if(f==i-1)
{
    VarPI=Head;
}
if(f==i)
{
    CurrI=Head;
}
if(f==j-1)
{
    VarPJ=Head;
}
if(f==j)
{
    CurrJ=Head;
}

f++;
    Head= Head.next;
    }
if(CurrI==null||CurrJ==null)
{
    return finalHead;
}
if(CurrI==CurrJ)
{
    return finalHead;
}
if(VarPI==null&&CurrI==VarPJ)
{
    finalHead=CurrJ;
    Node<Integer>Temp=CurrJ.next;;
    CurrJ.next=CurrI;
    CurrI.next=Temp;
    return finalHead;
}
if(CurrI==VarPJ)
{
    VarPI.next=CurrJ;
    Node<Integer>Temp=CurrJ.next;
    CurrJ.next=CurrI;
    CurrI.next=Temp;
    return finalHead;
}

if(VarPI==null)
{
    finalHead=CurrJ;
    VarPJ.next=CurrI;
    Node<Integer>Temp=CurrJ.next;
    CurrJ.next=CurrI.next;
    CurrI.next=Temp;
return finalHead;
}


    VarPJ.next=CurrI;
    VarPI.next=CurrJ;
    Node<Integer>Temp=CurrJ.next;
    CurrJ.next=CurrI.next;
    CurrI.next=Temp;

    return finalHead;
}


    public static void main(String[] args) {
        Node<Integer>Head=Takeinput();
        //print(Head);
        Node<Integer>finalhead=Head;
    
    Node<Integer>fhead=swap(Head,finalhead,0,6,0);
    print(fhead);
}
}