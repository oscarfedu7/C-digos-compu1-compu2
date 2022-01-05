public class listaDomino{
	protected int tam;
	protected nodoDomino cabeza, cola;
	
	public listaDomino(){
		tam=0;
		cabeza=new nodoDomino(-1, -1, null, null);
		cola=new nodoDomino(-1, -1, cabeza, null);
		cabeza.setSig(cola);
	}
	public int tam(){
		return tam;
	}
	public boolean isEmpty(){
		return tam==0;
	}
	public nodoDomino getPrimero() throws IllegalStateException {
    		if (isEmpty()) throw new IllegalStateException("La lista esta vacía");
    		return cabeza.getSig();
  	}
  	/** Regresa el último nodo de la lista */
  	public nodoDomino getUltimo() throws IllegalStateException {
    		if (isEmpty()) throw new IllegalStateException("La lista esta vacía");
    		return cola.getPrev();
  	}

	public nodoDomino[] creaFichas(){
		nodoDomino[] fichas=new nodoDomino[28];
                int k=0,j=0;
                for(int i=0;i<28;i++){
			fichas[i]=new nodoDomino(j,k,null,null);
                        j++;
                        if(j==7){
                                k++;
                                j=k;
                        }
                }
		return fichas;
     	}
	public nodoDomino[] getRandom(){
		listaDomino l=new listaDomino();
		nodoDomino[] fichasR=l.creaFichas();
		nodoDomino nodo;
		for(int i=0;i<28;i++){
			int r=(int)(Math.random()*27)+1;
			nodo=fichasR[i];
			fichasR[i]=fichasR[r];
			fichasR[r]=nodo;
		}
		return fichasR;
	}
	public void addFirst(nodoDomino nodo){
		nodoDomino primero=cabeza.getSig();
		primero.setPrev(nodo);
		nodo.setSig(primero);
		cabeza.setSig(nodo);
		nodo.setPrev(cabeza);
	}
	public void addLast(nodoDomino nodo){
		nodoDomino ultimo =cola.getPrev();
		ultimo.setSig(nodo);
		nodo.setPrev(ultimo);
		cola.setPrev(nodo);
		nodo.setSig(cola);
	}

}
