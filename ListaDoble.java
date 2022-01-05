//alumno: Oscar Fernández Durán
//Fecha:05/04/19
//Descripción: Se creó el método OrdenaPorSeleccion(), el cual ordena una lista doble de forma acendente por el método de selección.
public class ListaDoble {
  protected int tam;			     // cantidad de elementos
  protected NodoD cabeza, cola; // centinelas
  /** Constructor que crea una lista vacía */
  public ListaDoble() { 
    tam = 0;
    cabeza = new NodoD(null, null, null);	// crer cabeza
    cola = new NodoD(null, cabeza, null);	// crear terminación
    cabeza.setSig(cola);	// cabeza apunta a terminación 
  }
  /** Regresa la cantidad de elementos en la lista */
  public int tam() { return tam; }
  /** Indica si la lista esta vacía */
  public boolean estaVacia() { return (tam == 0); }
  /** Regresa el primer nodo de la lista */
  public NodoD getPrimero() throws IllegalStateException {
    if (estaVacia()) throw new IllegalStateException("La lista esta vacía");
    return cabeza.getSig();
  }
  /** Regresa el último nodo de la lista */
  public NodoD getUltimo() throws IllegalStateException {
    if (estaVacia()) throw new IllegalStateException("La lista esta vacía");
    return cola.getPrev();
  }
  /** Regresa el nodo anterior al nodo v dado. Un error ocurre si v
    * es la cabeza */
  public NodoD getPrev(NodoD v) throws IllegalArgumentException {
    if (v == cabeza) throw new IllegalArgumentException
      ("No se puede mover hacia atrás de la cabeza de la lista");
    return v.getPrev();
  }
  /** Regresa el nodo siguiente al nodo v dado. Un error ocurre si v
    * es la cola */
  public NodoD getSig(NodoD v) throws IllegalArgumentException {
    if (v == cola) throw new IllegalArgumentException
      ("No se puede mover hacia adelante de la terminación de la lista");
   return v.getSig();
  }
  /** Inserta el nodo z dado antes del nodo v dado. Un error
    * ocurre si v es la cabeza */
  public void agregarAntes(NodoD v, NodoD z) throws IllegalArgumentException {
    NodoD u = getPrev(v); // podría lanzar un IllegalArgumentException
    z.setPrev(u);
    z.setSig(v);
    v.setPrev(z);
    u.setSig(z);
    tam++;
  }
  /** Inserta el nodo z dado despues del nodo v dado. Un error
    * ocurre si v es la cabeza */
  public void agregarDespues(NodoD v, NodoD z) {
    NodoD w = getSig(v); // podría lanzar un IllegalArgumentException
    z.setPrev(v);
    z.setSig(w);
    w.setPrev(z);
    v.setSig(z);
    tam++;
  }
  /** Inserta el nodo v dado en la cabeza de la lista */
  public void agregarInicio(NodoD v) {
    agregarDespues(cabeza, v);
  }
  /** Inserta el nodo v dado en la cola de la lista */
  public void agregarFinal(NodoD v) {
    agregarAntes(cola, v);
  }
  /** Quitar el nodo v dado de la lista. Un error ocurre si v es
    * la cabeza o la cola */
  public void remover(NodoD v) {
    NodoD u = getPrev(v);	// podría lanzar IllegalArgumentException
    NodoD w = getSig(v);	// podría lanzar IllegalArgumentException
    // desenlazar el nodo v de la lista
    w.setPrev(u);
    u.setSig(w);
    v.setPrev(null);
    v.setSig(null);
    tam--;
  }
  /** Regresa si un nodo v dado tiene un nodo previo */
  public boolean tienePrev(NodoD v) { return v != cabeza; }
  /** Regresa si un nodo v dado tiene un nodo siguiente */
  public boolean tieneSig(NodoD v) { return v != cola; }
  /** Regresa una cadena representando la lista */
  public String toString() {
    String s = "[";
    NodoD v = cabeza.getSig();
    while (v != cola) {
      s += v.getElemento();                                
      v = v.getSig();
      if (v != cola)
        s += ",";
    }
    s += "]";
    return s;
  }
  public ListaDoble OrdenaPorSeleccion(ListaDoble lista){
     final int TAM=lista.tam();
     double dmenor=0, dp=0;
     int n=1;//posición en donde está el menor.
     NodoD m;
     NodoD primero=lista.getPrimero();
     NodoD p;
     NodoD menor=primero;
     NodoD ultimo=lista.getUltimo();
     if(TAM>1){
      for(int c=1;primero!=ultimo;c++){
        if(c>1){
            primero=lista.getSig(primero);
            menor=primero;
        }
        p=primero;
        for(int i=1;i<=(TAM-c);i++){
           p=lista.getSig(p);
           if(menor.getElemento().compareTo(p.getElemento())>0){
 	     menor=p;
             n=(i+1);
           }
        }
        m=primero;
        primero=menor;
 	if(c<TAM){//tener ojo.
           NodoD a=lista.getPrev(menor);
           lista.remover(lista.getSig(a));
	}
        lista.agregarInicio(primero);
        p=primero;
        for(int i=2;i<=n;i++){//gg
          if(lista.getSig(p)!=cola)//aqui
             p=lista.getSig(p);
          if(i==n){
             if(lista.getSig(p)!=null)
                  lista.agregarDespues(p,m);
             if(lista.getSig(primero)!=cola || lista.getSig(primero)!=null)
                  lista.remover(lista.getSig(primero));
          }
        }
      }
     }
     return lista;
  }
  public ListaDoble InvierteLista(ListaDoble lista){
     final int TAM=lista.tam();
     ListaDoble listaD= new ListaDoble();
     NodoD primero=lista.getPrimero();
     listaD.agregarInicio(primero);
     for(int i=1;i<TAM;i++){
           primero=lista.getSig(primero);
           listaD.agregarInicio(primero);
     }
     return listaD;
  }
}
