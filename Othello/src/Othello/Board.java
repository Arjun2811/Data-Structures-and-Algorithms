package Othello;

public class Board {

    private int[][]board;
    int boardsize=8;
    private int symbol1;
    private int symbol2;
    
public final static int Incomplete=1;




public Board(int symbol1,int symbol2)
{
board=new int[boardsize][boardsize];



    this.symbol1=symbol1;
    this.symbol2=symbol2;

}


}

