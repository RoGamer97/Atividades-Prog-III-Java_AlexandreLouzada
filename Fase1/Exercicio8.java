package controle;

import java.util.Scanner;

public class calcVolumeEsfera 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio da esféra: ");
		double raio = sc.nextDouble();
		
		double pi = 3.14159;
		
		System.out.print("Volume: " + ((4.0/3.0) * pi * (raio * raio * raio)));
		
	}
}
