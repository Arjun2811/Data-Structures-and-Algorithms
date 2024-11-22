package Count;

import java.util.Scanner;

public class Treeuse {


public static TreeNode<Integer> takeinputLevelwise1()
{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the root node");
    int rootdata=s.nextInt();
    TreeNode<Integer> root=new TreeNode<>(rootdata);
    QueueusingLL<TreeNode<Integer>> pendingnodes=new QueueusingLL<>();
    pendingnodes.Enqueue(root);
    while(!pendingnodes.isempty())
    {
        try {
            TreeNode<Integer>frontnode=pendingnodes.Dequeue();

System.out.println("Enter the children for "+frontnode.data);
int children=s.nextInt();
int i=0;
while(i<children)
{
    System.out.println("Enter the "+i+ " th child for "+ frontnode.data);
    int child=s.nextInt();
    TreeNode<Integer>Childnode=new TreeNode(child);
    frontnode.Children.add(Childnode);
    pendingnodes.Enqueue(Childnode);
    i++;
}



        } catch (QueueEmptyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    return root;

}
public static void Print(TreeNode<Integer>root)
{
    QueueusingLL<TreeNode<Integer>> pendingnodes=new QueueusingLL<>();
    pendingnodes.Enqueue(root);
    while(!pendingnodes.isempty())
    {
        int levelsize=pendingnodes.size();
        int i=0;
        while(i<levelsize)
        {
            try {
                TreeNode<Integer>frontnode=pendingnodes.Dequeue();
                System.out.print(frontnode.data+" ");
                int f=0;
                while(f<frontnode.Children.size())
                {
                    pendingnodes.Enqueue(frontnode.Children.get(f));
                    f++;
                }
                i++;

            } catch (QueueEmptyException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        System.out.println();
    }
}


public static int CountLeaf(TreeNode<Integer>root)
{


int i=0;
int ans=0;
while(i<root.Children.size())
{
     int count=CountLeaf(root.Children.get(i));
     ans=ans+count;

    i++;
}
if(root.Children.size()==0)
{
    ans++;

}
return ans;

}

public static void ReplaceNodewithDepth(TreeNode<Integer>root,int f)
{
if(root==null)
{
    return;
}
int i=0;
while(i<root.Children.size())
{
   
    ReplaceNodewithDepth(root.Children.get(i), f+1);
    i++;
    
    }
root.data=f;
}
public static void ReplaceNodewithDepth(TreeNode<Integer>root)
{
int f=0;
ReplaceNodewithDepth(root,f);
}

public static void main(String[]args)
{
    TreeNode<Integer>root=takeinputLevelwise1();
    Print(root);
//    int leaf= CountLeaf(root);
//    System.out.println(leaf);
   ReplaceNodewithDepth(root);
   Print(root);
}

}