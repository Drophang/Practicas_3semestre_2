import java.util.ArrayList;
import java.util.Scanner;

public class Registro_M_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner tc = new Scanner(System.in);
        ArrayList<Estudiante> list = new ArrayList<>();
        int M = 0;
        while (M != 4 || M > 4|| M < 1) {
            System.out.println("Registro de estudiantes y materias");
            System.out.println("1-Registrar Estudiante");
            System.out.println("2-Registrar Materia");
            System.out.println("3-Lista de Materias");
            System.out.println("4-Salir");
            M = sc.nextInt();
            if (M == 1) {
                System.out.println("ingrese la id y el nombre");
                boolean c = false;
                int I = sc.nextInt();
                while (c == false) {
                    if (list.size() == 0){
                        c = true;
                    }
                    for (Estudiante estudiante : list) {
                        if (estudiante.getId() == I) {
                            System.out.println("id repetida");
                            I = sc.nextInt();
                        } else {
                            c = true;
                        }
                    }
                }
                String N = tc.nextLine();
                Estudiante E = new Estudiante(I, N);
                list.add(E);
            }
            if (M == 2) {
                System.out.println("ingrese la id del estudiante");
                int ver = sc.nextInt();
                for (Estudiante estudiante : list) {
                    if (estudiante.getId() == ver) {
                        System.out.println("ingrese los datos de la materia nombre y id de la materia");
                        String N = tc.nextLine();
                        int I = sc.nextInt();
                        estudiante.RegistrarM(N, I);
                    }
                }
            }
            if (M == 3) {
                System.out.println("ingrese el id del estudiante");
                int ver = sc.nextInt();
                for (Estudiante estudiante : list) {
                    if (estudiante.getId() == ver) {
                        estudiante.MostrarM();
                    }
                }
            }
        }
    }
}
