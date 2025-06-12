package model;

public abstract class Pessoa implements Exibivel
{
	protected String nome;
	protected int idade;
	

	public Pessoa(String nome, int idade) 
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome( ) { return nome; }
	public int getIdade() { return idade; }
	
	public abstract void exibirDados();
}
