/*Älumno=Oscar Fernández Durán
  Feha: 29/03/19
  Descripción: creación de la aplicación UsaListaSimple, con el objetivo de ver el funcionamiento de la clase ListaSimple.
*/

public class UsaListaSimple{
	public static void main(String[]args){
		ListaSimple lista=new ListaSimple();
		Nodo [] nodos=new Nodo[3];//Crea un arreglo de nodos
		for(int i=0;i<nodos.length;i++){
			nodos[i]=new Nodo();
		}
		nodos[0].setElemento("Pepe");//inicializar los nodos.
		nodos[1].setElemento("Toño");
		nodos[2].setElemento("Juan");
		lista.agregarInicio(nodos[1]);
		lista.agregarFinal(nodos[2]);
		lista.agregarInicio(nodos[0]);
		System.out.println(lista.toString());
		lista.removerPrimero();
		System.out.println(lista.toString());
		System.out.println("Nodo solicitado: "+lista.getNodo(2));//muestra el nodo que se encuentra en la pusición 2, en este caso es Juan. 
		if(lista.esVacia())
			System.out.println("La lista está vacía");
		else{
			System.out.println("Los elementos de la lista son: "+lista.toString());
			lista.vaciarLista();
		}
		lista.agregarInicio(nodos[0]);
		lista.agregarInicio(nodos[2]);
		lista.agregarNodo(2, nodos[1]);//agrega a Toño en la posición 2.
		System.out.println(lista.toString());
		lista.vaciarLista();
		if(lista.esVacia())
                        System.out.println("La lista está vacía");
		lista.agregarInicio(nodos[2]);
                lista.agregarFinal(nodos[0]);
		System.out.println("Cabeza: "+lista.getCabeza()+ " Cola: "+lista.getCola());
	}
}
