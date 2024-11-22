package Returnpermutation;

public class permutation {



    public static String[] permutation(String input)
    {
        if(input.length()==0)
        {
            String ans[]={""};
            return ans;

        }


       String ans[]= permutation(input.substring(1));
        String output[]=new String[ans.length*input.length()];


        int k=0;
        int i=0;
        while(i<ans.length)
        {
            int j=0;
            while(j<=ans[i].length())
            {
                output[k]=ans[i].substring(0,j)+ input.charAt(0)+ans[i].substring(j);
                k++;
                j++;
            }
            i++;
        }
        return output;
    }
 






    public static void main(String[] args) {
        String str="abc";
        String output[]=permutation(str);
        int i=0;
        while(i<output.length)
        {
            System.out.println(output[i]);
            i++;
        }
    }
}
