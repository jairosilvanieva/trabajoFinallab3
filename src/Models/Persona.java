package Models;

import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private LocalDate fDeNacimiemto;
    private String email;
    private String direccion;
    private String nroDeTelefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, LocalDate fDeNacimiemto, String email, String direccion, String nroDeTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fDeNacimiemto = fDeNacimiemto;
        this.email = email;
        this.direccion = direccion;
        this.nroDeTelefono = nroDeTelefono;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public LocalDate getEdad() {
        return fDeNacimiemto;
    }
    public void setfDeNacimiemto(LocalDate fDeNacimiemto) {this.fDeNacimiemto = Persona.this.fDeNacimiemto;}
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNroDeTelefono() {
        return nroDeTelefono;
    }
    public void setNroDeTelefono(String nroDeTelefono) {
        this.nroDeTelefono = nroDeTelefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", fDeNacimiemto=" + fDeNacimiemto +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nroDeTelefono='" + nroDeTelefono + '\'' +
                '}';
    }
}
