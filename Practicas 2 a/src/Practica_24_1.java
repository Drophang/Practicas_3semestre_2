public class Practica_24_1 implements Comparable<Practica_24_1>{

    private String Nombre;
    
    public Practica_24_1(String Nombre){
        this.Nombre = Nombre;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int compareTo(Practica_24_1 p){
        return this.Nombre.compareTo(p.getNombre());
    }
    @Override
    public String toString() {
        return "Persona nombre = " + Nombre;
    }
}
