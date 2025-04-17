package EditDistance;

public class EditdistanceMemoziation {



public static int EditMemo(String s ,String t,int[][]arr)
{
    if(arr[s.length()][t.length()]!=-1)
{
    return arr[s.length()][t.length()];
}
    if(s.length()==0)
    {
      arr[s.length()][t.length()]=t.length();
      return arr[s.length()][t.length()];
    }
    if(t.length()==0)
    {
        arr[s.length()][t.length()]=s.length();
      return arr[s.length()][t.length()];
    }



      if(s.charAt(0)==t.charAt(0))
      {
          arr[s.length()][t.length()]=EditMemo(s.substring(1),t.substring(1),arr);
          return arr[s.length()][t.length()];
      }
      else{
         int insertans= EditMemo(s,t.substring(1),arr);
         int deleteans=EditMemo(s.substring(1),t,arr);
         int substituteans=EditMemo(s.substring(1), t.substring(1),arr);
  
         arr[s.length()][t.length()]=1+Math.min(insertans,Math.min(deleteans,substituteans));
         return arr[s.length()][t.length()];

      }
  }
  
      public static void main(String[]args)
      {
        //   String s="adef";
        //   String t="bedf";
          String s="abc";
          String t="dc";
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
          int ans=EditMemo(s,t,arr);
          
          System.out.println(ans);
      }
  
  }
    

