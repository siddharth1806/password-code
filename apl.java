import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*<applet code= apl.class Width=400 Height=400></applet>*/
public class apl extends Applet implements ActionListener
	{
		
		Label L1,L2,L3,l4,l5,l6,l7,l8;TextField T1,T2,T3,t4,t5,t6,t7,t8;
		Button B1,B2;
		public void init()
			{
				L1=new Label("Roll no.");
				l7=new Label("Name");
				L2=new Label("physics");
				L3=new Label("chemistry");
				l4=new Label("Math");
				l5=new Label("total marks");
				l8=new Label("percentage");
				l6=new Label("division");
				T1=new TextField(10);
				T2=new TextField(10);
				T3=new TextField(10);
				t4=new TextField(10);
				t5=new TextField(10);
				t6=new TextField(10);
				t7=new TextField(10);
				t8=new TextField(10);
				B1=new Button("show");
				B2=new Button("next");
				B1.addActionListener(this);
				B2.addActionListener(this);
				add(L1);add(T1);add(l7);add(t7);add(L2);add(T2);add(L3);add(T3);add(l4);add(t4);add(l5);add(t5);add(l6);add(t6);add(l8);add(t8);add(B1);add(B2);
			}
	
	public void actionPerformed(ActionEvent e)
	{	
		int n1,n2,n3,s;float d;String g;
		if(e.getSource()==B1)
			{
				n1=Integer.parseInt(T2.getText());
				n2=Integer.parseInt(T3.getText());
				n3=Integer.parseInt(t4.getText());
				s=n1+n2+n3;
				t5.setText(String.valueOf(s));
				d=((float)s/300)*100;
				t8.setText(String.valueOf(d));
				if(d<=40)
					g="Fail";
				else
					if(d<50)
						g="third";
					else
						if(d<60)
							g="second";
						else
							g="first";

				
				
				t6.setText(g);
			}
				if(e.getSource()==B2)
				{
					T1.setText("");
					T2.setText("");
					T3.setText("");
					t4.setText("");t5.setText("");t6.setText("");t7.setText("");t8.setText("");
							
				}
	
			
	}
}