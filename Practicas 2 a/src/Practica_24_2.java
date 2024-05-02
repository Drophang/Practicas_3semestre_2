import java.util.ArrayList;
import java.util.Collections;

public class Practica_24_2 {
    public static void main(String[] args) {
        Practica_24_1 p1 = new Practica_24_1("pep");
        Practica_24_1 p2 = new Practica_24_1("pablo");
        Practica_24_1 p3 = new Practica_24_1("gonzalo");
        ArrayList<Practica_24_1> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        Collections.sort(lista);
        for (Practica_24_1 i : lista) {
            System.out.println(i.toString());
        }
    }
}
