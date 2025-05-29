package dominio;

public class Carro extends Veiculo
{
	protected int quantidadePortas;
	
	public Carro(String marca, String modelo, int ano, int quantidadePortas)
	{
		super(marca,modelo,ano);
		this.quantidadePortas = quantidadePortas;
	}
	
	public int getQuantidadePortas()
	{
		return quantidadePortas;
	}
}
