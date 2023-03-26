package vehiculos;

public class Automovil extends Vehiculo{
    int puestos;
    public Automovil(String plac, String nom, int pre, int pes, Fabricante f, int puestos){
        super(plac, 4, 100, nom, pre, pes, "FWD", f);
        this.puestos = puestos;
    }
    public int getPuestos(){
        return this.puestos;
    }
    public void setPuestos(int p){
        this.puestos = p;
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
