package vehiculos;

public class Vehiculo{
    String placa;
    int puertas;
    int velocidadMaxima;
    String nombre;
    int precio;
    int peso;
    String traccion;
    Fabricante fabricante;
    static int CantidadVehiculos = 0;
    static int cantidadAutos = 0;
    static int cantidadCamionetas = 0;
    static int cantidadCamiones =0;
    public Vehiculo(String placa, int puertas, int vmax, String nom, int precio, int peso, String trac, Fabricante f){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = vmax;
        this.nombre = nom;
        this.precio = precio;
        this.peso = peso;
        this.traccion = trac;
        this.fabricante = f;
        if (trac.equals("FWD")){
            this.cantidadAutos++;
        } else if (trac.equals("4X2")){
            this.cantidadCamiones++;
        } else if (trac.equals("4X4")){
            this.cantidadCamionetas++;
        }
    }

    public String vehiculosPorTipo(){
        return "Automoviles: " + cantidadAutos + "Camionetas: " + cantidadCamionetas + "Camiones: " + cantidadCamiones;
    }
    public int getCantidadVehiculos(){
        return this.CantidadVehiculos;
    }
    public void setCantidadVehiculos(int c){
        this.CantidadVehiculos = c;
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