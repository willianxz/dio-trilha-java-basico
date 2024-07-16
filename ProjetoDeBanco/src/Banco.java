import java.util.List;

public class Banco {
	private static final String nome = "SANTANDER";
	private List<Conta> contas;
	
	public String getNome() {
		return nome;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	@Override
	public String toString() {
		return "{\"contas\":\"" + contas + "\"}";
	}	
	
	
}
