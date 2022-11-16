import java.time.LocalDate;

import pacote.*;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devOtoniel = new Dev();
        devOtoniel.setNome("Otoniel");
        devOtoniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Otoniel: " + devOtoniel.getConteudosInscritos());
        System.out.println("-");
        devOtoniel.progredir();
        devOtoniel.progredir();
        devOtoniel.progredir();
        System.out.println("Conteúdos inscritos Otoniel: " + devOtoniel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Otoniel: " + devOtoniel.getConteudosConcluidos());
        System.out.println("XP: " + devOtoniel.calcularTotalXp());

        System.out.println("-------------------------------");
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("-");
        devCamila.progredir();
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }
}
