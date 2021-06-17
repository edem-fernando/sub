package prova;

class Ponto2D implements Cloneable {
    private Double eixoY;
    private Double eixoX;

    // Letra A: I
    public Ponto2D() {
        this.setEixoX(0.0);
        this.setEixoY(0.0);
    }

    // Letra A: II
    public Ponto2D(double eixoX, double eixoY) {
        this.setEixoY(eixoY);
        this.setEixoX(eixoX);
    }

    // Letra A: III
    public Ponto2D(Ponto2D ponto2D) {
        this.setEixoY(ponto2D.getEixoY());
        this.setEixoX(ponto2D.getEixoX());
    }

    // Lebra B
    public Double getEixoY() {
        return eixoY;
    }

    // Lebra B
    public Double getEixoX() {
        return eixoX;
    }

    // Lebra B
    public void setEixoY(Double eixoY) {
        this.eixoY = eixoY;
    }

    // Lebra B
    public void setEixoX(Double eixoX) {
        this.eixoX = eixoX;
    }

    // Letra C
    public void movimentarPonto() {
        this.setEixoX(0.0);
        this.setEixoY(0.0);
    }

    // Letra C
    public void movimentarPonto(double eixoX, double eixoY) {
        this.setEixoX(eixoX);
        this.setEixoY(eixoY);
    }

    // Letra C
    public void movimentarPonto(Ponto2D ponto) {
        this.setEixoX(ponto.getEixoX());
        this.setEixoY(ponto.getEixoY());
    }

    // Letra D:
    public double calcularDistancia(Ponto2D ponto) {
        double ordernadaX = Math.pow((ponto.getEixoX() - this.getEixoX()), 2);
        double ordenadaY = Math.pow((ponto.getEixoY() - this.getEixoY()), 2);
        return Math.sqrt(ordernadaX + ordenadaY);
    }

    // Letra E:
    public Ponto2D clonarPonto(Ponto2D ponto) throws CloneNotSupportedException {
        Ponto2D novoPonto = ponto.getClone();
        return novoPonto;
    }

    // Letra E:
    private Ponto2D getClone() throws CloneNotSupportedException {
        final Ponto2D clone = (Ponto2D) super.clone();
        Ponto2D clone1 = clone;
        return clone1;
    }
}