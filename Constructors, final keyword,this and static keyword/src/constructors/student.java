package constructors;

public class student {

final int  rollnumber;
//final int  rollnumber=100;{if this it will show error in every object where we are trying to intilize it again}

private String name;
int id;
private static int numstudents=0;


public static int getnumstudent()
{
    return numstudents;
}

public student(int rollnumber,String name)
{
    this.rollnumber=rollnumber;
    this.name=name;
    numstudents++;
    //System.out.println(this);
}
//public student(String n){this function is commented bcoz its the example that final keyword has to initialized at any cost other wise it will show error}
//{
  // name=n;
//}
public student(int rollnumber ,String name,int id)
{
   this.rollnumber=rollnumber;
    this.name=name;
    this.id=id;
    numstudents++;
    //System.out.println(this);
}
public void print()
{
    System.out.println(name+":"+ rollnumber+":"+id);
}

}
