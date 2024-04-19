import java.util.LinkedList;
import java.util.Queue;

public class Practica_4_2 {
    public static void main(String[] args) {
        Queue<Practica_4_1> cola = new LinkedList<>();
        Practica_4_1 N = new Practica_4_1("Pepe","tores","ramos");
        cola.add(N);
        System.out.println(cola.toString());
    }
}
