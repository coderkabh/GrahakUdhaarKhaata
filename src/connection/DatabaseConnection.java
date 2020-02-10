/*
 * Created by IntelliJ IDEA.
 * User: Kanishk
 * Date: 10/02/20
 * Time: 10:57 PM
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static final String URL = "jdbc:mysql://localhost:3306/BorrowBaseDB";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    private static Connection connection = null;

    /*
     * This method will return connection
     */
    public static Connection getConnection() {
        return connection;
    }

    /*
     * This method will establish connection and return true if connection is established
     */
    public boolean establishConnection() throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection != null;
    }

    /*
     * This method will print connection status
     */
    public void printConnectionStatus() {
        if (getConnection() != null) {
            System.out.println("\nConnection is active\n");
        } else {
            System.out.println("\nConnection is inactive\n");
        }
    }

    /*
     * This method will return true if connection is established else false
     */
    public boolean getConnectionStatus() throws SQLException {
        boolean response = false;
        if (getConnection() != null) response = true;
        return response;
    }
}
