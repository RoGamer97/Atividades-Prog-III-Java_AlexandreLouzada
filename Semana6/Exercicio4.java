package dominio;

import java.util.Scanner;

public class CalcMediaAlunos 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite a quantidade de alunos: ");
		int alunoNum = sc.nextInt();
		double notasAlunos = 0;
		double somaNotas = 0;
		
		for (int i = 0; i < alunoNum; i++)
		{
			System.out.print("Digite a nota do " + (i + 1) + "º aluno: ");
			notasAlunos = sc.nextDouble();
			somaNotas += notasAlunos;
		}
		
		System.out.println("Média da turma: " + (somaNotas / alunoNum));
	}
}
