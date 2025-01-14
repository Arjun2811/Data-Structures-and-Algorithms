package practice;
import java.util.ArrayList;

public class practice {



    public static void main(String[] args) {
        ArrayList<Integer>arr= new ArrayList<>();
        arr.add(9);

        int i=0;
        while(i<arr.size())
        {
            System.out.println(arr.get(i));
            i++;
        }
    }
}
