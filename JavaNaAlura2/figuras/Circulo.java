public class Circulo implements AreaCalculavel {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return 2 * Math.PI * raio;
    }
}
