package employe;

public class Test {
        public static void main(String[] args) {
            Personnelle p=new Personnelle();
            p.ajouteremploye(new Vente("Pierre","Business",45,"1995",30000));
            p.ajouteremploye(new Representation("Léon","Vendtout",25,"2001",20000));
            p.ajouteremploye(new Production("Yves","Bosseur",32,"1998",1000));
            p.ajouteremploye(new Manutention("Jeanne","Stocketout",32,"1998",45));
            p.ajouteremploye(new RisqueProduction("Jean","Flippe",28,"2000",1000));
            p.ajouteremploye(new RisqueManutention("Al","Abordage",30,"2001",45));
            p.affichersalaire();
            System.out.println("le salaire moyen est "+p.salairemoyen());
            p.afficherEmp();
        }

}
