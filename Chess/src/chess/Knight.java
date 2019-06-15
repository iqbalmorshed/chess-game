/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Iqbal
 */
public class Knight {
    int count,i=0,j=0;
    int markKnight(int x,int y)
    {
        count=0;

        //System.out.println("pawn"+x+" "+y+" "+Board.b[x-1][y]);
        if(x+2<=7 && y+1<=7)    // no.1
        {
            if(Board.b[x][y]==18 || Board.b[x][y]==23)
            {
                if(!(Board.b[x+2][y+1]>=17 && Board.b[x+2][y+1]<=32))
                    Board.c[x+2][y+1]=33;count++;
            }
            else
            {
                if(!(Board.b[x+2][y+1]>=1 && Board.b[x+2][y+1]<=16))
                    Board.c[x+2][y+1]=33;count++;
            }
        }
        if(x+2<=7 && y-1>=0)    // no.2
        {
            if(Board.b[x][y]==18 || Board.b[x][y]==23)
            {
                if(!(Board.b[x+2][y-1]>=17 && Board.b[x+2][y-1]<=32))
                    Board.c[x+2][y-1]=33;count++;
            }
            else
            {
                if(!(Board.b[x+2][y-1]>=1 && Board.b[x+2][y-1]<=16))
                    Board.c[x+2][y-1]=33;count++;
            }
        }

        if(x+1<=7 && y-2>=0)    // no.3
        {
            if(Board.b[x][y]==18 || Board.b[x][y]==23)
            {
                if(!(Board.b[x+1][y-2]>=17 && Board.b[x+1][y-2]<=32))
                    Board.c[x+1][y-2]=33;count++;
            }
            else
            {
                if(!(Board.b[x+1][y-2]>=1 && Board.b[x+1][y-2]<=16))
                    Board.c[x+1][y-2]=33;count++;
            }
        }

        if(x-1>=0 && y-2>=0)    // no.4
        {
            if(Board.b[x][y]==18 || Board.b[x][y]==23)
            {
                if(!(Board.b[x-1][y-2]>=17 && Board.b[x-1][y-2]<=32))
                    Board.c[x-1][y-2]=33;count++;
            }
            else
            {
                if(!(Board.b[x-1][y-2]>=1 && Board.b[x-1][y-2]<=16))
                    Board.c[x-1][y-2]=33;count++;
            }
        }


        if(x-2>=0 && y-1>=0)    // no.5
        {
            if(Board.b[x][y]==18 || Board.b[x][y]==23)
            {
                if(!(Board.b[x-2][y-1]>=17 && Board.b[x-2][y-1]<=32))
                    Board.c[x-2][y-1]=33;count++;
            }
            else
            {
                if(!(Board.b[x-2][y-1]>=1 && Board.b[x-2][y-1]<=16))
                    Board.c[x-2][y-1]=33;count++;
            }
        }


        if(x-2>=0 && y+1<=7)    // no.6
        {
            if(Board.b[x][y]==18 || Board.b[x][y]==23)
            {
                if(!(Board.b[x-2][y+1]>=17 && Board.b[x-2][y+1]<=32))
                    Board.c[x-2][y+1]=33;count++;
            }
            else
            {
                if(!(Board.b[x-2][y+1]>=1 && Board.b[x-2][y+1]<=16))
                    Board.c[x-2][y+1]=33;count++;
            }
        }

        if(x-1>=0 && y+2<=7)    // no.7
        {
            if(Board.b[x][y]==18 || Board.b[x][y]==23)
            {
                if(!(Board.b[x-1][y+2]>=17 && Board.b[x-1][y+2]<=32))
                    Board.c[x-1][y+2]=33;count++;
            }
            else
            {
                if(!(Board.b[x-1][y+2]>=1 && Board.b[x-1][y+2]<=16))
                    Board.c[x-1][y+2]=33;count++;
            }
        }


        if(x+1<=7 && y+2<=7)    // no.8
        {
            if(Board.b[x][y]==18 || Board.b[x][y]==23)
            {
                if(!(Board.b[x+1][y+2]>=17 && Board.b[x+1][y+2]<=32))
                    Board.c[x+1][y+2]=33;count++;
            }
            else
            {
                if(!(Board.b[x+1][y+2]>=1 && Board.b[x+1][y+2]<=16))
                    Board.c[x+1][y+2]=33;count++;
            }
        }
        
        return count;
    }






}
