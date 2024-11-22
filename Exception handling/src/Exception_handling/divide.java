package Exception_handling;

public class divide {

    private int numerator;
    private int denominator;



public void setnumerator(int numerator) throws zeronumeratorException
{

    if(numerator==0)
    {
        zeronumeratorException e= new zeronumeratorException();

        throw e;
    }
    this.numerator=numerator;


}
public int getnumerator()
{
    return numerator;
}
public void setdenominator(int denominator) throws zerodenominatorException
{

    if(denominator==0)
    {
        zerodenominatorException e =new zerodenominatorException();
        {
            throw e;
        }
    }
    
    this.denominator=denominator;
}
public int getdenominator()
{
    return denominator;
}
}
