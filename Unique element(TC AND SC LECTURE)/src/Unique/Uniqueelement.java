package Unique;
public class Uniqueelement {
    //public static int Unique(int[]arr,int n,int i ,int j,int count)
    
    //{
    //  if(j==n)
//      {if(count==1)
//         {
//             return arr[i]; 
//         }
        
//      else{
//         return Unique(arr,n,++i,0,0); 
//      }
        
//      }


//      if(arr[i]==arr[j])
//      {
//         count++;
// }
// int ans=Unique(arr,n,i,++j,count);
// return ans;


//     }
//     public static int Unique(int[]arr)
//     {
//         int n=arr.length;
//         int i=0;
//         int j=0;
//         int count=0;
//         return Unique(arr,n,i,j,count);
//     }
    
//another approach
public static int Unique(int[]arr)
{
    int ans=arr[0];
    int i=1;
    while(i<arr.length)
    {
        ans=ans^arr[i];
        i++;
    }
    return ans;
}




    public static void main(String[]args)
    {

        int arr[]={2,3,2,3,1};
        int n=arr.length;
        int ans=Unique(arr);
        System.out.println(ans);
    }
}
