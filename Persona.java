public class Persona {
    private int id;
    private String Nombre;
    private String AP1;
    private String AP2;
    private int edad;
    public Persona(int id, String Nombre, String AP1, String AP2, int edad){
        this.id = id;
        this.Nombre = Nombre;
        this.AP1 = AP1;
        this.AP2 = AP2;
        this.edad = edad;
    }
    public void Show(){
        System.out.println("//");
        System.out.println(id);
        System.out.println(Nombre);
        System.out.println(AP1);
        System.out.println(AP2);
        System.out.println(edad);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getAP1() {
        return AP1;
    }

    public String getAP2() {
        return AP2;
    }

    public int getEdad() {
        return edad;
    }
}
