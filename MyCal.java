import java.awt.*;
import java.awt.event.*;

class MyCal extends Frame implements ActionListener{	
    	Menu m1,m2,m3;
	TextField tF;
	Button n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,add,sub,mul,div,per,eq,ce,c,mc,mr,ms,mAdd,mSub,sR,addOrSub,uB1,uB2,uB3,uB4,uB5,uB6;
	
	String fv,sv,op;
	double fdv,sdv,t;

	MyCal(){

        	setTitle("Calculator");
		setBounds(550,250,220,320);
		Panel p1=new Panel();
		Panel p2=new Panel();
		tF=new TextField(20);
        	add(p1,BorderLayout.NORTH);
        	add(p2,BorderLayout.CENTER);
		p1.add(tF);
		p2.setLayout(new GridLayout(6,5,5,5));


		addWindowListener(new WindowAdapter(){
               		public void windowClosing(WindowEvent Hu){
                        	System.exit(0);
                	}
                });

        	n0=new Button("0");
		n0.addActionListener(this);
		n1=new Button("1");
		n1.addActionListener(this);
		n2=new Button("2");
		n2.addActionListener(this);
		n3=new Button("3");
		n3.addActionListener(this);
		n4=new Button("4");
		n4.addActionListener(this);
		n5=new Button("5");
		n5.addActionListener(this);
		n6=new Button("6");
		n6.addActionListener(this);
		n7=new Button("7");
		n7.addActionListener(this);
		n8=new Button("8");
		n8.addActionListener(this);
		n9=new Button("9");
		n9.addActionListener(this);
		mc=new Button("MC");
		mr=new Button("MR");
		ms=new Button("MS");
		mAdd=new Button("M+");
		mSub=new Button("M-");
		uB1=new Button("<--");
		uB1.addActionListener(this);
		ce=new Button("CE");
		ce.addActionListener(this);
		c=new Button("C");
		c.addActionListener(this);
		addOrSub=new Button("+/-");
		addOrSub.addActionListener(this);
		sR=new Button("SQRT");
		sR.addActionListener(this);
		div=new Button("/");
		div.addActionListener(this);
		per=new Button("%");
		per.addActionListener(this);
		mul=new Button("*");
		mul.addActionListener(this);
		uB2=new Button("1/X");
		uB2.addActionListener(this);
		sub=new Button("-");
		sub.addActionListener(this);
		eq=new Button("=");
		eq.addActionListener(this);
		uB3=new Button("");
		uB3.addActionListener(this);
		uB4=new Button(".");
		uB4.addActionListener(this);
		add=new Button("+");
		add.addActionListener(this);
		uB6=new Button("");
		uB6.addActionListener(this);

        	p2.add(mc);
		p2.add(mr);
		p2.add(ms);
		p2.add(mAdd);
		p2.add(mSub);
		p2.add(uB1);
		p2.add(ce);
		p2.add(c);
		p2.add(addOrSub);
		p2.add(sR);
		p2.add(n7);
		p2.add(n8);
		p2.add(n9);
		p2.add(div);
		p2.add(per);
		p2.add(n4);
		p2.add(n5);
		p2.add(n6);
		p2.add(mul);
		p2.add(uB2);
		p2.add(n1);
		p2.add(n2);
		p2.add(n3);
		p2.add(sub);
		p2.add(eq);
		p2.add(n0);
		p2.add(uB3);
		p2.add(uB4);
		p2.add(add);
		p2.add(uB6);

        	MenuBar m=new MenuBar();
		m1=new Menu ("View");
		m2=new Menu ("Edit");
		m3=new Menu ("Help");
		m.add(m1);
		m.add(m2);
		m.add(m3);
		setMenuBar(m);
		MenuItem mI1=new MenuItem("View Help     F1");
		MenuItem mI2=new MenuItem("About Calculator");
		MenuItem mI3=new MenuItem("Copy       Ctrl+C");
		MenuItem mI4=new MenuItem("Paste      Ctrl+V");
		MenuItem mI5=new MenuItem("Cut          Ctrl+X");
		MenuItem mI6=new MenuItem("Exit");
		m3.add(mI1);
		m3.add(mI2);
		m2.add(mI3);
		m2.add(mI4);
		m2.add(mI5);
		m1.add(mI6);

        	setVisible(true);
    	}
	public void actionPerformed(ActionEvent aE){
		Object o=aE.getSource();

		if (o.equals(n0)){
			String x=tF.getText();
			String y=x+n0.getActionCommand();
			tF.setText(y);		
		}
		else if (o.equals(n1)){
			String x=tF.getText();
			String y=x+n1.getActionCommand();
			tF.setText(y);			
		}
		else if (o.equals(n2)){
			String x=tF.getText();
			String y=x+n2.getActionCommand();
			tF.setText(y);
		}
		else if (o.equals(n3)){
			String x=tF.getText();
			String y=x+n3.getActionCommand();
			tF.setText(y);
		}
		else if (o.equals(n4)){
			String x=tF.getText();
			String y=x+n4.getActionCommand();
			tF.setText(y);
		}
		else if (o.equals(n5)){
			String x=tF.getText();
			String y=x+n5.getActionCommand();
			tF.setText(y);
		}
		else if (o.equals(n6)){
			String x=tF.getText();
			String y=x+n6.getActionCommand();
			tF.setText(y);
		}
		else if (o.equals(n7)){
			String x=tF.getText();
			String y=x+n7.getActionCommand();
			tF.setText(y);
		}
		else if (o.equals(n8)){
			String x=tF.getText();
			String y=x+n8.getActionCommand();
			tF.setText(y);
		}
		else if (o.equals(n9)){
			String x=tF.getText();
			String y=x+n9.getActionCommand();
			tF.setText(y);
		}
		else if (o.equals(add)){
			fv=tF.getText();
			op=add.getActionCommand();
			tF.setText(null);
		}
		else if (o.equals(sub)){
			fv=tF.getText();
			op=sub.getActionCommand();
			tF.setText(null);
		}
		else if (o.equals(mul)){
			fv=tF.getText();
			op=mul.getActionCommand();
			tF.setText(null);
		}
		else if (o.equals(div)){
			fv=tF.getText();
			op=div.getActionCommand();
			tF.setText(null);
		}
		else if (o.equals(c)){
			tF.setText(null);
		}
		else if (o.equals(ce)){
			String pqr=null;
			tF.setText("");
			String ns="";
		}

		else if (o.equals(sR)){
           		fdv=Integer.valueOf(tF.getText());
           		tF.setText(String.valueOf(Math.sqrt(fdv)));
        	}
		else if (o.equals(uB1)){
            		fv=tF.getText();
            		sv=fv.substring(0,fv.length()-1);
          		tF.setText(sv);
		}	
		else if (o.equals(per)) {
            		fdv=Double.parseDouble(tF.getText());
            		tF.setText(""+fdv/100);
		}
		else if (o.equals(eq)){
			sv=tF.getText();
			fdv=Double.parseDouble(fv);
			sdv=Double.parseDouble(sv);
			if(op.equals("+")){
				t=fdv+sdv;
				tF.setText(String.valueOf(t));
			}
			else if(op.equals("-")){
				t=fdv-sdv;
				tF.setText(String.valueOf(t));
			}
			else if(op.equals("*")){
				t=fdv*sdv;
				tF.setText(String.valueOf(t));
			}
			else if(op.equals("/")){
				t=fdv/sdv;
				tF.setText(String.valueOf(t));
			}
			

			else if(o.equals("%")){
				fv=null;
				fdv=0;
				sdv=0;
				fv=tF.getText();
				
				if(fv.equals("")){
					tF.setText("");
				}else {
					fdv=Double.parseDouble(fv);
					double pr;
					pr=fdv/100;
					tF.setText(String.valueOf(pr));
				}
			}
		}
	}

	public static void main (String arg[]){
		new MyCal();
	}
}