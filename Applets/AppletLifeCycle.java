import java.applet.Applet;
import java.awt.Graphics;


public class AppletLifeCycle extends Applet{

	String msg;
	
	public void init(){
		
		System.out.println("I am in inti");
		msg="Init";
	}
	
	public void start(){
		System.out.println("I am in start");
		msg+=" Start";
		
	}
	
	public void paint(Graphics g){
		g.drawString(msg,100,100);
		showStatus(" Hello Status bar");
	}
	
	public void stop(){
		System.out.println("Applet Stoper");
		
	}
	
	public void destroy(){
		System.out.println("Ap[plet destoyed");
		
	}
}

	
