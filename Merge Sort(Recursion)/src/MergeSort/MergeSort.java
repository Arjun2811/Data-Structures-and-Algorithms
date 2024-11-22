package MergeSort;
public class MergeSort {


public static void  Merge(int[]arr,int si,int ei)
{

int mid=(si+ei)/2;
int f=0;
int s=si;
int ans[]= new int[ei-si+1];
int r=mid+1;
int e=ei;

while((si<=mid)&& (r<=ei))
{
    
        if(arr[si]<=arr[r])
        {
      ans[f]=arr[si];
      si++;
      f++;
        }
        else{
            ans[f]=arr[r];
            f++;
            r++;
        }
    }
    while(si<=mid)
    {
        ans[f]=arr[si];
        si++;
        f++;
    }
    while(r<=ei)
    {
        ans[f]=arr[r];
        f++;
        r++;
    }
   int h=0;
   
    while(s<=e)
    {
        arr[s]=ans[h];
        s++;
        h++;
    }
}

    public static void MergeSort(int[]arr,int si,int ei)
    {
if(si>=ei)
{
    return;
}
int mid=(si+ei)/2;


MergeSort(arr,si,mid);
MergeSort(arr, mid+1, ei);
Merge(arr,si,ei);
    }


    public static void main(String[] args) {
        int arr[]={1,2,5,7,8,4,3,1};
        int i=0;
        int r=arr.length-1;
        MergeSort(arr,i,r);
       int g=0;
       while(g<=r)
       {
        System.out.println(arr[g]);
        g++;
       }

    }
}



