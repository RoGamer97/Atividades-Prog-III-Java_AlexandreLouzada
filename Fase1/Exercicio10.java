package controle;

import java.util.Scanner;

public class calcDistancia2Pontos 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de x1: ");
		double x1 = sc.nextDouble();
		
		System.out.print("Digite o valor de y1: ");
		double y1 = sc.nextDouble();
		
		System.out.print("Digite o valor de x2: ");
		double x2 = sc.nextDouble();
		
		System.out.print("Digite o valor de y2: ");
		double y2 = sc.nextDouble();
		
		System.out.print("Distância dos pontos: " + Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
	}
}
