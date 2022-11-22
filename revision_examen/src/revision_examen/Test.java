package revision_examen;

public class Test {
	public static void main (String[] args) {
	auteur a1 , a2 , a3 ;
	livre l1 , l2 , l3 ;
	a1 = new auteur("taha");
	a2 = new auteur("salah");
	a3 = new auteur("ahmed");
	l1 = new livre("kiteb 9ria2a" , new auteur[] {a1} ) ;
	l2 = new livre("kiteb terikh" , new auteur[] {a1 , a2} ) ;
	l3 = new livre("kiteb science" , new auteur[] {a3, a2} ) ;
	System.out.println(l1.getTitre()+ l1.getPremierAuteur() );
	for (auteur i : l1.getAuteur())
	{
		i.afficher();
	}
}}
