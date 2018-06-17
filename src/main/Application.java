package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 4));
        university.addStudent(new Student("Julia Veselkina", 3));
        university.addStudent(new Student("Maria Perechrest", 5));
        university.addStudent(new Student("Matvey Maksimov", 4));
        university.addStudent(new Student("Veronika Bespalova", 3));
        university.addStudent(new Student("Antonina Drozdova", 3));
        university.addStudent(new Student("Alina Makarova", 4));
        university.addStudent(new Student("Evgeniy Yakovlev", 5));
        university.setAverageLevel();

        Internship internship = new Internship("Interlink");
        setInternship(university, internship);
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }

    public static void setInternship(University university, Internship internship) {
        for (Student student : university.getStudents()) {
            if (student.getKnowledge().getLevel() > university.getAverageLevel()) {
                internship.setStudent(student);
            }
        }
    }
}
