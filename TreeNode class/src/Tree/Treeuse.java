package Tree;

public class Treeuse {

    public static void main(String[] args) {
        
    
    TreeNode<Integer> root=new TreeNode<Integer>(4);
    TreeNode<Integer> node1=new TreeNode<Integer>(2);
    TreeNode<Integer> node2=new TreeNode<Integer>(3);
    TreeNode<Integer> node3=new TreeNode<Integer>(5);
    TreeNode<Integer> node4=new TreeNode<Integer>(6);

    root.Children.add(node1);
    root.Children.add(node2);
    root.Children.add(node3);
    node2.Children.add(node4);

    System.out.println(root);

}
}
