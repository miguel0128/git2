import java.util.Scanner;

public class Prog1_0 {

	public static void main(String[] args) {
	
		Scanner leerradio = new Scanner(System.in);
		int radio;
		System.out.println("Introduce el radio de la esfera");
		radio=leerradio.nextInt();
		
		double volumen;
		
		volumen = (4 * (Math.PI) * (Math.pow(radio,3))/3);

		System.out.println("El volumen de la esfera es "+volumen);
		System.out.println("Finalizado Version 1");
		
	}

}
