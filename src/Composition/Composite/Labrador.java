package Composition.Composite;

public interface Labrador {
    // The Hogwarts example is NOT a composite pattern
    // Objects in a composite pattern come from the same root!
    void bark();
    String getName();
    Color getColor();
    Gender getGender();
}
