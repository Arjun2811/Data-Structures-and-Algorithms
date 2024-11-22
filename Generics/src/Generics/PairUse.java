package Generics;

public class PairUse {


public static void main(String[]args)
{


//Pair p=new Pair(1,2);
//this is a wrong way by this t can be anything;
// p.setfirst(10);
// System.out.println(p.getfirst());
// System.out.println(p.getsecond());

Pair<String>p1=new Pair<String>("ab","cd");
p1.setfirst("ab");
System.out.println(p1.getfirst());
System.out.println(p1.getsecond());

//Pair <int> p2=new Pair<int>(1,2);
//this is wrong int is a primitive datatype wanna learn more see in register
Pair <Integer> p2=new Pair<Integer>(1,2);
p2.setfirst(10);
System.out.println(p2.getfirst());
System.out.println(p2.getsecond());

//Pair<Char> p3= new Pair<Char>('a','b');
//this is wrong int is a primitive datatype wanna learn more see in register

Pair<Character> p3= new Pair<Character>('a','b');
p3.setfirst('c');
System.out.println(p3.getfirst());
System.out.println(p3.getsecond());



Student<String,Integer> s1=new Student<String,Integer>("Arjun",1);
s1.setname("Sanya");
System.out.println(s1.getname());
System.out.println(s1.getid());



// By this way you can 3 or 4 values in a function of 2 values;
Student<String,Integer> Internalpair=new Student<String,Integer>("Arjun",2);
Student<Student<String,Integer>,Integer> s2= new Student<>(Internalpair,3);
s2.setname(Internalpair);
System.out.println(s2.getname());
System.out.println(s2.getname().getname());
System.out.println(s2.getname().getid());
System.out.println(s2.getid());




}


}






