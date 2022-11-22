package td3;
import java.util.ArrayList ;
public class test {
	public static void main(String[] args) {
	ArrayList<Employe> list = new ArrayList<>();
		list.add(new Vacataire ("ALI" , 200 , 3.9f)) ; 
		list.add(new Contractuel ("MOHAMED",900)) ;
		list.add( new Permanent ("Mohamed" , 1100f , 150f)) ;
		for ( int i= 0 ; i<list.size() ; i ++) 
		{
			System.out.println(list.get(i).toString()) ;
		}
	}

}
