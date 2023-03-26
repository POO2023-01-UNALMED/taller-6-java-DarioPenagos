package vehiculos;

import java.util.Map;
import java.util.HashMap;

public class Pais {
    String nombre = "";
    static Map<String, Integer> vendidos = new HashMap<String, Integer>();
    public Pais(String nombre){
        this.nombre = nombre;
        if(vendidos.containsKey(nombre)){
            vendidos.put(nombre, 1);
        } else {
            vendidos.put(nombre, vendidos.get(nombre));
        }
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }

    public static int paisMasVendedor(){
        String m;
        int n = 0;
        for(Map.Entry<String,Integer> entry : vendidos.entrySet()){
            if (n == 0 || entry.getValue() > n){
                m = entry.getKey();
                n = entry.getValue();
            }
        }
        return n;
    }

}
