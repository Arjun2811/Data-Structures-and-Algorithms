package INBUILTPRIORITYQUEUE;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class INBuiltmaxPriorityQueue {


public static class MaxPQComparator implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub

        if(o1>o2)
        {
            return -1;
        }
        else if(o1<o2)
        {
            return 1;
        }
        else{
            return 0;
        }
       
    }

}
public static class MinPQComparator implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub

        if(o1<o2)
        {
            return -1;
        }
        else if(o1>o2)
        {
            return 1;
        }
        else{
            return 0;
        }
       
    }

}









    public static void main(String[]args)
    {System.out.println("MAX PRIORITY QUEUE");
        MaxPQComparator maxPQComparator= new MaxPQComparator();
        PriorityQueue<Integer> pqmax= new PriorityQueue<>(maxPQComparator);
        pqmax.add(5);
        pqmax.add(3);
        pqmax.add(7);
        pqmax.add(1);
        pqmax.add(8);

        while(!pqmax.isEmpty())
        {
          System.out.println(pqmax.remove());
           
        }
        System.out.println("MIN PRIORITY QUEUE");
        MinPQComparator minPQComparator= new MinPQComparator();
        PriorityQueue<Integer> pqmin= new PriorityQueue<>(minPQComparator);
        pqmin.add(5);
        pqmin.add(3);
        pqmin.add(7);
        pqmin.add(1);
        pqmin.add(8);

        while(!pqmin.isEmpty())
        {
          System.out.println(pqmin.remove());
           
        }

        //Another simple and easiest way of using  maxpriorityqueue is by importing it from collections class and directly using it 
        System.out.println("Max PRIORITY QUEUE");
        PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());
        pq.add(5);
        pq.add(3);
        pq.add(7);
        pq.add(1);
        pq.add(8);

        while(!pq.isEmpty())
        {
          System.out.println(pq.remove());
           
        }


        
    }
}
