public class Retangulo implements AreaCalculavel {

    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calculaArea() {
        return this.ladoB * this.ladoA;
    }
}
