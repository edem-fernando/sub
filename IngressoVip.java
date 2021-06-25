package prova;

class IngressoVip extends Ingresso{
    public double valorAdicional = 5.0;

    public IngressoVip(double valor) {
        super(valor);
        this.valor = valor + this.valorAdicional;
    }

//    @Override
//    public String imprimirValor() {
//        return super.imprimirValor();
//    }
}
