public class Salida{
	private Cola estacionamiento= new Cola();
	private boolean disponible = true;
	private String mensaje;
        
        
	public synchronized void Sacar(Cola col,String nombre,int n,int tama){
                if (this.estacionamiento.tam()>=n){
		while(disponible==false){
			try{
			wait();}
			catch(InterruptedException e){}
		}
		estacionamiento.push(col.pop());				
		mensaje=nombre+" saco el carro con la matricula: "+col.tope().matr + " quedan : " + (tama-estacionamiento.tam() )+ " lugares ";	
		//System.out.println(mensaje);
                //System.out.println("Los carros que estan en el estacionamiento son: ");
		//estacionamiento.show();
                
		if (this.estacionamiento.tam()==Estacionamiento.Tam) {
			disponible=false;			
		}
		notifyAll();
                }
                else System.out.println("No entra al metodo");  
                }
        }
