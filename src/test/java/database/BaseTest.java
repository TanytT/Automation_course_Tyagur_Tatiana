package database;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseTest {

    protected static Connection connect = null;
    @BeforeClass
    public void connectToDatabase(){
        try{
            String url = "jdbc:mysql://127.0.0.1:3333?useUnicode=true&serverTimezone=UTC";
            String user = "root";
            String password = "Rfhfv,f123!";
            connect = DriverManager.getConnection(url,user,password);
            if(connect!=null){
                System.out.println("Connection to the database");
            }
        }catch (SQLException e) {
            System.out.println("Can not connect. Check if user/password is valid.");
            e.printStackTrace();
        }
    }
    @AfterClass
    public void closeConnection(){
        try{
            connect.close();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
