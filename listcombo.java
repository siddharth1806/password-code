import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*<applet code= listcombo.class Width=400 Height=400></applet>*/
public class listcombo extends Applet implements ActionListener
{		String a[]={"101","102","103","104","105"};
		String n[]={"AMIT","RAM","SHYAM","ANKIT","SID"};
	List l; Choice c; TextField t;
	public void init()
	{	
		
		l=new List(3);
		t=new TextField(20);
		c=new Choice();
		for(int i=0;i<5;i++)
		{
			l.add(a[i]);
			c.add(n[i]);
		}
		l.addActionListener(this);
		add(l);add(c);add(t);
	}
	public void actionPerformed(ActionEvent e)
	{
		int i=l.getSelectedIndex();
		String s = a[i];
		t.setText(s);
		showStatus(s);
	}
}