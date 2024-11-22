package BinaryTree;

import java.util.Scanner;

public class BinaryTreeNodeuse {


public static void print(BinaryTreeNode<Integer>root)
{if(root==null)
    {
        return;
    }
    String tobeprinted =root.data+" ";
    if(root.left!=null)
    {
        tobeprinted+="L:"+root.left.data+",";
    }
    if(root.right!=null)
    {
        tobeprinted+="R:"+root.right.data;

    }
System.out.println(tobeprinted);

    print(root.left);
    print(root.right);
}




public static BinaryTreeNode<Integer> Takeinput(Scanner s)
{


    System.out.println("Enter the root data");
    int rootdata=s.nextInt();
    if(rootdata==-1)
    {
        return null;
    }
    BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootdata);
    root.left=Takeinput(s);
    root.right=Takeinput(s);
    return root;
}




public static void main(String[]args)
{Scanner s = new Scanner(System.in);
    BinaryTreeNode<Integer>root=Takeinput(s);
    print(root);
}





}
