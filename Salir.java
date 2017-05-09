public class Salir extends Thread{
	private Coches c = new Coches();	
	private Cola col = new Cola();	
	private int r;
	public void run(){
		while(true){			
			int a=(int)(Math.random()*100);
			if (a<30&&Estacionamiento.estacionamiento.tam() >a){								
			col=c.Salir(a);				
			}
			if (!col.ColaVacia()) {
				r=Estacionamiento.Tam-Estacionamiento.estacionamiento.tam();
				System.out.println("Espacios ocupados: "+r);
				System.out.println("Salieron los coches con las matriculas:");
				col.shows(getName());		
				Estacionamiento.estacionamiento.show();		
			}
		}
	}
}