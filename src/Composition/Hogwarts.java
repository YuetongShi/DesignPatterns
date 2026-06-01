package Composition;

import java.util.ArrayList;

public class Hogwarts {
    private final ArrayList<Student> currentStudents;
    private final ArrayList<Student> formerStudents;
    // Students can only move from current to former, non-reversible, former students not removable

    public Hogwarts() {
        currentStudents = new ArrayList<>();
        formerStudents = new ArrayList<>();
    }

    public void addCurrentStudent(Student student) {
        if (student.getHouse() == null)
            throw new IllegalArgumentException("Not a current student!");
        else if (student.alreadyGraduated())
            throw new IllegalArgumentException("Student already graduated!");

        // Add the student
        currentStudents.add(student);
    }

    // Graduate a 7th year student
    // Goes with every end of year call, DO NOT use in main function
    public void graduateCurrentStudent(Student student) {
        if (student.getYear() != 7)
            throw new IllegalArgumentException("Did not finish school years!");

        // Move a student from current student to former student
        this.currentStudents.remove(student);
        student.changeGraduateStatus();
        addFormerStudent(student);
    }

    // Add a former student to the student list
    // DO NOT use formerStudents.add(student); to avoid graduation check!
    public void addFormerStudent(Student student) {
        if (student.alreadyGraduated())
            formerStudents.add(student);
        else {
            throw new IllegalArgumentException("Student not yet graduated!");
        }
    }

    // Get the house of a given student
    public String getCurrentStudentHouse(Student student) {
        int index = currentStudents.indexOf(student);
        return currentStudents.get(index).getHouse().name();
    }

    public String getFormerStudentHouse(Student student) {
        int index = formerStudents.indexOf(student);
        return formerStudents.get(index).getHouse().name();
    }

    // Dumbledore: Let the feast begin!
    public Student sortingCeremony(String name, Houses house){
        Student newStudent = new Student(name, house);
        currentStudents.add(newStudent);
        return newStudent;
    }

    public void endOfYear(){
        for (Student student : currentStudents) {
            if (student.getYear() < 7)
                student.finishYear();
            else {
                // Student at year 7 graduate and become former student
                graduateCurrentStudent(student);
            }
        }
    }
}