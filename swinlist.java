import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.JScrollPane.*;
/*<applet code= swinlist.class Width=400 Height=400></applet>*/
public class swinlist extends JApplet implements ListSelectionListener
{		String a[]={"101","102","103","104","105"};
		String n[]={"AMIT","RAM","SHYAM","ANKIT","SID"};
	JList l; JTextField t;
	public void init()
	{	
		
		l=new JList(a);
		t=new JTextField(20);
		JScrollPane j=new JScrollPane(l);
		l.setVisibleRowCount(3);
		l.addListSelectionListener(this);
		setLayout(new FlowLayout());
		add(j);add(t);
	}
	public void valueChanged(ListSelectionEvent e)
	{
		int i=l.getSelectedIndex();
		String s = a[i];
		t.setText(s);
		showStatus(s);
	}
}