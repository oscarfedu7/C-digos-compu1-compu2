/*Alumno: Oscar Fernández Durán
  Fecha: 04/03/19
  Descripción: Se crea la clase Cuadrilatero la cual calcula el área de un cuadrilatero regular.
  */
public class Cuadrilatero implements Poligono{
        private double base;
        private double altura;
        public Cuadrilatero(double b, double h){
                base=b;
                altura=h;
        }
        public double area(){
                return (base*altura);
        }
        public double perimetro(){
                return (base*2)+(altura*2);
        }
}

