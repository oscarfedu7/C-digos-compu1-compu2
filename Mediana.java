import java.util.Scanner;
import java.util.Arrays;
public class Mediana{
	public static void main(String []args){
		Scanner entr=new Scanner (System.in);
		System.out.print("Escribe el tamaño del arreglo: ");
		int tam=entr.nextInt();
		System.out.println();
		Double[] lista=new Double[tam];
		for(int i=0; i<tam; i++){
			System.out.println("Escribe el valor"+(i+1)+":");
			lista[i]=entr.nextDouble();
		}
		Double[] listaOrdenada=new Double[tam];
		listaOrdenada=ListaOrdenada(lista);
		double mediana=0;
		int tama=listaOrdenada.length;
		if((tama)%2==0){
			int num1=(tama/2);
			int num2=(num1-1);
			mediana=(listaOrdenada[num1]+listaOrdenada[num2])/2;
		}
		else{
			int num=(int)((tama/2)+1);
			mediana=listaOrdenada[(num-1)];
		}
		System.out.println(" "+Arrays.toString(listaOrdenada));
		System.out.println("Mediana: "+mediana);
	}
	public static Double[] ListaOrdenada(Double[] lista){
		double  menor=0;
		int uso=0, k=0;
		for(int i=0; i<(lista.length-1);i++){
			menor=lista[i];
			k=0;
			for(int t=(i+1);t<lista.length;t++){
				if(menor>lista[t]){
					k++;
					menor=lista[t];
					uso=t;
				}
			}
			if(k>0){
				lista[uso]=lista[i];
				lista[i]=menor;
			}
		}
		return lista;
	}
}
