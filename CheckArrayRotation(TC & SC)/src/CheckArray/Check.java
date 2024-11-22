package CheckArray;
public class Check {





    public static int Check(int[]arr)
    {
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int i=0;
        int count=0;
        while(i<n)
        {


            if(arr[i]<min)
            {  
                
                count++;
              if(count==2)
              {
                return i;
              }
              
            min=arr[i];
            }

            i++;
        }
        return 0;
    }

    public static void main(String[]args)
    {
        int arr[]={5,6,1,2,3,4};
        int k=Check(arr);
        System.out.println(k);
    }

}
