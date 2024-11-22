package Print;
public class Printnumbers {


 public static int Printnumbers(int n){

if(n==1)
{
    System.out.println(1);
    return 1;
}
int smallans=Printnumbers(n-1);




 System.out.println(smallans+1);
 

return smallans+1;


}
public static void main(String[]args){

    int n =5;
   
    int ans=Printnumbers(n);
   
    


}
}