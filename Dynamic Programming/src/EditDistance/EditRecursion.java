package EditDistance;

public class EditRecursion {

public static int EditDistance(String s,String t)
{
  if(s.length()==0)
  {
    return t.length();
  }
  if(t.length()==0)
  {
    return s.length();
  }


    if(s.charAt(0)==t.charAt(0))
    {
        int ans=EditDistance(s.substring(1),t.substring(1));
        return ans;

    }
    else{
       int insertans= EditDistance(s,t.substring(1));
       int deleteans=EditDistance(s.substring(1), t);
       int substituteans=EditDistance(s.substring(1), t.substring(1));

       return 1+Math.min(insertans,Math.min(deleteans,substituteans));
    }






}







    public static void main(String[]args)
    {
        String s="adef";
        String t="bedf";
        int ans=EditDistance(s,t);
        System.out.println(ans);
    }

}