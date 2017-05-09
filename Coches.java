public class Coches{
	private boolean disponible = true;
	private String mensaje;
	private int a;
	public synchronized void Estacionar(Cola col,String nombre){
		while(disponible==false){
			try{
			wait();}
			catch(InterruptedException e){}
		}
		Estacionamiento.estacionamiento.push(col.pop());				
		mensaje=nombre+" estaciono el coche con la matricula: "+Estacionamiento.estacionamiento.tope().matr;			
		a=Estacionamiento.Tam-Estacionamiento.estacionamiento.tam();
		System.out.println("Espacios ocupados: "+a+"\n"+mensaje+"\nEstacionamiento");
		Estacionamiento.estacionamiento.show();
		if (Estacionamiento.estacionamiento.tam()==Estacionamiento.Tam) {
			disponible=false;			
		}
		notifyAll();
	}
	public synchronized Cola Salir(int c){
		while(disponible==false){
			try{
			wait();}
			catch(InterruptedException e){}
		}
		Cola r = new Cola();
		for (int i=0;i<c;i++) {		
		r.push(Estacionamiento.estacionamiento.pop());	
		}		
		disponible=true;
		notifyAll();
		return(r);
	}
}