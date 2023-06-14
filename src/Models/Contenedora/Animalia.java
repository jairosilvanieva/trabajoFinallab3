package Models.Contenedora;

import Genericos.Generico;
import Interfacez.ABM;
import Models.Animal;
import Models.Clientes.Cliente;
import Models.Empleado;
import Models.Personal.Cajero;
import Models.Personal.Veterinario;

public class Animalia implements ABM {
    private Generico<Empleado> empleados;
    private Generico<Cliente> clientes;
    private Insumos stock;

    public Animalia() {
        this.empleados=new Generico<>();
        this.clientes=new Generico<>();
    }

    public Animalia(Generico<Empleado> empleados, Generico<Cliente> clientes, Insumos stock) {
        this.empleados = empleados;
        this.clientes = clientes;
        this.stock = stock;
    }

    public Generico<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Generico<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Generico<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Generico<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Insumos getStock() {
        return stock;
    }

    public void setStock(Insumos stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Animalia{" +
                "empleados=" + empleados +
                ", clientes=" + clientes +
                ", stock=" + stock +
                '}';
    }

    @Override
    public Boolean carga(Object elemento) {
        if (elemento instanceof Cliente){
            clientes.agregaGenerico((Cliente) elemento);
        } else if (elemento instanceof Empleado){
            if (elemento instanceof Veterinario){
                empleados.agregaGenerico((Veterinario) elemento);
            }
            else {
                empleados.agregaGenerico((Cajero) elemento);
            }
        }
        else if (elemento instanceof Animal){
            
        }
        return null;
    }

    @Override
    public void modifica(Object elemento) {

    }

    @Override
    public Boolean baja(Object elemento) {
        return null;
    }

    @Override
    public Boolean alta(Object elemento) {
        return null;
    }

    @Override
    public Boolean borra(Object elemento) {
        return null;
    }
}
