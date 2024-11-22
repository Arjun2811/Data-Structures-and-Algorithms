package ArraySortedbetter;
public class ArraySorted {

private static boolean ArraySorted(int[]arr,int startindex)
{
    
if(startindex==arr.length-1)
{
    return true;
}

boolean smallans=ArraySorted(arr,startindex+1);

if(arr[startindex]>arr[startindex+1])
{    
    return false;
}

return smallans;
}
// star point2 written in notebook for this question
private static boolean ArraySorted(int[]arr)
{

return ArraySorted(arr,0);




}

public static void main(String[] args) {
    int arr[]={5,7,3};
    boolean ans=ArraySorted(arr);
    System.out.println(ans);
}






}
