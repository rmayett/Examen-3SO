public class Coches{
	private Cola estacionamiento = new Cola();
	private boolean disponible = true;
	private String mensaje;
	public synchronized void Estacionar(Cola col,String nombre){
		while(disponible==false){
			try{
			wait();}
			catch(InterruptedException e){}
		}
		estacionamiento.push(col.pop());				
		mensaje=nombre+" estaciono el coche con la matricula: "+estacionamiento.tope().matr;	
		System.out.println(mensaje);
		estacionamiento.show();
		if (this.estacionamiento.tam()==Estacionamiento.Tam) {
			disponible=false;			
		}
		notifyAll();
	}
	public synchronized Cola Salir()throws InterruptedException{
		while(disponible==false){
			wait();
		}
		Cola r = new Cola();
                
		r.push(estacionamiento.pop());		
		disponible=true;
		notifyAll();
		return(r);
	}
}