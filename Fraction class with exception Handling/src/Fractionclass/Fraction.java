package Fractionclass;

public class Fraction {

   private int numerator;
    private int denominator;

public Fraction(int numerator,int denominator)
{  if(denominator==0 || numerator==0)
    {
        return;
    }
    this.numerator=numerator;
    this.denominator=denominator;
    simplify();
}
public void setnumerator(int numerator) throws ZeroNumeratorException
{
if(numerator==0)
{
    ZeroNumeratorException e = new ZeroNumeratorException();
    throw e;
}


    this.numerator=numerator;
    simplify();
}
public void setdenominator(int denominator) throws ZeroDenominatorException
{

    if(denominator==0)
    {
        ZeroDenominatorException e = new ZeroDenominatorException();
        throw e;
    }
    this.denominator=denominator;
    simplify();
}
public int  getdenominator()
{
    return denominator;
}
public void print()
{
    if(denominator==1)
    {
        System.out.println(numerator);
    }
    else{
        System.out.println(this.numerator+"/"+this.denominator);
    }
}

public void simplify()
{ int smaller=Math.min(numerator,denominator);
    int i=2;
    int gcd=1;
    while(i<=smaller)
    {
        if(numerator%i==0 && denominator%i==0)
        {
        gcd=i;
        }
        i++;
    }
    numerator=numerator/gcd;
    denominator=denominator/gcd;
}
    public void add(Fraction f2)
    {
        this.numerator=(this.numerator*f2.denominator)+(f2.numerator*this.denominator);
        this.denominator=(this.denominator*f2.denominator);
        simplify();
    }

    public void multiply(Fraction f2)
    {
        this.numerator=this.numerator*f2.numerator;
        this.denominator=this.denominator*f2.denominator;
        simplify();
    }
public static void add(Fraction f1,Fraction f2) throws ZeroDenominatorException
{


int newnumerator=(f1.numerator*f2.denominator)+(f2.numerator*f1.denominator);
int newdenominator=f1.denominator*f2.denominator;
if(newdenominator==0)
{
    ZeroDenominatorException e2=new ZeroDenominatorException();
    throw e2;
}
Fraction f=new Fraction(newnumerator, newdenominator);
f.print();
}
}

