package PriorityQueueQuestions;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArrays {

public static ArrayList<Integer> merge(ArrayList<ArrayList<Integer>>input)
{
    ArrayList<Integer>arrnew=new ArrayList<>();
PriorityQueue<Integer>pq= new PriorityQueue<>();
int i=0;
while(i<input.size())
{
ArrayList<Integer>arr=input.get(i);
int j=0;
while(j<arr.size())
{
    pq.add(arr.get(j));
j++;
}
i++;
}
while(!pq.isEmpty())
{

arrnew.add(pq.remove());
}

return arrnew;


}




    public static void main(String[]args){

        ArrayList<ArrayList<Integer>> input= new ArrayList<>();
        ArrayList<Integer>arr1=new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        ArrayList<Integer>arr2=new ArrayList<>();
        arr1.add(5);
        arr1.add(4);

        input.add(arr1);
        input.add(arr2);
       ArrayList<Integer>arrnew= merge(input);
       for(int ele:arrnew)
       {
        System.out.println(ele);
       }

    }
}
