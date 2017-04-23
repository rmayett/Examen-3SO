class Gencarros extends Thread{	
	private int hilos;
	public Gencarros(int hilos){
		this.hilos= hilos;
	}
	public void run(){
		Carroshilos[] r = new Carroshilos[hilos];
		for (int i=0;i<hilos;i++) {
			r[i]=new Carroshilos();
		}
		for (int i=0;i<hilos;i++) {
			r[i].start();			
		}
	}
}