package prova;

/**
 * 2 Questao
 * */
class NumeroComplexo {
    private double x, y;

    // a)
    public NumeroComplexo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Letra B
    public double getX() {
        return  this.x;
    }
    // Letra B
    public void setX(double x) {
        this.x = x;
    }
    // Letra B
    public double getY() {
        return this.y;
    }
    // Letra B
    public void setY(double y) {
        this.y = y;
    }

    // Letra C
    public void somar(NumeroComplexo numeroComplexo) {
        this.setX(this.getX() + numeroComplexo.getX());
        this.setY(this.getY() + numeroComplexo.getY());
    }

    // Letra D
    public void subtrair(NumeroComplexo numeroComplexo) {
        this.setX(this.getX() - numeroComplexo.getX());
        this.setY(this.getY() - numeroComplexo.getY());
    }

    // Letra E:
    public void multiplicar(NumeroComplexo numeroComplexo) {
        this.setX( (this.getX() * numeroComplexo.getX()) - (this.getY() * numeroComplexo.getY()) );
        this.setY( (this.getX() * numeroComplexo.getY()) + (this.getY() * numeroComplexo.getX()) );
    }

    // Letra F:
    public void dividir(NumeroComplexo num) {
        double resultadoX = (this.getX() * num.getX() - this.getY() * num.getY());
        this.setX(resultadoX / (Math.pow(num.getX(), 2) + Math.pow(num.getY(), 2)));

        double resultadoY = (this.getX() * num.getY() + this.getY() * num.getX());
        this.setY(resultadoY / (Math.pow(num.getX(), 2) + Math.pow(num.getY(), 2)));
    }

    // Letra G:
    @Override
    public String toString() {
        return "NumeroComplexo{ " + this.getX() + " + " + this.getY() + " }";
    }

    // Letra H:
    public double moduloNComplexo(NumeroComplexo n) {
        double xAoQuadrado = Math.pow(n.getX(), 2);
        double yAoQuadrado = Math.pow(n.getY(), 2);
        return Math.sqrt( xAoQuadrado + yAoQuadrado );
    }
}