public class PuntuacionesListaDoble {
	public static final int MAX_ENTRADAS=10;
	ListaDobleEJ lista;
	public PuntuacionesListaDoble(){
		lista=new ListaDobleEJ();
	}
	public String toString(){
		return lista.toString();
	}
	public void add(EntradaJuego e){
		int n=e.getPuntuacion();
		if(lista.tam()==MAX_ENTRADAS){
			if(n<=lista.getUltimo().getElemento().getPuntuacion())
				return;
			else
				lista.remover(lista.getUltimo());
		}
		if(lista.estaVacia()==false){
			NodoDEJ cursor=lista.getUltimo();
			for( ;lista.tienePrev(cursor)&&cursor.getElemento().getPuntuacion()<n;cursor=lista.getPrev(cursor)){
			}
			lista.agregarDespues(cursor,new NodoDEJ(e,null,null));
		}
		else{
			lista.agregarInicio(new NodoDEJ(e,null,null));
		}
	}
	public EntradaJuego remove(int i) throws IndexOutOfBoundsException{
		NodoDEJ n=null;
		if(i<0 || i>=lista.tam())
			throw new IndexOutOfBoundsException("Indice no válido: "+i);
		if(i<(lista.tam()/2)){
			for(int j=0;j<=i;j++){
				if(j==0)
					n=lista.getPrimero();
				else
					n=lista.getSig(n);
			}
		}
		else{
			for(int j=lista.tam()-1;j>=i;j--){
				 if(j==lista.tam()-1)
                                        n=lista.getUltimo();             
                                 else
					n=lista.getPrev(n);
			}
		}
		lista.remover(n);
		return n.getElemento();
	}
	public static void main(String[] args) {
      		PuntuacionesListaDoble p = new PuntuacionesListaDoble();
      		// se crean 15 puntuaciones
      		for(int i=0; i<15; ++i) {
         	EntradaJuego e = new EntradaJuego(""+(char) (i+'A'),
               	(int) (Math.random()*100) );
         	System.out.println("Intentando agregar "+e+"...");
         	p.add( e );
         	System.out.println(p);
      		}
      		System.out.println("Borrando "+p.remove(1)+"...");
      		System.out.println(p);
      		System.out.println("Borrando "+p.remove(8)+"...");
      		System.out.println(p);
      		System.out.println("Borrando "+p.remove(4)+"...");
      		System.out.println(p);
   	}
}
	
