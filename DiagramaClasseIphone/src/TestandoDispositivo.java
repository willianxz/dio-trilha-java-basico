import multifuncional.Iphone2007;
import navegador_de_internet.NavegadorDeInternet;
import reprodutor_musical.ReprodutorMusical;
import telefone.Telefone;

public class TestandoDispositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone2007 iphone = new Iphone2007();
		NavegadorDeInternet navegadorDeInternet = iphone;
		ReprodutorMusical reprodutorMusical = iphone;
		Telefone telefone = iphone;
		
		navegadorDeInternet.exibirPagina("www.google.com");
		navegadorDeInternet.adicionarNovaAba();
		navegadorDeInternet.atualizarPagina();
		
		reprodutorMusical.selecionarMusica("Beatles");
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		
		telefone.ligar("4833250328");
		telefone.atender();		
		telefone.iniciarCorreioVoz();
	}

}
