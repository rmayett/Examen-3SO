class Gencarros extends Thread{	
	private int hilos;
	public Gencarros(int hilos){
		this.hilos= hilos;
	}
	public void run(){
		for (int i=0;i<hilos;i++) {
			new Carroshilos().start();
		}		
	}
}