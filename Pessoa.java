package prova;

class Pessoa {
    public String nome;
    public Pessoa mae;
    public Pessoa pai;

    // Letra A II
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Letra A I
    public Pessoa(String nome, Pessoa mae, Pessoa pai) {
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
    }

    /**
     * Letra B
     * Deploy no Main:
     * <p>
     * Pessoa lulu = new Pessoa("Luizilene");
     * Pessoa alexo = new Pessoa("Alexo");
     * <p>
     * Pessoa edem = new Pessoa("Edem", lulu, alexo);
     * Pessoa joao = new Pessoa("Joao", lulu, alexo);
     * <p>
     * System.out.println(edem.iguais(joao) ? "Sao iguais" : "Nao iguais");
     */
    public boolean iguais(Pessoa pessoa) {
        return pessoa.mae == this.mae && pessoa.nome == this.nome ? true : false;
    }

    /***
     * Letra D
     * Deploy na Main:
     * Pessoa lulu = new Pessoa("Luizilene");
     * Pessoa alexo = new Pessoa("Alexo");
     *
     * Pessoa edem = new Pessoa("Edem");
     * edem.mae = lulu;
     *
     * System.out.println(edem.eAntecessor(alexo) ? "E antecessor" : "Nao E antecessor");
     * */
    public boolean eAntecessor(Pessoa pessoa) {
        // pai/mae
        if (pessoa == this.mae || pessoa == this.pai) {
            return true;
        }

        // avo
        if (pessoa.pai == this.pai.pai || pessoa.mae == this.mae.mae) {
            return true;
        }
        return false;
    }

    /***
     * Letra D
     * Deploy na Main:
     *
     * Pessoa lulu = new Pessoa("Luizilene");
     * Pessoa alexo = new Pessoa("Alexo");
     *
     * Pessoa edem = new Pessoa("Edem", lulu, alexo);
     * Pessoa joao = new Pessoa("Joao", lulu, alexo);
     *
     * System.out.println(edem.eIrmao(joao) ? "E irmao" : "Nao E irmao");
     */
    public boolean eIrmao(Pessoa pessoa) {
        return pessoa.mae == this.mae && pessoa.pai == this.pai ? true : false;
    }
}
