/** Nodo de una lista doblemente enlazada de una lista de cadenas */
public class nodoDomino {
  	protected int elementoD, elementoI;	//elemento derecha, elemento izquierda
  	protected nodoDomino sig, prev;	// Apuntadores a nodos siguiente y previo
  	/** Constructor que crea un nodo con los campos dados */
  	public nodoDomino(int d,int i, nodoDomino p, nodoDomino s) {
    		elementoD = d;
		elementoI = i;
    		prev = p;
    		sig = s;
  	}
  	/** Regresa el elemento DERECHA de este nodo */
  	public int getElementoD() { return elementoD; }
	/** Regresa el elemento IZQUIERDA de este nodo */
        public int getElementoI() { return elementoI; }
  	/** Regresa el nodo previo de este nodo */
  	public nodoDomino getPrev() { return prev; }
  	/** Regresa el nodo siguiente de este nodo */
  	public nodoDomino getSig() { return sig; }
  	/** Pone el elemento DERECHA de este nodo */
  	public void setElementoD(int nvoElem) { elementoD = nvoElem; }
	/** Pone el elemento IZQUIERDA de este nodo */
        public void setElementoI(int nvoElem) { elementoI = nvoElem; }
  	/** Pone el nodo previo de este nodo */
  	public void setPrev(nodoDomino nvoPrev) { prev = nvoPrev; }
  	/** Pone el nodo siguiente de este nodo */
  	public void setSig(nodoDomino nvoSig) { sig = nvoSig; }
}
