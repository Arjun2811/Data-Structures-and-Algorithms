package LevelWise;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Treeuse {

// public static TreeNode<Integer> TakeInputLevelWise() 
// {
//     Scanner s = new Scanner(System.in);
//     System.out.println("Enter the root node");
//     int rootdata=s.nextInt();
//     QueueusingLL<TreeNode<Integer>> pendingnodes=new QueueusingLL<>() ;
//     TreeNode<Integer> root= new TreeNode<>(rootdata);
//     pendingnodes.Enqueue(root);
    
//         while(!pendingnodes.isempty())
//         {
//         try{
        
//             TreeNode<Integer>frontnode=pendingnodes.Dequeue();
//             System.out.println("enter number of children of "+ frontnode.data);
//             int children=s.nextInt();
//             int i=0;
//             while(i<children)
//             {
//                 System.out.println("Enter the "+ (i+1) +"th of" +frontnode.data);
//                 int child=s.nextInt();
//                 TreeNode<Integer> childNode=new TreeNode<>(child);
//                 frontnode.Children.add(childNode);
//                 pendingnodes.Enqueue(childNode);
//                 i++;
//             }
//         }
//     catch (QueueEmptyException e) {
//         return null;  // TODO: handle exception
//     }
// }
// return root;
// }


public static TreeNode<Integer> TakeInputLevelWise() throws QueueEmptyException
{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the root node");
    int rootdata=s.nextInt();
    TreeNode<Integer> root= new TreeNode<Integer>(rootdata);
    QueueusingLL<TreeNode<Integer>> pendingnodes=new QueueusingLL<>();
    pendingnodes.Enqueue(root);
    while(!pendingnodes.isempty())
    {
        TreeNode<Integer>frontnode=pendingnodes.Dequeue();
        System.out.println("Enter the number of children for "+frontnode.data);
        int children=s.nextInt();
        int i=0;
        while(i<children)
        {
            System.out.println("Enter the"+i+"th child of"+frontnode.data);
            int child=s.nextInt();
            TreeNode<Integer>childnode=new TreeNode<Integer>(child);
            frontnode.Children.add(childnode);
            pendingnodes.Enqueue(childnode);
            i++;
        }
    }
    return root;

}




    
//     public static void print(TreeNode<Integer>root) //different way of print
//     {
//         QueueusingLL<TreeNode<Integer>> pendingnodes= new QueueusingLL<>();
//         pendingnodes.Enqueue(root);
//         while(!pendingnodes.isempty())
//         {String str="";
//                try {
//                 TreeNode<Integer>frontnode=pendingnodes.Dequeue();
//                 str+=frontnode.data + ":";
// int i=0;
// while(i<frontnode.Children.size())
// {
//     pendingnodes.Enqueue(frontnode.Children.get(i));
//     str+=frontnode.Children.get(i).data+ ", ";
//     i++;

// }
// System.out.println(str);



//             } catch (QueueEmptyException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }


//         }
//     }


public static  void print(TreeNode<Integer>root){  

    QueueusingLL<TreeNode<Integer>>pendingnodes=new QueueusingLL<>();
    pendingnodes.Enqueue(root);
    while(!pendingnodes.isempty())
    {
        int levelsize=pendingnodes.size();
        int i=0;
        while(i<levelsize)
        {
           TreeNode<Integer> frontnode;
        try {
            frontnode = pendingnodes.Dequeue();
            System.out.print(frontnode.data+" ");
           int f=0;
           while(f<frontnode.Children.size())
           {
pendingnodes.Enqueue(frontnode.Children.get(f));
f++;
           }
           i++;
        

        } catch (QueueEmptyException e) {
            
       System.out.println("queue is empty");
        }
        }
        System.out.println();

    }
}

public static int Numofnodes(TreeNode<Integer>root)
{if(root==null)//"this is a edge case not a base case".base case is when recursion chota hoye jara h and vo akhir m aopne chote point p lg ke return hota h.
                  //is ques m  base case vala kaam while loop krra h
    {
        return 0;
    }

int count=1;
int i=0;
while(i<root.Children.size())//in this recursion 'while' is  working as the base class bcoz if children is 0 it is simply returning which is generally the work of base class when we do
{
count+=Numofnodes(root.Children.get(i));
i++;
}
return count;

}
public static int sumofnodes(TreeNode<Integer>root)
{
if(root==null)
{
    return 0;
}

    int i=0;
    int ans=root.data;
    while(i<root.Children.size())
    {
        ans+=sumofnodes(root.Children.get(i));
        i++;
    }
    return ans;
}



    public static void main(String[]args) throws QueueEmptyException
    {
        TreeNode<Integer>root=TakeInputLevelWise();
        //print(root);
        //int ans=Numofnodes(root);
        //System.out.println(ans);
        int result=sumofnodes(root);
       System.out.println(result);
    }
}
