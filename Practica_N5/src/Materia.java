public class Materia {
    private String Nombre;
    private int idM;
    private int nota;
    public Materia(String Nombre,int idM){
        this.Nombre = Nombre;
        this.idM = idM;
        nota = 0;
    }

    public int getIdM() {
        return idM;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
