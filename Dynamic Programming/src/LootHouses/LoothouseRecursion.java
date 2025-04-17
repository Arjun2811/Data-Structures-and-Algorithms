package LootHouses;

public class LoothouseRecursion {

    public static int loothouse(int[]arr,int n)
    {
if(n==0)
{
    return arr[n];
}
if(n<0)
{
    return 0;
}




       int smallmax= loothouse(arr,n-2);
       int smallmax2=loothouse(arr,n-1);
       if(arr[n]+smallmax>smallmax2)
       {
       return arr[n]+smallmax;
       }
       else{
        return smallmax2;
       }

}
     
    public static void main(String[]args)
    {
        // int arr[]={10,2,30,20,3,50};
        int arr[]={5,5,10,100,10,5};
        int ans=loothouse(arr,arr.length-1);
        System.out.println(ans);
    }
}
