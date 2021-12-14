import java.sql.*;
import java.util.Scanner;

public class Jdbc1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root","");
        Statement s= con.createStatement();
//        PreparedStatement s=con.prepareStatement("insert into stu values (?,?,?)");
//        Scanner sc = new Scanner(System.in);
//        s.setString(1,sc.nextLine());
//        s.setString(2,sc.nextLine());
//        s.setInt(3,sc.nextInt());
//        s.executeUpdate("delete from stu where name ='kaushi'");
        s.executeUpdate("update stu SET name='kaushi' where name='harshi'");

        ResultSet rs =s.executeQuery("select * from stu");
        while(rs.next()){
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
        }
        con.close();
    }
}
