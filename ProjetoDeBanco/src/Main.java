import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("Alfredo");
		
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente1);
		
		Banco santander = new Banco();		
		List<Conta> listaDeContas = new ArrayList<Conta>();
		listaDeContas.add(cc);
		listaDeContas.add(poupanca);		
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		System.out.println("BANCO: "+santander.getNome());
		System.out.println(listaDeContas);
		System.out.println("-------------------------------------------");
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();		
	}
}
