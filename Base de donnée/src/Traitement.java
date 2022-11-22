import java.sql.Connection;
import java.sql.PreparedStatement;

public class Traitement {
   public void save(Produit P) {
       try {
       Connection c=Connect.getConnection();
       PreparedStatement stat=c.prepareStatement("insert into produit values(?,?,?)");
       stat.setInt(1,P.getId());
       stat.setString(2,P.getLibelle());
       stat.setDouble(3,P.getPrix());
       stat.executeUpdate();


   }catch(Exception e)
         {
         e.printStackTrace();
     }}

}
