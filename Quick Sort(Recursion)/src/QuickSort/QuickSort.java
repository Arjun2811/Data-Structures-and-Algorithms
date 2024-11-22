package QuickSort;
public class QuickSort {


    public static void QuickSort(int arr[],int si ,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pivotpos=partition(arr,si,ei);
        QuickSort(arr,si,pivotpos-1);
        QuickSort(arr,pivotpos+1,ei);
    }
public static void swap(int[]arr,int i,int j)
{
    int temp=arr[j];
    arr[j]=arr[i];
    arr[i]=temp;

}
//     public static int partition(int[]arr,int si ,int ei)
//     { int count=0;
//       int pivot=arr[si];
//       int i=si+1;
//       while(i<=ei)
//       {
//         if(arr[i]<=pivot)
//         {
//             count++;
            
//         }
//         i++;

//       }
//       if(count>0)
//       {
//         swap(arr,si,si+count);
//       }
   
//     int pivotpos=si+count;

   
//     while(si<pivotpos&&ei>pivotpos)
// {

// while(si<pivotpos&&arr[si]<=pivot)
// {
//     si++;
// }
// while(ei>pivotpos&&arr[ei]>=pivot)
// {
//     ei--;
// }
// if(si<pivotpos&&ei>pivotpos)
// {
//     swap(arr,si,ei);
//    si++;
//     ei--;

// }
// }
// return pivotpos;
// }

public static int partition(int[]arr,int si ,int ei)     
{  int pivot=arr[si];
    int pivotpos=si;
    int i=si+1;
    while(i<=ei)
    {
        if(arr[i]<=pivot)
        { pivotpos++;
            swap(arr,i,pivotpos);
            
        }
        i++;
    }
    swap(arr,si,pivotpos);
    
        
    
return pivotpos;
    }
    public static void main(String[] args) {
        int arr[]={4,3,8,4,6,5};
       //int arr[]={4,7,2,4,9,3};
        int si=0;
        int i=0;
        int ei=arr.length-1;
        QuickSort(arr,si,ei);
        while(i<=ei)
        {
            System.out.println(arr[i]);
            i++;
        }
    }
}
