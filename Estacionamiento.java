import java.util.Scanner;
import java.io.IOException;
public class Estacionamiento{
	public static int NumEnt,NumSal,Hilosgen,Tam;
	public static int [] estacionamiento;	
	public static void main(String[] args) throws IOException,InterruptedException{
		Scanner tec = new Scanner(System.in);
		new ProcessBuilder("cowsay","Dame el nuemero de entradas").inheritIO().start().waitFor();
		NumEnt=tec.nextInt();
		new ProcessBuilder("cowsay","Dame el numero de salidas").inheritIO().start().waitFor();
		NumSal=tec.nextInt();
		new ProcessBuilder("cowsay","Dame el numero de hilos por entrada").inheritIO().start().waitFor();
		Hilosgen=tec.nextInt();
		new ProcessBuilder("cowsay","Dame el tamanio del estacionamiento").inheritIO().start().waitFor();	
		Tam=tec.nextInt();		
		Gencarros[] gen = new Gencarros[NumEnt];
		for (int i = 0;i<NumEnt ;i++ ) {
			gen[i]=new Gencarros(Hilosgen);	
		}
		for (int j=0;j<NumEnt ;j++ ) {
		gen[j].start();			
		}
	}
}