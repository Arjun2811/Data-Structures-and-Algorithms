package Othello;
import java.util.Scanner;
public class OthelloManager {


Player player1;
Player player2;
Board board;
int count=3;


public void startgame()
{
Scanner s = new Scanner(System.in);
// take input
player1=takeplayerinput(1);
player2=takeplayerinput(2);
while(player2.getsymbol()==player1.getsymbol())
{System.out.println("Warning!! Choose a different Symbol");
    int symbol=s.nextInt();
    player2.setsymbol(symbol);
}
//Make the board

board=new Board(player1.getsymbol(),player2.getsymbol());

// Conduct the game
boolean player1turn=true;
int status=1;
while(count<64)
{
    if(player1turn==true)
    {
        System.out.println("Its player 1 "+ player1.getname()+" "+"turn");
        System.out.println("Enter the x coordinate");
        int x=s.nextInt();
        System.out.println("Enter the y coordinate");
        int y=s.nextInt();

        boolean player1move=Move(player1.getsymbol(),x,y);
        player1turn=false;
        if(player1move==true)
        {
        count++;
        }

    }
    else if(player1turn==false){
        System.out.println("Its player 2 "+ player2.getname()+" "+"turn");
        System.out.println("Enter the x coordinate");
        int x=s.nextInt();
        System.out.println("Enter the y coordinate");
        int y=s.nextInt();

        boolean player2move=Move(player2.getsymbol(),x,y);
        player1turn=true;
        if(player2move==true)
        {
        count++;
    }
}

}

}
public Player takeplayerinput(int num)
{
Scanner s= new Scanner(System.in);
System.out.println("Enter player"+ num + " name");
String name=s.nextLine();
System.out.println("Enter player"+ num + " symbol");
int symbol=s.nextInt();
Player p1=new Player(name, symbol);
return p1;
}

}
