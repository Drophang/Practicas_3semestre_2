public class Practica_17_1 {
    private String Nombre;
    private int id;
    public Practica_17_1(String Nombre,int id){
        this.Nombre = Nombre;
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }
}
