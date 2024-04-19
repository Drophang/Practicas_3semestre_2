import java.util.LinkedList;
import java.util.Queue;

public class Practica_5 {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        for (int i = 1; i <= 20;i++){
            if (i % 2 == 0){
                cola.add(i);
            }
        }
        System.out.println(cola);
    }
}
