import Ise.ListaSimplementeEnlazada;

public class Main {
    public static void main(String[] args) {
        ListaSimplementeEnlazada lista = new ListaSimplementeEnlazada();

        System.out.println(lista.estaVacia());

        // Insertar elementos en la lista
        lista.insertar(5);
        lista.insertar(4);
        lista.insertar(3);
        lista.insertar(2);
        lista.insertar(1);
        lista.insertar(0);

        // Mostrar la lista
        lista.mostrar();

        // Eliminar algunos elementos
        lista.eliminar();
        lista.eliminar();

        // Mostrar la lista después de eliminar
        lista.mostrar();
    }
}
