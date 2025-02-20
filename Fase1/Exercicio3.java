package controle;

import java.util.Scanner;

public class ConverterTemperatura 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		
		System.out.print("Temperatura em Fahrenheit: " + ((celsius * 9.0 / 5.0) + 32));
	}
}
