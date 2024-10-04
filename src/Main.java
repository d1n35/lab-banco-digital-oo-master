import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira seu nome: ");
		cliente.setNome(scan.nextLine());
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		System.out.println("Digite a quantia que deseja depositar na sua conta poupança: ");
		cc.depositar(scan.nextDouble());

		System.out.println("Digite o valor que deseja tranferir para a conta poupança: ");
		cc.transferir(scan.nextDouble(), poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
