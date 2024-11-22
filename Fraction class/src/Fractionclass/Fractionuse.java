package Fractionclass;

public class Fractionuse {

    public static void main(String[]args){

    Fraction f1=new Fraction(10,20);
    f1.print();
    //1/2


    f1.setnumerator(12);
    int d=f1.getdenominator();
    System.out.println(d);
    //1
    f1.print();
    //6

    f1.setnumerator(30);
    f1.setdenominator(60);
    f1.print();
    //1/2
    Fraction f2= new Fraction(20,40);
    f1.add(f2);
    f1.print();
    //1
    f2.print();
    //1/2

    Fraction f3=new Fraction(2,6);
    f3.multiply(f2);
    f3.print();
    //1/6
    f2.print();
    //1/2

    Fraction.add(f1,f2);
    
    //3/2
}
}