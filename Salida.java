public class Salida{
	private Cola estacionamiento= new Cola();
	private boolean disponible = true;
	private String mensaje;
        
        
	public synchronized void Sacar(Cola col,String nombre){
		while(disponible==false){
			try{
			wait();}
			catch(InterruptedException e){}
		}
		estacionamiento.push(col.pop());				
		mensaje=nombre+" saco el carro con la matricula: "+estacionamiento.tope().matr + " quedan : " + estacionamiento.tam() + " lugares ";	
		System.out.println(mensaje);
		estacionamiento.show();
		if (this.estacionamiento.tam()==Estacionamiento.Tam) {
			disponible=false;			
		}
		notifyAll();
	}
}