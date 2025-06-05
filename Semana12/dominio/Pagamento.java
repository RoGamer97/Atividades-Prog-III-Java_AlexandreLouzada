package dominio;

public interface Pagamento 
{
    void realizarPagamento(double valor);
    void exibirPagamento();
    double getValor();
}
