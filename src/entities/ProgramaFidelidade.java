package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
    public void verificarFidelidade(){
        LocalDate hoje = LocalDate.now();
        for(Cliente cliente : clientes){
            long meses = ChronoUnit.MONTHS.between(cliente.getDataCadastro(),hoje);
            if(meses >= 6){
                System.out.println(cliente.getNome() + "Está no programa de fidelidade há " + meses + " meses");
                cliente.adicionarPontos(-cliente.getPontosFidelidade());
            }
        }
    }
    public void exibirCliente(){
        for(Cliente cliente : clientes){
            System.out.println(cliente);
        }
    }
    public void exibirServico(){
        for(Servico servico : servicos){
            System.out.println(servico);
        }
    }


}
