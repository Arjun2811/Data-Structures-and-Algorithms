package KnapSack;

public class KnapSackRecursive {


public static int KnapSack(int weight[],int value[],int maxweight,int i,int maxvalue)
{

    if(i==weight.length||maxweight==0)
    {
        return maxvalue;
    }


if(weight[i]>maxweight)
{
   int max= KnapSack(weight,value,maxweight,i+1,maxvalue);
   return max;
}
else
{
    int MaxAfterPick=KnapSack(weight,value,maxweight-weight[i],i+1,maxvalue+value[i]);
    int MaxNotPick=KnapSack(weight, value, maxweight,i+1,maxvalue);
   return Math.max(MaxAfterPick,MaxNotPick);
}
}
    public static void main(String[]args)
    {
        // int weight[]={1,2,4,5};
        // int value[]={5,4,8,6};
        // int maxweight=5;
        int weight[]={12,7,11,8,9};
        int value[]={24,13,23,15,16};

        int maxweight=26;
        int ans=KnapSack(weight,value,maxweight,0,0);
        System.out.println(ans);
    }
}
