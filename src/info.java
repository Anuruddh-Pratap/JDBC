import java.sql.*;
class MysqlCon{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver"); //to register Driver class
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sonoo","root","root"); //creation of connection object
                    //here sonoo is database name, root is username and password
            Statement stmt=con.createStatement(); // creation of statement object
            ResultSet rs=stmt.executeQuery("select * from emp"); //execution of query
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close(); // closing the connection object
        }catch(Exception e){ System.out.println(e);}
    }
}