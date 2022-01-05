/*Alumno: Oscar Fernández Durán
  Fecha: 04/03/19
  Descripción: Se crea la clase Octagono, la cual saca el área de un octagono con el radio y lado, sacando el área con la fórmula básica(apotema*perimetro/2).
  El apotema se saca con la información del radio (distancia del centro a un vertice).          
*/

public class Octagono implements Poligono{
        private double perimetro;
        private double lado;
        private double radio;
        public Octagono(double l, double r){
                lado=l;
                radio=r;
                perimetro=perimetro();
        }
        public double area(){
                return (perimetro*(Math.sqrt((radio*radio)-((lado*lado)/2)))/2);
        }
        public double perimetro(){
                return lado*8;
        }
}

