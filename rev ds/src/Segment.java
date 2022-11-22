
public class Segment 
{
	private ex_rev p1 ;
	private ex_rev p2 ;
	public Segment ( ex_rev p1 , ex_rev p2) 
	{
		this.p1 = p1 ;
		this.p2 = p2 ;
	}
	public void DeplacerExt1 (float a , float b ) 
	{
		p1.deplacer(a , b) ;
		
	}
	public void DeplacerExt2 (float a , float b ) 
	{
		p2.deplacer(a, b);
	}
	public float longueur () 
	{
		
		float x1 = p1.getAbscisse() ;
		float x2 = p2.getAbscisse() ;
		float y1 = p1.getOrdonne() ;
		float y2 = p2.getOrdonne() ;
		float l = (x1 - x2)*(x1 - x2) + (y1 - y2)* (y1 - y2) ;
		return (float)(Math.sqrt(l)) ;
	}
	
	

}
