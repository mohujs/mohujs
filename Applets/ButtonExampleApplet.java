import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="internal2java_prob2" width=380 height=150>
</applet>
*/

public class ButtonExampleApplet extends Applet implements ActionListener, MouseMotionListener
{
	String reflect="";
	String msg="";
	int i=0,flag=0;
	int mouseX,mouseY;
	TextField name;
	Button btn1,btn2,btn3,btn4;
	public void init()
	{
		name = new TextField(reflect,30);add(name);
		name.addActionListener(this);
		btn1 = new Button("btn1"); add(btn1); btn1.addActionListener(this);
		btn2 = new Button("btn2"); add(btn2);btn2.addActionListener(this);
		btn3 = new Button("btn3"); add(btn3);btn3.addActionListener(this);
		btn4 = new Button("btn4");
		addMouseMotionListener(this);
		//addMouseListener(this);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		String str = ae.getActionCommand();
		if(str.equals("btn1")) {
			flag=0;
			if(i==0)
			{
				setBackground(Color.white);
				i=1;
			}
			else if(i==1)
			{
				setBackground(Color.green);
				i=2;
			}
			else if(i==2)
			{
				setBackground(Color.blue);
				i=3;
			}
			else if(i==3)
			{
				setBackground(Color.red);
				i=4;
			}
			else
				i=0;
		}
		else if(str.equals("btn2")) {
			flag=0;
			reflect="MCIS";
			name.setText(reflect);		
		}
		else if(str.equals("btn3"))
		//	flag=1;	
		//repaint();
			
			add(btn4);
			btn4.setBounds(100,100,100,100);
	}
	public void mouseMoved(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		if(flag==1)
			showStatus("Moving mouse at ("+me.getX()+" , "+me.getY()+")");
		repaint();
	}
	public void mouseClicked(MouseEvent me){repaint();}	
	public void mouseEntered(MouseEvent me){repaint();}
	public void mouseExited(MouseEvent me){	repaint();}
	public void mousePressed(MouseEvent me){repaint();}
	public void mouseReleased(MouseEvent me){repaint();}
	public void mouseDragged(MouseEvent me){repaint();}
	public void paint(Graphics g) 
	{
		if(flag==1)
			g.drawString("", mouseX, mouseY);
	}
}
