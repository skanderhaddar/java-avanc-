package port;

public class test {
		public static void main(String[] args) {

		barque b1;
		b1= new barque("barque1 ",1 );
		System.out.println(b1.toString());
		BarqueMoteur b2;
		b2=new BarqueMoteur(40, "barque2"  , 2);
		System.out.println(b2.toString());
		BarqueMoteur b3;
		b3=new BarqueMoteur(60 , "barque3" , 3 );
		barque b4;
		b4= new barque("barque4 ",4 );

		port p;
		p=new port("p1 ",20, 4);
		p.ajouter_barque(b1);
		p.ajouter_barque_moteur(b2);
		p.ajouter_barque_moteur(b3);
		p.ajouter_barque(b4);
		//System.out.println(p.toString());
		p.sortie(b2);
		//System.out.println(p.toString());
		System.out.println(p.calcule_taxe());

}}
