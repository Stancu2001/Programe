import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddBookDao {
    public static int save(int Id,String Titlu,String Autor,String Editura,int Cantitate,int Pagini,int Pret,int An_aparitie){
        int status=0;
        try{
            Connection con=DB.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into books(Id,Titlu,Autor,Editura,Cantitate,Pagini,Pret,An_aparitie) values(?,?,?,?,?,?,?,?)");
            ps.setInt(1,Id);
            ps.setString(2,Titlu);
            ps.setString(3,Autor);
            ps.setString(4,Editura);
            ps.setInt(5,Cantitate);
            ps.setInt(6,Pagini);
            ps.setInt(7, Pret);
            ps.setInt(8, An_aparitie);
            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    }
}
