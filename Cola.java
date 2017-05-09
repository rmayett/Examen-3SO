public class Cola{
	Nodo h = new Nodo(); 
	Nodo t = new Nodo();
	int i;
	public Cola(){
		this.i=0;
		this.h=null;
		this.t=null;		
	}
	public int tam(){
		return this.i;
	}
	public boolean ColaVacia(){
		if (this.h==null&&this.t==null) {
			return true;			
		}
		return false;
	}
	public void push(Nodo r){
		Nodo aux=r;
		if (!ColaVacia()) {
			t.setsig(aux);
			t=aux;
			t.setsig(null);
			this.i=this.i+1;				
		}
		else{
			this.i=1;
			this.h=aux;
			this.t=aux;
		}
	}
	public Nodo tope(){
		return this.h;
	}
	public Nodo pop(){
		if (!ColaVacia()) {
			Nodo resp = this.h;
			if (this.h==null) {
				this.t=null;							
						}
			this.h=this.h.getsig();
			this.i=this.i-1;			
			return resp;		
		}
		else{
			System.out.println("La cola esta vacia");
			return null;
		}
	}
	public void VaciarCola(){
		this.h=null;
		this.t=null;
	}
	public void show(){
		Nodo aux = h;
		System.out.println("Coches del estacionamiento");
		while(aux!=null){
			System.out.println(aux.getMatr());
			aux=aux.getsig();
		}
	}
	public void shows(String nombre){
		Nodo aux = h;
		System.out.println(nombre+" Saco los coches del estacionamiento con las matriculas");
		while(aux!=null){
			System.out.println(aux.getMatr());
			aux=aux.getsig();
		}
	}
}