package MapImplementation;

public class Mapuse {
public static void main(String[] args) {
    Map<String,Integer>map=new Map<>();
    int i=0;
    while(i<20)
    {
        map.insert("abc"+i,1+i);
        System.out.println(i+": "+map.loadfactor());
        i++;
    }
    map.removekey("abc3");
    map.removekey("abc5");

    i=0;
    while(i<20)
    {
        System.out.println("abc"+i+ ":"+map.getvalue("abc"+i));
        i++;
    }
}
}
