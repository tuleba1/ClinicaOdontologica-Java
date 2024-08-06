package entities;

public class Servico {
    private String nomeServico;
    private double preco;
    private int pontosFidelidade;

    public Servico(String nomeServico, double preco, int pontosFidelidade) {
        this.nomeServico = nomeServico;
        this.preco = preco;
        this.pontosFidelidade = pontosFidelidade;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void setPontosFidelidade(int pontosFidelidade) {
        this.pontosFidelidade = pontosFidelidade;
    }
    @Override
    public String toString() {
        return "Servico{" +
                "nome='" + nomeServico+ '\'' +
                ", preco=" + preco +
                ", pontosFidelidade=" + pontosFidelidade +
                '}';
    }
}
