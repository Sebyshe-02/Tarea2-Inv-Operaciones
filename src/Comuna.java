public class Comuna {

    public int id;
    public String nombre;
    public Double costo;

    // Constructor
    public Comuna() {
        
    }

    // Metodos
    public void mostrar() {
        System.out.println("Comuna: " + this.nombre);
    }

    // Getters y Setters

    public int getId() {
        return this.id;
    }
    public String getNombre() {
        return this.nombre;
    }
    public double getCosto(){
        return this.costo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCosto(Double costo){
        this.costo = costo;
    }

}