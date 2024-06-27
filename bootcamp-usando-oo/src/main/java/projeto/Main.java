package projeto;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Criação dos cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        // Criação da mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        // Criação do bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criação do Dev Camila e sua inscrição no bootcamp
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:\n" + formatarConteudos(devCamila.getConteudosInscritos()));
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:\n" + formatarConteudos(devCamila.getConteudosInscritos()));
        System.out.println("Conteúdos Concluídos Camila:\n" + formatarConteudos(devCamila.getConteudosConcluidos()));
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("-------");

        // Criação do Dev João e sua inscrição no bootcamp
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:\n" + formatarConteudos(devJoao.getConteudosInscritos()));
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:\n" + formatarConteudos(devJoao.getConteudosInscritos()));
        System.out.println("Conteúdos Concluídos João:\n" + formatarConteudos(devJoao.getConteudosConcluidos()));
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }

    private static String formatarConteudos(Set<Conteudo> conteudos) {
        StringBuilder sb = new StringBuilder();
        for (Conteudo conteudo : conteudos) {
            sb.append(conteudo.toString());
        }
        return sb.toString();
    }
}
