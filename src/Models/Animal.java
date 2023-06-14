package Models;

import java.time.LocalDate;

public abstract class Animal {
    private String nombre;
    private LocalDate nacimiento;
    private String sexo;
    private Double peso;
    ///PESO PUEDE SER UN METODO; PESAR DEVUELVE DOUBLE

    public Animal() {
    }

    public Animal(String nombre, LocalDate nacimiento, String sexo, Double peso) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", nacimiento=" + nacimiento +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                '}';
    }
}
