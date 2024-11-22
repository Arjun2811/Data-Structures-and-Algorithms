package CheckRedundant;

public class CheckRedundant {

public static boolean Check(String str) 
{
    StackusingLL<Character> stack= new StackusingLL<>();
int i=0;
int n=str.length();
int count=0;
int ans=0;

while(i<n)
{
if(str.charAt(i)==')')
{count=0;
    try {
        ans=0;
        while(stack.Top()!='(')
        {
if(stack.Top()== '+'|| stack.Top()=='-'||stack.Top( )=='*'||stack.Top()=='/')
{
    ans=1;
}

         stack.pop();
       
        count++;
        
        }
         stack.pop();
        
    } catch (StackEmptyException e) {
       return true;
    }
    i++;
    
    if(count==0)
    {
   return true;
    }
    if(count==1&&ans==0)
    {
        return true;
    }
    

}
else{
    stack.push(str.charAt(i));
i++;

}
}
return false;


}




    public static void main(String[]args) 
    {
        Boolean ans =Check("()");
        System.out.println(ans);
    }
}
