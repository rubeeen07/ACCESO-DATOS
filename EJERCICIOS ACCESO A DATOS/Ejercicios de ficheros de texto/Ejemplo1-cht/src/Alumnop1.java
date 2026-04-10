/*Crea una clase Alumno y guarda un objeto en un archivo.*/
//MIRAR Alumnop2

import java.io.Serializable;

public class Alumnop1 implements Serializable {
    String nombre;
    int edad;

    public Alumnop1(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: %s, edad: %d".formatted(nombre, edad);
    }
}
