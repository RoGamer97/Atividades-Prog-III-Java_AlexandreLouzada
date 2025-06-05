package dominio;

public class CartaoCredito implements Pagamento
{	
    private double valor;

    public CartaoCredito(double valor) 
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
		System.out.printf("Pagamento de R$ %.2f realizado com Cartão de Crédito.\n", valor);
	}
}
