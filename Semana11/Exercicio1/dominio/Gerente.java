package dominio;

public class Gerente extends Funcionario
{
	public Gerente(String nome, double salarioBase)
	{
		super(nome,salarioBase);
	}
	
	@Override
	public double calcSalarioBase()
	{
		return (salarioBase + (salarioBase * 5/100));
	}
}
