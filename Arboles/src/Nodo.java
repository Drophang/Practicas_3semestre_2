class Nodo {
    int valor;
    Nodo izquierda;
    Nodo derecha;
    public Nodo(int valor){
        this.valor = valor;
        izquierda = null;
        derecha = null;
    }
}
class ArbolBinario{
    Nodo raiz;
    public ArbolBinario(){
        raiz = null;
    }
    public void insertar(int valor){
        raiz = insertarNodo(raiz,valor);
    }
    public Nodo insertarNodo(Nodo nodo,int valor){
        if (nodo == null){
            nodo = new Nodo(valor);
            return  nodo;
        }
        if (valor < nodo.valor){
            nodo.izquierda = insertarNodo(nodo.izquierda,valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = insertarNodo(nodo.derecha,valor);
        }
        return nodo;
    }
    public void imprimirEnOrden(){
        imprimirEnOrden(raiz);
    }
    public void imprimirEnOrden(Nodo nodo){
        if (nodo != null){
            imprimirEnOrden(nodo.izquierda);
            System.out.println(nodo.valor + " ");
            imprimirEnOrden(nodo.derecha);
        }
    }
}

