import java.util.LinkedList;
import java.util.Queue;

public class Practica_11 {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        int S = 0;
        int A;
        for (int i = 1;i <= 10;i++){
            cola.add(i);
        }
        int T = cola.size();
        for (int i = 1;i < T;i++ ){
            A = cola.poll();
            if (A % 2 != 0){
                S = S + A;
            }
        }
        System.out.println(S);
    }
}
