package EditDistance;

public class EditDistanceDP {




public static int EditDP(String s,String t,int arr[][])
{
int i=0;
int j=t.length();
int f=0;
while(j>=0)
{
arr[i][j]=t.substring(f).length();
j--;
f++;
}
j=0;
i=s.length();
 f=0;
while(i>=0)
{
arr[i][j]=s.substring(f).length();
i--;
f++;
}
i=1;
while(i<s.length()+1)
{
j=1;
while(j<t.length()+1)
{
if(s.charAt(s.length()-i)==t.charAt(t.length()-j)){
   arr[i][j]= arr[i-1][j-1];  
}
else{
arr[i][j]=Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]))+1;

}
j++;
}
i++;
}

return arr[s.length()][t.length()];
}

    public static void main(String[]args)
    {

  //   String s="adef";
        //   String t="bedf";
        String s="abc";
        String t="ac";
        int arr[][]=new int[s.length()+1][t.length()+1];
        int i=s.length();
        while(i>=0)
        {
          int j=t.length();
          while(j>=0)
          {

              arr[i][j]=-1;
              j--;

          }
          i--;
        }
        int ans=EditDP(s,t,arr);
        
        System.out.println(ans);

    }
}
