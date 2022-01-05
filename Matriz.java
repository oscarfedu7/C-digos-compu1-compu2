public class Matriz<R>{
	private R[][] m;
	public Matriz(int f, int c){
		m=new (R[][]) Object[f][c];
	}
	public void fill(R n){
		for(int i=0; i<m.length; i++)
			Arrays.fill(m[i], n);
	}
	public String toString(){
		String m="";
		for(int i=0; i<m.length; i++)
			m=m+Arrays.toString(m[i]);
		return m;
	}
	public R get(int f, int c){
		if(f>=0 && f<m.length && c>=0 && c<m[0].length)
			return m[f][c];
		else
			return null;
	}
	public void set(int f, int c, R v){
		if(f>=0 && f<m.length && c>=0 && c<m[0].length)
                       	m[f][c]=v;
    	}
	public Matriz<R> Suma(Matriz<R> r){
		
		Matriz<R> m= new Matriz<
