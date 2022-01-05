
/** Alumno: Oscar Fernández Durán
    Fecha: 03/06/19
    Descripción: se implementa la interface ListaIndice y se agrega el método iterator()
  */
import java.util.*;
public class ArregloListaIndice<E> implements ListaIndice<E> {
  private E[] A; // arreglo almacenando los elementos de la lista indizada
  private int capacidad = 16;  // tamaño inicial del arreglo A
  private int tam = 0;  // número de elementos guardados en la lista 
  /** Crear la lista indizada con capacidad inicial de 16. */
  public ArregloListaIndice() { 
    A = (E[]) new Object[capacidad]; // el compilador podría advertir, 
                                     // pero está bien
  }

  public ElementoIteradorIndice<E> iterator(){
    return new ElementoIteradorIndice<E>(this);
  }

  /** Insertar un elemento en el índice dado. */
  public void add(int r, E e) 
    throws IndexOutOfBoundsException {
    revisarIndice(r, size() + 1);
    if (tam == capacidad) {  // un sobreflujo
      capacidad *= 2;
      E[] B =(E[]) new Object[capacidad]; // el compilador podría advertir
      for (int i=0; i<tam; i++) 
        B[i] = A[i];
      A = B;
    }
    for (int i=tam-1; i>=r; i--)  // desplazar elementos hacia adelante
      A[i+1] = A[i];
    A[r] = e;
    tam++;
  }
  /** Quitar el elemento guardado en el índice dado. */
  public E remove(int r) 
    throws IndexOutOfBoundsException {
    revisarIndice(r, size());
    E temp = A[r];
    for (int i=r; i<tam-1; i++)  // desplazar elementos hacia atrás
      A[i] = A[i+1];
    tam--;
    return temp;
  }
  /** Revisa si el índice dado está en el rango [0, n - 1] */
  protected void revisarIndice(int r, int n) // 
    throws IndexOutOfBoundsException {  // 
    if (r < 0 || r >= n)
      throw new IndexOutOfBoundsException("Índice ilegal : " + r);
  }
  /** Regresar el número de elementos en la lista indizada. */
  public int size() {
    return tam;
  }
  /** Indica si la lista indizada está vacía. */
  public boolean isEmpty() {
    return size() == 0; 
  }
  /** Regresa el elemento guardado en el índice dado. */
  public E get(int r) 
    throws IndexOutOfBoundsException {
    revisarIndice(r, size());
    return A[r]; 
  }
  /** Reemplaza el elemento guardado en el índice dado. */
  public E set(int r, E e) 
    throws IndexOutOfBoundsException {
    revisarIndice(r, size());
    E temp = A[r];
    A[r] = e;
    return temp;
  }
  public static void main(String[]args){
	ListaIndice<Integer> l = new ArregloListaIndice<Integer>();
	for(int i=1; i<21; i++) {
		l.add(l.size(),i);
		System.out.println("Agregado "+i+" al inicio "+l);
	}
		int n;
		Iterator<Integer> iterator=l.iterator();
			while(iterator.hasNext()){
				n=iterator.next();
				System.out.print(n+",");
			}
		n=iterator.next();
		System.out.println(n);
  }
}
