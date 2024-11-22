package TripletSum;
public class Triplet {




    public static int Triplet(int[]arr,int num)
    {
        int n=arr.length;
        int i=0;
        int count=0;
        while(i<n)
        {
            int j=i+1;
            while(j<n)
            {
                int k=j+1;
                while(k<n)
                {
                    if(arr[i]+arr[j]+arr[k]==num)
                    {
                        count++;
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        return count;
    }


    public static void main(String[]args)
    {
        int arr[]={1,2,3,4,5,6,7};
        int num=12;
        
       int ans= Triplet(arr,num);
       System.out.println(ans);
    }
}
