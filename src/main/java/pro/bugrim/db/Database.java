package pro.bugrim.db;

import pro.bugrim.utils.Settings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String FILE_NAME = "db";
    private static final String DRIVER = "driver";
    private static final String URL = "url";

    private Connection connection;
    private Settings settings;

    public Database() {
        this.connection = loadConnection();
        this.settings = new Settings(FILE_NAME);
    }

    protected Connection connection() {
        return connection;
    }

    private Connection loadConnection() {
        try {
            Class.forName(settings.value(DRIVER));
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(settings.value(URL));
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return connection;
    }
}
