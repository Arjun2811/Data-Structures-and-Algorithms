package SmallestSuperSequence;

public class Memoziation {

    public static int Memo(String str,String str1,int[][] arr)
    {
        int m=str.length();
        int n=str1.length();
    if(str.length()==0)
    {
        return str1.length();
    }
    if(str1.length()==0)
    {
        return str.length();
    }
    if(arr[m][n]!=-1)
    {
        return arr[m][n];
    }
    
    if(str.charAt(0)==str1.charAt(0))
    {
    int ans =Memo(str.substring(1),str1.substring(1),arr);

    arr[m][n]=ans+1;
    return arr[m][n];
    }
    else{
        int ans=Memo(str, str1.substring(1),arr);
        ans=ans+1;
        int ans2=Memo(str.substring(1),str1,arr);
        ans2=ans2+1;

        arr[m][n]=Math.min(ans, ans2);
        return arr[m][n];
    }    
    }
            public static void main(String[]args)
        {
    
    String str="abc";
    String str1="fac";
    int m=str.length()+1;
    int n=str1.length()+1;
    int arr[][]=new int [m][n];
    int i=0;
    while(i<m)
    {
        int j=0;
        while(j<n)
        {
            arr[i][j]=-1;
            j++;
        }
        i++;
    }
    int ans=Memo(str,str1,arr);
    System.out.println(ans);
    
    
        }
    }
    


