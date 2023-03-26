package vehiculos;

import java.util.Map;
import java.util.HashMap;

public class Pais {
    String nombre = "";
    static Map<String, int> vendidos = new HashMap<String, int>;
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
        int n;
        for(Map.Entry<String,int> entry : vendidos.entrySet()){
            if (n == 0 || entry.getValue() > n){
                m = entry.getKey();
                n = entry.getValue();
            }
        }
    }

}
