import java.util.Scanner;
import java.io.IOException;
public class Estacionamiento{
	public static int NumEnt,NumSal,Hilosgen,Tam;
	public static int [] estacionamiento;	
	public static void main(String[] args) throws IOException,InterruptedException{
		Scanner tec = new Scanner(System.in);
		System.out.println("Dame el nuemero de entradas");
		NumEnt=tec.nextInt();
		System.out.println("Dame el numero de salidas");
		NumSal=tec.nextInt();
		System.out.println("Dame el numero de hilos por entrada");
		Hilosgen=tec.nextInt();
		System.out.println("Dame el tamaño del estacionamiento");	
		Tam=tec.nextInt();
		new ProcessBuilder("cowsay","Creando Estacionamiento").inheritIO().start().waitFor();
		//Gencarros gen = new Gencarros(Hilosgen);
		
	}

}