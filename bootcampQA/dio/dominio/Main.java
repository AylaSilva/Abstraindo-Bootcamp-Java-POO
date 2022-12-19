import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo(" Curso Java");
        curso1.setDescricao(" Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo(" Curso de Lua");
        curso2.setDescricao(" Descrição Curso Lua");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo(" Mentoria de Java");
        mentoria.setDescricao(" Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp javaBootcamp = new Bootcamp();

        javaBootcamp.setNome("Bootcamp Java Developer");
        javaBootcamp.getConteudos().add(curso1);
        javaBootcamp.getConteudos().add(curso2);
        javaBootcamp.getConteudos().add(mentoria);

        System.out.println("Devs inscritos:");
        System.out.println("==========================================================================");

        Dev devCamila = new Dev();

        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(javaBootcamp);
        System.out.println("Conteúdos inscritos da Dev Camila; " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("==========================================================================");
        System.out.println("Conteúdos inscritos da Dev Camila; " + devCamila.getConteudosInscritos());
        System.out.println("==========================================================================");
        System.out.println("Conteúdos concluídos da Dev Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("***********************************");
        System.out.println("XP da Camila: " + devCamila.calcularXP() + " de experiência !");
        System.out.println("***********************************");
        System.out.println("==========================================================================");

        Dev devAyla = new Dev();

        devAyla.setNome("Ayla");
        devAyla.inscreverBootcamp(javaBootcamp);
        System.out.println("Conteúdos inscritos da Dev Ayla; " + devAyla.getConteudosInscritos());
        devAyla.progredir();
        System.out.println("==========================================================================");
        System.out.println("Conteúdos inscritos da Dev Ayla; " + devAyla.getConteudosInscritos());
        System.out.println("==========================================================================");
        System.out.println("Conteúdos concluídos da Dev Ayla: " + devAyla.getConteudosConcluidos());
        System.out.println("*********************************");
        System.out.println("XP da Ayla: " + devAyla.calcularXP() + " de experiência !");
        System.out.println("*********************************");

        System.out.println("==========================================================================");

    }
}
