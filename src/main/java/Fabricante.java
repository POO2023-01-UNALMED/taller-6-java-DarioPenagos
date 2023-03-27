package vehiculos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Fabricante {
    String nombre;
    Pais pais;
    static Map<Fabricante, Integer> ventasPorFabrica = new HashMap <Fabricante, Integer>();

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
        int valorMax = -1;
        Fabricante fabricaMayorVentas = null;

        for (Entry<Fabricante, Integer> entry : ventasPorFabrica.entrySet()) {
            int valorActual = entry.getValue();

            if (valorActual > valorMax){
                valorMax = valorActual;
                fabricaMayorVentas = entry.getKey();
            }
        }
        return fabricaMayorVentas;
    }
    
}
