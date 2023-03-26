package vehiculos;

public class Fabricante {
    String nombre;
    Pais pais;
    public Fabricante(String nom, Pais p){
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
    
    public static Fabricante fabricaMayorVentas(){
        return Vehiculo.fabricaMayorVentas();
    }
    
}
