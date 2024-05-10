public class Practica_25_1 {
    private String Nombre;
    private int precio;
    public Practica_25_1 (String Nombre, int precio){
        this.Nombre = Nombre;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
