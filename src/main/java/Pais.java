package vehiculos;

import java.util.Map;
import java.util.HashMap;

public class Pais {
    String nombre = "";
    static Pais masVendedor;
    static Map<Pais, Integer> vendidos = new HashMap<Pais, Integer>();
    public Pais(String nombre){
        this.nombre = nombre;
        if(vendidos.containsKey(nombre)){
            vendidos.put(this, 1);
        } else {
            vendidos.put(this, vendidos.get(nombre)+1);
        }

        /*
        int n = vendidos.get(this);
        if (Pais.masVendedor == null){
            Pais.masVendedor = this;
        } else if (vendidos.get(this) > vendidos.get(Pais.masVendedor)){
            Pais.masVendedor = this;
        }
        */
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }

    
    public static Pais paisMasVendedor(){
        int n = 0;
        Pais p = Pais.masVendedor;
        for(Map.Entry<Pais, Integer> entry : vendidos.entrySet()){
            if(entry.getValue() > n){
                n = entry.getValue();
            }
        }
        for(Map.Entry<Pais, Integer> entry : vendidos.entrySet()){
            if(n == entry.getValue()){
                return entry.getKey();
            } else {
                p = entry.getKey();
            }
        }
        return p;
    }
    

}
