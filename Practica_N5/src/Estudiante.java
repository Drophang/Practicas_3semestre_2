import java.util.ArrayList;
public class Estudiante {
    private int id;
    private String Nombre;
    private ArrayList<Materia> Materias = new ArrayList<Materia>();
    public Estudiante(int id,String Nombre){
        this.Nombre = Nombre;
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Materia> getMaterias() {
        return Materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        Materias = materias;
    }
    public void RegistrarM(String N, int id){
        Materias.add(new Materia(N,id));
    }
    public void MostrarM(){
        for (Materia materias: Materias){
            System.out.println(materias.getNombre() + " " + materias.getIdM());
        }
    }
}
