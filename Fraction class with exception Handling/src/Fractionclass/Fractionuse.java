package Fractionclass;

public class Fractionuse {

    public static void main(String[]args){

    Fraction f1=new Fraction(10,20);
    f1.print();
    //1/2


    try {
        f1.setnumerator(0);
    } catch (ZeroNumeratorException e) {
        // TODO Auto-generated catch block
        System.out.println("dont set numerator as 0");;
    }
    int d=f1.getdenominator();
    System.out.println(d);
    //1
    f1.print();
    //6

    try {
        f1.setnumerator(0);
    } catch (ZeroNumeratorException e) {
        // TODO Auto-generated catch block
        System.out.println("Don't set numerator as 0");
    }

    try {
        f1.setdenominator(0);
    } catch (ZeroDenominatorException e) {
        // TODO Auto-generated catch block
        System.out.println("Don't set denominator as 0");
    }
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
// Fraction f4=Fraction.add(f1,f2);
//static function if i want to return it. I can do it in this way as well.the above way
    try {
        Fraction.add(f1,f2);
    } catch (ZeroDenominatorException e2) {
        // TODO Auto-generated catch block
        System.out.println("Dont set denominator as 0");
    }
    
    //3/2
}
}



