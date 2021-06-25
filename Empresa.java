package prova;

import java.util.ArrayList;

public class Empresa {
    public String nome;
    public String cnpj;
    public ArrayList<Object> departamentos = new ArrayList<Object>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
}
