package Largest;

import java.util.Scanner;

public class TreeUse {


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

public static TreeNode<Integer> takeinputLevelwise2()
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
public static int Largest(TreeNode<Integer>root)
{
if(root==null)
{
    return Integer.MIN_VALUE;
}

int i=0;
int ans=root.data;
while(i<root.Children.size())
{
    int secondans=Largest(root.Children.get(i));
    if(secondans>ans)
    {
        ans=secondans;
    }
    i++;
}
return ans;

}

public static int greaterx(TreeNode<Integer>root,int x)
{
    if(root==null)
    {
        return 0;
    }
int count=0;
int i=0;
if(root.data>x)
{
    count=1;
}

while(i<root.Children.size())
{
    int ans= greaterx(root.Children.get(i),x);
    count+=ans;
    i++;
    

}
return count;

}

public static int Height(TreeNode<Integer>root)
{if(root.data==0)
    {
        return 0;
    }

    int h=0;
QueueusingLL <TreeNode<Integer>> pendingnodes=new QueueusingLL();
pendingnodes.Enqueue(root);
while(!pendingnodes.isempty())
{int i=0;
    h++;
    int levelsize=pendingnodes.size();
    while(i<levelsize)
    {
          try {
            TreeNode<Integer> frontnode= pendingnodes.Dequeue();
         int f=0;
         while(f<frontnode.Children.size())
         {
          pendingnodes.Enqueue(frontnode.Children.get(f));
          f++;
         }
         i++;

        } catch (QueueEmptyException e) {
            // TODO Auto-generated catch block
            System.out.println("stack is empty");
        }
    }

}
return h;

}
public static int HeightRecursive(TreeNode<Integer>root)
{
if(root.data==0)
{
    return 0;
}





int max=0;
    int smallheight=0;
int i=0;
    while(i<root.Children.size())
    {
         smallheight= HeightRecursive(root.Children.get(i));
     if(smallheight>max)
    {
       max=smallheight;
      }
         

          i++;
    }
    int actualheight=max+1;
    return actualheight;
}


public static void depth(TreeNode<Integer>root,int k)
{
if(k<0)
{
    System.out.println(-1);
}

if(k==0)
{
    System.out.println(root.data);
    return;
}



int i=0;
while(i<root.Children.size())
{
depth(root.Children.get(i),k-1);
i++;
}


}
public static int CountLeafNodes(TreeNode<Integer>root)
{



int count=0;
int smallans=0;
    int i=0;
    int ans=0;
    while(i<root.Children.size())
    {
         smallans=CountLeafNodes(root.Children.get(i));
        ans+=smallans;
        i++;
    }
    if(root.Children.size()==0)
    {
        count=1;
        return count;
    }
   
return ans;
}

public static void preorder(TreeNode<Integer>root)
{
if(root==null)
{
    return;
}
    System.out.print(root.data+" ");
    int i=0;
    while(i<root.Children.size())
    {
        preorder(root.Children.get(i));
        i++;
    }
}

public static void postorder(TreeNode<Integer>root)
{
if(root==null)
{
    return;
}


    int i=0;
    while(i<root.Children.size())
    {
postorder(root.Children.get(i));
i++;
    }
    System.out.print(root.data);
    
}

public static boolean Containx(TreeNode<Integer>root,int x)
{if(root==null)
    {
        return false;
    }

int i=0;
boolean ans=false;
while(i<root.Children.size())
{
    if(ans==true)
    {
        i++;
    }
    else{
     ans=Containx(root.Children.get(i),x);
    i++;
}
}
if(ans==true)
{
    return true;
}
else if(root.data==x)
{
    return true;
}
else{
    return false;
}

}


//this sum is part of max function
public static int Sum(TreeNode<Integer>root)
{
    int sum=root.data;
    int i=0;
    while(i<root.Children.size())
    {
      sum+=root.Children.get(i).data;
      i++;
    }
    return sum;
}




public static TreeNode<Integer> max(TreeNode<Integer>root)
{int rootsum=Sum(root);
    int max=0;
TreeNode<Integer>maxnode=root;

int i=0;
while(i<root.Children.size())
{
 TreeNode<Integer>maxnode1=max(root.Children.get(i)) ;
 if(max<Sum(maxnode1))
 {
    max=Sum(maxnode1);
    maxnode=maxnode1;
 }
 
i++;
}

if(rootsum>max)
{
    return root;
}
return maxnode;



}

public static boolean IdenticalStructure(TreeNode<Integer>root1,TreeNode<Integer>root2)
{
if(root1.data!=root2.data)
{
    return false;
}
if(root1.Children.size()!=root2.Children.size())
{
    return false;
}
int i=0;
boolean ans=true;

while(i<root1.Children.size()&&i<root2.Children.size())
{

    boolean smallans=IdenticalStructure(root1.Children.get(i), root2.Children.get(i));
    if(smallans==false)
    {
     ans=false;
    }
    i++;
}
return ans;
}
public static TreeNode<Integer> Larger(TreeNode<Integer>root1,int n)
{
int f=0;
int i=0;
TreeNode<Integer>ans=root1;
while(i<root1.Children.size())
{

     TreeNode<Integer>smallans=Larger(root1.Children.get(i),n);
     if(f==0)
     {
        if(smallans.data>n)
        {
            ans=smallans;
            f++;
        }
     }
     else if(smallans.data<ans.data&&smallans.data>n)
     {
     ans=smallans;
     }
     i++;
}
if(root1.data>n&&root1.data<ans.data)
{
return root1;
}
return ans;
}

public static Custom SecondLargest(TreeNode<Integer>root,int g)
{if (root == null) return new Custom(null, null);
int f=0;
int max=root.data;
int secondmax=Integer.MIN_VALUE;
TreeNode<Integer>second=new TreeNode<Integer>(null);
Custom helper=new Custom(root,second);
    int i=0;
    while(i<root.Children.size())
    {
       helper= SecondLargest(root.Children.get(i),g);
       if(f==0)
       {
        max=helper.max.data;
        secondmax=helper.secondmax.data;
        f++;
       }
       
 else if(helper.max.data>max){

    secondmax=max;
    max=helper.max.data;
}else if(helper.max.data>secondmax)
{
   secondmax=helper.max.data;
}
        i++;
        }
    if(root.data>secondmax&&root.data<max)
    {
        secondmax=root.data;
    
    }
    
        helper.max.data=max;
        helper.secondmax.data=secondmax;
        return helper;
    
   

}
public static TreeNode<Integer> SecondLargest(TreeNode<Integer>root)
{

Custom helper=SecondLargest(root,0);
return helper.secondmax;

}


    public static void main(String[]args)
    {
        TreeNode<Integer>root1=takeinputLevelwise1();
       // TreeNode<Integer>root2=takeinputLevelwise2();
        Print(root1);
        //Print(root2);
        //int ans=Largest(root);
        //System.out.println(ans);
       
        //int ans=greaterx(root,3);
        //System.out.println(ans);
       //int h= Height(root);
       //System.out.println(h);
      //int h= HeightRecursive(root);
      //System.out.println(h);
      //depth(root,2);(printing question)
      //int ans=CountLeafNodes(root);
      //System.out.println(ans);
      //preorder(root);
      //postorder(root);
      //Boolean ans=Containx(root,7);
      //System.out.println(ans);
      //TreeNode<Integer>ans=max(root);
      //System.out.println(ans.data);
      //boolean ans=IdenticalStructure(root1,root2);
     // System.out.println(ans);
    // TreeNode<Integer>ans= Larger(root1,2);
    // System.out.println(ans.data);
    TreeNode<Integer>secondmax=SecondLargest(root1);
    System.out.println(secondmax.data);






       }

    }

