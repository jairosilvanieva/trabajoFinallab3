package Models.Clientes;

import Models.Animal;

import java.time.LocalDate;

public class Gato extends Animal {

    private String color;
    private Boolean castrado;
    private Enum raza;

    public Gato() {
    }

    public Gato(String color, Boolean castrado, Enum raza) {
        this.color = color;
        this.castrado = castrado;
        this.raza = raza;
    }

    public Gato(String nombre, LocalDate nacimiento, String sexo, Double peso, String color, Boolean castrado, Enum raza) {
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
        return "Gato{" +
                "color='" + color + '\'' +
                ", castrado=" + castrado +
                ", raza='" + raza + '\'' +
                '}';
    }
}
