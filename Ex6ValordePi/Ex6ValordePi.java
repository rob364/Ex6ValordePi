import java.util.Locale;
import java.util.Scanner;

public class Ex6ValordePi {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, Triangulo, Circulo, Trapezio, Quadrado, Retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		Triangulo = A * C / 2.0;
		Circulo = 3.14159 * C * C;
		Trapezio = (A + B) / 2.0 * C;
		Quadrado =  B * B;
		Retangulo = A * B;
		
		
		
		System.out.printf("Triangulo %.3f%n", Triangulo );
		System.out.printf("Circulo: %.3f%n", Circulo );
		System.out.printf("Trapezio: %.3f%n", Trapezio);
		
		
		System.out.printf("Quadrado: %.3f%n", Quadrado );
		System.out.printf("Retangulo: %.3f%n", Retangulo);
		
		sc.close();
	}

}
