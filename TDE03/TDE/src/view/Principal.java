package view;

import controller.ConsultaController;
import model.*;
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ConsultaController controller = new ConsultaController();

        boolean continuar = true;
        while (continuar)
        {
            System.out.println("1. Cadastrar Médico");
            System.out.println("2. Cadastrar Paciente");
            System.out.println("3. Agendar Consulta");
            System.out.println("4. Listar Consultas");
            System.out.println("5. Buscar Consulta por Paciente");
            System.out.println("6. Cancelar Consulta");
            System.out.println("7. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao)
            {
                case 1:
                {
                    System.out.print("Nome do Médico: ");
                    String nomeMedico = scanner.nextLine();
                    System.out.print("Idade do Médico: ");
                    int idadeMedico = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Especialidade: ");
                    String especialidade = scanner.nextLine();
                    System.out.print("CRM: ");
                    String crm = scanner.nextLine();

                    Medico medico = new Medico(nomeMedico, idadeMedico, especialidade, crm);

                    try
                    {
                        controller.adicionarPessoa(medico);
                    }
                    catch (CampoObrigatorioException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                case 2:
                {
                    System.out.print("Nome do Paciente: ");
                    String nomePaciente = scanner.nextLine();
                    System.out.print("Idade do Paciente: ");
                    int idadePaciente = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Diagnóstico: ");
                    String diagnostico = scanner.nextLine();
                    System.out.print("Prontuário: ");
                    String prontuario = scanner.nextLine();

                    Paciente paciente = new Paciente(nomePaciente, idadePaciente, diagnostico, prontuario);
                    try
                    {
                        controller.adicionarPessoa(paciente);
                    }
                    catch (CampoObrigatorioException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                case 3:
                {
                    System.out.print("Nome do Paciente: ");
                    String nomePaciente = scanner.nextLine();
                    System.out.print("Nome do Médico: ");
                    String nomeMedico = scanner.nextLine();
                    System.out.print("Data (DD/MM/AA): ");
                    String data = scanner.nextLine();
                    System.out.print("Hora (HH/MM): ");
                    String hora = scanner.nextLine();

                    Paciente paciente = controller.buscarPacientePorNome(nomePaciente);
                    Medico medico = controller.buscarMedicoPorNome(nomeMedico);

                    if (paciente == null)
                    {
                        System.out.println("Paciente não encontrado: " + nomePaciente);
                    }
                    else if (medico == null)
                    {
                        System.out.println("Médico não encontrado: " + nomeMedico);
                    }
                    else
                    {
                        try
                        {
                            controller.agendarConsulta(paciente, medico, data, hora);
                        }
                        catch (CampoObrigatorioException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                }

                case 4:
                {
                    for (Consulta consulta : controller.listarConsultas())
                    {
                        consulta.exibirConsulta();
                    }
                    if (controller.listarConsultas().size() == 0)
                    {
                    	System.out.println("Nenhuma consulta cadastrada!");
                    }
                    break;
                }

                case 5:
                {
                    System.out.print("Nome do Paciente: ");
                    String nomePaciente = scanner.nextLine();
                    try
                    {
                        Consulta consulta = controller.buscarConsultaPorPaciente(nomePaciente);
                        consulta.exibirConsulta();
                    }
                    catch (ConsultaNaoEncontradaException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                case 6:
                {
                    System.out.print("Nome do Paciente: ");
                    String nomePaciente = scanner.nextLine();
                    try
                    {
                        Consulta consulta = controller.buscarConsultaPorPaciente(nomePaciente);
                        controller.cancelarConsulta(consulta);
                    }
                    catch (ConsultaNaoEncontradaException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                case 7:
                {                    
                	System.out.println("Saindo...");
                    continuar = false;
                    break;
                }

                default:
                {
                    System.out.println("Opção inválida.");
                }
            }
        }
        scanner.close();
    }
}