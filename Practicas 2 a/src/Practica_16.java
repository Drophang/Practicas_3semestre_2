import java.util.Scanner;
import java.util.Stack;

public class Practica_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        pila.add(1);
        pila.add(2);
        pila.add(3);
        System.out.println("Ingrese el numero a buscar");
        int N = sc.nextInt();
        if (pila.search(N) != -1) {
            System.out.println("El numero esta en " + pila.search(N));
        }else {
            System.out.println("No esta el numero");
        }
    }
}
