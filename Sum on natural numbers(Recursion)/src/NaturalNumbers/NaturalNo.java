package NaturalNumbers;

public class NaturalNo
{

    public static int SumNaturalNo(int n)
    {
        if(n==1)
        {
            return 1;
        }
    
    int smallans=SumNaturalNo(n-1);
        return n+ smallans;
    
    }
    public static void main(String[]args)
    {
        int n=5;
        int ans=SumNaturalNo(5);
        System.out.println(ans);
    }

}