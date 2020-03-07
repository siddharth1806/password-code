import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code= psd.class Width=400 Height=400></applet>*/
public class psd extends Applet implements ActionListener
{
	Label l1,l2,l3; frm obj1;
	TextField t1,t2;
	public void init()
	{
		l3=new Label("");
		l1=new Label("User's Name");
		t1=new TextField(30);
		l2=new Label("Password");
		t2=new TextField(30); t2.setEchoChar('*');
		obj1=new frm("First window",600,600);
		t2.addActionListener(this);
		add(l1);add(t1);add(l2);add(t2);add(l3);
	}
	public void actionPerformed(ActionEvent e)
		{
			if(t1.getText().equalsIgnoreCase("XYZ") && t2.getText().equalsIgnoreCase("RAM"))
				obj1.show();
			else
				l3.setText("Invalid Password");
			


		}
}
class frm extends Frame
	{
		frm(String s, int x, int y)		
			{
				super(s);
				resize(x,y);
			}
}