package INBUILTSTRINGPRIORITYQUEUE;

import java.util.Comparator;
import java.util.PriorityQueue;

public class STRINGPRIORTYQUEUE {



public static class MinPQComparator implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        // TODO Auto-generated method stub
        if(o1.length()<o2.length())
        {
return -1;

        }
        else if(o1.length()>o2.length())
        {
return 1;

        }
        else{
            return 0;
        }
    }
    
}
public static class MaxPQComparator implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        // TODO Auto-generated method stub
        if(o1.length()>o2.length())
        {
return -1;

        }
        else if(o1.length()<o2.length())
        {
return 1;

        }
        else{
            return 0;
        }
    }
    
}




public static void main(String[]args)
{
    System.out.println("MIN STRING PRIORITY QUEUE");
    MinPQComparator minpq=new MinPQComparator();
    PriorityQueue pqmin=new PriorityQueue<>(minpq);
    pqmin.add("there");
    pqmin.add("a");
        pqmin.add("Arjunsingh");
        pqmin.add("Loveyarora");

        while(!pqmin.isEmpty())
        {
        System.out.println(pqmin.remove());

} 

System.out.println("MAX STRING PRIORITY QUEUE");
MaxPQComparator maxpq=new MaxPQComparator();
PriorityQueue pqmax=new PriorityQueue<>(maxpq);
pqmax.add("there");
pqmax.add("a");
    pqmax.add("Arjunsingh");
    pqmax.add("Loveyarora");

    while(!pqmax.isEmpty())
    {
    System.out.println(pqmax.remove());

} 
}
}

