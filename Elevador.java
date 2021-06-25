package prova;

// Segunda Questao
public class Elevador {
    private int andarAtual, totalAndares, capacidade, qtdPessoas;

    // Inicializar
    public Elevador(int capacidade, int totalAndares) {
        this.setCapacidade(capacidade);
        this.setTotalAndares(totalAndares);
        this.setAndarAtual(0); // terreo
        this.setQtdPessoas(0);
    }

    // Entrar
    public void entrar() {
        if (this.getCapacidade() > this.getQtdPessoas()) {
            this.qtdPessoas++;
        }
    }

    // Sair
    public void sair() {
        if (this.getQtdPessoas() >= 1) {
            this.qtdPessoas--;
        }
    }

    // Subir
    public void subir() {
        if (this.getAndarAtual() < this.getTotalAndares()) {
            this.andarAtual++;
        }
    }

    // Descer:
    public void descer() {
        if (this.getAndarAtual() > 0) {
            this.andarAtual--;
        }
    }

    // setters e getters
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }
}
