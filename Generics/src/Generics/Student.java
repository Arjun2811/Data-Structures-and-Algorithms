package Generics;
public class Student<T,V> {


private T name;
private V id;


    public  Student(T name,V id)
{
    this.name=name;
    this.id=id;

}


public void setname(T name)
{
this.name=name;
}
public T getname()
{
    return name;
}
public void setid(V id)
{
    this.id=id;
}
public V getid()
{
    return id;
}





}

