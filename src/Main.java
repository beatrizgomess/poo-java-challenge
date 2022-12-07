import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();

        course.setTitle("Curso Java");
        course.setDescription("Descrição carga Horaria");
        course.setWorkload(8);

        Course course1 = new Course();
        course1.setTitle("Curso JS");
        course1.setDescription("Descrição Carga Horaria");
        course1.setWorkload(12);

        System.out.println(course);
        System.out.println(course1);

        Mentoring mentoring1 = new Mentoring();

        mentoring1.setTitle("Mentoria Java");
        mentoring1.setDescription("Descrição Mentoria Java");
        mentoring1.setDate(LocalDate.now());

        System.out.println(mentoring1);

    }
}