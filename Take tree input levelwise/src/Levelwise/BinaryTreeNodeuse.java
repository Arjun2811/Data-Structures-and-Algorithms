package Levelwise;

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
       if(frontnode.right!=null)
       {
pendingnodes.Enqueue(frontnode.right);
tobeprinted+="R :"+frontnode.right.data;
       }
System.out.println(tobeprinted);
    }
}

public static int Count(BinaryTreeNode<Integer>root)
{if(root==null)
    {
        return 0;
    }
   
   
   
   int ans=1;
    ans+=Count(root.left);
    ans+=Count(root.right);
    return ans;

}
public static int Sum(BinaryTreeNode<Integer>root)
{
if(root==null)
{
    return 0;
}


int ans=root.data;
    ans+=Sum(root.left);
   ans+= Sum(root.right);
   return ans;
}

public static boolean IsNodePresent(BinaryTreeNode<Integer>root,int x)
{
if(root==null)
{
    return false;
}
if(root.data==x)
{ 
    return true;
}

boolean ans=false;
    

ans=IsNodePresent(root.left, x);
if(ans==true)
{
    return ans;
}
ans=IsNodePresent(root.right, x);
return ans;

}



public static void main(String[]args)
{
    BinaryTreeNode<Integer>root=TakeinputLevelwise();
    print(root);
    // int count=Count(root);
    // System.out.println(count);
    // int sum=Sum(root);
    // System.out.println(sum);
    boolean ans=IsNodePresent(root,7);
    System.out.println(ans);

}

}
