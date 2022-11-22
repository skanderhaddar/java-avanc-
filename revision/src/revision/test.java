package revision;

public class test {
    public static void main(String[] args) {
    	Rectangle R = new Rectangle(2,1);
    	try {
    	Cercle C = new Cercle (-2);
    	C.contenantCarre(1);

    	}
    	catch(FormeException f) {
        f.printStackTrace();}

    	R.contenantCarre(20);
    }
    	
    }
