 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Points
{
    static int startX,startY,endX,endY;

}

class PaintPanel extends JPanel implements MouseListener
{
    int mouseX = 100, mouseY =100;
    ImageIcon var[]=new ImageIcon[35];
    int points[]=new int[10];
    Input inp=new Input();
    boolean x;
    int row,coloumn;
    int i;
    int index;
    PaintPanel()
    {
        addMouseListener(this);
        // Put a border around the panel.
        
         index=0;


        setBorder(BorderFactory.createLineBorder(Color.RED, 10));
        var[1] =  new ImageIcon("redRock.gif");
        var[8] =  new ImageIcon("redRock.gif");

        var[2] = new ImageIcon("redKnight.gif");
        var[7] = new ImageIcon("redKnight.gif");

        var[3] = new ImageIcon("redBishop.gif");
        var[6] = new ImageIcon("redBishop.gif");

        var[4] = new ImageIcon("redQueen.gif");
        var[5] = new ImageIcon("redKing.gif");
        for(i=9;i<=16;i++) var[i] = new ImageIcon("redPawn.gif");




        var[17] =  new ImageIcon("blueRock.gif");
        var[24] =  new ImageIcon("blueRock.gif");

        var[18] = new ImageIcon("blueKnight.gif");
        var[23] = new ImageIcon("blueKnight.gif");

        var[19] = new ImageIcon("blueBishop.gif");
        var[22] = new ImageIcon("blueBishop.gif");

        var[21] = new ImageIcon("blueKing.gif");
        var[20] = new ImageIcon("blueQueen.gif");
        for(i=25;i<=32;i++) var[i] = new ImageIcon("bluePawn.gif");

     }
    String msg = "";
    // Override the paintComponent() method.
        public void paintComponent(Graphics g)
        {
        // Always call the superclass method first.
           super.paintComponent(g);
           int i,j,m,k,even;
           for(i=m=even=0;i<8;i++,m=m+50)
            {
               if(i%2==0)            even=1;
               else                  even=0;
                for(j=k=0;j<8;j++,k=k+50)
                {
                    if(even%2==0)
                        g.setColor(Color.gray);
                    else
                        g.setColor(Color.white);

                    g.fillRect(k, m,50,50);
                    even++;
                }
            }

           for(i=0;i<8;i++)
           {
               for(j=0;j<8;j++)
               {
                   if(Board.c[i][j]==33)
                   {
                       g.setColor(Color.yellow);
                       g.fillRect(5+j*50,5+i*50,40,40);
                   }
               }
           }

           for(i=0;i<8;i++)
           {
               for(j=0;j<8;j++)
               {
                   if(Board.b[i][j]!=0)
                       var[Board.b[i][j]].paintIcon(this,g,j*50,i*50);

               }
           }


            g.setColor(Color.BLACK);
            g.drawString(msg, 50,430);
           //System.out.println("Hello world "+mouseX+" "+ mouseY);
        //}
        }

     // coordinates of mouse
       
        public void mouseClicked(MouseEvent me)
        {
            // save coordinates
            mouseX = me.getX();
            mouseY = me.getY();
            //msg = "Mouse clicked.";
            coloumn=mouseX/50;
            row=mouseY/50;
            System.out.println(row+" "+coloumn+" ");//debug
            points[index++]=row;
            points[index++]=coloumn;
            //System.out.println("hello"); //debug
            if(index==2 || index==6)
            {
                Points.startX=points[index-2];
                Points.startY=points[index-1];
                
                x=inp.takeStartPosition(Points.startX,Points.startY);
                //System.out.println(x);
                if(x==false)
                {
                    index=index-2;
                    msg="invalid start move";

                }
                else
                    msg="valid start move";

                 repaint();
            }
            if(index==4 || index ==8)
            {
                Points.endX=points[index-2];
                Points.endY=points[index-1];
                x=inp.takeEndPosition(Points.endX,Points.endY);
                if(x==false)
                {
                    index=index-2;
                    msg="invalid end move";

                }
                else
                {
                    msg="valid end move";
                    for(int m=0;m<8;m++)            // clear the Board.c
                        for(int n=0;n<8;n++)
                            Board.c[m][n]=0;
                    if(index==8)
                        index=0;
                }

                repaint();
            }

        }
        // Handle mouse entered.
        public void mouseEntered(MouseEvent me)
        {
        }
        // Handle mouse exited.
        public void mouseExited(MouseEvent me)
        {
        }
        // Handle button pressed.
        public void mousePressed(MouseEvent me)
        {
        }
        // Handle button released.
        public void mouseReleased(MouseEvent me)
        {
        }
        // Handle mouse dragged.

 }

class PaintDemo
{
    JLabel jlab;
    PaintPanel pp;
    PaintDemo()
    {
        // Create a new JFrame container.
        JFrame jfrm = new JFrame("Paint Demo");
        // Give the frame an initial size.
        jfrm.setSize(800,500); //800,500
        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create the panel that will be painted.
        pp = new PaintPanel();
        // Add the panel to the content pane. Because the default
        // border layout is used, the panel will automatically be
        // sized to fit the center region.
        jfrm.add(pp);
        // Display the frame.
        jfrm.setVisible(true);
    }
    public static void main(String args[])
    {
        Board bd=new Board();
        // Create the frame on the event dispatching thread.
        
        SwingUtilities.invokeLater
        (
                new Runnable()
                {
                    public void run()
                    {
                        new PaintDemo();
                    }
                }
         );
     }
}
class Input
{
    int count;
    Validity v=new Validity();

    boolean takeStartPosition(int x,int y)
    {
       
        if(v.isVaild(x,y)==true)
        {
            
            
            count=v.markValidStep(x,y);

            if(count!=0)
                return true;
        }
        System.out.println("count "+count);
        return false;
    }
    boolean takeEndPosition(int x,int y)
    {
        if(v.isValidPlace(x,y)==true)
        {
            v.set(x,y);
            return true;
        }
        return false;
    }

}
