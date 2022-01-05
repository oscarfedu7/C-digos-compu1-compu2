public class ExcepciónPedido extends Exception{
	public ExcepciónPedido(int n){
		super(MensajesError.ERRORES[n]);
	}
}
