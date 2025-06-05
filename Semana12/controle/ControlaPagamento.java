package controle;
import dominio.*;

public class ControlaPagamento 
{
	public static void main(String[] args)
	{
		Pagamento boleto = new BoletoBancario(500);
		Pagamento cartao = new CartaoCredito(1000);
		
		boleto.realizarPagamento(100);
		cartao.realizarPagamento(30);
		
		boleto.exibirPagamento();
		cartao.exibirPagamento();
	}
}
