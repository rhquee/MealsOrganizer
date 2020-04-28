package pl.kfrak;

import pl.kfrak.dao.DishDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class App {

        private final String url = "jdbc:postgresql://localhost:5432/MealsOrganizer";
        private final String user = "postgres";
        private final String password = "ppp";

        private DishDao dishDao;


    public static void main( String[] args ) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        App app = new App();
        app.connect();
    }

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    }
