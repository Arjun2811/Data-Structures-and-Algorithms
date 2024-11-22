package LevelWise;

import java.util.ArrayList;

public class TreeNode<T> {

    T data;
    ArrayList<TreeNode<T>> Children;

    public TreeNode(T data)
    {
        this.data=data;
        Children=new ArrayList<>();
    }
}
