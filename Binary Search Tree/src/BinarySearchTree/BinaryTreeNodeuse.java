package BinarySearchTree;



    import java.util.ArrayList;
import java.util.Scanner;
    
    public class BinaryTreeNodeuse {
    
    public static BinaryTreeNode<Integer> TakeinputLevelwise()
    {
        Scanner s = new Scanner(System.in);
        QueueusingLL<BinaryTreeNode<Integer>> pendingnodes=new QueueusingLL<>();
        System.out.println("Enter the root data");
        int rootdata=s.nextInt();
        if(rootdata==-1)
        {
            return null;
        }
        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootdata);
        pendingnodes.Enqueue(root);
        while(!pendingnodes.isempty())
        {BinaryTreeNode<Integer>frontnode;
            try {
           frontnode=pendingnodes.Dequeue();
            } catch (QueueEmptyException e) {
              return null;
            }
    
            System.out.println("Enter the left child of "+ frontnode.data);
            int leftchild=s.nextInt();
            if(leftchild!=-1)
            {
                BinaryTreeNode<Integer>child1=new BinaryTreeNode<Integer>(leftchild);
                pendingnodes.Enqueue(child1);
                frontnode.left=child1;
            }
            System.out.println("Enter the right child of "+ frontnode.data);
            int rightchild=s.nextInt();
            if(rightchild!=-1)
            {
    BinaryTreeNode<Integer>child2=new BinaryTreeNode<Integer>(rightchild);
    pendingnodes.Enqueue(child2);
    frontnode.right=child2;
            }
    
        }
        return root;
    
        
    }
    public static void print(BinaryTreeNode<Integer>root)
    {
        if(root==null)
        {
            return;
        }
        QueueusingLL<BinaryTreeNode<Integer>> pendingnodes=new QueueusingLL<>();
        pendingnodes.Enqueue(root);
        while(!pendingnodes.isempty())
        {
            BinaryTreeNode<Integer>frontnode;
            try {
                frontnode=pendingnodes.Dequeue();
            } catch (QueueEmptyException e) {
                return;
            }
    String tobeprinted=frontnode.data+": ";
           if(frontnode.left!=null)
           {
    pendingnodes.Enqueue(frontnode.left);
    tobeprinted+="L :"+frontnode.left.data+" , ";
           }
           else{
           tobeprinted+="L :"+ "-1" +" , ";
           }
           if(frontnode.right!=null)
           {
    pendingnodes.Enqueue(frontnode.right);
    tobeprinted+="R :"+frontnode.right.data;
           }
           else{
           tobeprinted+="R :"+ "-1" +" , ";
           }
    System.out.println(tobeprinted);
        }
    }
    public static boolean search(BinaryTreeNode<Integer>root,int k,boolean ans)
    {if(root==null)
        {
            return ans;
        }

if(root.data==k)
{ ans=true;
return ans;
}

boolean finalans=false;
if(k>=root.data)
{
   finalans= search(root.right,k,ans);
}
else{
 finalans=search(root.left,k,ans);
}

return finalans;

    }



    public static boolean search(BinaryTreeNode<Integer>root,int k)
    {
        boolean ans=false;
        return search(root,k,ans);
    }

    public static void elementinrange(BinaryTreeNode<Integer>root,int k1,int k2)
    {if(root==null)
        {
            return;
        }
      

        if(k1>=root.data)
        {
            if(root.data>=k1&&root.data<=k2)
            {
                System.out.println(root.data);
            }
            elementinrange(root.right, k1, k2);
            
        }
        else if(k2<root.data)
        {
            if(root.data>=k1&&root.data<=k2)
            {
                System.out.println(root.data);
            }
            elementinrange(root.left, k1, k2);
            
        }
else{
    elementinrange(root.left, k1, k2);
    if(root.data>=k1&&root.data<=k2)
{
    System.out.println(root.data);
}
    elementinrange(root.right, k1, k2);
}
    }




public static int maximum(BinaryTreeNode<Integer>root)
{

if(root==null)
{
    return Integer.MIN_VALUE;
}
int maxleft= maximum(root.left);
int maxright=maximum(root.right);

return Math.max(root.data,Math.max(maxleft,maxright));

}

public static int minimum(BinaryTreeNode<Integer>root)
{
    if(root==null)
    {
        return Integer.MAX_VALUE;
    }
int minleft=minimum(root.left);
int minright=minimum(root.right);

return Math.min(root.data,Math.min(minleft,minright));

}




public static boolean checkBST(BinaryTreeNode<Integer>root)
{
if(root==null)
{ 
    boolean ans=true;
    return ans;
}
int maxleft=maximum(root.left);
int minright=minimum(root.right);
if(root.data<=maxleft)
{
    return false;
}
if(root.data>minright)
{
return false;
}
boolean finalansleft=checkBST(root.left);
boolean finalansright=checkBST(root.right);


if(finalansleft==false||finalansright==false)
{
    return false;
}
return true;
    }
    public static Pair<Boolean,Pair<Integer,Integer>> CheckBST2(BinaryTreeNode<Integer>root)
    {//first integer=min;
       // second integer=max;
if(root==null)
{
    Pair<Boolean,Pair<Integer,Integer>> output= new Pair<>();
    output.first=true;
    output.second=new Pair<Integer,Integer>();
    output.second.first=Integer.MAX_VALUE; 
   output.second.second= Integer.MIN_VALUE;
   return output;
}





       Pair<Boolean,Pair<Integer,Integer>>outputleft= CheckBST2(root.left);
        Pair<Boolean,Pair<Integer,Integer>>outputright=CheckBST2(root.right);

        int minimum=Math.min(root.data,Math.min(outputleft.second.first,outputright.second.first));
        int maximum=Math.max(root.data,Math.max(outputleft.second.second,outputright.second.second));


Pair<Boolean,Pair<Integer,Integer>> newoutput=new Pair<>();
        newoutput.first=outputleft.second.second<root.data&&outputright.second.first>=root.data&&outputleft.first==true&&outputright.first==true;
        newoutput.second=new Pair<Integer,Integer>();
newoutput.second.first=minimum;
newoutput.second.second=maximum;
return newoutput;
    }
    public static boolean CheckBST3(BinaryTreeNode<Integer>root,int min,int max)
    {
if(root==null)
{
    return true;
}
if(root.data<min||root.data>max)
{
    return false;
}


        boolean leftoutput=CheckBST3(root.left,min,root.data-1);
        boolean rightoutput=CheckBST3(root.right,root.data,max);
        return leftoutput&&rightoutput;
    }
    public static BinaryTreeNode<Integer> BSTfromSortedArray(int[]arr,int si,int ei)
    {
if(arr.length==0)
{
    return null;
}
if(si>ei)
{
    return null;
}

int mid=(si+ei)/2;

BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(arr[mid]);


BinaryTreeNode<Integer>leftroot=BSTfromSortedArray(arr,si, mid-1);
BinaryTreeNode<Integer>rightroot=BSTfromSortedArray(arr, mid+1, ei);

root.left=leftroot;
root.right=rightroot;

return root;
    }

    public static LinkedListnode BSTtoLL(BinaryTreeNode<Integer>root)//not done
    {if(root.left==null&&root.right==null)
        {
            Node<Integer>node1=new Node<Integer>(root.data);
            LinkedListnode ans= new LinkedListnode();
            ans.head=node1;
            ans.tail=node1;
        }


        Node<Integer>rootnode=new Node<Integer>(root.data);


LinkedListnode leftnode= BSTtoLL(root.left);
LinkedListnode rightnode= BSTtoLL(root.right);

leftnode.tail.next=rootnode;
rootnode.next=rightnode.head;

return leftnode;
    }
public static ArrayList<Integer> PathinBST(BinaryTreeNode<Integer>root,int data)
{
if(root==null)
{
    return null;
}
if(root.data==data)
{
    ArrayList<Integer>output= new ArrayList<>();
    output.add(data);
    return output;
}

if(data<root.data)
{
   ArrayList<Integer>leftoutput= PathinBST(root.left,data);
   if(leftoutput!=null)
   {
    leftoutput.add(root.data);
    return leftoutput;
   }

}
else{
   ArrayList<Integer>rightoutput= PathinBST(root.right,data);
   if(rightoutput!=null)
   {
    rightoutput.add(root.data);
    return rightoutput;
   }
}
return null;
}
   


public static void main(String[]args)
{
    BinaryTreeNode<Integer>root=TakeinputLevelwise();
    print(root);
    // boolean ans=search(root,4);
    // System.out.println(ans);

    // elementinrange(root,1,3);

//    boolean ans= checkBST(root);
//    System.out.println(ans);
   
//   boolean ans= CheckBST3(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
//   System.out.println(ans);

// int arr[]={1,2,3,4,5,6,7};
// BinaryTreeNode<Integer>ans=BSTfromSortedArray(arr,0,arr.length-1);
// print(ans);

// BSTtoLL(root);//not done
ArrayList<Integer>outputans=PathinBST(root,6);
System.out.println(outputans);


}



}
