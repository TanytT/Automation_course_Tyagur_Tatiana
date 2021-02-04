package database;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

import static org.testng.Assert.*;

public class DatabaseTest extends BaseTest{
    private Statement statement;
    private final String nameDatabase = "products";
    private final String nameTable = "vegetables";
    private final String rowName = "Tomato";
    private final String rowName1 = "Potato";

    private DatabaseOperations databaseOperations;

    @BeforeClass
    public void init() throws SQLException {
        statement = connect.createStatement();
        databaseOperations = new DatabaseOperations(statement);
    }

    @Test(priority = 0)
    public void createDatabaseTest() throws SQLException {
        databaseOperations.createDatabase(nameDatabase);
        assertTrue(databaseOperations.isDatabaseExist(nameDatabase),"The database is not created.");
    }

    @Test(priority = 1)
    public void createTableTest() throws SQLException {
        databaseOperations.createTable(nameTable);
        assertTrue(databaseOperations.isTableExist(nameTable),"The table is not created.");
    }

    @Test(priority = 2)
    public void insertInTableTest() throws SQLException {
        databaseOperations.insertData();
        assertEquals(databaseOperations.getCountRows(),"3");

    }

    @Test(priority = 3)
    public void selectTableTest() throws SQLException {
        assertEquals(databaseOperations.selectRows(),3);
    }

    @Test(priority = 4)
    public void updateTableTest() throws SQLException {
        databaseOperations.updatePrice(rowName1, 14.0);
        assertEquals(databaseOperations.selectPriceByName(rowName1),"14.0");
    }

    @Test(priority = 5)
    public void deleteRowFromTableTest() throws SQLException {
        databaseOperations.deleteRow(rowName);
        assertFalse(databaseOperations.isPresent(rowName), "The row Tomato is not deleted.");
    }

    @Test(expectedExceptions = SQLSyntaxErrorException.class, priority = 6)
    public void dropTableTest() throws SQLException {
        databaseOperations.dropTable();
        databaseOperations.requestAfterDeleting();
    }

    @Test(expectedExceptions = SQLException.class, priority = 7)
    public void dropDatabaseTest() throws SQLException {
        databaseOperations.dropDatabase();
        databaseOperations.requestAfterDeleting();
    }

}
