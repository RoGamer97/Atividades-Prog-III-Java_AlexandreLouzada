package controller;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultaController
{
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Medico> medicos = new ArrayList<>();
    private List<Consulta> consultas = new ArrayList<>();

    public void adicionarPessoa(Pessoa pessoa) throws CampoObrigatorioException
    {
        if (pessoa == null)
        {
            throw new CampoObrigatorioException("Pessoa não pode ser nula!");
        }

        if (pessoa instanceof Paciente)
        {
            pacientes.add((Paciente) pessoa);
        }
        else if (pessoa instanceof Medico)
        {
            medicos.add((Medico) pessoa);
        }
        else
        {
            throw new CampoObrigatorioException("Tipo de pessoa inválido!");
        }
    }

    public void agendarConsulta(Paciente paciente, Medico medico, String data, String hora) throws CampoObrigatorioException
    {
        if (paciente == null || medico == null || data == null || hora == null)
        {
            throw new CampoObrigatorioException("Dados de consulta incompletos!");
        }

        Consulta consulta = new Consulta(paciente, medico, data, hora);
        consultas.add(consulta);
        System.out.println("Consulta agendada com sucesso!");
    }

    public List<Consulta> listarConsultas()
    {
        return consultas;
    }

    public Consulta buscarConsultaPorPaciente(String nomePaciente) throws ConsultaNaoEncontradaException
    {
        for (Consulta consulta : consultas)
        {
            if (consulta.getPaciente().getNome().equalsIgnoreCase(nomePaciente))
            {
                return consulta;
            }
        }
        throw new ConsultaNaoEncontradaException("Consulta não encontrada para o paciente: " + nomePaciente);
    }

    public void cancelarConsulta(Consulta consulta)
    {
        consultas.remove(consulta);
        System.out.println("Consulta cancelada com sucesso!");
    }

    public Paciente buscarPacientePorNome(String nome)
    {
        for (Paciente p : pacientes)
        {
            if (p.getNome().equalsIgnoreCase(nome))
            {
                return p;
            }
        }
        return null;
    }

    public Medico buscarMedicoPorNome(String nome)
    {
        for (Medico m : medicos)
        {
            if (m.getNome().equalsIgnoreCase(nome))
            {
                return m;
            }
        }
        return null;
    }
}