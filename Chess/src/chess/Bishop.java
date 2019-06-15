/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Iqbal
 */
public class Bishop
{
    int count,i,j;
    int markBishop(int x,int y)
    {
        count=0;
        if(x>0 && y>0)
        {
            for(i=x-1,j=y-1;i>=0 && j>=0;i--,j--)
            {
                if(Board.b[i][j]!=0)
                    break;
                Board.c[i][j]=33;
                count++;
            }
            if(i!=-1 && j!=-1)
            {
                if(Board.b[x][y]==19 || Board.b[x][y]==22)
                {
                     if(Board.b[i][j]>=1 && Board.b[i][j]<=16)
                        Board.c[i][j]=33;count++;
                }
                else
                {
                    if(Board.b[i][j]>=17 && Board.b[i][j]<=32)
                        Board.c[i][j]=33;count++;
                }
            }
        }
        if(x>0 && y<7)
        {
            for(i=x-1,j=y+1;i>=0 && j<=7;i--,j++)
            {
                if(Board.b[i][j]!=0)
                    break;
                Board.c[i][j]=33;
                count++;
            }
            if(i!=-1 && j!=8)
            {
                if(Board.b[x][y]==19 || Board.b[x][y]==22)
                {
                     if(Board.b[i][j]>=1 && Board.b[i][j]<=16)
                        Board.c[i][j]=33;count++;
                }
                else
                {
                    if(Board.b[i][j]>=17 && Board.b[i][j]<=32)
                        Board.c[i][j]=33;count++;
                }
            }
        }
        if(x<7 && y>0)
        {
            for(i=x+1,j=y-1;i<=7 && j>=0;i++,j--)
            {
                if(Board.b[i][j]!=0)
                    break;
                Board.c[i][j]=33;
                count++;
            }
            if(i!=8 && j!=-1)
            {
                if(Board.b[x][y]==19 || Board.b[x][y]==22)
                {
                     if(Board.b[i][j]>=1 && Board.b[i][j]<=16)
                        Board.c[i][j]=33;count++;
                }
                else
                {
                    if(Board.b[i][j]>=17 && Board.b[i][j]<=32)
                        Board.c[i][j]=33;count++;
                }
            }
        }
        if(x<7 && y<7)
        {
            for(i=x+1,j=y+1;i<=7 && j<=7;i++,j++)
            {
                if(Board.b[i][j]!=0)
                    break;
                Board.c[i][j]=33;
                count++;
            }
            if(i!=8 && j!=8)
            {
                if(Board.b[x][y]==19 || Board.b[x][y]==22)
                {
                     if(Board.b[i][j]>=1 && Board.b[i][j]<=16)
                        Board.c[i][j]=33;count++;
                }
                else
                {
                    if(Board.b[i][j]>=17 && Board.b[i][j]<=32)
                        Board.c[i][j]=33;count++;
                }
            }
        }
        
        return count;
    }



    // for Black Rook
   
}

