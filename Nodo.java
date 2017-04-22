public class Nodo{
	String matr;
	Nodo sig;
	public Nodo(){
		this.matr=null;
		this.sig=null;
	}
	public Nodo(Nodo sig){
		this.matr="AB"+(int) Math.floor(Math.random()*16);
		this.sig=sig;
	}
	public void setSig(Nodo sig){
		this.sig=sig;
	}
	public String getMatr(){
		return this.matr;
	}
	public Nodo getSig(){
		return this.sig;
	}
}