package ulti;

import entity.User;

import java.sql.*;

public class MySQLConnection {
    private String DB_URL = "jdbc:mysql://localhost:3306/shopee_homework";
    private String DB_USERNAME = "root";
    private String DB_PASSWORD = "123456";

    private static final String INSERT_USERS_SQL = "INSERT INTO USERS (USER_NAME, PASSWORD) VALUES (?, ?);";
    private static final String SELECT_USER_BY_ID = "SELECT ID,USER_NAME,PASSWORD FROM USERS WHERE ID =?";
    private static final String SELECT_ALL_USERS = "SELECT * FROM USERS";
    private static final String DELETE_USERS_SQL = "DELETE FROM USERS WHERE ID = ?;";
    private static final String UPDATE_USERS_SQL = "UPDATE USERS SET NAME = ?,EMAIL= ?, COUNTRY =? WHERE ID = ?;";

    public MySQLConnection() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void insertUser(User user) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.setString(3, user.getPassWord());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public User selectUser(long id) {
        User user = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setLong(1,id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int
            }
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
