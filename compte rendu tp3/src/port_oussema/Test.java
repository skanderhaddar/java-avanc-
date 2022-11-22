package port_oussema;

public class Test {
		public static void main(String[] args) {
		Barque b1;
		b1= new Barque("barque1 ",1 );
		System.out.println(b1.toString());
		BarqueMoteur b2;
		b2=new BarqueMoteur(40, "barque2"  , 2);
		System.out.println(b2.toString());
		BarqueMoteur b3;
		b3=new BarqueMoteur(60 , "barque3" , 3 );
		Barque b4;
		b4= new Barque("barque4 ",4 );

		Port p;
		p=new Port("p1 ",20, 4);
		p.ajouter_barque(b1);
		p.ajouter_barque(b2);
		p.ajouter_barque(b3);
		p.ajouter_barque(b4);
		//System.out.println(p.toString());
		p.sortie(b2);
		//System.out.println(p.toString());
		System.out.println(p.calcule_taxe());

}}
