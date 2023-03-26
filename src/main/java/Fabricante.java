package vehículos;

public class Fabricante {
    String nombre;
    Pais pais;
    Fabricante(String nom, Pais p){
        this.nombre = nom;
        this.pais = p;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public Pais getPais(){
        return this.pais;
    }
    public void setPais(Pais p){
        this.pais = p;
    }
}
