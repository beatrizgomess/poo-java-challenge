import br.com.dio.challenge.domain.*;
import br.com.dio.challenge.pattern.FacadeBootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FacadeBootcamp facadeBootcamp = new FacadeBootcamp();


        Course course = new Course();
        course.setTitle("Curso Java");
        course.setDescription("Descrição carga Horaria");
        course.setWorkload(8);

        Course course1 = new Course();
        course1.setTitle("Curso JS");
        course1.setDescription("Descrição Carga Horaria");
        course1.setWorkload(12);

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setTitle("Mentoria Java");
        mentoring1.setDescription("Descrição Mentoria Java");
        mentoring1.setDate(LocalDate.now());


        //Polimorfismo
        //Tudo que em conteudo, tem em curso
        //Mas nem tudo que em curso tem em conteudo
        Content content = new Course();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Java Developer");
        bootcamp.getContents().add(course);
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(mentoring1);

        System.out.println();
        Dev dev1 = new Dev();
        dev1.setName("Bea");
        System.out.println("DEV " + dev1.getName());
        dev1.signedUpBootcamp(bootcamp);
        dev1.signedUpBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + dev1.getSubscribedContent());
        dev1.toProgress();


        System.out.println("XP BEA - " + dev1.calculateXP());
        System.out.println("Conteudos Inscritos: " + dev1.getSubscribedContent());
        System.out.println("Conteudos Concluídos: " + dev1.getCompletedContents());


        System.out.println();
        Dev dev2 = new Dev();
        dev2.setName("Eduarda");
        System.out.println("DEV " + dev2.getName());
        System.out.println("XP EDUARDA - " + dev2.calculateXP());

        dev2.signedUpBootcamp(bootcamp);


        System.out.println("Conteudos Inscritos: " + dev2.getSubscribedContent());
        dev2.toProgress();
        System.out.println("Questões para serem respondidas: " );

        //dev2.toProgressWithQuestion();



        System.out.println("Conteudos Inscritos: " + dev2.getSubscribedContent());
        System.out.println("Conteudos Concluídos: " + dev2.getCompletedContents());

        System.out.println();
        System.out.println();

        System.out.println("DESING PATTERN - OBSERVER");

        System.out.println("Notificação do sistema: ");
        Bootcamp bootcamp3 = new Bootcamp("Python Developer", "Descrição do Bootcamp de Python");

        System.out.println("Notificação para " + dev1.getName() + "ATENÇÃO: ");
        dev1.enviarNotificacao(bootcamp3);

        System.out.println("Notificação para " + dev2.getName() + " ATENÇÃO: ");
        dev2.enviarNotificacao(bootcamp3);


        facadeBootcamp.createBootcamp(bootcamp3);
        //Sempre que crio um bootcamp, envio notificação para os observadores.
        // Dentro do método createBootcamp, contém o método "notificarObservadores"





    }
}