package controle;

import java.util.Scanner;

public class Funcionario 
{
	private String nome;
	private double salarioBase;
	private char categoria;
	
	public static void calcularSalarioFinal(double salarioBase, char categoria)
	{
		switch (categoria)
		{
		case 'A':
		case 'a':
			System.out.println("Salário: " + (salarioBase * 1.2));
			break;
		case 'B':
		case 'b':
			System.out.println("Salário: " + (salarioBase * 1.1));
			break;	
		case 'C':
		case 'c':
			System.out.println("Sem acréscimo de salário!");
		}
	}
	
	
	public static void main(String[] args)
	{
		Funcionario func = new Funcionario();
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		func.nome = sc.nextLine();
		
		System.out.print("Digite o salário base: ");
		func.salarioBase = sc.nextDouble();
		
		System.out.print("Digite a categoria: ");
		func.categoria = sc.next().charAt(0);
		
		calcularSalarioFinal(func.salarioBase, func.categoria);
	}
}