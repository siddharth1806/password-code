import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*<applet code= aplmenu.class Width=400 Height=400></applet>*/
public class aplmenu extends Applet implements ActionListener
{
	Button b;
	frm obj;
	public void init()
	{
		obj=new frm();
		b=new Button("Show Menu");
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			obj.show();
	}
}
class frm extends Frame implements ActionListener
{
	Menu m;MenuItem i1,i2;MenuBar mb; TextField t;
	frm()
	{
		super("MAIN_MENU");
		resize(400,400);
		m=new Menu("File");
		i1=new MenuItem("x");
		i2=new MenuItem("y");
		t=new TextField(20);
		mb=new MenuBar();
		mb.add(m);m.add(i1);m.add(i2);
		i1.addActionListener(this);
		i2.addActionListener(this);
		setMenuBar(mb);
		add(t);
	}
public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==i1)
		{	t.setText("choose x");}
		if(e.getSource()==i2)
		{ 	t.setText("choose y");}
	}
}
		
		