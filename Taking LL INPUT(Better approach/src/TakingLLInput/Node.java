package TakingLLInput;

public class Node<T> {


    T data;
    Node<T>Next;

     Node(T data)
    {
        this.data=data;
        Next=null;

    }

}
