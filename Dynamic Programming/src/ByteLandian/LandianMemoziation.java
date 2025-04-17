package ByteLandian;

import java.util.HashMap;

public class LandianMemoziation {

    public static long Landianmemo(long n,HashMap memo)
    {
    if(n==1)
    {memo.put(n,n);
        long a=(long) memo.get(n);
        return a;
    }
    if(n==0)
    {
        memo.put(n,n);
        long a=(long)memo.get(n);
        return a;
    }
    if(memo.containsKey(n))
    {
        return (long)memo.get(n);
    }
    
    
    long a=Landianmemo(n/2,memo);
    long b=Landianmemo(n/3,memo);
    long c=Landianmemo(n/4,memo);
    if(a+b+c>n)
    {
        memo.put(n,a+b+c);
        return (long)memo.get(n);
    }
    else{
        memo.put(n,n);
        return (long)memo.get(n);
    }
    
    
    
    }
    public static long Landianmemo(long n)
    {
        
        HashMap<Long,Long>memo=new HashMap<>();
        return Landianmemo(n,memo);
    }
    
    
    
        public static void main(String args[])
        {
            long n=14;
            long ans=Landianmemo(n);
            System.out.println(ans);
        }
    }
    


    

