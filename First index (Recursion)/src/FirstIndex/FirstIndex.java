package FirstIndex;

public class FirstIndex {


    public static int FirstIndex(int[]arr,int x,int startindex,int value)
    {


 if(arr[startindex]==x)
{
  return startindex;
}
if(startindex==arr.length-1)
{
  
    return value;
}



int smallans=FirstIndex(arr,x,startindex+1,value);
return smallans;



    }

    public static int FirstIndex(int[]arr,int x)
    {
        int startindex=0;
        int value=-1;
        return FirstIndex(arr,x,startindex,value);
    }


    public static void main(String[]args)
    {
        int arr[]={1,2,4,4};
        int x=2;
        int y=FirstIndex(arr,x);
        System.out.println(y);
    }

}








