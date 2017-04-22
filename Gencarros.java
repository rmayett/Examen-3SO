public class Gencarros() extends Thread{
	int hilos; 
	public Gencarros(int hilos){

	}
	public void run(){
		while(true){
			nMsj=(int)(Math.random()*100);
			mensaje.Almacenar(nMsj);
			System.out.println("Productor "+getName()+": almacena el mensaje #"+nMsj);
			try{
				sleep((int)(Math.random()*100));
			}
			catch(InterruptedException e){}
		}
	}
}