package dominio;

public class Pagamento 
{
	protected double valor;
	
	public Pagamento(double valor)
	{
		this.valor = valor;
	}
	
	public void realizarPagamento(double valor)
	{
		this.valor += valor;
	}
	
	public void exibirPagamento()
	{
		System.out.println("Mensagem padrão de pagamento");
	}
	
	public double getValor()
	{
		return valor;
	}
}
