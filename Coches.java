public class Coches{
	private Nodo[] estacionamiento = null;
	private boolean disponible = true;
	private String mensaje;
	public synchronized void Estacionar(Cola col)throws InterruptedException{
		while(disponible==false){
			wait();
		}
		estacionamiento[estacionamiento.length]=col.pop();				
		mensaje="estaciono el coche con la matricula: "+estacionamiento[estacionamiento.length].matr;	
		System.out.println(mensaje);
		if (estacionamiento.length-1==Estacionamiento.Tam) {
			disponible=false;			
		}
		notifyAll();
	}
/*	public synchronized Cola Salir()throws InterruptedException{
		while(disponible==true){
			wait();
		}
		Cola r = new Cola();
		r.push(estacionamiento[i]);
		estacionamiento[i]= null;
		disponible=true;
		return(r);
	}*/
}