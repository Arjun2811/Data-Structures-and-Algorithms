package TOWEROFHANOI;
public class TOH {

public static void TOH(int disks,char source,char auxillary,char destination)
{
    if(disks==1)
    { System.out.println( source + " "+ destination);
        return;
    }
    TOH(disks-1, source, destination, auxillary);
    System.out.println(source+" "+destination);
    TOH(disks-1, auxillary, source, destination);


}

    public static void main(String[] args) {
        int disks=4;
        char source='a';
        char auxillary='b';
        char destination='c';
        TOH(disks,source,auxillary,destination);

    }
}
