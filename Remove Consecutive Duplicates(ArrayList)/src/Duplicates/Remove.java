package Duplicates;

import java.util.ArrayList;

public class Remove {




public static ArrayList<Integer> Duplicates(int[]arr)
{
    ArrayList <Integer> List1=new ArrayList<>();
    int i=0;
    int f=1;
    List1.add(0,arr[i]);
    int n =arr.length;
    while(i<n-1)
    { 
     if(arr[i]==arr[i+1])
     {
        i++;
        continue;
     }
     else{
        List1.add(f,arr[i+1]);
        f++;
        i++;
     }
    }
    return List1;
}






    public static void main(String[]args)
    {
        int arr[]={10,20,20,20,20,30,40,10};
        ArrayList<Integer>List1=Duplicates(arr);
        int i=0;
        while(i<List1.size())
        {
            System.out.println(List1.get(i));
            i++;
        }
        
    }
}
