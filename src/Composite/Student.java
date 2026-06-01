package Composite;

public class Student {
    private String name;
    private int year;
    private final Houses house;
    private boolean isGraduated;

    public Student(String name, Houses house) {
        // To enroll new students
        // DO NOT use this constructor in main function
        this.name = name;
        this.year = 1;
        this.house = house;
        this.isGraduated = false;
    }

    public Student(String name, Houses house, int year) {
        // To register current students
        this.name = name;
        this.house = house;
        this.year = year;
        this.isGraduated = false;
    }

    public Student(String name, Houses house, boolean isGraduated) {
        // To register graduated students
        if (!isGraduated)
            throw new IllegalArgumentException("Current student is not supported!");

        this.name = name;
        this.house = house;
        this.year = 7;
        this.isGraduated = true;
    }

    public String getName() {
        return this.name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public int getYear() {
        return this.year;
    }

    // This function gets the house only, strings are available by Hogwarts class methods only
    public Houses getHouse() {
        return this.house;
    }

    // A student that is not in their last year upgrades to the next year
    public void finishYear() {
        if (this.year >= 7)
            throw new IllegalArgumentException("Year out of 7!"); // Hogwarts has at most 7 years
        this.year += 1; // Raise to the next year
    }

    public boolean alreadyGraduated() {
        return this.isGraduated;
    }

    // Graduate a 7-year student, does not check the eligibility, not reversible
    public void changeGraduateStatus(){
        this.isGraduated = true;
    }
}
