import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
/* <applet code=External width=250 height=300>
</applet> */
public class External extends java.applet.Applet implements ActionListener{
        Choice c;
	public void init(){
        setBackground(Color.black);
        setForeground(Color.yellow);
        add(new Label("              JUICE ORDERING            "));
        setForeground(Color.black);
        setBackground(Color.lightGray);
        Checkbox c1=new Checkbox("Orange Juice");
        Checkbox c2=new Checkbox("Mango Juice");
        Checkbox c3=new Checkbox("Banana Juice");
        Checkbox c4=new Checkbox("Apple Juice");
        Checkbox c5=new Checkbox("Grape Juice");
        Checkbox c6=new Checkbox("Carrot Juice");
        Checkbox c7=new Checkbox("Papaya Juice");
        Checkbox c8=new Checkbox("Tomota Juice  ");
        Checkbox c9=new Checkbox("Pomegranate Juice      ");          
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(c6);
        add(c7);
        add(c8);
        add(c9);
        Button b1 = new Button("\tConfirm");
	Button b2 = new Button("Cancel");
	add(b1);
	add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);}
	public void paint(Graphics g){}
	public void actionPerformed(ActionEvent ae){
		String str = ae.getActionCommand();
		if(str.equals("Confirm"))
			JOptionPane.showMessageDialog(null,new String("Order Confirmed..! Enjoy Your Juice"));
		else
			System.exit(0);
}}