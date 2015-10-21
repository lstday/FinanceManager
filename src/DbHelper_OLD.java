import java.sql.*;

/**
 * Created by eliseev on 06.10.15.
 */


public class DbHelper_OLD {
    private static Connection connection = null;
    private static Statement statement = null;
    private static Boolean isClosed = true;

//    static {
//        //TODO создаём необходимое для соединения(что именно? нужно ли вообще?)
//    }

    public Connection getConnection() {
        if (connection == null ||  isClosed) { //Или "&&"?
            try {
                Driver d = (Driver) Class.forName("org.sqlite.JDBC").newInstance();
                String url = "jdbc:sqlite:/home/eliseev/fmanager.db";
                connection = DriverManager.getConnection(url);
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
            //TODO? проверка на наличие таблиц
            //я думаю, неправильно проверять бд на наличие таблиц при обращении к getConnection(),
            // может быть лучше сделать метод, который запускает в каком-нибудь init методе(это при запуске программы)
            // скрипт с create table if not exist?

        }
        return connection;
    }

    public static void closeConn() throws SQLException {
        connection.close();
        isClosed = true;
    }

}