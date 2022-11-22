
 import javax.swing.JFrame;

	public class fenetre2  extends JFrame{
		String titre ;
		int l , h ;
		public fenetre2(String titre , int l , int h ) {
			this.setTitle(titre);
			this.setSize(l , h);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
