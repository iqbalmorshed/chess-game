/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Iqbal
 */
public class King
{
    int count=0;
    int markKing(int x,int y)
    {
        if(x<7)
        {
            if(Board.b[x+1][y]==0)
            {
                Board.c[x+1][y]=33;
                count++;
            }
            if(Board.b[x][y]==21)
            {
                if(Board.b[x+1][y]>=1 && Board.b[x+1][y]<=16)
                {
                    Board.c[x+1][y]=33;
                    count++;
                }
            }
            else
                if(Board.b[x+1][y]>=17 && Board.b[x+1][y]<=32)
                {
                    Board.c[x+1][y]=33;
                    count++;
                }
        }

        if(x>0)
        {
            if(Board.b[x-1][y]==0)
            {
                Board.c[x-1][y]=33;
                count++;
            }
            if(Board.b[x][y]==21)
            {
                if(Board.b[x-1][y]>=1 && Board.b[x-1][y]<=16)
                {
                    Board.c[x-1][y]=33;
                    count++;
                }
            }
            else
                if(Board.b[x-1][y]>=17 && Board.b[x-1][y]<=32)
                {
                    Board.c[x-1][y]=33;
                    count++;
                }
        }
        if(y<7)
        {
            if(Board.b[x][y+1]==0)
            {
                Board.c[x][y+1]=33;
                count++;
            }
            if(Board.b[x][y]==21)
            {
                if(Board.b[x][y+1]>=1 && Board.b[x][y+1]<=16)
                {
                    Board.c[x][y+1]=33;
                    count++;
                }
            }
            else
                if(Board.b[x][y+1]>=17 && Board.b[x][y+1]<=32)
                {
                    Board.c[x][y+1]=33;
                    count++;
                }
        }
        if(y>0)
        {
            if(Board.b[x][y-1]==0)
            {
                Board.c[x][y-1]=33;
                count++;
            }
            if(Board.b[x][y]==21)
            {
                if(Board.b[x][y-1]>=1 && Board.b[x][y-1]<=16)
                {
                    Board.c[x][y-1]=33;
                    count++;
                }
            }
            else
                if(Board.b[x][y-1]>=17 && Board.b[x][y-1]<=32)
                {
                    Board.c[x][y-1]=33;
                    count++;
                }
        }
        if(x<7 && y<7)
        {
            if(Board.b[x+1][y+1]==0)
            {
                Board.c[x+1][y+1]=33;
                count++;
            }
            if(Board.b[x][y]==21)
            {
                if(Board.b[x+1][y+1]>=1 && Board.b[x+1][y+1]<=16)
                {
                    Board.c[x+1][y+1]=33;
                    count++;
                }
            }
            else
                if(Board.b[x+1][y+1]>=17 && Board.b[x+1][y+1]<=32)
                {
                    Board.c[x+1][y+1]=33;
                    count++;
                }
        }
        if(x<7 && y>0)
        {
            if(Board.b[x+1][y-1]==0)
            {
                Board.c[x+1][y-1]=33;
                count++;
            }
            if(Board.b[x][y]==21)
            {
                if(Board.b[x+1][y-1]>=1 && Board.b[x+1][y-1]<=16)
                {
                    Board.c[x+1][y-1]=33;
                    count++;
                }
            }
            else
                if(Board.b[x+1][y-1]>=17 && Board.b[x+1][y-1]<=32)
                {
                    Board.c[x+1][y-1]=33;
                    count++;
                }
        }
        if(x>0 && y<7)
        {
            if(Board.b[x-1][y+1]==0)
            {
                Board.c[x-1][y+1]=33;
                count++;
            }
            if(Board.b[x][y]==21)
            {
                if(Board.b[x-1][y+1]>=1 && Board.b[x-1][y+1]<=16)
                {
                    Board.c[x-1][y+1]=33;
                    count++;
                }
            }
            else
                if(Board.b[x-1][y+1]>=17 && Board.b[x-1][y+1]<=32)
                {
                    Board.c[x-1][y+1]=33;
                    count++;
                }
        }
        if(x>0 && y>0)
        {
            if(Board.b[x-1][y-1]==0)
            {
                Board.c[x-1][y-1]=33;
                count++;
            }
            if(Board.b[x][y]==21)
            {
                if(Board.b[x-1][y-1]>=1 && Board.b[x-1][y-1]<=16)
                {
                    Board.c[x-1][y-1]=33;
                    count++;
                }
            }
            else
                if(Board.b[x-1][y-1]>=17 && Board.b[x-1][y-1]<=32)
                {
                    Board.c[x-1][y-1]=33;
                    count++;
                }
        }
        return count;
    }

}
