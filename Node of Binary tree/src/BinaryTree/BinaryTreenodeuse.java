package BinaryTree;

public class BinaryTreenodeuse {


public static void main(String[]args)
{
    BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);
    BinaryTreeNode<Integer> child1=new BinaryTreeNode<Integer>(2);
    BinaryTreeNode<Integer> child2= new BinaryTreeNode<Integer>(3);
    root.left=child1;
    root.right=child2;

}


}
