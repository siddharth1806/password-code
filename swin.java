import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code= swin.class Width=400 Height=400></applet>*/
public class swin extends JApplet implements ActionListener
{
	JLabel L1,L2,L3;
	JTextField T1,T2,T3;
	JButton B1,B2;
	public void init()
			{
				setLayout(new FlowLayout());
				L1=new JLabel("Num1");
				L2=new JLabel("Num2");
				L3=new JLabel("sum");
				T1=new JTextField(10);
				T2=new JTextField(10);
				T3=new JTextField(10);
				B1=new JButton("show");
				B2=new JButton("next");
				B1.addActionListener(this);
				B2.addActionListener(this);
				add(L1);add(T1);add(L2);add(T2);add(L3);add(T3);add(B1);add(B2);
			}
	
	public void actionPerformed(ActionEvent e)
	{	
		int n1,n2,s;
		if(e.getSource()==B1)
			{
				n1=Integer.parseInt(T1.getText());
				n2=Integer.parseInt(T2.getText());
				s=n1+n2;
				T3.setText(String.valueOf(s));
			}
			if(e.getSource()==B2)
			{
				T1.setText("");
				T2.setText("");
				T3.setText("");
			}
	}
}