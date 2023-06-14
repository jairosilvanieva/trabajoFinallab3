package Models;

import Models.Persona;

import java.time.LocalDate;

public abstract class Empleado extends Persona {
    private Double salario;
    private Integer cantDeHoras;
    private Integer antiguedad;

    public Empleado() {
    }

    public Empleado(Double salario, Integer cantDeHoras, Integer antiguedad) {
        this.salario = salario;
        this.cantDeHoras = cantDeHoras;
        this.antiguedad = antiguedad;
    }

    public Empleado(String nombre, String apellido, String dni, LocalDate fDeNacimiento, String email, String direccion, String nroDeTelefono, Double salario, Integer cantDeHoras, Integer antiguedad) {
        super(nombre, apellido, dni, fDeNacimiento, email, direccion, nroDeTelefono);
        this.salario = salario;
        this.cantDeHoras = cantDeHoras;
        this.antiguedad = antiguedad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getCantDeHoras() {
        return cantDeHoras;
    }

    public void setCantDeHoras(Integer cantDeHoras) {
        this.cantDeHoras = cantDeHoras;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "salario=" + salario +
                ", cantDeHoras=" + cantDeHoras +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
