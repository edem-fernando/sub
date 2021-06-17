package prova;


import java.util.ArrayList;

/**
 * 4 Questao
 */
class Pais {
    private String codigo;
    private String nome;
    private Integer populacao;
    private Double dimensao;

    public ArrayList<Object> vizinhos = new ArrayList<Object>();

    // Letra A
    public Pais(String codigo, String nome, Double dimensao) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setDimensao(dimensao);
    }

    // Letra B
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Letra B
    public String getCodigo() {
        return this.codigo;
    }

    // Letra B
    public String getNome() {
        return this.nome;
    }

    // Letra B
    public Integer getPopulacao() {
        return this.populacao;
    }

    // Letra B
    public Double getDimensao() {
        return this.dimensao;
    }

    // Letra B
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Letra B
    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    // Letra B
    public void setDimensao(Double dimensao) {
        this.dimensao = dimensao;
    }

    // Letra B
    public void mesmoPais(Pais pais) {
        System.out.println(this.getCodigo() == pais.getCodigo() ? "Paises Iguais " : "Paises Diferentes");
    }

    /**
     * Letra D
     * Deploty na Main
     * Pais Brasil = new Pais("159", "Brasil", 54564564.88);
     * Pais Paraguai = new Pais("02", "Paraguai", 201.99);
     * Brasil.vizinhos.add(new Pais("11", "Argentina", 55454.99));
     * Brasil.vizinhos.add(new Pais("01", "Chile", 2012.99));
     * Brasil.vizinhos.add(Paraguai);
     * System.out.println(Brasil.eVizinho(Paraguai) ? "Limitrofe" : "Nao limitrofe");
     * */
    public boolean eVizinho(Pais pais) {
        boolean resultado = false;
        for (int i = 0; i < this.vizinhos.size(); i++) {
            resultado = this.vizinhos.contains(pais);
        }
        return resultado;
    }

    // Letra E
    public double densidade() {
        return this.getPopulacao() / this.getDimensao();
    }

    /**
     * Letra F
     * Deploty na Main
     *
     * Pais Brasil = new Pais("159", "Brasil", 54564564.88);
     * Pais Paraguai = new Pais("02", "Paraguai", 201.99);
     * Pais Argentina = new Pais("11", "Argentina", 55454.99);
     * Pais Chile = new Pais("01", "Chile", 2012.99);
     *
     * Brasil.vizinhos.add(Argentina);
     * Brasil.vizinhos.add(Chile);
     * Brasil.vizinhos.add(Paraguai);
     *
     * Paraguai.vizinhos.add(Argentina);
     * Paraguai.vizinhos.add(Chile);
     *
     * Brasil.paisesComuns(Paraguai);
     * */
    public void paisesComuns(Pais pais) {
        ArrayList<Object> paisesComuns = new ArrayList<Object>();

        for (int i = 0; i < pais.vizinhos.size(); i++) {
            Pais vizinhosDestaClasse = (Pais) this.vizinhos.get(i);
            if (this.vizinhos.contains(vizinhosDestaClasse)) {
                paisesComuns.add(vizinhosDestaClasse);
            }
        }

        for (int c = 0; c < paisesComuns.size(); c++) {
            Pais paisComun = (Pais) paisesComuns.get(c);
            System.out.println(paisComun.getNome());
        }
    }
}
