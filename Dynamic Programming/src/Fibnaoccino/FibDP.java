package Fibnaoccino;
import java.util.Scanner;
public class FibDP {

    public static void main(String[]args)
    {Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int storage[]= new int[n+1];
        storage[0]=0;
        storage[1]=1;
        int i=2;
        while(i<=n)
        {
            storage[i]=storage[i-1]+storage[i-2];
            i++;

        }
        System.out.println(storage[n]);
    }
}
