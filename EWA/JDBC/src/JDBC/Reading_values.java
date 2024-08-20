package JDBC;

import java.sql.*;

public class Reading_values {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a database connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "8076107814@Yash");

            // Create a statement for executing SQL queries
            Statement stat = con.createStatement();

            // Execute a SELECT query to retrieve data from the table "Student_Yash22csu295"
            ResultSet rs = stat.executeQuery("select * from Student_Yash22csu295");

            while (rs.next()) {
                // Iterate through the result set and print the values of the first four columns
                System.out.println(
                        rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));

                // Note: Closing the connection here is not recommended, as it should be closed after processing all data.
                // The following line should be outside the loop.
                // con.close();
            }
        } catch (Exception e) {
            // Handle any exceptions that may occur during database operations
            System.out.println(e);
        }
    }
}
