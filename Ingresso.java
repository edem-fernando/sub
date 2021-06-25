package prova;

// Terceira Questao
// Deploy
//
//class Main {
//    public static void main(String[] args) {
//        Ingresso ingresso = new Ingresso(10);
//        IngressoVip vip = new IngressoVip(10);
//
//        System.out.println("Ingresso comum : " + ingresso.imprimirValor());
//        System.out.println("Ingresso vip : " + vip.imprimirValor());
//    }
//}

public class Ingresso {
    public double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public String imprimirValor() {
        return "R$" + this.valor;
    }
}
