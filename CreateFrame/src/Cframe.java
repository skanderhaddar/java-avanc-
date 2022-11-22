import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Cframe extends JFrame{

Frame f1 ;
Button b1 ,b2 ;

public Cframe(){
	f1 = new Frame("ahla w sahla") ; 
	f1.setLayout(new GridLayout(2,2));
	f1.setSize(500,400);
	b1=new Button("mriguel") ;
	f1.add(b1);
	b2=new Button("moch mriguel") ;
	f1.add(b2);

	f1.setVisible(true);
	pack();
}}