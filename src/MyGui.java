import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyGui extends JFrame{

	public MyGui(){
		setLayout(new BorderLayout());
		JPanel pan=new JPanel();
		pan.add(new JLabel("Products"));
		//super.
		//this.
		add(pan,BorderLayout.NORTH);
		setTitle("Order");
		JPanel panScroll=new JPanel();
		JScrollPane scroll=new JScrollPane(panScroll);
		//add(scroll,BorderLayout.CENTER);
		putPanels(panScroll);
		setVisible(true);
		setSize(300,300);
	}
	
	public void putPanels(JPanel pan){
		pan.setLayout(new BoxLayout(pan,BoxLayout.Y_AXIS));
		for(int i=0;i<50;i++){
			JPanel p=new JPanel();
			JLabel l=new JLabel("Item: "+i);
			JTextField f=new JTextField(30);
			p.add(l);
			p.add(f);
			pan.add(p);
		}
		JButton b=new JButton("Submit");
		JPanel p=new JPanel();
		p.add(b);
		pan.add(p);
	}
}
