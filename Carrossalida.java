public class Carrossalida extends Thread{
    private Coches s= new Coches();
    private Cola  c=new Cola();
    
	public void run(){
		while(true){
			int a=(int)(Math.random()*100);
			if (a<30) {
                            try {
                                c=s.Salir();
                                System.out.println("Los carros que salieron son:");
                                c.show();
                            } catch (InterruptedException e){} 
				}					
			try{
				sleep((int)(Math.random()*100));
			}
			catch(InterruptedException e){}
		}
	}
}