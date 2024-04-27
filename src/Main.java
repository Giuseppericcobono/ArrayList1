//Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Paolo", 19);
        Student student2 = new Student("Marco", 22);
        Student student3 = new Student("Francesco", 20);

        List<Student> gruppo1 = Arrays.asList(student1, student2, student3);

        System.out.println(gruppo1);

        Student student4 = new Student("Josh", 19);
        Student student5 = new Student("Marika", 22);
        Student student6 = new Student("Katia", 20);
        Student student7 = new Student("Giuseppe", 18);

        gruppo1 = new ArrayList<>(gruppo1);
        gruppo1.add(student4);
        gruppo1.add(student5);
        gruppo1.add(student6);
        gruppo1.add(student7);

        System.out.println(gruppo1);
    }
}