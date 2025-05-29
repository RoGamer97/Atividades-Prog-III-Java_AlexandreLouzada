package dominio;

public class Moto extends Veiculo
{
	protected int cilindradas;
	
	public Moto(String marca, String modelo, int ano, int cilindradas)
	{
		super(marca,modelo,ano);
		this.cilindradas = cilindradas;
	}
	
	public int getCilindradas()
	{
		return cilindradas;
	}
}
