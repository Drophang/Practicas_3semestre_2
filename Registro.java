import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        ArrayList<Persona> lista = new ArrayList<>();
        int op;
        int aux = 0;
        int id = 0;
        int E = 0;
        boolean C = false;
        do {
            System.out.println("Menu");
            System.out.println("1 Registrar Persona");
            System.out.println("2 Buscar Persona");
            System.out.println("3 Eliminar persona");
            System.out.println("4 Listar Personas");
            System.out.println("5 Salir");
            op = sc.nextInt();
            switch (op){
                case 1:
                    while (C == false) {
                        System.out.println("Recuerda ingresar una id no repetida");
                        id = sc.nextInt();
                        C = true;
                        for (Persona persona : lista) {
                            if (persona.getId() == id) {
                                C = false;
                            }
                        }
                    }
                            System.out.println("Ingrese el nombre");
                            String Nombre = sc2.nextLine();
                            System.out.println("Ingrese primer apellido");
                            String Apel1 = sc2.nextLine();
                            System.out.println("Ingresa el segundo ");
                            String Apel2 = sc2.nextLine();
                            System.out.println("Ingrese la edad");
                            int Edad = sc.nextInt();
                    Persona p = new Persona(id,Nombre,Apel1,Apel2,Edad);
                    lista.add(p);
                    C = false;
                    break;
                case 2:
                    System.out.println("ingrese la id del usuario que desea buscar");
                    id = sc.nextInt();
                    for (Persona persona: lista){
                        if (id == persona.getId()){
                            C = true;
                            System.out.println(persona.getNombre() + " " + persona.getAP1() +" " + persona.getAP2() + " " + persona.getEdad());
                        }
                    }
                    if (C = false){
                        System.out.println("No se encuentra esa persona");
                    }
                    C = false;
                    break;
                case 3:
                    System.out.println("Ingrese la id de la persona a eliminar");
                    E = sc.nextInt();
                    int finalE = E;
                    lista.removeIf(persona -> persona.getId() == finalE);
                    break;
                case 4:
                    for (Persona persona: lista) {
                        persona.Show();
                    }
                    break;
                default:

            }
        }while (op != 5);
    }
}
