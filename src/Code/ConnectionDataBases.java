package Code;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDataBases {

        public static void main(String[] args) {

            String url = "jdbc:mysql://127.0.0.1:3306/hotel_db";
            String username = "root";
            String password = "Jawed@91997#";

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection(url, username, password);

                System.out.println("Connected to the database.");

            } catch (Exception e) {
                System.out.println("Connection failed: " + e.getMessage());
            }
        }
    }

