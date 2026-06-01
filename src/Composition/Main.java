package Composition;

public class Main {
    public static void main(String[] args) {
        // Create Hogwarts
        Hogwarts hogwarts = new Hogwarts();

        // Enroll new student
        Student harry = hogwarts.sortingCeremony("Harry Potter", Houses.GRYFFINDOR);
        System.out.println(harry.getName() + "? " + hogwarts.getCurrentStudentHouse(harry) + "!");

        // Register current student
        Student cedric = new Student("Cedric Diggory", Houses.HUFFLEPUFF, 3);
        hogwarts.addCurrentStudent(cedric);
        System.out.println(cedric.getName() + " is a year " + cedric.getYear() + " student in "
                + hogwarts.getCurrentStudentHouse(cedric) + "!");

        // Register former student
        Student minerva = new Student("Minerva McGonagall", Houses.GRYFFINDOR, true);
        hogwarts.addFormerStudent(minerva);
        System.out.println(minerva.getName() + " graduated from " + hogwarts.getFormerStudentHouse(minerva) + "!");

        // End of a year, everyone upgrades
        Student roger = new Student("Roger Davis", Houses.RAVENCLAW, 3);
        hogwarts.addCurrentStudent(roger);
        hogwarts.endOfYear(); // Roger should be a year 4 student after the end of the year
        System.out.println(roger.getName() + " now becomes a year " + roger.getYear() + " student in "
        + hogwarts.getCurrentStudentHouse(roger) + " for the new school year!");
    }
}