
package Balancedparenthesis;


public class Balanced {



public static boolean isbalanced(String str) 
{
    StackusingLL stack= new StackusingLL();
    int i=0;
    int n=str.length();
    if(n==0)
    {
        return true;
    }
    while(i<n)
    {
    if(str.charAt(i)=='{')
        {
         stack.push("{");
         i++;
        }
        else if(str.charAt(i)=='('){
       stack.push("(");
       i++;
        }
        else if(str.charAt(i)=='[')
        {
     stack.push("[");
     i++;
        }
        else if(str.charAt(i)=='}')
        {
            if(stack.Top()=="{")
            {
      stack.pop();
      i++;
            }
            else{
                return false;
            }
        }
        else if(str.charAt(i)==')')
        {
            if(stack.Top()=="(")
            {
                stack.pop();
                i++;
            }
            else{
                return false;
            }

        }
        else if(str.charAt(i)==']')
        {
            if(stack.Top()=="[")
            {
                stack.pop();
                i++;
            }
            else{
                return false;
            }
            
        }
        else{
        i++;
    }
}
if(stack.size()==0)
{
    return true;
}
return false;

}


    public static void main(String[]args)
    {
       String str="{{}}";
       boolean ans=isbalanced(str);
       System.out.println(ans);

    }


}
