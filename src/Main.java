import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRogerio = new Dev();
        devRogerio.setNome("Rogerio");
        devRogerio.increverbootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Rogerio" + devRogerio.getConteudosInscritos());
        devRogerio.progredir();
        devRogerio.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Rogerio" + devRogerio.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Rogerio" + devRogerio.getConteudosConcluidos());
        System.out.println("XP:" + devRogerio.calcularTotalXP());

        System.out.println("---------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.increverbootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXP());



    }
}
