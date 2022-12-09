import Mall.Persons.Customer;

import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException {
        Customer a = new Customer("Fantana","Alex",123, null,300.25);

        String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        try
        {
            Class. forName(jdbcDriver);
            System.out.println("JDBC driver loaded");
        }
        catch (Exception err)
        {
            System.err.println("Error loading JDBC driver");
            err.printStackTrace(System.err);
            System.exit(0);
        }

        String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:49908;database=Mall;encrypt=true;trustServerCertificate=true;username=alex_fantana;password=cornporn";
        Connection databaseConnection;
        //Connect to the database
        databaseConnection = DriverManager.getConnection(url);
        System.out.println("Connected to the database");

        //declare the statement object
        Statement sqlStatement = databaseConnection.createStatement();

        //declare the result set
        ResultSet rs;
        String x = "select * from Customers";
        rs = sqlStatement.executeQuery(x);
        //System.out.println(rs);
        while (rs.next()) {
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("vorname"));
            System.out.println(rs.getString("credit"));
        }
        rs.close();
        System.out.println("Closing database connection");

        //close the database connection
        databaseConnection.close();

    }
}