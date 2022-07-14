package classe.santander;

import classe.santander.Bootcamp;
import classe.santander.Curso;
import classe.santander.Dev;
import classe.santander.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("CURSO JAVA \n");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria( 8);

        Curso curso2 = new Curso();
        curso2.setTitulo("CURSO JS \n");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("MENTORIA DE JAVA \n");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer \n");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("\n Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("\n Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("\n ------- ");
        System.out.println("\n Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("\n Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("\n XP:" + devCamila.calcularTotalXp());

        System.out.println("\n -------------------------------------------------------------\n");

        Dev devBarb = new Dev();
        devBarb.setNome("\n Barbara ");
        devBarb.inscreverBootcamp(bootcamp);
        System.out.println("\n Conteúdos Inscritos Barbara: " + devBarb.getConteudosInscritos());
        devBarb.progredir();
        devBarb.progredir();
        devBarb.progredir();
        System.out.println("\n------- ");
        System.out.println("\n Conteúdos Inscritos Barbara: " + devBarb.getConteudosInscritos());
        System.out.println("\n Conteúdos Concluidos Barbara: " + devBarb.getConteudosConcluidos());
        System.out.println("\n XP: " + devBarb.calcularTotalXp());
        System.out.println("\n -------------------------------------------------------------\n");

    }

}