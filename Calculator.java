//_____________________________import__________________________________________________________________________________________________

import java .awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//_____________________________ActionListener____________________________________________________________________________________________

class Mycal7 extends Frame implements ActionListener {
	Button B,B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,B26,B27,B28,B29;
	TextField TX;
	Panel p,p2;
	String fv,sv,op;
	double fdv,sdv,tot;
	Menu MN;
	double firstvalue;
	
	
	Mycal7(){
	setTitle("Calculator");
	setBounds(400,100,350,450);

	addWindowListener(new WindowAdapter(){
               	 public void windowClosing(WindowEvent Hu){
                            System.exit(0);
                                                    }
                                                    });

//_____________________________Button__________________________________________________________________________________________________	
	
	B=new Button("MC");
	B1=new Button("MR");
	B2=new Button("MS");	
	B3=new Button("M+");
	B4=new Button("M-");
	B5=new Button("<--");
	B6=new Button("CE");
	B7=new Button("C");
	B8=new Button("±");	
	B9=new Button("SQRT");
	B10=new Button("7");
	B11=new Button("8");
	B12=new Button("9");
	B13=new Button("/");
	B14=new Button("%");	
	B15=new Button("4");
	B16=new Button("5");
	B17=new Button("6");
	B18=new Button("*");
	B19=new Button("1/x");
	B20=new Button("1");
	B21=new Button("2");
	B22=new Button("3");
	B23=new Button("-");
	B24=new Button("=");
	B25=new Button("0");
	B26=new Button(" ");
	B27=new Button(".");
	B28=new Button("+");
	B29=new Button(" ");	
	
//_____________________________set TextField , GridLayout and Panel___________________________________________________________________________
	TX=new TextField(30);

	GridLayout G=new GridLayout(6,6,4,4);

	p=new Panel();	
	p.add(TX);

	p2=new Panel();
	
	p2.setLayout(G);

//_____________________________add Button______________________________________________________________________________________________

	p2.add(B);
	p2.add(B1);
	p2.add(B2);
	p2.add(B3);
	p2.add(B4);
	p2.add(B5);
	p2.add(B6);
	p2.add(B7);
	p2.add(B8);
	p2.add(B9);
	p2.add(B10);
	p2.add(B11);
	p2.add(B12);
	p2.add(B13);
	p2.add(B14);
	p2.add(B15);
	p2.add(B16);
	p2.add(B17);
	p2.add(B18);
	p2.add(B19);
	p2.add(B20);
	p2.add(B21);
	p2.add(B22);
	p2.add(B23);
	p2.add(B24);
	p2.add(B25);
	p2.add(B26);
	p2.add(B27);
	p2.add(B28);
	p2.add(B29);
	
//_____________________________add ActionListener_________________________________________________________________________________________
	
	B.addActionListener(this);
	B1.addActionListener(this);
	B2.addActionListener(this);
	B3.addActionListener(this);
	B4.addActionListener(this);
	B5.addActionListener(this);
	B6.addActionListener(this);
	B7.addActionListener(this);
	B8.addActionListener(this);
	B9.addActionListener(this);
	B10.addActionListener(this);
	B11.addActionListener(this);
	B12.addActionListener(this);
	B13.addActionListener(this);
	B14.addActionListener(this);
	B15.addActionListener(this);
	B16.addActionListener(this);
	B17.addActionListener(this);
	B18.addActionListener(this);
	B19.addActionListener(this);
	B20.addActionListener(this);
	B21.addActionListener(this);
	B22.addActionListener(this);
	B23.addActionListener(this);
	B24.addActionListener(this);
	B25.addActionListener(this);
	B26.addActionListener(this);
	B27.addActionListener(this);
	B28.addActionListener(this);
	B29.addActionListener(this);

//_____________________________BorderLayout____________________________________________________________________________________________

	add(p,BorderLayout.NORTH);
	add(p2,BorderLayout.CENTER);

//_____________________________MenuBar , SubMenu and MenuItem________________________________________________________________________________________________
		MenuBar MB=new MenuBar();
	
	Menu MN= new Menu("File");
	MenuItem MI=new MenuItem("Standard                    Alt+1");
	MenuItem MI11=new MenuItem("Scientific                    Alt+2");
	MenuItem MI22=new MenuItem("Programmer             Alt+3");
	MenuItem MI33=new MenuItem("Statistics                   Alt+4");
	MenuItem MI44=new MenuItem("History");
	MenuItem MI55=new MenuItem("Digit grouping");
	MenuItem MI66=new MenuItem("Basic                           Ctrl+F4");
	MenuItem MI77=new MenuItem("Unit Conversion          Ctrl+U");
	MenuItem MI88=new MenuItem("Date Calculation          Ctrl+E");
	MN.add(MI);
	MN.add(MI11);
	MN.add(MI22);
	MN.add(MI33);
	MN.add(MI44);
	MN.add(MI55);
	MN.add(MI66);
	MN.add(MI77);
	MN.add(MI88);

	Menu MN1= new Menu("Edit");
	Menu MI4=new Menu ("History");
	
	MenuItem MI2=new MenuItem ("Copy                     Ctrl+C");
	MenuItem MI3=new MenuItem ("Paste                   Ctrl+V");
	
	MenuItem SB=new MenuItem ("Copy History         Ctrl+H");
	MenuItem SB1=new MenuItem("Edit                                F2");
	MenuItem SB2=new MenuItem ("Cancel Edit                  F4");
	MenuItem SB3=new MenuItem("Clear            Ctrl+Shift+D");
	MI4.add(SB);
	MI4.add(SB1);
	MI4.add(SB2);
	MI4.add(SB3);
	MN1.add(MI2);
	MN1.add(MI3);
	MN1.add (MI4);

	Menu MN2= new Menu("Help");
	MenuItem MI5=new MenuItem("View Help             F8");
	MenuItem MI6=new MenuItem("About  Calcutator ");
	MN2.add(MI5);
	MN2.add(MI6);
	


	MB.add(MN);
	MB.add(MN1);
	MB.add(MN2);

	setMenuBar(MB);	
	
	setVisible(true);
	//addWindowListener(new MyCloseButtonHandler());
	//addWindowListener(new MyCloseButtonHandler());


	}
	public void actionPerformed(ActionEvent e){
	Object o=e.getSource();
	
//_____________________________Button ("7")______________________________________________________________________________________________

	if(o.equals(B10)){
		String ss=TX.getText();
		TX.setText(ss+B10.getActionCommand());
		}

//_____________________________Button ("8")______________________________________________________________________________________________
	
else if(o.equals(B11)){
		String ss=TX.getText();
		TX.setText(ss+B11.getActionCommand());
		}

//_____________________________Button ("9")______________________________________________________________________________________________

	else if(o.equals(B12)){
		String ss=TX.getText();
		TX.setText(ss+B12.getActionCommand());
		}

//_____________________________Button ("4")______________________________________________________________________________________________
	
	else if(o.equals(B15)){
		String ss=TX.getText();
		TX.setText(ss+B15.getActionCommand());
		}

//_____________________________Button ("5")______________________________________________________________________________________________

	else if(o.equals(B16)){
		String ss=TX.getText();
		TX.setText(ss+B16.getActionCommand());
		}

//_____________________________Button ("6")______________________________________________________________________________________________
	
	else if(o.equals(B17)){
		String ss=TX.getText();
		TX.setText(ss+B17.getActionCommand());
		}

//_____________________________Button ("1")______________________________________________________________________________________________	
	
	else if(o.equals(B20)){
		String ss=TX.getText();
		TX.setText(ss+B20.getActionCommand());
		}

//_____________________________Button ("2")______________________________________________________________________________________________

	else if(o.equals(B21)){
		String ss=TX.getText();
		TX.setText(ss+B21.getActionCommand());
		}

//_____________________________Button ("3")______________________________________________________________________________________________
	else if(o.equals(B22)){
		String ss=TX.getText();
		TX.setText(ss+B22.getActionCommand());
		}
	
//_____________________________Button ("0")______________________________________________________________________________________________

	else if(o.equals(B25)){
		String ss=TX.getText();
		TX.setText(ss+B25.getActionCommand());
		}

//_____________________________Button (".")______________________________________________________________________________________________
	
	else if(o.equals(B27)){
		String ss=TX.getText();
		TX.setText(ss+B27.getActionCommand());
		}	

//_____________________________Button ("CE")____________________________________________________________________________________________

	else if(o.equals(B6)){
		op=B6.getActionCommand();
		//TX.setText("");
		TX.setText(null);
		}

//_____________________________Button ("C")_____________________________________________________________________________________________

	else if(o.equals(B7)){
		op=B7.getActionCommand();
		//TX.setText("");
		TX.setText(null);
		}

//_____________________________Button ("/")______________________________________________________________________________________________

	else if(o.equals(B13)){
		fv=TX.getText();
		op=B13.getActionCommand();
		//TX.setText("");
		TX.setText(null);
		}

//_____________________________Button ("*")______________________________________________________________________________________________

	else if(o.equals(B18)){
		fv=TX.getText();
		op=B18.getActionCommand();
		//TX.setText("");
		TX.setText(null);
		}

//_____________________________Button ("-")______________________________________________________________________________________________
	else if(o.equals(B23)){
		fv=TX.getText();
		op=B23.getActionCommand();
		//TX.setText("");
		TX.setText(null);
		}

//_____________________________Button ("+")_____________________________________________________________________________________________

	else if(o.equals(B28)){
		fv=TX.getText();
		op=B28.getActionCommand();
		//TX.setText("");
		TX.setText(null);
		}

//_____________________________Button ("<--")____________________________________________________________________________________________

	else if (o.equals(B5)) {
            		fv = TX.getText();
            		sv= fv.substring(0, fv.length() - 1);
          		TX.setText(sv);
		}

//_____________________________Button ("SQRT")__________________________________________________________________________________________

	else if (o.equals(B9)) {
           		 fdv = Double.parseDouble(TX.getText());
           		 TX.setText("" + Math.sqrt(fdv));
        		}

//_____________________________Button ("=")_____________________________________________________________________________________________

	else if(o.equals(B24)){
		sv=TX.getText();
		fdv=Double.parseDouble(fv);
		sdv=Double.parseDouble(sv);
		
		if(op.equals("+")){
			tot=fdv+sdv;
			TX.setText(tot+"");
			//TX.setText(String.valueof(tot));
			}

		if(op.equals("-")){
			tot=fdv-sdv;
			TX.setText(tot+"");
			}

		if(op.equals("/")){
			tot=fdv/sdv;
			TX.setText(tot+"");
			//TX.setText(String.valueof(tot));
			}

		if(op.equals("*")){
			tot=fdv*sdv;
			TX.setText(tot+"");
			}}

//_____________________________Button(B 14)_____________________________________________________________________________________________


		else if(o.equals("%")){ 
			fv=null;
			fdv=0;
			sdv=0;
			fv=TX.getText();
		if(fv.equals("")){
			TX.setText("");
		}else {
			fdv=Double.parseDouble(fv);
			double pr;
			pr=fdv/100;
			TX.setText(String.valueOf(pr));
				
	                   	}			
		}
	}
}
class cal8{
	public static void main(String args[]){
		Mycal7 mc=new Mycal7();
	}
}

