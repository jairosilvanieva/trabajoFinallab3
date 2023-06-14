package Interfacez;

import Models.Persona;

public interface ABM <T>{
    public abstract Boolean carga(T elemento);
    public abstract void modifica(T elemento);
    public abstract Boolean baja(T elemento);
    public abstract Boolean alta(T elemento);
    public abstract Boolean borra(T elemento);

}
