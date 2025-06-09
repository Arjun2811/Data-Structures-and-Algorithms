package Othello;

public class Player {


private String name;
private int symbol;

public Player(String name,int symbol)
{

    this.name=name;
    if(symbol!=0)
    {
    this.symbol=symbol;
    }
}
public void setname(String name)
{
this.name=name;


}
public String getname()
{
return name;
}
public void setsymbol(int symbol)
{
    if(symbol!=0)
    {
this.symbol=symbol;
    }
}
public int getsymbol()
{
    return symbol;

}


}
