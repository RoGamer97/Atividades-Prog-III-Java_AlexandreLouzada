package controle;

import dominio.*;

public class ControlaFuncionario 
{
	public static void main(String[] args)
	{
		Funcionario funcionario = new Funcionario("Ro", 5000);
		Gerente gerente = new Gerente("Louzada", 9500);
		Estagiario estagiario = new Estagiario("Luis", 4000);
		
		System.out.println("Nome: " + funcionario.getNome() + " Salário final: " + funcionario.calcSalarioBase());
		System.out.println("Nome: " + gerente.getNome() + " Salário final: " + gerente.calcSalarioBase());
		System.out.println("Nome: " + estagiario.getNome() + " Salário final: " + estagiario.calcSalarioBase());
	}
}
