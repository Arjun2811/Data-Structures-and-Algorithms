package ComplexNumber;

public class ComplexNumber {

//a +bi
    private int real;
    private int imaginary;
    public ComplexNumber(int real,int imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;

    }

    public void print()
    {
        if(this.imaginary<0)
        {
            System.out.println(this.real+ ""+this.imaginary+"i");
        }
        else{
    System.out.println(this.real +"+"+this.imaginary+"i");
    }
}

    public void setReal(int real)
    {
        this.real=real;
    }
    public void setImaginary(int imaginary)
    {
        this.imaginary=imaginary;
    }

    public void add(ComplexNumber c2)
    {
       this.real= this.real+c2.real;
       this.imaginary=this.imaginary+c2.imaginary;
    }
    public void Multiply(ComplexNumber c2)
    {
        this.real=this.real*c2.real;
        this.imaginary=this.imaginary*c2.imaginary;
    }
    public static ComplexNumber add(ComplexNumber c1,ComplexNumber c2)
    {
       int newreal= c1.real+c2.real;
        int newimaginary= c1.imaginary+c2.imaginary;
        ComplexNumber c4=new ComplexNumber(newreal, newimaginary);
        
        return c4;
    }

    public void conjugate()
    {
        this.imaginary=this.imaginary*(-1);
        
    }

}
