package Maps;

import java.util.HashMap;
import java.util.Set;

public class ExtractUniqueCharacters {

public static String ExtractUnique(String str){
    String newString="";
int n=str.length();
HashMap<Character,Integer>map=new HashMap<>();
int i=0;
while(i<n)
{
    if(map.containsKey(str.charAt(i)))
    {
        map.put(str.charAt(i),map.get(str.charAt(i))+1);

    }
    else{
        map.put(str.charAt(i),1);
        newString+=str.charAt(i);

    }
    i++;
}
return newString;
}


    public static void main(String[]args){


        String str="codingninjas";
        String ans=ExtractUnique(str);
        System.out.println(ans);
    }
}
