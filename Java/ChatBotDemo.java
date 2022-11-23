import java.awt.Color;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
class Chatbot extends JFrame{
	private JTextArea ca=new JTextArea();
	private JTextField cf=new JTextField();
	private JButton b=new JButton();
	private JLabel l=new JLabel();

	Chatbot(){
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setSize(700,500);
		f.getContentPane().setBackground(Color.orange);
		f.setTitle("GENERAL KNOWLEDGE CHATBOT");
		f.add(ca);
		f.add(cf);
		f.add(b);
		b.add(l);
		ca.setSize(500,300);
		ca.setLocation(1,1);
		ca.setBackground(Color.BLACK);
		b.setSize(400,40);
		b.setLocation(300,320);
		cf.setSize(500,40);
		cf.setLocation(1,320);
		f.add(b);
		l.setText("SEND");
		b.add(l);
		b.setSize(400,40);
		b.setLocation(500,320);
		b.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==b){
					String text=cf.getText();
					ca.setForeground(Color.PINK);
					ca.append("You-->"+text+"\n");
					cf.setText("");
					if(text.contains("Hi")) {
						replyMeth("Hi i am a general knowledge chatbot,");
						replyMeth("How can i help you");
					}
					else if(text.contains("Prime minister of india")){
						replyMeth("Narendra Modi");
					}
					else if(text.contains("President of india")){
						replyMeth("Draupadi Murmu");
					}
					else if(text.contains("Vice president of india")){	
						replyMeth("Jagadeep Dhankar");
					}
					else if(text.contains("Lok sabha speaker")){
						replyMeth("Om Birla");
					}
					else if(text.contains("Andhrapradesh chief minister")){	
						replyMeth("Y.S Jagan Mohan Reddy");
					}
					else if(text.contains("Telangana chief minister")){	
						replyMeth("K.Chandra Shekar Rao");
					}
					else if(text.contains("Tamilnadu chief minister")){	
						replyMeth("Muthuvel Karunanidhi Stalin");
					}
					else if(text.contains("Educational minister of tamilnadu")){	
						replyMeth("Anbil Mahesh Poyyamozhi");
					}
					else if(text.contains("Educational minister of telangana")){	
						replyMeth("Smt.Patlolla Sabitha Indra Reddy");
					}
					else if(text.contains("Finance minister of telangana")){	
						replyMeth("T.Harish Rao");
					}
					else if(text.contains("Finance minister of andhrapradesh")){	
						replyMeth("Buggana Ragendranath Reddy");
					}
					else if(text.contains("President of USA")){	
						replyMeth("Donald Trump");
					}				
					else if(text.contains("Bye")){
						replyMeth("Too soon :( Anyways STAY HOME STAY SAFE");
						replyMeth("OK BYE :)");
					}
					else 
						replyMeth("I Can't Understand");
				}
			}
		});

	}
	public void replyMeth(String s){
		ca.append("ChatBot-->"+s+"\n");
	}
	
}

public class ChatBotDemo{
	public static void main(String[] args) {
		new Chatbot();
	}
}