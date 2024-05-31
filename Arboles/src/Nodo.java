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
    public int calcularAltura(Nodo nodo){
        if (nodo == null){
            return 0;
        }else {
            int alturaIzquierda = calcularAltura(nodo.izquierda);
            int alturaDerecha = calcularAltura(nodo.derecha);
            return Math.max(alturaIzquierda,alturaDerecha)+1;
        }
    }
    public int contarNodos(Nodo nodo){
        if(nodo == null){
            return 0;
        }else {
            int cantidadIzquierda = contarNodos(nodo.izquierda);
            int cantidadDerecha = contarNodos(nodo.derecha);
            return cantidadIzquierda + cantidadDerecha +1;
        }
    }
    public Nodo encontrarMinimo(Nodo nodo){
        if (nodo == null){
            return null;
        }else {
            while (nodo.izquierda != null){
                nodo = nodo.izquierda;
            }
        }
        return nodo;
    }
    public boolean sonArbolesIdenticos (Nodo nodo1,Nodo nodo2){
        if (nodo1 == null && nodo2 == null){
            return true;
        }
        if (nodo1 == null || nodo2 == null){
            return false;
        }
        return (nodo1.valor == nodo2.valor) &&
                sonArbolesIdenticos(nodo1.izquierda,nodo2.izquierda)&&
                sonArbolesIdenticos(nodo1.derecha,nodo2.derecha);
    }
    public double calcularNivelPromedio(Nodo raiz){
        int altura = calcularAltura(raiz);
        int cantidadNodos = contarNodos(raiz);
        return (double) cantidadNodos / altura;
    }
     public Nodo invertirArbol(Nodo nodo){
        if (nodo == null){
            return null;
        }
        Nodo temp = nodo.izquierda;
        nodo.izquierda = invertirArbol(nodo.derecha);
        nodo.derecha = invertirArbol(temp);
        return nodo;
     }
}

