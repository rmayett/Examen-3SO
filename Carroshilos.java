public class Carroshilos extends Thread{
	private Coches c = new Coches();	
	private Cola col = new Cola();		
	public void run(){
		while(true){
			int a=(int)(Math.random()*100);
			if (a<30) {
				for (int j=0;j<a;j++) {					
				this.col.push(new Nodo(a));					
				}
				c.Estacionar(this.col,getName());							
				}					
			try{
				sleep((int)(Math.random()*100));
			}
			catch(InterruptedException e){}
		}
	}
}