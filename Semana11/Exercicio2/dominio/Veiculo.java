package dominio;

public class Veiculo 
{
	protected String marca;
	protected String modelo;
	protected int ano;
	
	Veiculo(String marca, String modelo,int ano)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public String getMarca()
	{
		return marca;
	}
	
	public String getModelo()
	{
		return modelo;
	}
	
	public int getAno()
	{
		return ano;
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	
	public void setAno(int ano)
	{
		this.ano = ano;
	}
	
	public void exibirDados()
	{
		System.out.println("Marca: " + getMarca() + "\n Modelo: " + getModelo() + "\nAno: " + getAno());
	}
}
