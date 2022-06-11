import java.sql.*;
public class IssueBookDao {

    public static boolean checkBook(String bookname){
        boolean status=false;
        try{
            Connection con=DB.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from books where Titlu=?");
            ps.setString(1,bookname);
            ResultSet rs=ps.executeQuery();
            status=rs.next();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    }

    public static int save(String bookname,int studentid,String studentname,String studentcontact){
        int status=0;
        try{
            Connection con=DB.getConnection();

            status=updatebook(bookname);//updating Cantitate

            if(status>0){
                PreparedStatement ps=con.prepareStatement("insert into issuebooks(Titlu,studentid,studentname,studentcontact) values(?,?,?,?)");
                ps.setString(1,bookname);
                ps.setInt(2,studentid);
                ps.setString(3,studentname);
                ps.setString(4,studentcontact);
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

            if(quantity>0){
                PreparedStatement ps2=con.prepareStatement("update books set Cantitate=? where Titlu=?");
                ps2.setInt(1,quantity-1);
                ps2.setString(2,bookcallno);

                status=ps2.executeUpdate();
            }
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    }
}
