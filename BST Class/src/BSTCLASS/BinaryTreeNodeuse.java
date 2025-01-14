package BSTCLASS;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
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
    public static void printusingqueue(BinaryTreeNode<Integer>root)
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

public static void  createinsert(BinaryTreeNode<Integer>root)
{

if(root==null)
{
    return;
}




    createinsert(root.left);
    createinsert(root.right);
    BinaryTreeNode<Integer>node1=new BinaryTreeNode<Integer>(root.data);
BinaryTreeNode<Integer>temp=root.left;
root.left=node1;
node1.left=temp;
}
public static int LCABinaryTree(BinaryTreeNode<Integer>root,int a,int b)
{if(root==null)
    {
        return -1;
    }

if(root.data==a||root.data==b)
{
    return root.data;
}





int leftLCA=LCABinaryTree(root.left,a,b);
int rightLCA=LCABinaryTree(root.right,a,b);

if(leftLCA!=-1&&rightLCA!=-1)
{
    return root.data;
}
else if(leftLCA==-1)
{
return rightLCA;
}
else if(rightLCA==-1)
{
return leftLCA;
}
else{
    return -1;
}
}
public static int LCABST(BinaryTreeNode<Integer>root,int a ,int b)
{
if(root==null)
{
    return -1;
}

if(root.data==a||root.data==b)
{
    return root.data;
}


if(root.data>a&&root.data>b)
{
    int lcaleft=LCABST(root.left, a, b);
    return lcaleft;

}
else if(root.data<a&&root.data<b)
{
   int lcaright= LCABST(root.right, a, b);
   return lcaright;
}
else{
    int lcaleft=LCABST(root.left, a, b);
    int lcaright= LCABST(root.right, a, b);
    if(lcaleft!=-1&&lcaright!=-1)
    {
        return root.data;
    }
    else if(lcaleft==-1)
    {
        return lcaright;
    }
   else if(lcaright==-1)
    {
        return lcaleft;
    }
    else 
    {
        return -1;
    }
}
}
public static void search(int k,BinaryTreeNode<Integer>root2,int w)
{if(root2==null)
    {
        return;
    }

if(root2.data==k)
{
if(k>w)
{
    System.out.println(w+" "+k);
    root2.data=-1;
    return;
}
else if(k<w){
    System.out.println(k+" "+w);
    root2.data=-1;
    return;
}
else{
    root2.data=-1;
    return;
}

}


    search(k,root2.left,w);
    search(k,root2.right,w);
    

}


public static void Pairsum(BinaryTreeNode<Integer>root1,BinaryTreeNode<Integer>root2,int sum)
{
    if(root1==null)
    {
        return;
    }

if(root1.data!=-1)
{
    search(sum-root1.data,root2,root1.data);
}


    Pairsum(root1.left,root2,sum);
    Pairsum(root1.right,root2,sum);
}
public static ArrayList<Integer> Pairsumbetterhelper(BinaryTreeNode<Integer>root,int sum)
{

if(root==null)

{ArrayList<Integer>arr=new ArrayList<>();
    return arr;
}


   ArrayList<Integer>leftarr= Pairsumbetterhelper(root.left,sum);
    ArrayList<Integer>rightarr=Pairsumbetterhelper(root.right,sum);
   int i=0;
   while(i<rightarr.size())
   {
leftarr.add(rightarr.get(i));
i++;

   }
   leftarr.add(root.data);

   return leftarr;


}

public static void Pairsumbetter(BinaryTreeNode<Integer>root,int sum)
{
    
    ArrayList<Integer>arrnew=Pairsumbetterhelper(root,sum);
  Collections.sort(arrnew);
 for(int eleme:arrnew)
 {
    System.out.println(eleme);
 }

 int i=0;
int j=arrnew.size()-1;
while(i<j)
{
    if(arrnew.get(i)+arrnew.get(j)==sum)
    {
        System.out.println(arrnew.get(i)+" "+arrnew.get(j));
i++;
j--;
    }
    else  if(arrnew.get(i)+arrnew.get(j)>sum)
    {
j--;
}
else if(arrnew.get(i)+arrnew.get(j)<sum)
{
    i++;
}


}
}
public static void Sumroottoleaf(BinaryTreeNode<Integer>root,int k,String ans)
{
    if(root==null)
    {
        return;
    }
    k=k-root.data;
    ans+=root.data+" ";
if(k==0)
{
if(root.left==null&&root.right==null)
{
    System.out.println(ans);
    return;
}
}
Sumroottoleaf(root.left, k,ans);
Sumroottoleaf(root.right,k,ans);

}
public static int height(BinaryTreeNode<Integer>root)
{
if(root==null)
{
    return 0;
}

int leftheight=height(root.left);
int rightheight=height(root.right);

return(Math.max(leftheight,rightheight))+1;

}
public static boolean CheckBST(BinaryTreeNode<Integer>root,int min,int max)
{
if(root==null)
{
return true;
}
if(root.data<min||root.data>max)
{
return false;
}


    boolean leftoutput=CheckBST(root.left,min,root.data-1);
    boolean rightoutput=CheckBST(root.right,root.data,max);
    return leftoutput&&rightoutput;
}


public static int Largestbst(BinaryTreeNode<Integer>root)
{
if(root==null)
{
    return 0;
}
if(CheckBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE)==true)
{
    return height(root);
}



int heightleftmax=Largestbst(root.left);
int heightrightmax=Largestbst(root.right);

    return Math.max(heightleftmax,heightrightmax);
}
public static LargestBST2PAIR LargestBST2(BinaryTreeNode<Integer>root)
{

if(root==null)
{
    LargestBST2PAIR ans = new LargestBST2PAIR();
    ans.min=Integer.MAX_VALUE;
    ans.max=Integer.MIN_VALUE;
    ans.isBST=true;
    ans.maxheight=0;
    return ans;
}


   LargestBST2PAIR ansleft= LargestBST2(root.left);
    LargestBST2PAIR ansright=LargestBST2(root.right);

    if(ansleft.isBST&&ansright.isBST)
    {
        if(root.data>ansleft.max&&root.data<=ansright.min)
        {
            LargestBST2PAIR ans = new LargestBST2PAIR();
            if(ansleft.max==Integer.MIN_VALUE)
            {
                ans.min=root.data; 
            }
            else{
                ans.min=ansleft.min;
            }
           if(ansright.min==Integer.MAX_VALUE)
           {
            ans.max=root.data;
           }
           else{
            ans.max=ansright.max;
           }
         
            ans.isBST=true;
            ans.maxheight=(Math.max(ansleft.maxheight,ansright.maxheight))+1;
            return ans;
        }
    }
    else if( ansleft.maxheight>ansright.maxheight)
    {   LargestBST2PAIR ans = new LargestBST2PAIR();
        ans.min=ansleft.min;
        ans.max=ansleft.max;
        ans.isBST=false;
        ans.maxheight=ansleft.maxheight;
        return ans;

    }
   
        LargestBST2PAIR ans = new LargestBST2PAIR();
        ans.min=ansright.min;
        ans.max=ansright.max;
        ans.isBST=false;
        ans.maxheight=ansright.maxheight;
        return ans;
}
public static int helper(int k,BinaryTreeNode<Integer>root2)
{
if(root2==null)
{
    return 0;
}
int ans=0;
    if(root2.data>=k)
    {
ans=root2.data;
    }


   int ansleft= helper(k,root2.left);
   int ansright= helper(k,root2.right);

    return ansleft+ansright+ans;

}
public static ArrayList<Integer> ReplacewithLargerNode(BinaryTreeNode<Integer>root,BinaryTreeNode<Integer>root2,ArrayList<Integer>arr)
{if(root==null)
    {
        return arr;
    }

   int finalans= helper(root.data,root2);
  arr.add(finalans);




    ReplacewithLargerNode(root.left,root2,arr);
    ReplacewithLargerNode(root.right,root2,arr);

    return arr;
}
public static void helper2(BinaryTreeNode<Integer>root,BinaryTreeNode<Integer>root2)
{
    ArrayList<Integer>arr= new ArrayList<>();
    ArrayList<Integer>arrfinal=ReplacewithLargerNode(root,root2,arr);

  helper3(root,arrfinal);


  
    
}
public static void helper3(BinaryTreeNode<Integer>root,ArrayList<Integer>arrfinal){

if(root==null)
{
    return;
}

root.data=arrfinal.get(0);
arrfinal.remove(0);



helper3(root.left,arrfinal);
helper3(root.right,arrfinal);

}

public static int Replacewithlargernodebetter(BinaryTreeNode<Integer>root,int sum)
{


if(root==null)
{
    return 0;
}


int right=Replacewithlargernodebetter(root.right,sum);
int rootdata=root.data;
root.data=root.data+right +sum;
int left=Replacewithlargernodebetter(root.left,root.data);

return rootdata+left+right;
}


public static void PairSumBST(BinaryTreeNode<Integer>root,int sum)
{
    Stack <BinaryTreeNode>s1= new Stack();
    Stack<BinaryTreeNode> s2= new Stack();

    pushleft(s1,root);
    pushright(s2,root);

while(!s1.isEmpty()&&!s2.isEmpty())
{

  int a=(int)s1.peek().data;
  int b=(int)s2.peek().data;

if(a>=b)
{
    break;
}


else if(a+b==sum)
{System.out.println(a+","+b);
    BinaryTreeNode<Integer>tempnode=s2.peek().left;
    s2.pop();
    pushright(s2,tempnode);

    BinaryTreeNode<Integer>tempnode2=s1.peek().right;
    s1.pop();
    pushleft(s1, tempnode2);
}


  else if(a+b>sum)
  {
    BinaryTreeNode<Integer>tempnode=s2.peek().left;
    s2.pop();
    pushright(s2,tempnode);
  }
  else if(a+b<sum)
  {
    BinaryTreeNode<Integer>tempnode=s1.peek().right;
    s1.pop();
    pushleft(s1, tempnode);
  }
}





}
public static void pushleft(Stack<BinaryTreeNode>s1,BinaryTreeNode<Integer>root)
{
    while(root!=null)
    {
        s1.push(root);
        root=root.left;
    }
}
public static void pushright(Stack<BinaryTreeNode>s2,BinaryTreeNode<Integer>root)
{


    while(root!=null)
    {
        s2.push(root);
        root=root.right;
    }
}



    public static void main(String[]args)
    {
        BinaryTreeNode<Integer>root=TakeinputLevelwise();
        printusingqueue(root);

        // BinarySearchTree bst=new BinarySearchTree(); for bst class when using this comment the aobe two function.
        // bst.insert(10);
        // bst.insert(5);
        // bst.insert(20);
        // bst.insert(3);
        // bst.insert(7);
        // bst.insert(15);
        // bst.Printtree();
        // bst.delete(10);
        // bst.Printtree();

        // createinsert(root);
        // System.out.println("new printing");
        // printusingqueue(root);

        // int ans=LCABinaryTree(root,2,10);
        // System.out.println(ans);

        // int ans=LCABST(root,12,78);
        // System.out.println(ans);

        // Pairsum(root,root,15);
        // Pairsumbetter(root, 8);


        // Sumroottoleaf(root,13,"");

    //    int ans= Largestbst(root);
    //    System.out.println(ans);

    // LargestBST2PAIR ans=LargestBST2(root);
    // System.out.println(ans.maxheight);

    // helper2(root,root);//Replace with larger node question
    // printusingqueue(root);

    // int ans=Replacewithlargernodebetter(root,0);
    // System.out.println(ans);
    // printusingqueue(root);



    PairSumBST(root,21);
    }



}