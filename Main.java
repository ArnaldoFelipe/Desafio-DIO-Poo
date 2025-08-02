package DesafioDIO;

import java.time.LocalDate;

import DesafioDIO.Dominio.*;


public class Main {
    
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("GFT Start JAVA");
        curso1.setDescricao("Trilha de aprendizado java");
        curso1.setCargaHoraria(70);

        Curso curso2 = new Curso();
        curso2.setTitulo("GFT Start C#");
        curso2.setDescricao("Trilha de aprendizado C#");
        curso2.setCargaHoraria(70);

        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("felipe");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos " + dev1.getConteudosInscrtos());

        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos " + dev1.getConteudosInscrtos());
        System.out.println("conteudos concluidos " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());
        
        System.out.println("====================");

        Dev dev2 = new Dev();
        dev2.setNome("silva");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos " + dev2.getConteudosInscrtos());

        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos " + dev2.getConteudosInscrtos());
        System.out.println("conteudos Concluidos " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());




    }
}
