                                                      

/*Alumno: Oscar Fernández Durán 
  Fecha:18/02/2019
  Descripción: Se hace la aplicación llamada Paradoja, donde demuestra experimentalmente la paradoja de que en un conjunto o grupo de 23 personas, la probabilida
  de que al menos una vez, dos personas de dicho grupo cumplan años el mismo día; en este código se hace la pruba experimental para un conjunto de personas de 5,
  10,15...,90,95,100.
*/
public class Paradoja{
        public static void main (String[]args){
                double cont=0;
                for(int o=5;o<101;o=o+5){//ciclo encargado de la cantidad de personas, en este caso va de 5,10,15,...,90,95,100.
                        cont=0;
                        for(int d=1; d<=100;d++){/*ciclo encargado de hacer la prueba n veces para o cantidad de personas(donde o es la variable que controla la-
                                cantidad de personas), mientras n sea más grande, más exacto será la probabilidad.*/
                                int[] cumpleaños=new int[23];//aquí se escoge la cantidad de fechas de cumplaños, dependiendo de la cantidad de personas.
                                //si se sustituye la o por 23, en el arreglo creado, se podría hacer el experimento con 23 personas para probar que en efecto tiende a 5$
                                for(int i=0; i<cumpleaños.length;i++){//Le pone el día del año en que cumplen años alatoriamente las personas.
					MRandom al=new MRandom();
                                        cumpleaños[i]=al.getRandom(365);
                                }
                                for(int l=0;l<cumpleaños.length;l++){//ciclo que verifica si algún cumpleaños coincide con otro, si esto sucede las variables m y l romp$
                                        for(int m=l+1;m<cumpleaños.length;m++){
                                                if(cumpleaños[l]==cumpleaños[m]){
                                                        cont++;
                                                        m=10000;
                                                        l=10000;
                                                }
                                        }
                                }
                                if(d==100){//cuando acabe el experimento con o cantidad de personas, se calcula su probabilidad con los datos obtenido y segurá-
                                        //el experimento para o+1 cantidad de personas.
                                        double promedio=(cont*100)/100;
                                        System.out.println("El porcentaje de veces que al menos dos personas cumplan años el mismo día para "+o+" peronas es de: "+promedio);
                                }
                        }
                }
        }
}



