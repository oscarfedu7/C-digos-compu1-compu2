/*
 * Autor: H. Tejeda
 * Fecha: 1/4/2019
 *
 * Escribir la clase PuntuacionesListaDoble la cual hará los mismos métodos
 * de la clase Puntuaciones pero, usando una lista doblemente enlazada. La
 * implementación del método remove() deberá hacer la menor cantidad de
 * saltos para obtener la entrada con el índice i. 
 */

/** Lista doblemente enlazada de nodos tipo NodoDEJ para EntradasJuego. */
public class ListaDobleEJ {
   protected int tam;			     // cantidad de elementos
   protected NodoDEJ cabeza, cola; // centinelas
   /** Constructor que crea una lista vacía */
   public ListaDobleEJ() { 
      tam = 0;
      cabeza = new NodoDEJ(null, null, null);	// crer cabeza
      cola = new NodoDEJ(null, cabeza, null);	// crear terminación
      cabeza.setSig(cola);	// cabeza apunta a terminación 
   }
   /** Regresa la cantidad de elementos en la lista */
   public int tam() { return tam; }
   /** Indica si la lista esta vacía */
   public boolean estaVacia() { return (tam == 0); }
   /** Regresa el primer nodo de la lista */
   public NodoDEJ getPrimero() throws IllegalStateException {
      if (estaVacia()) throw new IllegalStateException("La lista esta vacía");
      return cabeza.getSig();
   }
   /** Regresa el último nodo de la lista */
   public NodoDEJ getUltimo() throws IllegalStateException {
      if (estaVacia()) throw new IllegalStateException("La lista esta vacía");
      return cola.getPrev();
   }
   /** Regresa el nodo anterior al nodo v dado. Un error ocurre si v
    * es la cabeza */
   public NodoDEJ getPrev(NodoDEJ v) throws IllegalArgumentException {
      if (v == cabeza) throw new IllegalArgumentException
         ("No se puede mover hacia atrás de la cabeza de la lista");
      return v.getPrev();
   }
   /** Regresa el nodo siguiente al nodo v dado. Un error ocurre si v
    * es la cola */
   public NodoDEJ getSig(NodoDEJ v) throws IllegalArgumentException {
      if (v == cola) throw new IllegalArgumentException
         ("No se puede mover hacia adelante de la terminación de la lista");
      return v.getSig();
   }
   /** Inserta el nodo z dado antes del nodo v dado. Un error
    * ocurre si v es la cabeza */
   public void agregarAntes(NodoDEJ v, NodoDEJ z) throws IllegalArgumentException {
      NodoDEJ u = getPrev(v); // podría lanzar un IllegalArgumentException
      z.setPrev(u);
      z.setSig(v);
      v.setPrev(z);
      u.setSig(z);
      tam++;
   }
   /** Inserta el nodo z dado despues del nodo v dado. Un error
    * ocurre si v es la cabeza */
   public void agregarDespues(NodoDEJ v, NodoDEJ z) {
      NodoDEJ w = getSig(v); // podría lanzar un IllegalArgumentException
      z.setPrev(v);
      z.setSig(w);
      w.setPrev(z);
      v.setSig(z);
      tam++;
   }
   /** Inserta el nodo v dado en la cabeza de la lista */
   public void agregarInicio(NodoDEJ v) {
      agregarDespues(cabeza, v);
   }
   /** Inserta el nodo v dado en la cola de la lista */
   public void agregarFinal(NodoDEJ v) {
      agregarAntes(cola, v);
   }
   /** Quitar el nodo v dado de la lista. Un error ocurre si v es
    * la cabeza o la cola */
   public void remover(NodoDEJ v) {
      NodoDEJ u = getPrev(v);	// podría lanzar IllegalArgumentException
      NodoDEJ w = getSig(v);	// podría lanzar IllegalArgumentException
      // desenlazar el nodo v de la lista
      w.setPrev(u);
      u.setSig(w);
      v.setPrev(null);
      v.setSig(null);
      tam--;
   }
   /** Regresa si un nodo v dado tiene un nodo previo */
   public boolean tienePrev(NodoDEJ v) { return v != cabeza; }
   /** Regresa si un nodo v dado tiene un nodo siguiente */
   public boolean tieneSig(NodoDEJ v) { return v != cola; }
   /** Regresa una cadena representando la lista */
   public String toString() {
      String s = "[";
      NodoDEJ v = cabeza.getSig();
      while (v != cola) {
         s += v.getElemento();
         v = v.getSig();
         if (v != cola)
            s += ",";
      }
      s += "]";
      return s;
   }
}
