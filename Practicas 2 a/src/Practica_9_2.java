import java.util.LinkedList;
import java.util.Queue;

public class Practica_9_2 {
    public static void main(String[] args) {
        Practica_9_1 r = new Practica_9_1("Rojo");
        Practica_9_1 v = new Practica_9_1("Verde");
        Practica_9_1 a = new Practica_9_1("Azul");
        Practica_9_1 am = new Practica_9_1("Amarillo");
        Queue<Practica_9_1> cola = new LinkedList<>();
        cola.add(r);
        cola.add(v);
        cola.add(a);
        cola.add(am);
        cola.remove(r);
        cola.remove(am);
        System.out.println(cola);
    }
}
