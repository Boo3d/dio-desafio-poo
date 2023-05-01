import java.time.LocalDate;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do Curso de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
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

        Dev devDyego = new Dev();
        devDyego.setNome("Dyego");
        devDyego.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos " + devDyego.getNome() + ": " + devDyego.getConteudosInscritos());

        devDyego.progredir();
        devDyego.progredir();
        System.out.println("___");
        
        System.out.println("Conteudos Incritos " + devDyego.getNome() + ": " + devDyego.getConteudosInscritos());
        System.out.println("Conteudos Concluídos " + devDyego.getNome() + ": " + devDyego.getConteudosConcluidos());
        System.out.println("XP: " + devDyego.calcularTotalXp());
        
        System.out.println("__________");
        
        Dev devAngelica = new Dev();
        devAngelica.setNome("Angélica");
        devAngelica.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos " + devAngelica.getNome() + ": " + devAngelica.getConteudosInscritos());
        
        devAngelica.progredir();
        devAngelica.progredir();
        devAngelica.progredir();
        System.out.println("___");
        
        System.out.println("Conteudos Incritos " + devAngelica.getNome() + ": " + devAngelica.getConteudosInscritos());
        System.out.println("Conteudos Concluídos " + devAngelica.getNome() + ": " + devAngelica.getConteudosConcluidos());
        System.out.println("XP: " + devAngelica.calcularTotalXp());
    }
}
