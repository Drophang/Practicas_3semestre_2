import java.util.Scanner;
import java.util.Stack;

public class Practica_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros desea apilar?");
        int N = sc.nextInt();
        int E;
        Stack<Integer> pila = new Stack<>();
        int Ma = 0;
        int Me = 0;
        for (int i = 1;i < N;i++){
            pila.add(E = sc.nextInt());
        }
        Me = pila.peek();
        for (int i:pila) {
            if (i > Ma){
                Ma = i;
            }
            if (i < Me){
                Me = i;
            }
        }
        System.out.println("Mayor " +Ma);
        System.out.println("Menor " + Me);
    }
}
