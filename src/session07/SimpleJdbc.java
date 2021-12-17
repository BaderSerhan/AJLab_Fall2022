package session07;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleJdbc {

    //use try-catch to handle exceptions or substitute with throws keywords in method signature
    public static void main(String[] args) throws SQLException {
        String host = "localhost";
        String username = "root";
        String rootPassword = "q1w2e3r4";

        Connection connection = null;

        try {
            //1 - Load the JDBC driver
            //throws ClassNotFoundException
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");

            //2- Establish the Connection
            //throws SQLException
            //connection string = jdbc:mysql://localhost/UMS?user=root&password=q1w2e3r4
            connection = DriverManager.getConnection("jdbc:mysql://" + host + "/UMS?user=" + username + "&password=" + rootPassword);
            System.out.println("Connection Established");

            //3 - Create a Statement
            Statement statement = connection.createStatement();

            //4 - Execute a statement
            String query = "INSERT INTO users (first_name, last_name) VALUES ('hassan', 'nassif')";
            int result = statement.executeUpdate(query);

            // 5- Process the results
            System.out.println(result + " rows updated");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SimpleJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SimpleJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.close();
        }
    }
}
