package Ise;

public class ListaSimplementeEnlazada {
    Nodo primero;

    public ListaSimplementeEnlazada() {
        primero = null;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void insertar(Object dato) {
        Nodo nuevo = new Nodo(dato, primero);
        primero = nuevo;
    }

    public void eliminar() {
        if (!estaVacia()) {
            primero = primero.getSiguiente();
        }
    }

    public void mostrar() {
        Nodo tmp = primero;
        StringBuilder sb = new StringBuilder();
        while (tmp != null) {
            sb.append(tmp.getDato());
            if (tmp.getSiguiente() != null) {
                sb.append(" ");
            }
            tmp = tmp.getSiguiente();
        }
        System.out.println(sb.toString());
    }

}


