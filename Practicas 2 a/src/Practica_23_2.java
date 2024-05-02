public class Practica_23_2 {
    private String Nombre;
    private int Salario;
    public Practica_23_2(String Nombre, int Salario){
        this.Nombre = Nombre;
        this.Salario = Salario;
    }
    public String getNombre() {
        return Nombre;
    }
    public int getSalario() {
        return Salario;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setSalario(int salario) {
        Salario = salario;
    }
}