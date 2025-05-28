package CodingNinja;
import java.util.Scanner;
public class CodingNinja {

public static int Codingninja(char [][]board,String str,int i,int j,int n,boolean[][]visited)
{
    if(n==str.length())
    {
        // visited[i][j]=false;
return 1;
    }

visited[i][j]=true;

// int di[]={-1,-1,-1,0,0,1,1,1};
// int dj[]={0,-1,1,1,-1,0,-1,1};
int di[] = {-1, -1, -1,  0, 0, 1, 1, 1};
int dj[] = {-1,  0,  1, -1, 1, -1, 0, 1};

int f=0;
while(f<8)
{
    int newx=i+di[f];
    int newy=j+dj[f];
    if(newx>=0&&newy>=0&&newy<board[0].length &&newx<board.length&& board[newx][newy]==str.charAt(n)&&visited[newx][newy]==false)
    {
        int ans= Codingninja(board, str,newx,newy , n+1,visited);
        // visited[i][j]=false;
        return ans;
    }
    f++;

}


    visited[i][j]=false;
    return 0;


  }



public static int helper(char[][]board,String str)
{
    // boolean visited[][]=new boolean[board.length][board[0].length];
    int i=0;
    while(i<board.length)
    {
    int j=0;
    while(j<board[i].length)
    {

        if(board[i][j]==str.charAt(0))
        {boolean visited[][]=new boolean[board.length][board[0].length];
            int ans=Codingninja(board, str,i,j,1,visited);
            if(ans==1)
            {
                return 1;
            }
        }
        j++;
    }
    i++;
}
return 0;
}



    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
      int N =s.nextInt();
     int M=s.nextInt();
        // String []graph={"CXDXNXNXNXA","XOXIXGXIXJX"};
        String []graph={"CANI","OOJN","DDIG","JNIN"};

        char board[][]=new char[N][M];
        int i=0;
        while(i<N)
        {
            int j=0;
            while(j<M)
            {
                board[i][j]=graph[i].charAt(j);
                j++;
            }
            i++;
        }
        String str="CODINGNINJA";
        int ans=helper(board,str);
        System.out.println(ans);
    }
}