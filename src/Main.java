public class Main {

    public static void main(String[] args) {
        Cliente larissa = new Cliente();
        larissa.setNome ("Larissa");

        Conta cc = new ContaCorrente(larissa);
        Conta poupanca = new ContaPoupanca(larissa);

        cc.depositar(100);
        cc.transferir(70, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}