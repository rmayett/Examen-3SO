public class Nodo{
	String matr;
	Nodo sig;
	public Nodo(){
		this.matr=null;
		this.sig=null;
	}
	public Nodo(int a){
		this.matr="AB"+(int) Math.floor(Math.random()*a);
		this.sig=null;
	}
	public Nodo(Nodo sig){
		this.matr="AB"+(int) Math.floor(Math.random()*16);
		this.sig=sig;
	}
	public void setsig(Nodo sig){
		this.sig=sig;
	}
	public String getMatr(){
		return this.matr;
	}
	public Nodo getsig(){
		return this.sig;
	}
}