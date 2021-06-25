package prova;

import java.util.Date;

public class Funcionario {
    public String nome;
    public double salario;
    public Date dataAdmissao;

    public Funcionario(String nome, double salario, Date dataAdmissao) {
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }
}
