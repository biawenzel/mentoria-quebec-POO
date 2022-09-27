public class Main {
    public static void main(String[] args) {
        Vendedor joaoVendedor = new Vendedor("João", "112343", 10.0, 5);
        double salarioJoao = joaoVendedor.calcularSalario();
        System.out.println("O salario de João é: " + salarioJoao);

        Consultor mariaConsultor = new Consultor("Maria", "123456", 100.0, 10);
        double salarioMaria = mariaConsultor.calcularSalario();
        System.out.println("O salario de Maria é: " + salarioMaria);
    }
}