package Tree;
import java.util.Scanner;
public class Treeuse {


public static TreeNode<Integer> Takeinput(Scanner s)
{
    //Scanner s = new Scanner(System.in);      yha hoga toh ek sath sari values ni de skte reason register m likha h
    System.out.println("Enter the root Node");
    int n=s.nextInt();
    
    TreeNode<Integer> root=new TreeNode<Integer>(n);
    System.out.println("Enter the number of child" + "of "+n);
    int childcount=s.nextInt();
int i=0;
while(i<childcount)
{
    TreeNode<Integer>child=Takeinput(s);
    root.Children.add(child);
    i++;
}
return root;

}
public static void print(TreeNode<Integer>root)
{
String s=root.data+":";
int i=0;
while(i<root.Children.size())
{
    s+=root.Children.get(i).data+",";
    i++;
}
System.out.println(s);
i=0;
while(i<root.Children.size())
{
    print(root.Children.get(i));
    i++;
}
}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TreeNode<Integer> root=Takeinput(s);
        print(root);

    }

}
