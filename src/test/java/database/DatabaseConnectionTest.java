package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnectionTest {

    private static Connection connect = null;

    public static void main(String[] args) {

        try{
            String url = "jdbc:mysql://127.0.0.1:3333/customers?useUnicode=true&serverTimezone=UTC";
            String user = "root";
            String password = "Rfhfv,f123!";
            connect = DriverManager.getConnection(url,user,password);
            if(connect!=null){
                System.out.println("Connection to the database Customers ");
            }

            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customers.customers_data;");

//
//            String[] arr = null;
//            while (resultSet.next()){
//                String name = resultSet.getString("name");
//                System.out.println(name);
//            }
            List allRows = new ArrayList();
            int numberColumns = 6;
            while (resultSet.next()){
                String[] currentRow = new String[numberColumns];
                for (int i = 1; i <=numberColumns ; i++) {
                    currentRow[i-1] = resultSet.getString(i);
                    System.out.print(currentRow[i-1] + " ");
                }
                System.out.println();
                allRows.add(currentRow);
            }

        }catch (SQLException e){
            System.out.println("Can not connect. Check if user/password is valid.");
            e.printStackTrace();
        }finally {
            try{
                connect.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}
