package Application;

import entities.Cliente;
import entities.ProgramaFidelidade;
import entities.Servico;

import java.time.LocalDate;
import java.time.Month;

public class Program{
    public static void main(String[] args) {
        ProgramaFidelidade programa = new ProgramaFidelidade();

        Cliente cliente1 = new Cliente("Jonas", "123456789", "Rua C1, 10", LocalDate.of(2023,2,1), Month.JULY, 0);
        Cliente cliente2 = new Cliente("Laura", "123456789", "Rua D4, 25", LocalDate.of(2023,6,15), Month.FEBRUARY, 0);

        programa.adicionaCliente(cliente1);
        programa.adicionaCliente(cliente2);

        Servico servico1 = new Servico("Limpeza dentária", 65.00,1);
        Servico servico2 = new Servico("Manutenção aparelho", 100.00,1);

        programa.registrarServico(cliente1, servico1);
        programa.registrarServico(cliente2, servico2);

        programa.exibirCliente();
        programa.exibirServico();

        programa.verificarFidelidade();
    }
}