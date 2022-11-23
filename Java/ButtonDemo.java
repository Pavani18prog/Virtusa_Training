import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code=ButtonDemo width=600 height=700>
</applet>
*/
public class ButtonDemo  extends Applet implements ActionListener
{
	public void init()
	{
		setBackground(Color.darkGray);
 		setForeground(Color.cyan);
		Button b1=new Button("Submit");
		Button b2=new Button("Reset");
		Button b3=new Button("Quit");
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString("ButtonDemo",50,50);
	}
	public void actionPerformed(ActionEvent ae){
		String str=ae.getActionCommand();
		if(str.equals("Submit"))
			setBackground(Color.pink);
		else if(str.equals("Reset"))
			setBackground(Color.orange);
		else
			setBackground(Color.red);
	}
}