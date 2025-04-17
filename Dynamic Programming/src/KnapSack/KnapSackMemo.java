package KnapSack;

public class KnapSackMemo {

public static int KnapSack(int weight[],int value[],int maxweight,int i,int arr[][])
{
   

    if(i==weight.length||maxweight==0)
    {
        return 0;
    }
if(arr[i][maxweight]!=-1)
{
    return arr[i][maxweight];
}

if(weight[i]>maxweight)
{
   arr[i][maxweight]= KnapSack(weight,value,maxweight,i+1,arr);
   return arr[i][maxweight];
}
else
{
    int MaxAfterPick=value[i]+KnapSack(weight,value,maxweight-weight[i],i+1,arr);
    int MaxNotPick=KnapSack(weight, value, maxweight,i+1,arr);
  
  arr[i][maxweight]= Math.max(MaxAfterPick,MaxNotPick);
  return arr[i][maxweight];
}




}


    public static void main(String[]args)
    {
            int weight[]={9,8,1,9};
        int value[]={6,10,8,8};
        int maxweight=16;
        // int weight[]={12,7,11,8,9};
        // int value[]={24,13,23,15,16};
        // int maxweight=26;
int arr[][]=new int[weight.length][maxweight+1];
int i=0;
while(i<weight.length)
{
    int j=0;
    while(j<=maxweight)
    {
        arr[i][j]=-1;
        j++;
    }
    i++;
}
        int ans=KnapSack(weight,value,maxweight,0,arr);
        System.out.println(ans);

    }
}
