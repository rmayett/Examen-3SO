public class Cola{
	Nodo h = new Nodo(); 
	Nodo t = new Nodo();
	public Cola(){
		this.h=null;
		this.t=null;		
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
		}
		else{
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
		while(aux!=null){
			System.out.println(aux);
			aux=aux.getsig();
		}
	}
}