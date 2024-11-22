package Collections;

import java.util.LinkedList;

public class Nodeuse {


    public static void main(String[]args)
{
// The `LinkedList` class in Java is used to create a linked list data structure. In the provided code
// snippet, a `LinkedList` object named `list` is created to store integer values. Elements are added
// to the list using the `add`, `addFirst`, and `addLast` methods. The size of the list is printed
// before and after adding elements. Finally, the elements of the list are printed in reverse order
// using a loop.
LinkedList<Integer> list= new LinkedList<>();
System.out.println(list.size());
list.add(10);
list.add(20);
System.out.println(list.size());
list.addFirst(0);
list.addLast(100);
list.set(3,200);
int i=list.size()-1;
while(i>=0)
{
    System.out.println(list.get(i));
    i--;
}

}}
