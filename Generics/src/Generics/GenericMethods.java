package Generics;

public class GenericMethods {


    public static<T extends printinterface> void printarray(T arr[])
    {//3. this will make us free, where we can print any object(vehicle,etc) that implement printinterface.Earlier only object inherited from vehicle we are able to run.

        int n=arr.length;
        int i=0;
       while(i<n)
       {
        arr[i].print();
        System.out.print(" ");
        i++;

    }
}

//public static<T extends Vehicle> void printarray(T arr[])
//2. so t extends vehicle ,it means only those objects or'T' jo vehicle ko extend krte h voi lene h bs bound krdiya isse ab koi bhi ake ab 'T' ni ban skta
//and every object that extends vehicle have a print function as well so error * which is coming will be gone
//int n=arr.length;
//int i=0;
//while(i<n)
//{
    // System.out.print(arr[i]);
    // System.out.print(" ");
    // i++;
    //**ye vehicle ka address print krdega upar vala part n times ye upar vala printarray inbuilt classes k liye foe example int,string, char inke liye toh theek h
    //but jo classes maine bnayi h for example vehicle unhe ni print krega ye unka toh normal addres print krdiya isne as we have seen
   // arr.print()*;
    //1.int,char classes k pass ye print function h hi ni,vehicle k pass h uske liye run krega ye meri vehicle class m maine uske liye print function bana rkha h
    //toh in all, har 'T' Ke pass k passs print function ni ho skta so vo error *(ye function error dega )dega starting se hi kisi pe print function hoga kisipe ni m kaise kru ye btao
   //so  what we can do in this case so we can give a gurantee to 'T that jo b function hum tko denge usme print function hoga'
//}
//System.out.println();






    public static void main(String[]args)
    {int n=10;
        Integer arr[]= new Integer[n];
        int i=0;
        while(i<n)
    {
         arr[i]=i+10;
         i++;

    }
    //printarray(arr);





    String arr1[]= new String[n];
    int f=0;
    while(f<n)
    {
        arr1[f]="abc";
        f++;
    }
   // printarray(arr1);



vehicle v[]= new vehicle[10];
int j=0;
while(j<n)
{
    v[j]=new vehicle();
    j++;
}
printarray(v);

//**but it will print the address of vehicle class array that we are making n times

teacher t1[]= new teacher[10];
int c=0;
while(c<n)
{
    t1[c]=new teacher();
    c++;
}
printarray(t1);
}
}