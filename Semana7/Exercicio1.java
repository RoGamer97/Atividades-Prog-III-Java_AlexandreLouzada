// TODO: Ainda tenho que rever o código e usar getters e setters. Não vejo como o código seria melhor neste caso usando, pois criaria mais funções, sendo que já tenho acesso á variável diretamente

package dominio;

import java.util.Scanner;

public class ContaBancaria 
{
	private double saldo;
	private String titular;
	
	public static void main(String[] args)
	{
		ContaBancaria conta = new ContaBancaria();
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do titular: ");
		conta.titular = sc.nextLine();
		int opcao = 0;
		while (opcao != 4)
		{
			System.out.print("Digite a opção:\n1) Depositar\n2) Sacar\n3) Exibir salário\n4) Encerrar\nDigite a opção: ");
			opcao = sc.nextInt();
		
			switch (opcao)
			{
				case 1:
					depositar(conta);
					break;
				case 2:
					sacar(conta);
					break;
					
				case 3:
					exibirSalario(conta);
					break;
				default:
					System.out.println("Opção inválida!");		
			}
		}
		System.out.print("Encerrando programa...");
		sc.close();
	}
	
	public static void depositar(ContaBancaria conta)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor que quer depositar: ");
		double valorDeposito = sc.nextDouble();
		conta.saldo += valorDeposito;
		System.out.println("Deposito realizado com sucesso! Saldo: " + conta.saldo);
	}
	
	public static void sacar(ContaBancaria conta)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor que quer sacar: ");
		double valorSaque = sc.nextDouble();
		while (valorSaque > conta.saldo)
		{
			System.out.print("Saldo insuficiente! Saldo atual: " + conta.saldo + "\nPor favor, digite uma quantia válida: ");
			valorSaque = sc.nextDouble();
		}
		conta.saldo -= valorSaque;
		System.out.println("Saque realizado! Saldo atual: " + conta.saldo);
	}
	
	public static void exibirSalario(ContaBancaria conta)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Seu saldo é: " + conta.saldo);
	}
}
