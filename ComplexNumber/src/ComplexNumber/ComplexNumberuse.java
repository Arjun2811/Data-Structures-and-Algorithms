package ComplexNumber;

public class ComplexNumberuse {

public static void main(String[]args)
{
    ComplexNumber c1 =new ComplexNumber(2,3);
    c1.print();
    //2+3i
    c1.setReal(10);
    c1.setImaginary(15);
    c1.print();
    //10+15i

    ComplexNumber c2= new ComplexNumber(4,5);
    c1.add(c2);
     c1.print();
     //14+20i
     c2.print();
     //4+5i

     ComplexNumber c3 =new ComplexNumber(3,5);
     c3.Multiply(c2);
     c3.print();
     //12+25i
     c2.print();
     //4+5i

     ComplexNumber c4 =ComplexNumber.add(c1,c2);
     c4.print();
     //18+25i

      c1.conjugate();
      c1.print();
      //14-20i


}


}
