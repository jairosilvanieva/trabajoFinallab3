package Genericos;

import java.util.ArrayList;
import java.util.List;

public class Generico<E>{
    List<E> genericos;

    public Generico() {
        this.genericos=new ArrayList<>();
    }

    public void agregaGenerico(E emp){
        this.genericos.add(emp);
    }
    public Integer cantidadTotal(){
        return this.genericos.size();
    }
    public Boolean borrarGenerico(E emp){
        return this.genericos.remove(emp);
    }
    public Boolean borrarGenerico(Integer pos){
        return this.genericos.remove(pos);
    }
    public E getGenerico(Integer pos){
        return genericos.get(pos);
    }



}
