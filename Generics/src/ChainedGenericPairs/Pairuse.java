package ChainedGenericPairs;

public class Pairuse {

public static void main(String[] args) {
    pair<Integer,String> p=new pair<>(2,"abc");
    System.out.println(p.getfirst());
    System.out.println(p.getsecond());
    p.setfirst(24);
    p.setsecond(("abcde"));
    System.out.println(p.getfirst());
    System.out.println(p.getsecond());




    pair<Integer,String> Innerp=new pair<>(2,"argh");
    pair<pair<Integer,String>,String> p1= new pair<>(Innerp,"arjun");
    p1.setfirst(Innerp);
    System.out.println(p1.getfirst());
    System.out.println(p1.getfirst().getfirst());
    System.out.println(p1.getfirst().getsecond());
    //p1.setfirst().setfirst(5);
    //p1.setfirst().setsecond("sanya");
    //you cant set the values this way this will give error;
    Innerp.setfirst(10);
    Innerp.setsecond("sanya");
    //this is the correct way to access the value in a pair
    p1.setsecond("lovey");
    System.out.println(p1.getfirst().getfirst());
    System.out.println(p1.getfirst().getsecond());
    System.out.println(p1.getsecond());


   // p1.setfirst().setfirst()
}


}
