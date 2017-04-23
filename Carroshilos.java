public class Carroshilos extends Thread{
	private Coches coche;	
	public Cola col = new Cola();		
	public void run(){
		while(true){
			for (int i =0;i<(int)(Math.random()*10);i++) {
				Nodo s = new Nodo(i);
				this.col.push(s);
			}
			System.out.println(getName()+" "+col.ColaVacia());						
			coche.Estacionar(col);
			try{
				sleep((int)(Math.random()*100));
			}
			catch(InterruptedException e){}
		}
	}
}