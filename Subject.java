package pl.edu.pja.kirill;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Subject {
    public String name;
    public Person teacher;

    public List<Student> students;
    public int maxSize = 50;



    public Subject(String name) {
        this.name = name;
        students = new ArrayList<Student>();
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) throws TooManyStudentsException {
        if (students.size() >= maxSize) {
            throw new TooManyStudentsException("Max numbers of students!");
        }
        students.add(student);
    }



    @Override
    public String toString() {
        String studentNames = String.join("", students.stream().map(Student::toString).toArray(String[]::new));
        return name + "," + " teacher " + teacher + ", students:" + studentNames;
    }

}
