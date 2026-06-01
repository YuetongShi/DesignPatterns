package Composition.Composite;

import java.util.ArrayList;

public class Mom implements Labrador{
    private final Color color;
    private final String name;
    private final Gender gender = Gender.Female;
    private final ArrayList<Labrador> children;

    public Mom(Color color, String name){
        this.color = color;
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public void bark() {
        System.out.println(this.name + ": Wolf! Wolf!");

        // Each child barks too
        for (Labrador labrador : children) {
            System.out.println("This is " + this.name + "'s child " + labrador.getName() + "!");
            labrador.bark();
        }

        // Leave a blank line between each family
        System.out.println();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public Gender getGender() {
        return this.gender;
    }

    public void giveBirth(Labrador puppy){
        this.children.add(puppy);
    }
}
