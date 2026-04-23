import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class JdbcConnection  {


    private static Connection connection;
    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/mercedes";
    private static final String CONNECTION_USER = "root";
    private static final String CONNECTION_PASSWORD = "1234";

    private JdbcConnection() throws SQLException {

        connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USER, CONNECTION_PASSWORD);


    }

    public static Connection getInstance(){
        try{
            if ((Objects.isNull(connection) ||  connection.isClosed()))
                new JdbcConnection();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
}