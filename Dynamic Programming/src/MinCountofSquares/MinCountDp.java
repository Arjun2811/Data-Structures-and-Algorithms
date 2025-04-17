package MinCountofSquares;

public class MinCountDp {


public static int MinCount(int n,int[]storage)
{
storage[0]=0;
int i=1;


while(i<storage.length) {
    int min=Integer.MAX_VALUE;
int f=1;
while(f*f<=i)
{
    int minway=storage[i-(f*f)];
if(minway<min)
{
    min=minway;
}

    f++;

}
storage[i]=min+1;
i++;

}
return storage[n];
}
public static int MinCount(int n)
{
    int storage[]= new int[n+1];
    return MinCount(n,storage);
}
    public static void main(String[]args)
    {
        System.out.println(MinCount(3));
    }
}
