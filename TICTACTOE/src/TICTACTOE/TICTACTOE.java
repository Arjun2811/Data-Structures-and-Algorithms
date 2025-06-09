package TICTACTOE;
import java.util.Scanner;
public class TICTACTOE {

private PLAYER player1;
 private PLAYER player2;
private BOARD board;



public static void main(String[] args) {
    TICTACTOE t=new TICTACTOE();
    t.startgame();
}




public void startgame()
{
    // taking players input
    Scanner s = new Scanner(System.in);
     player1 =takeplayerinput(1);
    player2=takeplayerinput(2);
    while(player1.getsymbol()==player2.getsymbol())
     {
System.out.println("player 2 please take another symbol!This is already taken");
char symbol=s.next().charAt(0);
player2.setsymbol(symbol);
    }
    // making board
    board=new BOARD(player1.getsymbol(),player2.getsymbol());
    // Conduct the game
    // turn by turn player 1 and player 2 moves 
int status=board.Incomplete;
    boolean player1turn=true;
    while(status==board.Invalid||status==board.Incomplete)
    {
        if(player1turn==true)
{

      System.out.println(" player 1 "+ player1.getname()+"'s" + "turn");
        System.out.println("Enter x coordinate");
        int x=s.nextInt();
        System.out.println("Enter y coordinate");
        int y=s.nextInt();
         status=board.move(player1.getsymbol(),x,y);
        if(status!=board.Invalid)
        {
            player1turn=false;
            board.print();
        }
        else{
            System.out.println("coordinates are Invalid");
        }
        
    }
    else{
        System.out.println(" player 2 "+ player2.getname()+"'s" + "turn");
        System.out.println("Enter x coordinate");
        int x=s.nextInt();
        System.out.println("Enter y coordinate");
        int y=s.nextInt();
         status=board.move(player2.getsymbol(),x,y);
        if(status!=board.Invalid)
        {
            player1turn=true;
            board.print();
        }
        else{
            System.out.println("coordinates are Invalid");
        }
    }
}
    if(status==board.Player_1_Win)
    {
        System.out.println("player 1 "+player1.getname() +" wins");
    }
    else if(status==board.Player_2_Win)
    {
        System.out.println("player 2 "+player2.getname() +" wins");
    }
else{
    System.out.println("draw");
}
    }




public PLAYER takeplayerinput(int num)
{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter player"+num+" name");
    String name=s.nextLine();
    System.out.println("Enter player "+num+ " Symbol");
    char symbol=s.next().charAt(0);
    PLAYER player=new PLAYER(name,symbol);
    return player;
}


}
