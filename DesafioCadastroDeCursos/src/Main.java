import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso SQL");
		curso1.setDescricao("Um curso da DIO");
		curso1.setCargaHoraria(4);		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JAVA");
		curso2.setDescricao("Um curso da DIO");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria da CAMILA");
		mentoria.setDescricao("Uma mentoria para aprender JAVA");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		System.out.println("======================================");
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp JAVA");
		bootcamp.setDescricao("Um Bootcamp da DIO em parceria com SANTANDER");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Willian");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Wilian: "+dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("-----");
		System.out.println("Conteúdos inscritos Wilian: "+dev1.getConteudosInscritos());
		System.out.println("Conteúdos concluidos Wilian: "+dev1.getConteudosConcluidos());
		System.out.println("XP " + dev1.calcularTotalXp());
		
		Dev dev2 = new Dev();
		dev2.setNome("Daniel");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Daniel: "+dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("-----");
		System.out.println("Conteúdos inscritos Daniel: "+dev2.getConteudosInscritos());
		System.out.println("Conteúdos concluidos Daniel: "+dev2.getConteudosConcluidos());
		System.out.println("XP " + dev2.calcularTotalXp());
	}

}
