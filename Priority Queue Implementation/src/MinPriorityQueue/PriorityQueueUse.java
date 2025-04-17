package MinPriorityQueue;

public class PriorityQueueUse {



    public static void main(String[]args) throws PriorityQueueException 
    {PriorityQueue p1= new PriorityQueue();
        int i=0;
//         while(i<10)
//         {
// p1.insert(i+1);
// i++;
//         }
p1.insert(10);
p1.insert(5);
p1.insert(15);
p1.insert(2);
p1.insert(4);
p1.insert(20);

        p1.print();
        System.out.println("Aftering removing minimum ");
        System.out.println(p1.removeminbetter());
        p1.print();
      
        System.out.println(p1.getmin());
        System.out.println("Aftering removing minimum ");
        p1.removeminbetter();
        p1.print();

    }
}
