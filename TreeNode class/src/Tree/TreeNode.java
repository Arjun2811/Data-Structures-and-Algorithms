package Tree;

import java.util.ArrayList;

public class TreeNode<T> {

    public T data;
    public ArrayList<TreeNode<T>>Children;

    public TreeNode(T data)
    {
        this.data=data;
        Children=new ArrayList<>();
    }

}
