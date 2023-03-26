package vehiculos;

public class Camioneta extends Vehiculo{
    boolean volco;
    public Camioneta(String plac, int puert, String nom, int precio, int peso, Fabricante f, boolean volco){
        super(plac, puert, 90, nom, precio, peso, "4X4", f);
        this.volco = volco;
    }
    public boolean isVolco(){
        return volco;
    }
    public boolean setVolco(boolean v){
        this.volco = v;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String p){
        this.placa = p;
    }
    public int getPuertas(){
        return this.puertas;
    }
    public void setPuertas(int p){
        this.puertas = p;
    }
    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }
    public void setVelocidadMaxima(int v){
        this.velocidadMaxima = v;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.placa = n;
    }
    public int getPrecio(){
        return this.precio;
    }
    public void setPrecio(int p){
        this.precio = p;
    }
    public int getPeso(){
        return this.peso;
    }
    public void setPeso(int p){
        this.peso = p;
    }
    public String getTraccion(){
        return this.traccion;
    }
    public void setTraccion(String t){
        this.traccion = t;
    }
    public Fabricante getFabricante(){
        return this.fabricante;
    }
    public void setFabricante(Fabricante f){
        this.fabricante = f;
    }

}
