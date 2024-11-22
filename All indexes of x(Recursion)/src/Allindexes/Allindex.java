package Allindexes;
public class Allindex {


    
        public static int[] Allindex(int[]arr,int x,int startindex,int[]arr1,int i)
        {
    
    
     if(arr[startindex]==x)
    {
      
      arr1[i]=startindex;
      if(i<(arr1.length-1))
      {
      i++;
      
    }
}
    if(startindex==arr.length-1)
    {
      
        return arr1;
    }
    
    
    
     arr1= Allindex(arr,x,startindex+1,arr1,i);
     return arr1;
    
    
    
    
    
        
    
    
    
    
    
        }
    
        public static int[] Allindex(int[]arr,int x)
        {
            int startindex=0;
            int count=0;
            int f=0;
            while(f<arr.length)
            {
                if(arr[f]==x)
                {
                    count++;
                }
                f++;

            }
            int arr1[]=new int[count];
            int i=0;
            return Allindex(arr,x,startindex,arr1,i);
        }
    
    
        public static void main(String[]args)
        {
            int arr[]={2,4,4,3};
            int x=5;
            int arr1[]=Allindex(arr,x);
           
            int i=0;
            while(i<arr1.length)
            {
                System.out.println(arr1[i]);
                i++;
            }
        }
    
    }
    











