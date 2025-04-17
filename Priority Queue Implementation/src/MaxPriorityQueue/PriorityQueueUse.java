package MaxPriorityQueue;

public class PriorityQueueUse {


    public static void main(String[] args) throws PriorityQueueException {
        PriorityQueue p1= new PriorityQueue();
        p1.insert(1);
        p1.insert(2);
        p1.insert(3);
        p1.insert(4);
        p1.insert(5);
        p1.print();
        System.out.println("after removing the max");
        System.out.println(p1.removemax());
        p1.print();
        System.out.println("size"+p1.size());
        System.out.println("isempty"+p1.isempty());
        System.out.println("max element"+p1.getmax());
    }
}
