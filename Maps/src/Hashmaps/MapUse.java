
package Hashmaps;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapUse {

    public static void main(String[]args)
    {
HashMap<String,Integer> map=new HashMap<>();

//**insertion**
map.put("abc",2);
map.put("def",3);
map.put("abc",5);
map.put("def",6);

//**size**
int x=map.size();
System.out.println(x);//it will show size 2 bcoz the second tym we insert a value for the same key it just updates its value at its earlier position 


//**prescence of key**
boolean ans=map.containsKey("abc");
System.out.println(ans);

//**prescence of value**
if(map.containsValue(4))
{
System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
//**searching for value**
//1st example of searching
    int a=map.get("abc");
    System.out.println(a);

    // **2nd example of searching
//   int b=map.get("njh")  ;
//   System.out.println(b);   //it will give null pointer exception bcoz it does not exist.explained in register

//**Deletion**
int y=map.remove("abc");
System.out.println(y);

//**for printing all the keys**
Set<String>keys=map.keySet();
for(String str:keys)
{
    System.out.println(str);
}
//**for printing all the values**
Collection<Integer>values=map.values();
for(int val:values)
{
    System.out.println(val);
}



}
}