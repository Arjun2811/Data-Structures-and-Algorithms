
package temp;

public  class  student {
    private int rollnumber;
    String name;
    public int id;


    public void setRollnumber(int rn)
    {
        if(rn>=0)
        {
            rollnumber =rn;
        }
        return;
    }

    public int getRollNumber()
    {
        return rollnumber;
    }

}
