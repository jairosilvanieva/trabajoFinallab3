package Models.Clientes;

import Models.Animal;

import java.time.LocalDate;

public class Perro extends Animal {
    private String color;
    private Boolean castrado;
    private Enum raza;

    public Perro() {
    }

    public Perro(String color, Boolean castrado, Enum raza) {
        this.color = color;
        this.castrado = castrado;
        this.raza = raza;
    }

    public Perro(String nombre, LocalDate nacimiento, String sexo, Double peso, String color, Boolean castrado, Enum raza) {
        super(nombre, nacimiento, sexo, peso);
        this.color = color;
        this.castrado = castrado;
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getCastrado() {
        return castrado;
    }

    public void setCastrado(Boolean castrado) {
        this.castrado = castrado;
    }

    public Enum getRaza() {
        return raza;
    }

    public void setRaza(Enum raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "color=" + color +
                ", castrado=" + castrado +
                ", raza='" + raza + '\'' +
                '}';
    }
}
