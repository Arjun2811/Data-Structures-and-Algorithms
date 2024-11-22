package Lastindex;
public class Lastindex {




    public static int Lastindex(int[]arr,int x,int startindex,int value)
    {


 if(arr[startindex]==x)
{
  value=startindex;
}
if(startindex==arr.length-1)
{
  
    return value;
}



int smallans=Lastindex(arr,x,startindex+1,value);
return smallans;




    





    }

    public static int Lastindex(int[]arr,int x)
    {
        int startindex=0;
        int value=-1;
        return Lastindex(arr,x,startindex,value);
    }


    public static void main(String[]args)
    {
        int arr[]={1,2,4,4};
        int x=4;
        int y=Lastindex(arr,x);
        System.out.println(y);
    }

}
