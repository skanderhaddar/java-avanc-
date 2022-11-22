package Exception;

public class Test {
    public static void main(String[] args) {
        try {
        temps T = new temps(51,12,37);
            
        } catch (TempsException e) {
            e.printStackTrace();
        }
    }
}


