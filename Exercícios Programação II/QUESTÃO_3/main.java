public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora();

        // Exemplo de operações
        double num1 = 10;
        double num2 = 5;

        // Somando
        double soma = calculadora.somar(num1, num2);
        System.out.println("Soma: " + soma);

        // Subtraindo
        double subtracao = calculadora.subtrair(num1, num2);
        System.out.println("Subtração: " + subtracao);

        // Multiplicando
        double multiplicacao = calculadora.multiplicar(num1, num2);
        System.out.println("Multiplicação: " + multiplicacao);

        // Dividindo
        double divisao = calculadora.dividir(num1, num2);
        System.out.println("Divisão: " + divisao);
    }
}
