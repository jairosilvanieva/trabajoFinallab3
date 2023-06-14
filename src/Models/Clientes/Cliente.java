package Models.Clientes;

import Genericos.Generico;
import Models.Animal;
import Models.Persona;

import java.time.LocalDate;

public class Cliente extends Persona {
    private Generico<Animal> mascotas;
    private Integer cantDeCompras;

    public Cliente() {
        this.cantDeCompras=0;
    }

    public Cliente(Generico<Animal> mascotas) {
        this.mascotas = mascotas;
        this.cantDeCompras=0;
    }

    public Cliente(String nombre, String apellido, String dni, LocalDate fDeNacimiemto, String email, String direccion, String nroDeTelefono, Generico<Animal> mascotas) {
        super(nombre, apellido, dni, fDeNacimiemto, email, direccion, nroDeTelefono);
        this.mascotas = mascotas;
        this.cantDeCompras=0;
    }

    public Generico<Animal> getMascotas() {
        return mascotas;
    }

    public void setMascotas(Generico<Animal> mascotas) {
        this.mascotas = mascotas;
    }

    public Integer getCantDeCompras() {
        return cantDeCompras;
    }

    public void setCantDeCompras(Integer cantDeCompras) {
        this.cantDeCompras = cantDeCompras;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "mascotas=" + mascotas +
                ", cantDeCompras=" + cantDeCompras +
                super.toString() +
                '}';
    }
}
