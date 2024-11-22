
package Towerofhanoi;
import java.util.Scanner;
public class Towerofhanoi {

public static void Towerofhanoi(int disks,char source,char auxiliary,char destination)
{

    if(disks==0)
    {
        return;
    }
    


    if (disks== 1) {
        System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
        return;
    }

    // Move top n-1 disks from source to auxiliary, using destination as a temporary rod
    Towerofhanoi(disks- 1, source, destination, auxiliary);

    // Move the nth disk from source to destination
    System.out.println("Move disk " + disks + " from rod " + source + " to rod " + destination);

    // Move n-1 disks from auxiliary to destination, using source as a temporary rod
    Towerofhanoi(disks - 1, auxiliary, source, destination);
}





















public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int disks=s.nextInt();
    char source='a';
    char destination='c';
    char auxilary='b';
    Towerofhanoi(disks,source,auxilary,destination);


}
}
