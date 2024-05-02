import java.util.Scanner;
import java.util.Stack;

public class Practica_23_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Practica_23_2> pila = new Stack<>();
        Practica_23_2 pepe = new Practica_23_2("Pepe", 200);
        Practica_23_2 pablo = new Practica_23_2("Pablo", 300);
        Practica_23_2 gonzales = new Practica_23_2("Gonzales", 400);
        pila.push(pepe);
        pila.push(pablo);
        pila.push(gonzales);
        System.out.println("ingrese el salario");
        int B = sc.nextInt();
        for (Practica_23_2 i : pila) {
            if (i.getSalario() == B) {
                System.out.println(i.getNombre());
            }
        }
    }
}