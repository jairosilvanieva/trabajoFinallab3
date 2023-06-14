import Enums.RazaGato;
import Enums.RazaPerro;
import Genericos.Generico;
import Models.Animal;
import Models.Clientes.Cliente;
import Models.Clientes.Gato;
import Models.Clientes.Perro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro("Catriel", LocalDate.now(), "Macho", 34.6, "Negro", true, RazaPerro.BULL_TERRIER);
        Gato g1 = new Gato("Roco", LocalDate.now(), "Hembra", 24.6, "Blanco", false, RazaGato.BENGALI);
        Generico<Animal> mascotas = new Generico<>();
        mascotas.agregaGenerico(p1);
        mascotas.agregaGenerico(g1);
        Cliente cl1 = new Cliente("Nahuel", "Mirabella", "41307784", LocalDate.of(1998, 9, 25), "mirabellamirabella@hotmail.com", "Vertiz", "2236350260", mascotas);
        Cliente cl2 = new Cliente("Jairo", "Silva", "2341123", LocalDate.of(1988, 1, 20), "jairosn@hotmail.com", "Colon", "222131223", mascotas);
        Cliente cl3 = new Cliente("Nicolas", "Duarte", "3342318", LocalDate.of(1992, 12, 20), "nicoduarteDev@hotmail.com", "Libertad", "2223525211", mascotas);

        System.out.println(cl1.toString());
 
    }
}