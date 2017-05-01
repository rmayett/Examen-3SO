public class Carrossalida extends Thread{
    private Salida s= new Salida();
    private Cola  c=new Cola();
    
	public void run(){
		while(true){
			int a=(int)(Math.random()*100);
			if (a<30) {
				for (int j=0;j<a;j++) {					
				this.c.push(new Nodo(a));					
				}
				s.Sacar(this.c,getName(),a);							
				}					
			try{
				sleep((int)(Math.random()*100));
			}
			catch(InterruptedException e){}
		}
	}
}