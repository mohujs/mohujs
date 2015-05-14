/* Program to increment font size for every mouse click 
 * starting with an alphabet 'A' 
 * For every key click change alphabet in ascending order from 'A-Z'
 * and in the reverse order
 */


import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
   <applet code="MouseKey" width=1200 height=900>
   </applet> 
 */

public class MouseKey extends Applet implements MouseListener,MouseMotionListener , KeyListener
{
	static int FSize=20;
	String msg1="A";
	int flag=0;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		requestFocus();
	}
	
	//mouse events
	public void mouseClicked(MouseEvent me)
	{
		FSize=FSize+10;
		repaint();
	}
	
	public void mouseEntered(MouseEvent me){repaint();}
	public void mouseExited(MouseEvent me){	repaint();}
	public void mousePressed(MouseEvent me){repaint();}
	public void mouseReleased(MouseEvent me){repaint();}
	public void mouseDragged(MouseEvent me){repaint();}
	public void mouseMoved(MouseEvent me)
	{
		showStatus("Moving mouse at "+me.getX()+" , "+me.getY());
	}
	
	//key events	
	public void keyPressed(KeyEvent ke) 
	{
		/*The part of the code which changes 'A-Z' and reverse*/
		if(flag==0)
		{	
			char c = msg1.charAt(0);
			int i= (int) c;
			i++;
			char chi = (char) i;
			msg1 = Character.toString(chi);
			if(c=='Y')
				flag=1;
		}
		else
		{
			char c = msg1.charAt(0);
			int i= (int) c;
			i--;
			char chi = (char) i;
			msg1 = Character.toString(chi);
			if(c=='B')
				flag=0;
		}
		
		repaint();
	}
	public void keyReleased(KeyEvent ke){repaint();}
	public void keyTyped(KeyEvent ke){repaint();}
	public void paint(Graphics g)
	{
		Font f = new Font("Helvetica",Font.BOLD,FSize);
		g.setColor(Color.RED);
		g.setFont(f);
		g.drawString(msg1, 90, 300);
	}
}