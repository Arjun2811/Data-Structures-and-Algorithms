package BSTCLASS;

public class BinarySearchTree {
private BinaryTreeNode<Integer>root;


private BinaryTreeNode<Integer> helperinsert(int data,BinaryTreeNode<Integer>root)
{


if(root==null)
{
    BinaryTreeNode<Integer>newroot=new BinaryTreeNode<Integer>(data);
    return newroot;
}

if(data<root.data)
{
   root.left= helperinsert(data,root.left);

}
if(data>=root.data)
{
   root.right= helperinsert(data,root.right);
}
return root;



}



public void insert(int data)
{
   root= helperinsert(data,root);
}


private BinaryTreeNode<Integer> helperdelete(int data,BinaryTreeNode<Integer>root)
{
if(root==null)
{
return null;
}

if(data<root.data)
{
root.left=helperdelete(data, root.left);
return root;
}
else if(data>root.data){
    root.right=helperdelete(data, root.right);
    return root;
}
else 
{
    if(root.left==null&&root.right==null)
    {
   return null;
}

    if(root.left==null)
    {
      return root.right;
    }
    else if(root.right==null)
    {
      return root.left;
    }
    else{
        BinaryTreeNode<Integer>minnode=root.right;
        while(minnode.left!=null)
        {
            minnode=minnode.left;
        }
        root.data=minnode.data;
       root.right= helperdelete(minnode.data, root.right);
       return root;
    }


}

}


public void delete(int data)
{
root=helperdelete(data,root);

}


private  boolean helperhasdata(int data,BinaryTreeNode<Integer>root)
{
    if(root==null)
    {
return false;
    }
    if(root.data==data)
    {
return true;
    }

    if(data<root.data)
    {
    boolean ans=helperhasdata(data,root.left);
    if(ans==true)
    {
        return true;
    }
    }
    else{
    boolean ans=helperhasdata(data,root.right);
    if(ans==true)
    {
        return true;
    }
    }
    return false;

}
public  boolean hasdata(int data)
{


    boolean ans=helperhasdata(data,root);
    return ans;
}

private void print(BinaryTreeNode<Integer>root)
{

if(root==null)
{
    return;
}
System.out.print(root.data+":");
if(root.left!=null)
{
System.out.print("L:" + root.left.data+",");
}
if(root.right!=null)
{
System.out.print("R:"+root.right.data);
}
System.out.println();


    print(root.left);
    print(root.right);
}


public void Printtree()
{
    print(root);
}



}
