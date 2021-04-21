import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {

    private static Connection connection = null;
    private static Statement statement = null;

    public Db(){}

    public void init() {
        System.out.println("Db is connecting...........");


        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tests?characterEncoding=utf8","root","code9Mya!@");
            statement = connection.createStatement();
            System.out.println("Db connected......");

        }catch (SQLException e){
            System.out.println("Db error: "+e.getMessage());
        }

    }

    public static Connection getConnection() {
        return connection;
    }


    public static Statement getStatement() {
        return statement;
    }
    public static void closeConnection(){
        try{
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
