import java.util.LinkedList;
import java.util.Queue;

public class Practica_10 {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        for (int i = 1;i <= 10;i++){
            cola.add(i);
        }
        System.out.println(cola);
        int E = 5;
        while (cola.size() > 4){
            cola.remove(E*2);
            E = E - 1;
            System.out.println("-");
        }
        System.out.println(cola);
    }
}
