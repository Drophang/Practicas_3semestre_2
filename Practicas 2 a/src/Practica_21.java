import java.util.Scanner;
import java.util.Stack;

public class Practica_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        System.out.println("Cuantos desea apilar?");
        int N = sc.nextInt();
        int E = 0;
        int S = 0;
        for(int i = 0;i < N; i++){
        pila.add(E = sc.nextInt());
        }
        for (Integer i : pila) {
            S = S+i;
        }
        System.out.println(S);
    }
}