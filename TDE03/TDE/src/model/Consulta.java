package model;

public class Consulta 
{
    private Paciente paciente;
    private Medico medico;
    private String data;
    private String hora;

    public Consulta(Paciente paciente, Medico medico, String data, String hora) 
    {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
    }

    public Paciente getPaciente() { return paciente;}
    public Medico getMedico() { return medico; }
    public String getData() { return data; }
    private String getHora() { return hora; }

    public void exibirConsulta() 
    {
        System.out.println("Consulta agendada para: " + data +  " as " + hora);
        paciente.exibirDados();
        medico.exibirDados();
    }
}