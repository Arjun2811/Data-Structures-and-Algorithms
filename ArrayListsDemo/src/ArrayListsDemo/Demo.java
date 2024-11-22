package ArrayListsDemo;

import java.util.ArrayList;

public class Demo {

public static void main(String[]args)
{

ArrayList<Integer>List1= new ArrayList<>();

System.out.println(List1.size());

List1.add(20);
List1.add(40);
List1.add(80);
System.out.println(List1.size());
int i=0;
while(i<List1.size())
{
    System.out.println(List1.get(i));
    i++;
}
List1.add(2,60);
//now the element at 2nd position will be shifted right side
System.out.println("*2nd time printing element*");
i=0;
while(i<List1.size())
{
    System.out.println(List1.get(i));
    i++;
}
List1.remove(1);
//it will remove the element at 1st index and the element after 1 will be shifted left
System.out.println("*3rd time printing of elements*");
i=0;
while(i<List1.size())
{
    System.out.println(List1.get(i));
    i++;
}
List1.set(2,100);
//just replace the element if any element is present there
System.out.println("*4th time printing of elements*");
i=0;

while(i<List1.size())
{
    System.out.println(List1.get(i));
    i++;
}
System.out.println("*5th time printing of elements*");
i=0;
for(int element:List1)
{
    System.out.println(element);
}
//element=100;
//this is wrong we can't do this.
}
}
