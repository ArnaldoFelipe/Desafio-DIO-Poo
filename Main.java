package DesafioDIO;

import java.time.LocalDate;

import DesafioDIO.Dominio.Curso;
import DesafioDIO.Dominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println("==========================");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
