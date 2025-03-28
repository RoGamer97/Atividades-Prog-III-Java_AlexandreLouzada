package dominio;

import java.util.Scanner;

public class Elevador 
{
	private int andarAtual;
	private int totalAndares;
	
	public static void subir(Elevador elevador)
	{
		if (elevador.andarAtual != elevador.totalAndares)
		{
			elevador.andarAtual++;
		}
	}
	
	public static void descer(Elevador elevador)
	{
		if (elevador.andarAtual != 0)
		{
			elevador.andarAtual--;
		}
	}
	
	public static void exibirAndar(Elevador elevador)
	{
		System.out.println("Andar atual: " + elevador.andarAtual);
	}
	public static void main(String[] args)
	{
		Elevador elevador = new Elevador();
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o total de andares: ");
		elevador.totalAndares = sc.nextInt();
		
		int opcao = 0;
		do
		{
			System.out.print("Digite a opção: \n1) Subir\n2) Descer\n3) Exibir andar\n4) Encerrar programa\nDigite: ");
			opcao = sc.nextInt();
			
			switch (opcao)
			{
				case 1:
					subir(elevador);
					break;
				case 2:
					descer(elevador);
					break;
				case 3:
					exibirAndar(elevador);
					break;
				default:
					System.out.println("Opção inválida!");	
			}
		}
		while (opcao != 4);
	}
}
