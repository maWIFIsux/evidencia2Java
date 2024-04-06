class Nodo<T> {
    Nodo<T> valor;
    Nodo<T> izquierda, derecha;

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierda = this.derecha = null;

    }
}
