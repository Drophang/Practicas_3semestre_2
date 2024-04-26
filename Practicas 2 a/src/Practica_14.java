import java.util.Stack;

public class Practica_14 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.add(1);
        pila.add(2);
        pila.add(3);
        pila.add(4);
        for (int i = 0;i < 4 ; i++) {
            System.out.println(pila.pop());
        }
    }
}
