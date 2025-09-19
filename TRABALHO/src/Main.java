public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", 70, 1.75);
        Pessoa atleta1 = new Atleta("Mariana", 70, 1.75, "Corrida");

        System.out.printf("%s - IMC: %.2f%n", p1.getNome(), p1.calcularIMC());
        System.out.printf("%s - IMC (ajustado por ser atleta): %.2f%n",
                atleta1.getNome(), atleta1.calcularIMC());
    }
}