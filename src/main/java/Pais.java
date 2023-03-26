package vehiculos;

import java.util.Map;
import java.util.HashMap;

public class Pais {
    String nombre = "";
    static Map<Pais, Integer> vendidos = new HashMap<Pais, Integer>();
    public Pais(String nombre){
        this.nombre = nombre;
        if(vendidos.containsKey(nombre)){
            vendidos.put(this, 1);
        } else {
            vendidos.put(this, vendidos.get(nombre)+1);
        }
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }

    public static Pais paisMasVendedor(){
        Pais m = new Pais("nonononononononono");
        int n = 0;
        for(Map.Entry<Pais,Integer> entry : vendidos.entrySet()){
            if (n == 0 || entry.getValue() > n){
                m = entry.getKey();
                n = entry.getValue();
            }
        }
        return m;
    }

}
