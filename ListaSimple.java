/** Lista simple enlazada. */
/*Älumno=Oscar Fernández Durán
  Feha: 29/03/19
  Descripción: creación de la clase ListaSimple con diferentes métodos para su uso.
*/
public class ListaSimple {
  	protected Nodo cabeza;  // nodo cabeza de la lista
  	protected Nodo cola;   //nodo cola
  	protected long tam;     // cantidad de nodos en la lista
  	/** constructor por defecto para crear una lista vacía */
  	public ListaSimple() {
   		cabeza = null;
    		cola=null;
    		tam = 0;
  	}
 	public void agregarInicio(Nodo v){
		v.setSig(cabeza);
		cabeza=v;
		tam++;
		if(tam==1)
			cola=cabeza;
 	}
	public void agregarFinal(Nodo v){
		cola.setSig(v);
		cola=v;
		tam++;
		v.setSig(null);
		if(tam==1)
			cabeza=cola;
	}
	public void removerPrimero(){
		if(tam>=1){
			Nodo v=cabeza.getSig();
			cabeza.setSig(null);
			cabeza=v;
			tam--;
			if(tam==0)
				cola=null;
	}
		else
			System.out.println("No se puden remover elementos elementos de una lista vacia");
	}
	public String toString(){
		String c="[";
		Nodo v=cabeza;
		while(v.getSig()!=null){
			c=c+v.getElemento()+", ";
			v=v.getSig();
		}
		return c+cola.getElemento()+"]";
	}
	public long Tamaño(){
		return tam;
	}
	public boolean esVacia(){
		long t=tam;
		return (t==0);
	}
	public String getCabeza(){
		return cabeza.getElemento();
	}
	public String getCola(){
		return cola.getElemento();
	}
	public String getNodo(int n){//Método que te devuelve el nodo con el indice dado, por ejemplo: si quieres la cabeza, n debería ser 1, o si quieres la cola n debería ser tam.
		if(n>tam||n<0){
			System.out.println("No se encuentra ese elemento en la lista");
			return null;
		}
		Nodo v=cabeza;
		Nodo solicitado=cabeza;
		for(long i=1;i<=tam;i++){
			if(n==i){
				solicitado=v;
				i=(tam+1);
			}
			else 
				v=v.getSig();
		}
		return solicitado.getElemento();
	}
	public void vaciarLista(){
		cabeza=null;
		cola=null;
		tam=0;
	}
	public void reemplazarNodo(int n, Nodo a){//método que reemplaza un nodo por otro.
                if(n>tam||n<0){
                        System.out.println("No se encuentra ese elemento en la lista");
                }
                Nodo v=cabeza;
                for(long i=1;i<=tam;i++){
                        if(n==i)
                                v=a;
                        else 
                                v=v.getSig();
                }
        }
	public void agregarNodo(int n, Nodo a){//Agrega un nodo en cualquier lugar de la lista (donde se desee).
                if(n>tam||n<0){
                        System.out.println("No se encuentra ese elemento en la lista");
                }
		else if(tam==0){
			cabeza=a;
			cola=a;
			a.setSig(null);
		}
		else if(tam==1){
			if(n==1)
				agregarInicio(a);
			else
				agregarFinal(a);
		}
		else{
                	Nodo v=cabeza;
                	for(long i=1;i<=tam;i++){
                        	if(n==(i+1)){
					Nodo l=v.getSig();
                                	v.setSig(a);
					a.setSig(l);
					tam++;
					i=(tam+1);
				}
                        	else 
                                	v=v.getSig();
                	}
        	}
	}
}
