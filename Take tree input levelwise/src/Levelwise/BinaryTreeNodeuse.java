package Levelwise;

import java.util.ArrayList;
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
public static int Largest(BinaryTreeNode<Integer>root)
{if(root==null)
    {
        return -1;
    }
    
    int largest=0;
      int a= Largest(root.left);
       int b=Largest(root.right);
    //    if(a>=b) both approaches(if else approach and formula approach of math max are fine)
    //    {
    //     largest=a;
    //    }
    //    else{
    //     largest=b;
    //    }
    //    if(root.data>largest)
    //    {
    //     return root.data;
    //    }
    //    else{
    //     return largest;
    //    }
   return Math.max(root.data,Math.max(a,b));
}
public static int NodeX(BinaryTreeNode<Integer>root,int X)
{if(root==null)
    {
        return 0;
    }


    int a=0;
    int b=0;
    a=NodeX(root.left,X);
    b=NodeX(root.right,X);
int ans=a+b;
    if(root.data>X)
    {
        ans++;

    }
    return ans;
}
public static int Height(BinaryTreeNode<Integer>root)
{if(root==null)
    {
        return 0;
    }



int a=0;
int b=0;
    a=Height(root.left);
    b=Height(root.right);
   int larger=Math.max(a,b);
   int ans=larger+1;
   return ans;

}
public static int Numberleaves(BinaryTreeNode<Integer>root)
{
if(root==null)
{
    return 0;
}
if(root.left==null&&root.right==null)
{
return 1;
}


//     int a=Numberleaves(root.left);   both ways are correct can write this step in either way
//    int b= Numberleaves(root.right);
//    return a+b;
   return Numberleaves(root.left)+Numberleaves(root.right);
}

public static void printnodesatdepthK(BinaryTreeNode<Integer>root,int k)
{

    if(root==null)
    {
        return;
    }
if(k==0)
{
    System.out.print(root.data+" ");
    return;
}



    printnodesatdepthK(root.left,k-1);
    printnodesatdepthK(root.right,k-1);
}


public static void Replacenodewithdepth(BinaryTreeNode<Integer>root,int k)
{
   if(root==null)
   {
    return;
   }
   root.data=k;




Replacenodewithdepth(root.left,k+1);
System.out.print(root.data+" ");
Replacenodewithdepth(root.right,k+1);




}

public static void Replacenodewithdepth(BinaryTreeNode<Integer>root)
{
    int k=0;
    Replacenodewithdepth(root,k);
}
public static void NodesWithoutSiblings(BinaryTreeNode<Integer>root)
{
if(root==null)
{
    return;
}

if(root.right==null&&root.left!=null)
{
System.out.print(root.left.data+" ");
}

if(root.left==null&&root.right!=null)
{
System.out.print(root.right.data+" ");
}


NodesWithoutSiblings(root.left);
NodesWithoutSiblings(root.right);
// if(root.left==null&&root.right!=null)
// {
// System.out.print(root.right.data+" ");
// }
// if(root.right==null&&root.left!=null)
// {
// System.out.print(root.left.data+" ");
// }




}
public static BinaryTreeNode<Integer> Removeleafnodes(BinaryTreeNode<Integer>root)//Remove leaf Nodes
{
    if(root==null)
    {
        return null;
    }
    if(root.left==null&&root.right==null)
    {
        return null;
    }

   root.left= Removeleafnodes(root.left);
   root.right= Removeleafnodes(root.right);
    return root;
}

public static int height(BinaryTreeNode<Integer>root) //"height" needed for many functions
{if(root==null)
    {
        return 0;
    }

    int a=height(root.left);
    int b=height(root.right);
    return Math.max(a,b)+1;




}



public static boolean isBalanced(BinaryTreeNode<Integer>root)//is balanced
{
if(root==null)
{
    return true;
}
int h1=height(root.left);
int h2=height(root.right);
if(Math.abs(h1-h2)>1)
{
   return false;
}
boolean ansleft=isBalanced(root.left);
boolean ansright=isBalanced(root.right);

return ansleft&&ansright;
}
public static balanced isbalancedbetter(BinaryTreeNode<Integer>root)//is balanced better
{
if(root==null)
{
int height=0;
boolean isbal=true;
balanced ans=new balanced();
ans.height=height;
ans.isbalanced=isbal;
return ans;
}

   balanced leftoutput= isbalancedbetter(root.left);
    balanced rightoutput=isbalancedbetter(root.right);
    balanced finalans=new balanced();
    finalans.height=1+Math.max(leftoutput.height,rightoutput.height);
    finalans.isbalanced=true;

if(Math.abs(leftoutput.height-rightoutput.height)>1)
{
    finalans.isbalanced=false;
 
}
if(!leftoutput.isbalanced||!rightoutput.isbalanced)
{
    finalans.isbalanced=false;
}
return finalans;
}
public static int diameter(BinaryTreeNode<Integer>root)//diameter
{if(root==null)
    {
        return 0;
    }

int rootdiameter=height(root.left)+height(root.right);

    int leftdiameter=diameter(root.left);
    int rightdiameter=diameter(root.right);
  int ans= Math.max(rootdiameter,Math.max(leftdiameter,rightdiameter));
   return ans;
}
public static diameterimprove<Integer,Integer> diameterimproved(BinaryTreeNode<Integer>root)//diameter improve
{if(root==null)
    {
        diameterimprove<Integer,Integer> d1=new diameterimprove<>(0, 0);
        return d1;
    }

    diameterimprove<Integer,Integer> outputleft=diameterimproved(root.left);
    diameterimprove<Integer,Integer> outputright=diameterimproved(root.right);

    int latestheight=Math.max(outputleft.height,outputright.height)+1;
    int option1=outputleft.height+outputright.height;
    int latestdiameter =Math.max(option1,Math.max(outputleft.diameter,outputright.diameter));

    diameterimprove <Integer,Integer>d2= new diameterimprove<>(latestheight, latestdiameter);
    return d2;


}
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){//diameter of binary tree
if(root==null)
    {
        return 0;
    }

int rootdiameter=height(root.left)+height(root.right)+1;

    int leftdiameter=diameterOfBinaryTree(root.left);
    int rightdiameter=diameterOfBinaryTree(root.right);
  int ans= Math.max(rootdiameter,Math.max(leftdiameter,rightdiameter));
   return ans;
	}

    public static void Mirror(BinaryTreeNode<Integer>root)
    {if(root==null)
        {
            return;
        }



        Mirror(root.left);
        Mirror(root.right);

        BinaryTreeNode<Integer>temp=root.left;
       root.left= root.right;
       root.right=temp;
    }
public static void inorder(BinaryTreeNode<Integer>root)
{
if(root==null)
{
    return;
}

inorder(root.left);
System.out.print(root.data+" ");
inorder(root.right);

}
public static void preorder(BinaryTreeNode<Integer>root)
{
    if(root==null)
    {
        return;
    }

System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
}

public static void postorder(BinaryTreeNode<Integer>root)
{
    if(root==null)
    {
        return;
    }



    postorder(root.left);
    postorder(root.right);
    System.out.println(root.data);
}
public static BinaryTreeNode<Integer> Buildtree(int in[],int pre[],int insi,int inei,int presi,int preei)
{if(insi>inei)
    {
        return null;
    }

    int rootdata=pre[presi];
    BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootdata);

    int rootindex=-1;
    int i=insi;
    while(i<=inei)
    {
       if(in[i]==rootdata)
       { rootindex=i;
          break;
       } 
       i++;
    }
       if(rootindex==-1)
       {
        return null;
       }
    
int leftinsi=insi;
int leftinei=rootindex-1;
int leftpresi=presi+1;
int leftpreei=leftinei-leftinsi+leftpresi;
int rightinsi=rootindex+1;
int rightinei=inei;
int rightpresi=leftpreei+1;
int rightpreei=preei;





root.left=Buildtree(in,pre,leftinsi,leftinei,leftpresi,leftpreei);
root.right=Buildtree(in, pre, rightinsi, rightinei, rightpresi, rightpreei);


return root;

}

public static BinaryTreeNode<Integer> Buildtree2(int po[],int in[],int posi,int poei,int insi,int inei)
{
    if(insi>inei)
    {
        return null;
    }
   int rootdata= po[poei];
   BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);

   int rootindex=-1;
   int i=insi;
   while(i<=inei){

    if(in[i]==rootdata)
    {
        rootindex=i;
        break;
    }
    i++;
   }

   if(rootindex==-1)
   {
    return null;
   }

   int leftinsi=insi;
   int leftinei=rootindex-1;
int leftposi=posi;
int leftpoei=leftinei-leftinsi+leftposi;

int rightinsi=rootindex+1;
int rightinei=inei;
int rightposi=leftpoei+1;
int rightpoei=poei-1;



root.left=Buildtree2(po,in,leftposi,leftpoei,leftinsi,leftinei);
root.right=Buildtree2(po,in,rightposi,rightpoei,rightinsi,rightinei);
return root;

}

public static void Insertduplicate(BinaryTreeNode<Integer>root)
{
if(root==null)
{
    return;
}




Insertduplicate(root.left);
Insertduplicate(root.right);

int duplicate=root.data;
BinaryTreeNode<Integer>duplicatenode=new BinaryTreeNode<Integer>(duplicate);
BinaryTreeNode<Integer>temp=root.left;
root.left=duplicatenode;
duplicatenode.left=temp;

}
public static Pair<Integer,Integer> maxminNode(BinaryTreeNode<Integer>root)
{
if(root==null)
{
    Pair<Integer,Integer> ans= new Pair<>(Integer.MIN_VALUE,Integer.MAX_VALUE);
    return ans;
}

    Pair<Integer,Integer> p1=maxminNode(root.left);
    Pair<Integer,Integer> p2=maxminNode(root.right);

    Pair<Integer,Integer> finalans=new Pair<>(p1.maximum,p1.minimum);
    if(p2.maximum>p1.maximum)
    {
finalans.maximum=p2.maximum;
    }
    if(p2.minimum<p1.minimum)
    {
        finalans.minimum=p2.minimum;
    }
    if(root.data>finalans.maximum)
    {
        finalans.maximum=root.data;
    }
    if(root.data<finalans.minimum)
    {
        finalans.minimum=root.data;
    }
   

    return finalans;

}
public static void Roottoleaf(BinaryTreeNode<Integer>root,int k)
{
    if(root==null)
    {
        return;
    }
    Rootleaf(root,"",k);
  
}

public static void Rootleaf(BinaryTreeNode<Integer>root,String str,int k)
{
  if(root==null)
  {
    return;
  }
if(k==0)
{
    if(root.data==0)
    {
        System.out.println(root.data);
        return;
    }
    else{
        return;
    }
}

  k=k-root.data;
  str+= root.data+" ";

  if(k==0)
  {
    if(root.left==null&&root.right==null)
    {
        System.out.println(str);
        return;
    }
    else{
        return;
    }
  }


    Rootleaf(root.left, str, k);
    Rootleaf(root.right,str,k);
   

}
public static ArrayList<Integer> Roottonodepath(BinaryTreeNode<Integer>root,int data)
{
if(root==null)
{
    return null;
}
if(root.data==data)
{
    ArrayList<Integer>output=new ArrayList<>();
    output.add(root.data);
    return output;
}


ArrayList<Integer>leftoutput=Roottonodepath(root.left,data);
if(leftoutput!=null)
{
leftoutput.add(root.data);
return leftoutput;
}
ArrayList<Integer>rightoutput=Roottonodepath(root.right, data);
if(rightoutput!=null)
{
rightoutput.add(root.data);
return rightoutput;
}

return null;




}




public static void main(String[]args)
{
    BinaryTreeNode<Integer>root=TakeinputLevelwise();
    print(root);
    // int count=Count(root);
    // System.out.println(count);
    // int sum=Sum(root);
    // System.out.println(sum);
    // boolean ans=IsNodePresent(root,7);
    // System.out.println(ans);
//    int ans= Largest(root);
//    System.out.println(ans);
// int ans=NodeX(root,2);
// System.out.println(ans);
// int ans=Height(root);
// System.out.println(ans);
// int ans=Numberleaves(root);
// System.out.println(ans);
// printnodesatdepthK(root,2);
// 
// NodesWithoutSiblings(root);
// Removeleafnodes(root);
// print(root);
// boolean ans=isBalanced(root);
// System.out.println(ans);
// balanced ans=isbalancedbetter(root);
// System.out.println(ans.isbalanced);
// int ans=diameter(root);
// System.out.println(ans);
// diameterimprove ans=diameterimproved(root);
// System.out.println(ans.diameter);
// System.out.println(ans.height);
// int ans=diameterOfBinaryTree(root);
// System.out.println(ans);
// Mirror(root);
// print(root);
// inorder(root);
// preorder(root);
//postorder(root)

// int arr1[]={4,5,2,7,3,1};
// int arr2[]={4,2,5,1,3,7};
// BinaryTreeNode<Integer>Root=Buildtree(arr1,arr2,0,arr1.length-1,0,arr2.length-1);
// print(Root);

// BinaryTreeNode<Integer>Root=Buildtree2(arr1,arr2,0,arr1.length-1,0,arr2.length-1);
// print(Root);

// Insertduplicate(root);
// System.out.println(" new root in printing");
// print(root);

// Pair<Integer,Integer>ans=maxminNode(root);
// System.out.println("maximum:"+ ans.maximum);
// System.out.println("minimum:"+ans.minimum);

// Roottoleaf(root,0);

ArrayList<Integer>output=Roottonodepath(root,6);
System.out.println(output);




}

}
