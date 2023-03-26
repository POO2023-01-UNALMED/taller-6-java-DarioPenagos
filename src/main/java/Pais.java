package vehiculos;

import java.util.Map;
import java.util.HashMap;

public class Pais {
    String nombre = "";
    static Pais masVendedor = null;
    static Map<Pais, Integer> vendidos = new HashMap<Pais, Integer>();
    public Pais(String nombre){
        this.nombre = nombre;
        if(vendidos.containsKey(nombre)){
            vendidos.put(this, 1);
        } else {
            vendidos.put(this, vendidos.get(nombre)+1);
        }
        int n = vendidos.get(this);
        if (Pais.masVendedor == null){
            Pais.masVendedor = this;
        } else if (vendidos.get(this) > vendidos.get(Pais.masVendedor)){
            Pais.masVendedor = this;
        }
        
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }

    
    public static Pais paisMasVendedor(){
        return Pais.masVendedor;
    }
    

}
