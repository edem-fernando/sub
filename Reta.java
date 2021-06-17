package prova;

/**
 * 3 Questao
 * */
class Reta {
    public double coeficienteAngular, coeficienteLinar;

    // LETRA A
    public Reta(double coeficienteAngular, double coeficienteLinar) {
        this.setCoeficienteAngular(coeficienteAngular);
        this.setCoeficienteLinar(coeficienteLinar);
    }
    // Letra A
    public Reta(Ponto2D ponto1, Ponto2D ponto2) {
        // valor do coeficiente angular
        double deltaY = ponto2.getEixoY() - ponto1.getEixoY();
        double deltaX =  ponto2.getEixoX() - ponto1.getEixoX();
        this.setCoeficienteAngular(deltaY / deltaX);

        // coeficiente linear => deltaY = m.(deltaX)
        double cfLinear = (this.getCoeficienteAngular() * deltaX) - deltaY;
        setCoeficienteLinar(cfLinear);
    }

    // LETRA B
    public double getCoeficienteAngular() { return coeficienteAngular; }
    public double getCoeficienteLinar() { return coeficienteLinar; }
    public void setCoeficienteAngular(double coeficienteAngular) { this.coeficienteAngular = coeficienteAngular; }
    public void setCoeficienteLinar(double coeficienteLinar) { this.coeficienteLinar = coeficienteLinar; }

    // Letra  D:
    @Override
    public String toString() {
        return "Reta{ " +
                "coeficienteAngular= " + this.getCoeficienteAngular() +
                ", coeficienteLinar= " + this.getCoeficienteLinar() +
                '}';
    }
}
