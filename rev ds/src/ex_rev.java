
public class ex_rev {
		private float abs , ord ; 
		public ex_rev(float abs , float ord )
		{
			this.abs = abs ;
			this.ord=ord;
		}
		
		public float getAbscisse ()
		{
			return(abs) ;
		}
		
		public float getOrdonne ()
		{
			return(ord) ;
		}
		public void deplacer (float dx ,float dy)
		{
			abs= abs + dx ;
			ord = ord + dy ; 
		}
		public void afficher () 
		{
			System.out.println("abscisse =" +  abs + "cordonné = " + ord) ;
		}
		public boolean coincide(ex_rev p )
		{
			return ( p.abs == abs && p.ord == ord) ;
		}
			
	}

