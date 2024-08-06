package entities;

import java.time.LocalDate;
import java.time.Month;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private LocalDate dataCadastro;
    private Month mesAniversario;
    private int pontosFidelidade;

    public Cliente(String nome, String cpf, String endereco, LocalDate dataCadastro, Month mesAniversario, int pontosFidelidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
        this.mesAniversario = mesAniversario;
        this.pontosFidelidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Month getMesAniversario() {
        return mesAniversario;
    }

    public void setMesAniversario(Month mesAniversario) {
        this.mesAniversario = mesAniversario;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void setPontosFidelidade(int pontosFidelidade) {
        this.pontosFidelidade = pontosFidelidade;
    }
    public void adicionarPontos(int pontos){
        this.pontosFidelidade += pontos;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dataCadastro=" + dataCadastro +
                ", mesAniversario=" + mesAniversario +
                ", pontosFidelidade=" + pontosFidelidade +
                '}';
    }
}
