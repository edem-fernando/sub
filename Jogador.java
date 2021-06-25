package prova;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// Primeira Questao
// Debug na Main:
// public static void main(String[] args) throws ParseException {
//        Jogador edem = new Jogador();
//        edem.setAltura(1.78);
//        edem.setNome("Edem");
//        edem.setNacionalidade("Brasileiro");
//        edem.setDataNascimento("28/11/1970");
//        edem.setPeso(112.00);
//        edem.setPosicao("Defesa");
//
//        edem.dadosJogador();
//        edem.tempoAposentar();
//    }
public class Jogador {
    private String nome, posicao, nacionalidade;
    private Date dataNascimento;
    private double altura, peso;

    // valores para se aponsetnar
    private static int IDADEAPSDEFESA = 40;
    private static int IDADEAPSMEIO = 38;
    private static int IDADEAPSATAQUE = 35;

    public Integer calcularIdade() {
        GregorianCalendar hoje = new GregorianCalendar();
        GregorianCalendar nascimento = new GregorianCalendar();
        if (this.getDataNascimento() != null) {
            nascimento.setTime(this.getDataNascimento());
        }

        int anoAtual = hoje.get(Calendar.YEAR);
        int anoNascimento = nascimento.get(Calendar.YEAR);
        return new Integer(anoAtual - anoNascimento);
    }

    public void tempoAposentar() {
        int tempoAponsentar = 1;
        if (this.getPosicao() == "Defesa") {
            tempoAponsentar = IDADEAPSDEFESA - this.calcularIdade();
        } else if (this.getPosicao() == "Meio") {
            tempoAponsentar = IDADEAPSMEIO - this.calcularIdade();
        } else {
            tempoAponsentar = IDADEAPSATAQUE - this.calcularIdade();
        }

        if (this.calcularIdade() > IDADEAPSDEFESA) {
            System.out.println("Ja passou da hora de voce se aponsentar");
        } else {
            System.out.println("Faltam " + tempoAponsentar + " anos para voce se aponsentar");
        }
    }

    public void dadosJogador() {
        System.out.println("======== Dados do jogador ========");
        System.out.println("nome: " + this.nome);
        System.out.println("posição: " + this.posicao);
        System.out.println("data de nascimento: " + this.dataNascimento.toString());
        System.out.println("nacionalidade: " + this.nacionalidade);
        System.out.println("altura: " + this.altura);
        System.out.println("peso: " + this.peso);
    }

    // getters
    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    // setters
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setDataNascimento(String dataNascimento) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.dataNascimento = formato.parse(dataNascimento);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}
