package MinCountofSquares;

public class MinCountRecursion {


public static int MinCount(int n)
{
if(n==0)
{
    return 0;
}

int min=Integer.MAX_VALUE;
int i=1;
while(i*i<=n)
{
int minsquarecount=MinCount(n-(i*i));
if(minsquarecount<min)
{
    min=minsquarecount;
}
i++;

}
return 1+min;


}
    public static void main(String[]args)
    {
        int ans=MinCount(10);
        System.out.println(ans);
    }
}