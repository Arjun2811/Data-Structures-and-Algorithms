package Generics;
public class Pair<T> {
    //T means that T is generic now the values can be anything int , string ,char or anything.T can be string,int , double or anything.We dont h
    //have to make different constructors for int and string alag alag.

    private T first;
    private T second;
    

public  Pair(T first,T second)
{
    this.first=first;
    this.second=second;

}


public void setfirst(T first)
{
this.first=first;
}
public T getfirst()
{
    return first;
}
public void setsecond(T second)
{
    this.second=second;
}
public T getsecond()
{
    return second;
}


}



