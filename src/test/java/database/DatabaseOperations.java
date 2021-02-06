package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOperations {
    private Statement statement;

    public DatabaseOperations(Statement statement) {
        this.statement = statement;
    }

    public void createDatabase(String nameDatabase) throws SQLException {
        statement.executeUpdate("CREATE SCHEMA "+nameDatabase+";");
    }

    public boolean isDatabaseExist(String str) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SHOW DATABASES;");
        List<String> list = new ArrayList<>();
        while(resultSet.next()) {
            list.add(resultSet.getString(1));
            if(list.contains(str)) {
                return true;
            }
        }
        return false;
    }
    public boolean isTableExist(String str) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM information_schema.tables where TABLE_SCHEMA='products'");
        List<String> list = new ArrayList<>();
        while(resultSet.next()) {
            list.add(resultSet.getString(3));
            if(list.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public void createTable(String nameTable) throws SQLException {
        statement.executeUpdate("CREATE TABLE products."+nameTable+" (\n" +
                "  id_vegetables INT NOT NULL,\n" +
                "  name VARCHAR(45) NULL,\n" +
                "  price DOUBLE NULL,\n" +
                "  weight DOUBLE NULL,\n" +
                "  PRIMARY KEY (id_vegetables));");
    }

    public void insertData() throws SQLException {
        statement.executeUpdate("INSERT products.vegetables (id_vegetables,name,price,weight)\n"+
                "VALUES ('1','Potato','10.3','158.6'), " +
                "('2','Tomato','42.6','52.9')," +
                "('3','Carrot','8.6','65.3');");
    }

    public int selectRows() throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM products.vegetables;");
        List allRows = new ArrayList();
        int numberColumns = 4;
        int cnt=0;
        String[] currentRow = new String[numberColumns];
        while (resultSet.next()){
            for (int i = 1; i <=numberColumns ; i++) {
                currentRow[i-1] = resultSet.getString(i);
                System.out.print(currentRow[i-1] + " ");
            }
            System.out.println();
            allRows.add(currentRow);
            cnt++;
        }
        return cnt;
    }

    public void updatePrice(String name, double price) throws SQLException {
        statement.executeUpdate("UPDATE products.vegetables SET price = '"+price+"' \n" +
                "WHERE name = '"+name+"';");
    }

    public String selectPriceByName(String name) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM products.vegetables WHERE name='"+name+"';");
        String price="";
        while (resultSet.next()){
            if(resultSet.getString("name").equals(name)) {
                price = resultSet.getString("price");
            }
        }
        return price;
    }

    public void deleteRow(String name) throws SQLException {
        statement.executeUpdate("DELETE FROM products.vegetables WHERE name = '"+name+"';");
    }

    public void dropTable() throws SQLException {
        statement.executeUpdate("DROP TABLE products.vegetables;");
    }

    public void requestAfterDeleting() throws SQLException {
        statement.executeQuery("SELECT * FROM products.vegetables;");
    }

    public void dropDatabase() throws SQLException {
        statement.executeUpdate("DROP DATABASE products;");
    }

    public boolean isPresent(String name) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM products.vegetables;");
        List<String> arr = new ArrayList<>();
        while (resultSet.next()) {
            arr.add(resultSet.getString("name"));
        }
        return arr.contains(name);
    }

    public String getCountRows() throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT COUNT(name) FROM products.vegetables;");
        String cnt="";
        while (resultSet.next()){
            cnt = resultSet.getString(1);
        }
        return cnt;
    }
}
