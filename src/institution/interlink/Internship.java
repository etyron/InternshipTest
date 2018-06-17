package institution.interlink;

import person.Student;

import java.util.ArrayList;

public class Internship {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    public Internship(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudent(Student student) {
        this.students.add(student);
    }

    public String getStudents() {
        String str = "";
        for (Student student : students) {
            str += student.getName() + "\n";
        }
        return str;
    }
}
