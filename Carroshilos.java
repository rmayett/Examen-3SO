public class Carroshilos extends Thread{
	private Coches c = new Coches();	
	private Cola col = new Cola();		
	public void run(){
		while(true){
			for (int i =1;i<5+(int)(Math.random()*10);i++) {				
				this.col.push(new Nodo(i));
			}						
			c.Estacionar(this.col,getName());			
			try{
				sleep((int)(Math.random()*100));
			}
			catch(InterruptedException e){}
		}
	}
}