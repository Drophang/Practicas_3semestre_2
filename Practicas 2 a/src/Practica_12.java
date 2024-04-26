import java.util.LinkedList;
import java.util.Queue;

public class Practica_12 {
    public static void main(String[] args) {
        Queue <String> cola1 = new LinkedList<>();
        Queue <Integer> cola2 = new LinkedList<>();
        Queue <String> cola3 = new LinkedList<>();
        cola1.add("A");
        cola1.add("B");
        cola1.add("C");
        cola1.add("D");
        cola1.add("E");
        for (int i = 1;i < 5;i++){
            cola2.add(i);
        }
        int N = cola1.size()+cola2.size();
        for (int i = 1;i < N;i++){
            if (i % 2 == 0){
                cola3.add(cola1.poll());
            }else {
                cola3.add(cola2.poll().toString());
            }
        }
        System.out.println(cola3);
    }
}
