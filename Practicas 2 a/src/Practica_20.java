import java.util.Scanner;
import java.util.Stack;

public class Practica_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sy = new Scanner(System.in);
        System.out.println("Cuantos desea apilar?");
        Stack<String> pila = new Stack<>();
        Stack<String> pila1 = new Stack<>();
        int N = sc.nextInt();
        String E;
        int R = 0;
        for (int i = 0; i < N; i++) {
            pila.add(E = sy.nextLine());
        }
        int Re =0;
        while (N > Re){
            pila1.add(pila.pop());
            System.out.println("-");
            if (pila.peek() == pila1.peek()){
                pila.remove(pila1.peek());
            }
            Re++;
        }
        System.out.println(pila1);
    }
}
