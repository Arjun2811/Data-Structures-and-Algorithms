package MinimumBracket;
import java.util.Stack;

public class Minimum {


    public static int Minimum(String str)
    {int count=0;
        
Stack<Character> stack= new Stack();
if(str.length()%2!=0)
{
return -1;
}
int i=0;
int n=str.length();
while(i<n)
{
if(str.charAt(i)=='{')
{
    stack.push('{');
}
else if(str.charAt(i)==('}'))
{
    if(!stack.isEmpty()&&stack.peek()=='{')
    {
        stack.pop();
    }
    else{
        stack.push('}');
    }

}
i++;
}
while(!stack.isEmpty())
{
char c1= stack.peek();
stack.pop();
char c2=stack.peek();
stack.pop();
if(c1==c2)
{
    count++;
}
else{
    count+=2;
}
}
return count;
    }
public static void main(String[] args) {
    String str="}{{{}}";
    int ans=Minimum(str);
    System.out.println(ans);
    
}
}
