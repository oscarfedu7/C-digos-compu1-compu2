/**Alumno: Oscar Fernández Durán
  Fecha: 03/06/19
  Descripción: se crea la clase ElemmentoIteradorIndice la cual implementa a Iterador por lo tanto se crean los
  métodos hasNext() y next().
*/
import java.util.*;
public class ElementoIteradorIndice<E> implements Iterator<E> {
	protected ListaIndice<E> lista;
	protected int indice;
	
	public ElementoIteradorIndice(ListaIndice<E> A){
		lista=A;
		if(A.isEmpty())
			indice=-1;
		else
			indice=0;
	}
	public boolean hasNext(){
		 return ((indice+1)<lista.size());//si el índice siguiente es menor a la cantidad de elementos 
	}
	public E next() throws NoSuchElementException{
		if(indice==lista.size())
			throw new NoSuchElementException("No hay elemento siguiente");
		E elemento=lista.get(indice);
		indice++;
		return elemento;
	}
}
