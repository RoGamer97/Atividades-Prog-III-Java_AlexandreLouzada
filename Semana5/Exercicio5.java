package controle;

import java.util.Scanner;

public class ConverterNotaConceito
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite uma nota: ");
		int nota = sc.nextInt();
		
		switch (nota)
		{
		case 10:
		case 9:
			System.out.print("A");
			break;
		case 8:
		case 7:
			System.out.print("B");
			break;
		case 6:
		case 5:
			System.out.print("C");
			break;
		case 4:
		case 3:
			System.out.print("D");
			break;
		case 2:
		case 1:
		case 0:
			System.out.print("E");
			break;
		default:
			System.out.print("Nota inválida!");
		}		
	}
}
