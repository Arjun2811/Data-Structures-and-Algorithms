package Returnallcodes;
public class Returncodes {


public static String[] Returncodes(String input)
{

  if(input.length()==0)
  {
    String ans[]={""};
    return ans;
  }

  String smallans[]=Returncodes(input.substring(1));
  int an=input.charAt(0)-'0';
 char firstchar= (char)('a'+an-1);
 int i=0;
 while(i<smallans.length)
 {
    smallans[i]=firstchar+smallans[i];
    i++;
 }
 String smallans1[]=new String[0];
 if(input.length()>=2)
 {
    int an1=input.charAt(0)-'0';
    int an2=input.charAt(1)-'0';
    int an3=(an1*10)+an2;
    if(an3>=10 && an3<=26)
    {
        char firsttwochar=(char)('a'+an3-1);
    
    smallans1=Returncodes(input.substring(2));
     i=0;
     while(i<smallans1.length)
     {
        smallans1[i]=firsttwochar +smallans1[i];
        i++;
     }
 }
}


String output[]=new String[smallans.length+smallans1.length];
{int k=0;
  i=0;
while(i<smallans.length)
{
output[k]=smallans[i];
i++;
k++;
}
i=0;
while(i<smallans1.length)
{
    output[k]=smallans1[i];
    k++;
    i++;
}


return output;
}

}


    public static void main(String[]args)
    {

        String str="1123";
        String ans[]=Returncodes(str);
        int i=0;
        while(i<ans.length)
        {
            System.out.println(ans[i]);
            i++;
        }
    }
}
