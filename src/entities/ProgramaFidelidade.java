package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgramaFidelidade {
    private List<Cliente> clientes;
    private List<Servico> servicos;

    public ProgramaFidelidade() {
        this.clientes = new ArrayList<Cliente>();
        this.servicos = new ArrayList<Servico>();
    }
    public void adicionaCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }
    public void registrarServico(Cliente cliente, Servico servico) {
        double precoFinal = servico.getPreco();
        LocalDate hoje = LocalDate.now();

        if(cliente.getMesAniversario() == hoje.getMonth()){
            precoFinal *= 0.20;
            System.out.println("O desconto será aplicado para "+ cliente.getNome());
        }
        cliente.adicionarPontos(servico.getPontosFidelidade());
    }

}
