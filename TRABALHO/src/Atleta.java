public class Atleta extends Pessoa {
    private String esportePraticado;

    public Atleta(String nome, double peso, double altura, String esportePraticado) {
        super(nome, peso, altura);
        this.esportePraticado = esportePraticado;
    }

    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }

    // Polimorfismo: sobrescreve o cálculo do IMC
    @Override
    public double calcularIMC() {
        double imcNormal = super.calcularIMC();
        return imcNormal * 0.95; // reduz 5%
    }
}