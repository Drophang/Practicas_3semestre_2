import java.util.Stack;

public class Practica_15 {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        pila.add("A");
        pila.add("B");
        pila.add("C");
        if (pila.isEmpty()){
            System.out.println("Esta vacia");
        }else {
            System.out.println("No esta vacia");
        }
    }
}
