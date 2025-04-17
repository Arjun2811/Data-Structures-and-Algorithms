package MinStepsto1;

public class MinDP {


public static void main(String[] args) {
   
    int n=1000;
    int steps[]= new int[n+1];
    steps[1]=0;
    int i=2;
    while(i<steps.length)
    {
int min=steps[i-1];

if(i%3==0)
{
    int value=steps[i/3];
    if(value<min)
    {


        min=steps[i/3];
    }
}
if(i%2==0)
{
    if(min>steps[i/2])
    {
min=steps[i/2];
    }

}
steps[i]=min+1;
i++;
    }
System.out.println(steps[n]);

  




}
}
