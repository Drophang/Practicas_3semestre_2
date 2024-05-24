public class Nodo {
    int valor;
    Nodo izquierda;
    Nodo derecha;
    public Nodo(int valor){
        this.valor = valor;
        izquierda = null;
        derecha = null;
    }
}
class arbolBinario{
    Nodo raiz;
    public arbolBinario(){
        raiz = null;
    }
    public void insertar(int valor){
        raiz = insertarNodo(raiz,valor);
    }
    private Nodo insertarNodo(Nodo nodo,int valor){
        if (nodo == null){
            nodo = new Nodo(valor);
            return nodo;
        }
        if (valor < nodo.valor){
            nodo.izquierda = insertarNodo(nodo.izquierda,valor);
        }else if (valor > nodo.valor){
            nodo.derecha = insertarNodo(nodo.derecha,valor);
        }
        return nodo;
    }
    public void imprimirEnorden(){
        imprimirEnorden();
    }
    public void imprimirEnorden(Nodo nodo){
        if(nodo != null){
            imprimirEnorden(nodo.izquierda);
            System.out.println(nodo.valor + " ");
                imprimirEnorden(nodo.derecha);
        }
    }
}
public class main {
    public static void main (String[] args){
        arbolBinario arbol = new arbolBinario();
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);
        System.out.println("Arbol en orden");
        arbol.imprimirEnorden();
    }
}

