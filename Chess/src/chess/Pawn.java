/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Iqbal
 */
public class Pawn
{
    int markPawn(int x,int y)
    {
        int count=0;
        //System.out.println("pawn"+x+" "+y+" "+Board.b[x-1][y]);
        if(Board.initial[Board.b[x][y]]==0)
        {
            if(Board.b[x-1][y]==0)
            {
                Board.c[x-1][y]=33;
                count++;
            }
            if(Board.b[x-2][y]==0)
            {
                Board.c[x-2][y]=33;
                count++;
            }
            Board.initial[Board.b[x][y]]=1;
        }
        else
        {
            if(x>0)
            {
                if(Board.b[x-1][y]==0)
                {
                    Board.c[x-1][y]=33;
                    count++;
                }
                if(y>0)
                {
                    if(Board.b[x-1][y-1]>=1 && Board.b[x-1][y-1]<=16)
                    {
                        Board.c[x-1][y-1]=33;count++;
                    }

                }
                if(y<7)
                {
                    if(Board.b[x+1][y+1]>=1 && Board.b[x+1][y+1]<=16)
                    {
                        Board.c[x+1][y+1]=33;count++;
                    }


                }

            }
        }
       
        return count;
    }
    int markPawnB(int x,int y)
    {
       int count=0;
        //System.out.println("pawn"+x+" "+y+" "+Board.b[x-1][y]);
       if(Board.initial[Board.b[x][y]]==0)
        {
            if(Board.b[x+1][y]==0)
            {
                Board.c[x+1][y]=33;
                count++;
            }
            if(Board.b[x+2][y]==0)
            {
                Board.c[x+2][y]=33;
                count++;
            }
            Board.initial[Board.b[x][y]]=1;
        }
       else
       {

            if(x<7)
            {
                if(Board.b[x+1][y]==0)
                {
                    Board.c[x+1][y]=33;
                    count++;
                }
                if(y<7)
                {
                    if(Board.b[x+1][y+1]>=17 && Board.b[x+1][y+1]<=32)
                    {
                        Board.c[x+1][y+1]=33;count++;
                    }

                }
                if(y>0)
                {
                    if(Board.b[x+1][y-1]>=17 && Board.b[x+1][y-1]<=32)
                    {
                        Board.c[x+1][y-1]=33;count++;
                    }

                }

            }
       }

        return count;
    }
    
}

