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
		
		double area;
		area = (Math.PI) * (Math.pow(radio, 2));
		System.out.println("El área de la esfera es "+area);
		System.out.println("Finalizado Version 2");
		
		double longitud;
		longitud = 2 * (Math.PI)* radio;
		
		System.out.println("La longitud de la circunferencia es "+longitud);
		System.out.println("Finalizado Version 3");

		System.out.println("");
		System.out.println("Version definitiva y refundida");
		
	}

}
