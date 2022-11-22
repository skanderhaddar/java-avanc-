package employe;

import java.util.ArrayList;
public class Personnelle {
	    ArrayList<Employe> emp=new ArrayList<Employe>();
	    public void ajouteremploye(Employe e) {
	        emp.add(e);
	    }
	    void affichersalaire() {
	        for(int i=0;i<emp.size();i++) {
	            System.out.println(emp.get(i).calculer_salaire());
	        }
	    }
	    float salairemoyen() {
	        float som=0;
	        for(int i=0;i<emp.size();i++) {
	            som+=emp.get(i).calculer_salaire();
	        }
	        return som/emp.size();
	    }
	    void afficherEmp(){
	        for (Employe e:emp){
	            System.out.println(e.getNom());
	        }
	    }
	}


