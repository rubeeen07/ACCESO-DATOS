import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ClaseNueva {
    public static void main(String[] args) {
        try(Connection conexion = JdbcConnection.getInstance();){
            String query = "SELECT id,nombre,apellidos,email,telefono from clientes";
            try(Statement stmt = conexion.createStatement();){
                ResultSet rs=stmt.executeQuery(query);
                while(rs.next()){
                    int id=rs.getInt("id");
                    String nombre=rs.getString("nombre");
                    String apellidos=rs.getString("apellidos");
                    String email=rs.getString("email");
                    String telefono=rs.getString("telefono");
                    System.out.println(id+","+nombre+","+apellidos+","+email+","+telefono);
                }

            }catch (SQLException e){
                e.printStackTrace();
            }



        }catch (SQLException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
