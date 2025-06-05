package dominio;

public class CartaoCredito extends Pagamento
{	
	public CartaoCredito(double valor)
	{
		super(valor);
	}
	
	@Override
	public void exibirPagamento()
	{
		System.out.printf("Pagamento de R$ %.2f realizado com Cartão de Crédito.\n", getValor());
	}
}
