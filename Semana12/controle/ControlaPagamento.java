package controle;
import dominio.*;

public class ControlaPagamento 
{
	public static void main(String[] args)
	{
		BoletoBancario boleto = new BoletoBancario(500);
		CartaoCredito cartao = new CartaoCredito(1000);
		
		boleto.realizarPagamento(100);
		cartao.realizarPagamento(30);
		
		boleto.exibirPagamento();
		cartao.exibirPagamento();
	}
}
