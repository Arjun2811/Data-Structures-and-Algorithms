package TICTACTOE;
public class BOARD {

     private char board[][];
     private char symbol1;
     private  char symbol2;
     private int boardsize=3;
     private int count=0;

     public final static int Player_1_Win=1;
     public final static int Player_2_Win=2;
     public final static int draw=3;
     public final static int Incomplete=4;
     public final static int Invalid=5;

    public BOARD(char symbol1,char symbol2)
    {
     board=new char[boardsize][boardsize];
     int i=0;
    while(i<boardsize)
    {
    int j=0;
while(j<boardsize)
{
    board[i][j]=' ';
    j++;
}
i++;
   
}
this.symbol1=symbol1;
this.symbol2=symbol2;
    }

public int move(char symbol,int x,int y)
{
   
if(x<boardsize&&y<boardsize&&x>=0&&y>=0&&board[x][y]==' ')
{
board[x][y]=symbol;
count++;

}
else{
    return Invalid;
}

if(board[x][0]==board[x][1]&&board[x][0]==board[x][2])
{
if(symbol==symbol1)
{
    return Player_1_Win;
}
else{
    return Player_2_Win;
}
}
if(board[0][y]==board[1][y]&&board[0][y]==board[2][y])
{
    if(symbol==symbol1)
{
    return Player_1_Win;
}
else{
    return Player_2_Win;
}
}
if(board[0][2]!=' '&&board[0][2]==board[1][1]&&board[0][2]==board[2][0])
{
    if(symbol==symbol1)
{
    return Player_1_Win;
}
else{
    return Player_2_Win;
}
}
if(board[0][0]!=' '&&board[0][0]==board[1][1]&&board[0][0]==board[2][2])
{

    if(symbol==symbol1)
    {
        return Player_1_Win;
    }
    else{
        return Player_2_Win;
    }
}

if(count==9)
{
    return draw;
}
else{
    return Incomplete;
}

    }

    public void print()
    {
        int i=0;
        System.out.println("----------------");
        while(i<boardsize)
        {
            int j=0;
            while(j<boardsize)
            {
                System.out.print("|"+board[i][j]+"|");
                j++;
            }
            System.out.println();
            i++;

        }
        System.out.println("---------------");
    }


   
}



