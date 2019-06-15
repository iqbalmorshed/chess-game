/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iqbal
 */
public class Validity
{
    Pawn p=new Pawn();
    Rook r=new Rook();
    Bishop b=new Bishop();
    King k=new King();
    Queen q=new Queen();
    Knight kn=new Knight();


    boolean isVaild(int x,int y)
    {
        if(Board.b[x][y]==0)
            return false;
        
        return true;
    }


    int markValidStep(int x,int y) //for marking steps of pieces
    {
        if(Board.b[x][y]>=25 && Board.b[x][y]<=32) //marking white pawn
           return p.markPawn(x,y);

        if(Board.b[x][y]>=9 && Board.b[x][y]<=16)  //marking black pawn
           return p.markPawnB(x,y);

        if(Board.b[x][y]==17 || Board.b[x][y]==24 || Board.b[x][y]==1 || Board.b[x][y]==8 )
            return r.markRook(x,y);
        
        if(Board.b[x][y]==19 || Board.b[x][y]==22 || Board.b[x][y]==3 || Board.b[x][y]==6)
            return b.markBishop(x,y);

        if(Board.b[x][y]==21 || Board.b[x][y]==5)
            return k.markKing(x,y);

        if(Board.b[x][y]==20 || Board.b[x][y]==4)
            return q.markQueen(x,y);

        if(Board.b[x][y]==18 || Board.b[x][y]==23 || Board.b[x][y]==2 || Board.b[x][y]==7)
            return kn.markKnight(x,y);
        
        return 0;
    }
    boolean isValidPlace(int x,int y)
    {
        if(Board.c[x][y]==33)
            return true;

        return false;
    }
    void set(int x,int y)
    {
        Board.b[x][y]=Board.b[Points.startX][Points.startY];
        //if(Points.startX!=Points.endX)
            Board.b[Points.startX][Points.startY]=0;
    }

}
class Board
{
    static int b[][]=new int[8][8];
    static int c[][]=new int[8][8];


    static int initial[] = new int[33];

    Board()
    {
        int i,j,m;
        for(i=9;i<=16;i++)
            initial[i]=0;
        for(i=25;i<=32;i++)
            initial[i]=0;

        m=1;
        for(i=0;i<=1;i++)
        {
            for(j=0;j<=7;j++)
            {
                b[i][j]=m++;

            }
        }


        for(i=7;i>=6;i--)
            for(j=0;j<=7;j++)
                b[i][j]=m++;
    }

}