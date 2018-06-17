package institution;

import person.Student;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    private int averageLevel;

    public University(String name) {
        this.name = name;
        this.averageLevel = 0;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setAverageLevel() {
        averageLevel = 0;
        for (Student student : students) {
            averageLevel += student.getKnowledge().getLevel();
        }
        averageLevel = averageLevel / students.size();
    }

    public int getAverageLevel() {
        return averageLevel;
    }
}
