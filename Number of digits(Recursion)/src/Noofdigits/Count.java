package Noofdigits;
public class Count {



    public static int count(int n)
    {
if(n==0)
{
    return 0;
}
//int count;
//count++;


int smallans=count(n/10);

return smallans+1;

}












    
    public static void main(String[]args)
    {
        int n=123;
        int ans =count(n);
        System.out.println(ans);
    }
}
