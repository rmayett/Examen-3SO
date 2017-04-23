public class Coches{
	private Nodo[] estacionamiento = null;
	private boolean disponible = true;
	private String mensaje;
	public synchronized void Estacionar(int coches,Cola col)throws InterruptedException{
		while(disponible==false){
			wait();
		}
		mensaje="Se estacionaron "+coches+": ";
		for (int i = estacionamiento.length;i<estacionamiento.length+coches;i++) {
			estacionamiento[i]=col.pop();
			mensaje=mensaje+" "+estacionamiento[i];				
		}
		if (estacionamiento.length-1==tam) {
			disponible=false;			
		}
		notifyAll();
	}
	public synchronized Nodo Salir(){

	}
}