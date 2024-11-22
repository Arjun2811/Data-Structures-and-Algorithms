
package temp;

import java.util.Scanner;
public class studentuse {
    public static  void main(String[]args){
Scanner s = new Scanner(System.in);
    student s1=new student();
    s1.name = "Arjun";
   // s1.rollnumber = 123;(it is showing error bcoz it is private)
    //System.out.println(s1.rollnumber);

    s1.setRollnumber(-123);

   System.out.println(s1.getRollNumber());
}
}

