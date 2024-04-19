import java.util.LinkedList;
import java.util.Queue;

public class Practica_7 {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        cola.add("A");
        cola.add("B");
        cola.add("C");
        cola.add("D");
        cola.add("E");
        System.out.println(cola);
        cola.clear();
        cola.add("F");
        cola.add("G");
        cola.add("H");
        cola.add("I");
        cola.add("J");
        System.out.println(cola);
    }
}
