package TICTACTOE;
public class PLAYER {

 private String name;
 private char symbol;

  

    public PLAYER(String name, char symbol)
    {

        setname(name);
        setsymbol(symbol);
    }
    public void setname(String name)
    {
        if(!name.isEmpty())
this.name=name;

    }
    public String getname()
    {
        return name;
    }
    public void setsymbol(char symbol)
    // checking if the symbol is not null
    {if(symbol!='\0')
    {
    this.symbol=symbol;
    }
}
    public char getsymbol()
    {
        return symbol;
    }
}
