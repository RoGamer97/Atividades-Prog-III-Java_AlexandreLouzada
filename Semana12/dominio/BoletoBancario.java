package dominio;

public class BoletoBancario implements Pagamento
{	
	private double valor;
	
	public BoletoBancario(double valor) 
	{
        this.valor = valor;
    }
	
	public void realizarPagamento(double valor)
	{
		this.valor += valor;
	}
	
	public double getValor()
	{
		return valor;
	}
	
	@Override
	public void exibirPagamento()
	{
		System.out.printf("Pagamento de R$ %.2f realizado com Boleto Bancário.\n", valor);
	}
}
