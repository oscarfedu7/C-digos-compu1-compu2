import java.util.*;
public class juegoDomino{
        public static void main(String[]args){
		listaDomino lista= new listaDomino();
		nodoDomino[] fichas= lista.creaFichas();
		for(int i=0;i<28;i++){
			System.out.println("["+fichas[i].getElementoI()+"|"+fichas[i].getElementoD()+"]");
		}
		System.out.println();
		fichas=lista.getRandom();
		for(int i=0;i<28;i++){
                        System.out.println("["+fichas[i].getElementoI()+"|"+fichas[i].getElementoD()+"]");
                }

	}
}
