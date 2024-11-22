package classesandobjects;

public class DynamicArrayuse {
public static void main(String[]args)
{


    DynamicArray d = new DynamicArray();
int i=0;

    while(i<100)
    {
        d.add(i+10);
        i++;
    }
    System.out.println(d.size());
    //100
    d.set(4,20);
    System.out.println(d.get(4));
    //20
    System.out.println(d.get(102));
    //-1

    while(!d.isempty())
    {
        System.out.println(d.removelast());   
        System.err.println("size"+" "+d.size());
    }
}
}