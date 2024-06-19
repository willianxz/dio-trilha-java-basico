package multifuncional;

import navegador_de_internet.NavegadorDeInternet;
import reprodutor_musical.ReprodutorMusical;
import telefone.Telefone;

public class Iphone2007 implements ReprodutorMusical, Telefone, NavegadorDeInternet{

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("Exibindo página de navegação: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando nova aba de navegação");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando pagina de navegação");
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Ligando para o numero..."+numero);
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Atendendo chamada telefonica");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
	   	System.out.println("Iniciando correio de voz...");
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando a musica");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pausando a musica");
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Selecionando a musica chamada: "+musica);		
	}

}
