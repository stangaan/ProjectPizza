import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    private static void createCoffeTable(Connection connection)throws SQLException{
        Statement statement = connection.createStatement();

        String createTableQuery = "CREATE TABLE IF NOT EXISTS coffee (" +
                "iD INT PRIMARY KEY AUTO_INCREMENT,"+
                "name VARCHAR (100) NOT NULL" +
                "description VARCHAR (1000) NOT NULL" +
                "price DECIMAL(10,2) NOT NULL" +
                ")";
        statement.executeUpdate(createTableQuery);

    }
    private static void addCoffee(Connection connection, String name, String description, double price)
        throws SQLException{
        String insertQuery = "INSERT INTO coffee (name, description, price) VALUES(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
preparedStatement.setString(1,name);
preparedStatement.setString(2,description);
preparedStatement.setDouble(3,price);

preparedStatement.executeUpdate();
System.out.println("Information reinvoll eingetragen wurde!");

    }
}
