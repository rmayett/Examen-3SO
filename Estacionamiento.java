import java.util.Scanner;
import java.io.IOException;
public class Estacionamiento{	
	public static Cola estacionamiento = new Cola();
	public static int NumEnt,NumSal,Hilosgen,Tam;		
	public static void main(String[] args) throws IOException,InterruptedException{
		Scanner tec = new Scanner(System.in);
		new ProcessBuilder("cowsay","Dame el nuemero de entradas").inheritIO().start().waitFor();
		NumEnt=tec.nextInt();
		new ProcessBuilder("cowsay","Dame el numero de salidas").inheritIO().start().waitFor();
		NumSal=tec.nextInt();
		new ProcessBuilder("cowsay","Dame el numero de hilos por entrada").inheritIO().start().waitFor();
		Hilosgen=tec.nextInt();
		new ProcessBuilder("cowsay","Dame el tamaño del estacionamiento").inheritIO().start().waitFor();	
		Tam=tec.nextInt();	
		System.out.println(Tam);	
		Salir[] sal = new Salir[NumSal];
		Gencarros[] gen = new Gencarros[NumEnt];
		for (int i=0;i<NumEnt;i++) {
			gen[i]=new Gencarros(Hilosgen);	
		}
		for (int k=0;k<NumSal;k++) {
			sal[k]=new Salir();
		}
		for (int j=0;j<NumSal;j++) {
			sal[j].start();
		}
		for (int j=0;j<NumEnt ;j++ ) {
		gen[j].start();					
		}
	}
}