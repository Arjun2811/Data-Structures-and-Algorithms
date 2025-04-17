package ByteLandian;

import java.util.HashMap;

public class LandianDP {



    public static Long LandianDP(Long n,HashMap h1)
    {
long x=0;
long y=1;
h1.put(x,x);
h1.put(y,y);
long i=2;
while(i<=n/2)
{
    long a=(long)h1.get(i/2);
    long b =(long)h1.get(i/3);
    long c=(long)h1.get(i/4);
    if(a+b+c>i)
    {
h1.put(i,a+b+c);
    }
    else{
        h1.put(i,i);
    }
    i++;

}
long a=(long)h1.get(n/2);
long b=(long)h1.get(n/3);
long c=(long)h1.get(n/4);
if(a+b+c>n)
{
    h1.put(n,a+b+c);
}
else{
    h1.put(n,n);
}

return (long)h1.get(n);
    }
    // public static long LandianDP(long n, HashMap<Long, Long> h1) {   2nd approach


    //     long x=0;
    //     long y=1;
    //     h1.put(x,x);
    //     h1.put(y,y);
    //     long i=2;
    //     while(i<=n)
    //     {
    //         long a=(long)h1.get(i/2);
    //         long b =(long)h1.get(i/3);
    //         long c=(long)h1.get(i/4);
    //         if(a+b+c>i)
    //         {
    //     h1.put(i,a+b+c);
    //         }
    //         else{
    //             h1.put(i,i);
    //         }
    //         i++;
        
    //     }
        
    //     return (long)h1.get(n);
    //         }
        
        

    public static void main(String[]args)
    {
        long n=7747374;
HashMap<Long,Long>h1=new HashMap<>();
       Long ans= LandianDP(n,h1);
       System.out.println(ans);
    }
}
