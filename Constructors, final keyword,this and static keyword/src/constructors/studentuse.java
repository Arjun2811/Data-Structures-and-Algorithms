package constructors;

public class studentuse {
public static void main(String[]args){


    student s1=new student(121,"Arjun");
    //System.out.println(s1);
    System.out.println(student.getnumstudent());//(the best way for accesing a static value)
 s1.print();

    student s2= new student(1,"Lakshay");
    //System.out.println(s2);
    s2.print();
    System.out.println(s2.getnumstudent());
    student s3=new student(3,"Manvi",6);
    //System.out.println(s3);
    System.out.println(s3.getnumstudent());
    s3.print();
    //student s4=new student("Lovey");{commented bcoz -"reason in the student class"}
    //s4.print();

}

}
