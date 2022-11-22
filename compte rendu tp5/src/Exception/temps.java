package Exception;


public class temps {
	    private int heures, minutes, secondes;

	    public temps(int h, int m, int s) throws TempsException {
	        if (h < 0 || h > 23)
	            throw new TempsException("Heure invalide");
	        if (m < 0 || m > 59)
	            throw new TempsException("Minute invalide");
	        if (s < 0 || s > 59)
	            throw new TempsException("Secondes invalides");
	        heures = h;
	        minutes = m;
	        secondes = s;
	    }
	}


