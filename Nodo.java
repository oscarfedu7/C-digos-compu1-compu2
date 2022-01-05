/** Nodo de una lista simple enlazada de cadenas. */
public class Nodo {
  private String elemento; // Los elementos son cadenas de caracteres
  private Nodo sig;
  /** Se crea un nodo con el elemento dado y el nodo sig. */
  public Nodo(){
    elemento=null;
    sig=null;
  }
  public Nodo(String e, Nodo n) {
    elemento = e;
    sig = n;
  }
  /** Regresa el elemento de este nodo. */
  public String getElemento() { return elemento; }
  /** Regresa el nodo siguiente de este nodo. */
  public Nodo getSig() { return sig; }
  // métodos modificadores
  /** Pone el elemento de este nodo. */
  public void setElemento(String nvoElem) { elemento = nvoElem; }
  /** Pone el nodo sig de este nodo. */
  public void setSig(Nodo nvoSig) { sig = nvoSig; }
}
