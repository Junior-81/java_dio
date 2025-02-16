import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = Integer.parseInt(scanner.nextLine()); // Usa nextLine() para evitar problemas de quebra de linha

        System.out.print("Por favor, digite seu Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo da conta: ");
        String saldoTexto = scanner.nextLine();
        double saldo = Double.parseDouble(saldoTexto.replace(",", ".")); // Converte para double e troca vírgula por ponto

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
