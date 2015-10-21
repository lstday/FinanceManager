import java.sql.*;

/**
 * Created by eliseev on 06.10.15.
 */
public class DbHelper {
    private static Connection connection = null;
    private static Statement statement = null;
    private static Boolean isCreated = false;
    private static Boolean isClosed = true;
    private static DbHelper instance = null;


    public static DbHelper getInstance() {
        if (instance == null) {
            instance = new DbHelper();
        }
        return instance;
    }

    private DbHelper() {

    }

    public static Connection getConnection() {
        if (connection == null ||  isClosed) { //Или "&&"?
            try {
                Driver d = (Driver) Class.forName("org.sqlite.JDBC").newInstance();
                String url = "jdbc:sqlite:/home/eliseev/mydb.db";
                connection = DriverManager.getConnection(url);
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
            if (!isCreated) {
                createTables();
                isCreated=true;
            }
        }
        return connection;
    }

    public static void closeConn() throws SQLException {
        connection.close();
        isClosed = true;
    }

    private static void createTables() {
        //TODO создаём таблицы
    }
}



