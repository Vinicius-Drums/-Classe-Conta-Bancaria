public class App {
    public static void main(String[] args) {
        // Criando uma instância de ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria(9876, 5432, "Chad Smith", 1000.0);

        // Imprimindo informações da conta
        System.out.println();
        System.out.println("Número da Conta: " + minhaConta.getNumeroDaConta());
        System.out.println();
        System.out.println("Agência: " + minhaConta.getAgencia());
        System.out.println();
        System.out.println("Nome do Titular: " + minhaConta.getNomeDoTitular());
        System.out.println();
        System.out.println("Saldo: R$" + minhaConta.getSaldo());

        // Realizando operações de depósito e saque
        System.out.println();
        minhaConta.depositar(500.0);
        System.out.println();
        minhaConta.sacar(200.0);
        System.out.println();
        minhaConta.sacar(2000.0); // Tentativa de sacar mais do que o saldo disponível
    }
}
