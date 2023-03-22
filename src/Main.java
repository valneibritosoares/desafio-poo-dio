import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Java Basico");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de PHP");
        curso2.setDescricao("Curso Prático de PHP");
        curso2.setCargaHoraria(45);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso de HTML5");
        curso3.setDescricao("Com CSS3 e JavaScript");
        curso3.setCargaHoraria(45);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao(" Abstração no Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de HTML5");
        mentoria2.setDescricao(" Tag Principal do HTML5");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        System.out.println("=======================================================");

        Dev devCamila = new Dev("Camila", 01);
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("=======================================================");

        Dev devPaulo = new Dev("João", 02);
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devPaulo.getConteudosInscritos());
        System.out.println("XP:" + devPaulo.calcularTotalXp());

        Dev devCamila2 = new Dev("Camila", 03);
        devCamila2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila2.getConteudosInscritos());
        devCamila2.progredir();
        devCamila2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila2.getConteudosConcluidos());
        System.out.println("XP:" + devCamila2.calcularTotalXp());
       
        System.out.println("=======================================================");
        System.out.println(devCamila.getIdDev());
        System.out.println(devCamila2.getIdDev());
    }   

}
