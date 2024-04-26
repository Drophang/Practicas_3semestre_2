import java.util.Stack;

public class Practica_17_2 {
    public static void main(String[] args) {
        Stack<Practica_17_1> pila = new Stack<>();
        Practica_17_1 p1 = new Practica_17_1("pepe",1);
        Practica_17_1 p2 = new Practica_17_1("Pepa",2);
        Practica_17_1 p3 = new Practica_17_1("Mari",3);
        pila.add(p1);
        pila.add(p2);
        pila.add(p3);
        for (Practica_17_1 practica171 : pila) {
           System.out.println(practica171.getNombre() + " " + practica171.getId());
        }

    }
}
