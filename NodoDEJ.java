/** Nodo de una lista doblemente enlazada de una lista de cadenas */
public class NodoDEJ {
  protected EntradaJuego elemento;	// Nodo guarda un elemento EntradaJuego
  protected NodoDEJ sig, prev;	// Apuntadores a nodos siguiente y previo
  /** Constructor que crea un nodo con los campos dados */
  public NodoDEJ(EntradaJuego e, NodoDEJ p, NodoDEJ s) {
    elemento = e;
    prev = p;
    sig = s;
  }
  /** Regresa el elemento de este nodo */
  public EntradaJuego getElemento() { return elemento; }
  /** Regresa el nodo previo de este nodo */
  public NodoDEJ getPrev() { return prev; }
  /** Regresa el nodo siguiente de este nodo */
  public NodoDEJ getSig() { return sig; }
  /** Pone el elemento de este nodo */
  public void setElemento(EntradaJuego nvoElem) { elemento = nvoElem; }
  /** Pone el nodo previo de este nodo */
  public void setPrev(NodoDEJ nvoPrev) { prev = nvoPrev; }
  /** Pone el nodo siguiente de este nodo */
  public void setSig(NodoDEJ nvoSig) { sig = nvoSig; }
}
