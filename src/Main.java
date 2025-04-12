import br.com.dio.desafio.dominios.Bootcamp;
import br.com.dio.desafio.dominios.Curso;
import br.com.dio.desafio.dominios.Dev;
import br.com.dio.desafio.dominios.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("Curso java");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso CYBER");
        curso2.setDescricao("Curso CYBER");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp java");
        bootcamp1.setDescricao("Descricao Bootcamp java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp1);

        System.out.println("Conteudos inscritos Caio" + devCaio.getConteudosInscritos());
        devCaio.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Caio" + devCaio.getConteudosInscritos());
        System.out.println("Conteudos concluidos Caio" + devCaio.getConteudosConcluidos());



        System.out.println("---------------------");


        Dev devEusa = new Dev();
        devEusa.setNome(" Eusa");
        devEusa.inscreverBootcamp(bootcamp1);

        System.out.println("Conteudos inscritos Eusa" + devEusa.getConteudosInscritos());
        devEusa.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Eusa" + devEusa.getConteudosInscritos());
        System.out.println("Conteudos concluidos Eusa" + devEusa.getConteudosConcluidos());





        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/




    }
}