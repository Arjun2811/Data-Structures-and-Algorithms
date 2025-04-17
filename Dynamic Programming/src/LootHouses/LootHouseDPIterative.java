package LootHouses;

public class LootHouseDPIterative {



public static int LootHouseDp(int[]arr,int storage[])
{
storage[0]=arr[0];
storage[1]=arr[1];
int i=2;
while(i<storage.length)
{
   
   if((storage[i-1])>arr[i]+storage[i-2])
   {
    storage[i]=storage[i-1];
}
else{
    storage[i]=arr[i]+storage[i-2];
}
i++;
}
return storage[arr.length-1];

}

public static void main(String[]args)
{
    // int arr[]={5,10,100,10,5};
    // int arr[]={2,3,1000,2000};
    int arr[]={10,2,30,20,3,50};
int storage[]=new int[arr.length];
   int ans= LootHouseDp(arr,storage);
   System.out.println(ans);
    
}

}
