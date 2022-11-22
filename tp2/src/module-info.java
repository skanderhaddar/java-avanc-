public class compte {
	private float s  ;
	int comp = 0 ;
	String num ;
	
	public compte ()
	{
		s = 0 ;
		comp = comp + 1 ;
		num = String.valueOf(comp) ;
	}
	
	void crediter (float x) 
	{
		s = s+x ;
	}
	void debiter (float x)
	{
		if (s>x) 
		{
			s = s-x ;
		}
	}
	float getSolde()
	{
		return (s) ;
	}
	void afficher () 
	{
		System.out.printf(num) ;
		getSolde() ;
		
	}
	boolean Verif ( String a)
	{
	  return (a.equals(num) ) ;
	}
	
	
			
	}