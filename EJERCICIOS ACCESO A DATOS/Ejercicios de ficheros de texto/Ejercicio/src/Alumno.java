import java.io.IOException;
import java.io.Serializable;

public class Alumno implements Serializable {

    private static final long serialVersionUID = 8948394829L;

    private String numeroExpediente;
    private String nombre;
    private String apellidos;

    public Alumno(String numeroExpediente, String nombre, String apellidos) {
        this.numeroExpediente = numeroExpediente;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numeroExpediente='" + numeroExpediente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
