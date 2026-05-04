import java.io.Serializable;

public class Impresora implements Serializable {

    private int numeroSerie;
    private String marca;
    private String modelo;
    private TipoImpresora tipo;

    public Impresora(int numeroSerie, String marca, String modelo, TipoImpresora tipo) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoImpresora getTipo() {
        return tipo;
    }

    public void setTipo(TipoImpresora tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "numeroSerie=" + numeroSerie +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
