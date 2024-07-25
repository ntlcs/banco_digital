package br.com.ncs.bancodigital;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Verde");
        Cliente cliente = new Cliente("Natalia");

        System.out.println("Nome do Banco: " + banco.getNome());
        System.out.println("Nome do Cliente: " + cliente.getNome());

        Conta cc = new ContaCorrente();
        cc.depositar(5000);

        Conta poupanca = new ContaPoupanca();
        poupanca.depositar(3500);

        poupanca.transferir(255, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
