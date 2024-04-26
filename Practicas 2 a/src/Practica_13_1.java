import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practica_13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int U = 0;
        String Persona = "Persona";
        int C = 1;
        Queue<Practica_13_2> cola = new LinkedList<>();
        do{
            System.out.println("1-Agregar a la cola");
            System.out.println("2-Retirar de la cola");
            System.out.println("3-Mostrar cola");
            System.out.println("4-Salir");
            U = sc.nextInt();
            switch (U){
                case 1:
                    C = C +1;
                    Persona = Persona + C;
                    Practica_13_2 P = new Practica_13_2(Persona);
                    cola.add(P);
                    System.out.println("Se añadio una persona");
                    break;
                case 2:
                    System.out.println("Se elimino una persona " + cola.poll());
                    break;
                case 3 :
                    System.out.println(cola);
            }
        }while (U != 4 && U > 0 );
    }
}
