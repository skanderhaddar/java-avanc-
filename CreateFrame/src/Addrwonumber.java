import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Addrwonumber {
Frame f1 ; 
Label l1 , l2 , l3 ;
TextField t1 , t2 ; 
Button b1 ; 
Panel p1 , p2 , p3 , p4 ; 
public Addrwonumber() {
	f1 = new Frame("dakhel number jdid") ;
	l1 = new Label("bara mriguel") ;
	l2 = new Label("bara mriguel 2") ;
	l3 = new Label ("");
	t1 = new TextField(10);
	t2 = new TextField(20);
	  f1.addWindowListener(new WindowAdapter(){
          @Override
          public void windowClosing(WindowEvent we) {

              System.exit(0);
          }
      } );

	
	// create frame 
	createframe();
	Addfourpaneltoframe() ;
}

	private void createframe() {
		f1.setLayout(new GridLayout(4,1));
		f1.setSize(600 , 500);
		f1.setVisible(true);
		
	}
	private void Addfourpaneltoframe() {
		p1 = new Panel() ;
		f1.add(p1) ; 
		p1.add(l1) ; 
		p1.add(t1);
		p1.setVisible(true);

	}

}

