//Alumno: Oscar Fernández Durán
//Fecha:05/04/19
//Descripción: usuo de la clase ListaDoble con el objetivo de ver como trabajan los métodos nuevos.
public class UsaListaDoble{
        public static void main(String[]args){
                ListaDoble lista=new ListaDoble();
                NodoD [] nodos=new NodoD[10];//Crea un arreglo de nodos
                for(int i=0;i<nodos.length;i++){
                        nodos[i]=new NodoD(null,null,null);
                }
                nodos[0].setElemento("67");//inicializar los nodos.
                nodos[1].setElemento("12");
                nodos[2].setElemento("24");
		nodos[3].setElemento("133"); 
		nodos[4].setElemento("88");
		nodos[5].setElemento("13");
		nodos[6].setElemento("10");
		nodos[7].setElemento("30");
		nodos[8].setElemento("1");
		nodos[9].setElemento("9");
                lista.agregarInicio(nodos[9]);
		lista.agregarInicio(nodos[8]);
		lista.agregarInicio(nodos[7]);
		lista.agregarInicio(nodos[6]);
	/*	lista.agregarInicio(nodos[5]);
		lista.agregarInicio(nodos[4]);
		lista.agregarInicio(nodos[3]);
		lista.agregarInicio(nodos[2]);
		lista.agregarInicio(nodos[1]);
                lista.agregarInicio(nodos[0]);*/
                System.out.println(lista.toString());
                lista=lista.InvierteLista(lista);
                System.out.println(lista.toString());
		lista=lista.OrdenaPorSeleccion(lista);
		System.out.println(lista.toString());
	}
}
