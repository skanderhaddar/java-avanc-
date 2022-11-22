import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Fenetre  extends JFrame{
	String titre ;
	int l , h ;
	public Fenetre(String titre , int l , int h ) {
		this.setTitle(titre);
		this.setSize(l , h);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan = new JPanel() ;
		pan.setBackground(Color.RED);
		JLabel l1 = new JLabel ("login");
		JLabel l2 = new JLabel ("Paasword");
		JTextField txt1 = new JTextField(20) ; 
		JPasswordField txt2=  new JPasswordField(20) ;
		JButton b1 = new JButton("ok") ;
		JButton b2 = new JButton("Annuler") ;
		JButton b3 = new JButton("Fermer") ;

		pan.add(b1 ) ;
		pan.add(b2 );
		pan.add(b3 );
		
		JPanel pan1 = new JPanel(new GridLayout(0,2)) ; 
		pan1.add(l1);
		pan1.add(txt1);

		pan1.add(l2);
		pan1.add(txt2);
		this.getContentPane().add(pan1 , BorderLayout.NORTH) ;
		this.getContentPane().add(pan , BorderLayout.SOUTH) ;
		this.setResizable(false);

		this.setVisible(true) ;
		pack();

				}

}
