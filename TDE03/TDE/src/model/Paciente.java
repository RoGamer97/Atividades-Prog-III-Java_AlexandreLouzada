package model;

public class Paciente extends Pessoa 
{
    private String diagnostico;
    private String prontuario;

    public Paciente(String nome, int idade, String diagnostico, String prontuario) 
    {
        super(nome, idade);
        this.diagnostico = diagnostico;
        this.prontuario = prontuario;
    }
	
    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }
    public String getProntuario() { return prontuario;}
    public void setProntuario(String prontuario) { this.prontuario = prontuario; }

    @Override
    public void exibirDados() 
    {
        System.out.println("Paciente: " + nome);
        System.out.println("Idade: " + idade);
    }

}
