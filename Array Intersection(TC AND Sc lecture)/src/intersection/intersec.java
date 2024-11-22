package intersection;
public class intersec {

public static void Intersec(int arr1[],int arr2[])
{
int n=arr1.length;
int m =arr2.length;
int a =Integer.MIN_VALUE;
int i=0;
while(i<n)
{
    int j=0;
    while(j<m)
    {  
        if(arr1[i]==arr2[j])
        {  arr2[j]=0;
            System.out.println(arr1[i]);
            
            break;
        }
        j++;
        
    }
    i++;
}
}
    public static void main(String[]args)
    {
        int arr1[]={6,2,6,2,1,9,8};
        int arr2[]={3,6,8,2,9};
        Intersec(arr1,arr2);

    }
}
