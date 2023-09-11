package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updating {
    public static void main(String[] args) {

         class DatabaseUpdater {
            // JDBC connection parameters
            private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
            private static final String DB_USER = "username";
            private static final String DB_PASSWORD = "password";

            public static void main(String[] args) {
                // Establish a connection to the database
                try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                    // Create a prepared statement for the update query
                    String updateQuery = "UPDATE your_table SET column1 = ?, column2 = ? WHERE id = ?";
                    PreparedStatement statement = conn.prepareStatement(updateQuery);

                    // Set the new values for the columns
                    statement.setString(1, "New value for column1");
                    statement.setString(2, "New value for column2");
                    statement.setInt(3, 1); // Assuming the primary key value is 1

                    // Execute the update query
                    int rowsUpdated = statement.executeUpdate();

                    // Check the result
                    if (rowsUpdated > 0) {
                        System.out.println("Update successful!");
                    } else {
                        System.out.println("No rows were updated.");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
