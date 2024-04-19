import java.util.LinkedList;
import java.util.Queue;

public class Practica_8_2 {
    public static void main(String[] args) {
        Practica_8_1 P = new Practica_8_1("Perro");
        Practica_8_1 g = new Practica_8_1("Gato");
        Practica_8_1 c = new Practica_8_1("Conejo");
        Practica_8_1 l = new Practica_8_1("Loro");
        Queue<Practica_8_1> cola = new LinkedList<>();
        cola.add(P);
        cola.add(g);
        cola.add(c);
        cola.add(l);
        cola.remove(c);
        System.out.println(cola);
    }
}
