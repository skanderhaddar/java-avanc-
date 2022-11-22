package revision_examen;

public class livre {
       private String titre ;
       auteur[] tabAuteurs ;
       public livre (String ch , auteur[] t)
       {
    	   titre = ch ; 
    	   tabAuteurs = t ; 
    	   for (auteur i : tabAuteurs) {
    		   i.ajouterLivre(this) ;
    	   }
       }
       public String getTitre() 
       {
    	   return titre ;
       }
       public auteur getPremierAuteur()
       {
    	   return tabAuteurs[0];
       }
       public auteur[] getAuteur ()
       {
    	   return tabAuteurs;
       }
}
