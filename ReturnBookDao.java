import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReturnBookDao {
    public static int delete(String bookcallno,int studentid){
        int status=0;
        try{
            Connection con=DB.getConnection();

            status=updatebook(bookcallno);//updating Cantitate

            if(status>0){
                PreparedStatement ps=con.prepareStatement("delete from issuebooks where Titlu=? and studentid=?");
                ps.setString(1,bookcallno);
                ps.setInt(2,studentid);
                status=ps.executeUpdate();
            }

            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    }
    public static int updatebook(String bookcallno){
        int status=0;
        int quantity=0;
        try{
            Connection con=DB.getConnection();

            PreparedStatement ps=con.prepareStatement("select Cantitate from books where Titlu=?");
            ps.setString(1,bookcallno);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                quantity=rs.getInt("Cantitate");

            }
                PreparedStatement ps2=con.prepareStatement("update books set Cantitate=? where Titlu=?");
                ps2.setInt(1,quantity+1);
                ps2.setString(2,bookcallno);
                status=ps2.executeUpdate();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    }
}
