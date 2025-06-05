package dominio;

public class BoletoBancario extends Pagamento
{	
	public BoletoBancario(double valor)
	{
		super(valor);
	}
	
	@Override
	public void exibirPagamento()
	{
		System.out.printf("Pagamento de R$ %.2f realizado com Boleto Bancário.\n", getValor());
	}
}
