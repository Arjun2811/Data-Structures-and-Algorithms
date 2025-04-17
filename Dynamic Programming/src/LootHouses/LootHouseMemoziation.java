package LootHouses;

public class LootHouseMemoziation {
    public static int loothouse(int[]arr,int n,int[]storage)
    {
if(n==0)
{
    storage[n]=arr[n];
    return storage[n];
}
if(n<0)
{

    return 0;
}


if(storage[n]!=0)
{
    return storage[n];
}

       int smallmax= loothouse(arr,n-2,storage);
       int smallmax2=loothouse(arr,n-1,storage);
       if(arr[n]+smallmax>smallmax2)
       {
        storage[n]=arr[n]+smallmax;
       return storage[n];
       }
       else{
        storage[n]=smallmax2;
        return storage[n];
       }

}
     
    public static void main(String[]args)
    {
        // int arr[]={2,3,1000,2000};
        int arr[]={5,5,10,15};
        // int arr[]={10,2,30,20,3,50};
        // int arr[]={5,5,10,100,10,5};
        int storage[]=new int[arr.length+1];
        int ans=loothouse(arr,arr.length-1,storage);
        System.out.println(ans);
    }
}
