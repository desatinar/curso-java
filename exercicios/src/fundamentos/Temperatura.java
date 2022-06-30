package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//(Fº - 32) * 5/9 = ºC
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		double fahrenheit = 20;
		double conversao = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("Temperatura em Celcius =" + conversao);
	}
}
