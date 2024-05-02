import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
public class Practica_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        Stack <String> pila = new Stack<>();
        System.out.println("Cuantos desea apilar?");
        int N = sc.nextInt();
        String E;
        for(int i = 0; i < N; i++){
            E = st.nextLine();
            pila.add(E);
        }
        Collections.sort(pila);
        System.out.println(pila);
    }
}