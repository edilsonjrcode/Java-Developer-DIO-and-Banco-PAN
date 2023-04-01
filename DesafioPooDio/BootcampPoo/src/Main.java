import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(120);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Kotlin");
        curso2.setDescricao("Descrição Curso Kotlin");
        curso2.setCargaHoraria(150);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso Javascript");
        mentoria.setDescricao("Descrição Curso Javascript");
        mentoria.setData(LocalDate.now());



//        System.out.println(curso1);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJunior = new Dev();
        devJunior.setNome("Júnior");
        devJunior.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + devJunior.getNome() + " " + devJunior.getConteudosInscritos());

        devJunior.progredir();

        System.out.println("-----------------------------------------");
        System.out.println("Conteúdos Inscritos de " + devJunior.getNome() + " " + devJunior.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + devJunior.getNome() + " " + devJunior.getConteudosConcluidos());
        devJunior.progredir();
        System.out.println("XP: " + devJunior.calcularTotalXp());


        System.out.println("-----------------------------------------");

        Dev devGiselly = new Dev();
        devGiselly.setNome("Giselly");
        devGiselly.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + devGiselly.getNome() + " " + devGiselly.getConteudosInscritos());
        devGiselly.progredir();

        System.out.println("-----------------------------------------");
        System.out.println("Conteúdos Inscritos de " + devGiselly.getNome() + " " + devGiselly.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + devGiselly.getNome() + " " + devGiselly.getConteudosConcluidos());
        System.out.println("XP: " + devGiselly.calcularTotalXp());

    }


}